package com.hyq0719.mktapi.generator.oceanengine.handler;

import com.google.gson.Gson;
import com.hyq0719.mktapi.generator.oceanengine.entity.*;
import com.hyq0719.mktapi.generator.oceanengine.util.GeneratorUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.IOUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.*;

public class CodeGenerator {
  public static final GeneratorConfigEntity GENERATOR_ENTITY = getConfig();
  public static final Map<String, String> TYPE_MAP = getTypeMap();
  public static final Set<String> OBJECT_TYPE_SET = getObjectTypeSet();
  public static final Set<String> LIST_TYPE_SET = getListTypeSet();

  /**
   * 获取配置信息
   */
  public static GeneratorConfigEntity getConfig() {
    GeneratorConfigEntity generatorConfigEntity = null;
    try {
      Yaml yaml = new Yaml();
      InputStream resourceAsStream = GeneratorUtils.class.getClassLoader().getResourceAsStream("generator.yml");
      generatorConfigEntity = yaml.loadAs(resourceAsStream, GeneratorConfigEntity.class);
    } catch (Exception e) {
      throw new RuntimeException("获取配置文件失败，", e);
    }
    return generatorConfigEntity;
  }

  public static List<String> getTemplates() {
    List<String> templates = new ArrayList<String>();
    GENERATOR_ENTITY.getGeneratorJavaMap().forEach((k, v) -> {
      templates.add("template" + File.separator + k + ".java.vm");
    });
    return templates;
  }

  /**
   * 获取文件名
   */
  public static Map<String, Boolean> getFileName(String template, String className) {
    Map<String, Boolean> map = new HashMap<>();
    String packagePath = "src" + File.separator + "main" + File.separator + "java" + File.separator;
    Map<String, GeneratorConfigEntity.JavaMap> generatorJavaMap = GENERATOR_ENTITY.getGeneratorJavaMap();
    for (String key : generatorJavaMap.keySet()) {
      if (template.equals("template" + File.separator + key + ".java.vm")) {
        GeneratorConfigEntity.JavaMap javaMap = GENERATOR_ENTITY.getGeneratorJavaMap().get(key);
        map.put(packagePath + javaMap.getPackageName().replace(".", File.separator) + File.separator + className
          + ".java", true);
        return map;
      }
    }
    return null;
  }

  public static List<SingleFileEntity> getSingleFileList(Map<String, List<BaseEntity>> map, String className) {
    List<SingleFileEntity> singleFileList = new ArrayList<>();
    SingleFileEntity sfe = new SingleFileEntity();
    sfe.className(className).isRequest(false);
    List<BaseEntity> entityList = map.get(className);
    if (CollectionUtils.isEmpty(entityList)) {
      throw new RuntimeException(className + " EntityMap error");
    }
    for (BaseEntity baseEntity : entityList) {
      addImportList(baseEntity, sfe);
      parseBaseEntity(map, baseEntity, singleFileList);
    }
    sfe.list(entityList);
    singleFileList.add(sfe);
    return singleFileList;
  }

  public static List<SingleFileEntity> getSingleFileList(CrawlerResult crawlerResult) {
    List<SingleFileEntity> singleFileList = new ArrayList<>();
    String classPrefix = crawlerResult.getClassPrefix();
    Map<String, List<BaseEntity>> requestEntityMap = crawlerResult.getRequestEntityMap();
    if (requestEntityMap != null) {
      parseRequestMap(requestEntityMap, singleFileList, classPrefix);
    }
    Map<String, List<BaseEntity>> responseEntityMap = crawlerResult.getResponseEntityMap();
    if (requestEntityMap != null) {
      parseResponseMap(responseEntityMap, singleFileList, classPrefix);
    }
    return singleFileList;
  }

  public static void parseRequestMap(Map<String, List<BaseEntity>> map, List<SingleFileEntity> singleFileList,
                                     String classPrefix) {
    String requestName = classPrefix + "Request";
    SingleFileEntity sfe = new SingleFileEntity();
    sfe.className(requestName).isRequest(true);
    List<BaseEntity> entityList = map.get(requestName);
    if (CollectionUtils.isEmpty(entityList)) {
      throw new RuntimeException("requestEntityMap error");
    }

    for (BaseEntity baseEntity : entityList) {
      addImportList(baseEntity, sfe);
      if ("filtering".equals(baseEntity.getSnakeProperty())) {
        baseEntity.setCamelProperty(GeneratorUtils.toLowerCaseFirstOne(classPrefix + "Filtering"));
      }
      parseBaseEntity(map, baseEntity, singleFileList);
    }
    sfe.list(entityList);
    singleFileList.add(sfe);
  }

  public static void parseResponseMap(Map<String, List<BaseEntity>> map, List<SingleFileEntity> singleFileList,
                                      String classPrefix) {
    SingleFileEntity sfe = new SingleFileEntity();
    sfe.isRequest(false);
    List<BaseEntity> entityList = map.get("data");
    if (CollectionUtils.isEmpty(entityList)) {
      System.out.println("responseEntityMap empty");
      return;
    } else {
      sfe.className(classPrefix + "ResponseData");
    }
    for (BaseEntity baseEntity : entityList) {
      addImportList(baseEntity, sfe);
      parseBaseEntity(map, baseEntity, singleFileList, classPrefix);
    }
    sfe.list(entityList);
    singleFileList.add(sfe);
  }


  public static void parseBaseEntity(Map<String, List<BaseEntity>> map, BaseEntity baseEntity,
                                     List<SingleFileEntity> singleFileList) {
    String type = baseEntity.getType();
    String snakeProperty = baseEntity.getSnakeProperty();
    if (TYPE_MAP.containsKey(type)) {
      baseEntity.setType(TYPE_MAP.get(type));
      return;
    }
    if (OBJECT_TYPE_SET.contains(type)) {
      String className = GeneratorUtils.toUpperCaseFirstOne(baseEntity.getCamelProperty() + "Struct");

      baseEntity.setType(className);
      setArrayBaseEntity(type, baseEntity, className);

      SingleFileEntity sfe = new SingleFileEntity();
      sfe.className(className).isRequest(false);
      List<BaseEntity> entityList = map.get(snakeProperty);
      if (CollectionUtils.isEmpty(entityList)) {
        return;
      }
      for (BaseEntity entity : entityList) {
        addImportList(entity, sfe);
        parseBaseEntity(map, entity, singleFileList);
      }
      sfe.list(entityList);
      singleFileList.add(sfe);
    }
  }

  public static void parseBaseEntity(Map<String, List<BaseEntity>> map, BaseEntity baseEntity,
                                     List<SingleFileEntity> singleFileList, String classPrefix) {
    String type = baseEntity.getType();
    String snakeProperty = baseEntity.getSnakeProperty();
    if (TYPE_MAP.containsKey(type)) {
      baseEntity.setType(TYPE_MAP.get(type));
      return;
    }
    if (OBJECT_TYPE_SET.contains(type)) {
      String camelProperty = baseEntity.getCamelProperty();
      String className;
      if ("list".equals(camelProperty)) {
        className = GeneratorUtils.toUpperCaseFirstOne(classPrefix + "ListStruct");
      } else {
        className = GeneratorUtils.toUpperCaseFirstOne(camelProperty + "Struct");
      }

      baseEntity.setType(className);
      setArrayBaseEntity(type, baseEntity, className);

      SingleFileEntity sfe = new SingleFileEntity();
      sfe.className(className).isRequest(false);
      List<BaseEntity> entityList = map.get(snakeProperty);
      if (CollectionUtils.isEmpty(entityList)) {
        return;
      }
      for (BaseEntity entity : entityList) {
        addImportList(entity, sfe);
        parseBaseEntity(map, entity, singleFileList);
      }
      sfe.list(entityList);
      singleFileList.add(sfe);
    }
  }


  /**
   * 生成代码
   */
  public static void generateCode(List<SingleFileEntity> list) {
    GeneratorConfigEntity.Person person = GENERATOR_ENTITY.getPerson();
    Map<String, GeneratorConfigEntity.JavaMap> generatorJavaMap = GENERATOR_ENTITY.getGeneratorJavaMap();
    GeneratorConfigEntity.JavaMap request = generatorJavaMap.get("default");
    BaseClassInfo bci = new BaseClassInfo().author(person.getAuthor()).email(person.getEmail())
      .datetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()))
      .packageName(request.getPackageName()).comments("");

    //设置velocity资源加载器
    Properties prop = new Properties();
    prop.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
    Velocity.init(prop);

    for (SingleFileEntity singleFileEntity : list) {
      singleFileEntity.baseClassInfo(bci);
      Gson gson = new Gson();
      Map map = gson.fromJson(gson.toJson(singleFileEntity), Map.class);
      VelocityContext context = new VelocityContext(map);
      //获取模板列表
      List<String> templates = getTemplates();
      for (String template : templates) {
        //渲染模板
        StringWriter sw = new StringWriter();
        Template tpl = Velocity.getTemplate(template, "UTF-8");
        tpl.merge(context, sw);

        try {
          //添加到zip
          Map<String, Boolean> fileNameMap = getFileName(template, singleFileEntity.getClassName());
          String key = fileNameMap.keySet().iterator().next();
          if (org.apache.commons.lang.StringUtils.isEmpty(key)) {
            return;
          }
          File file = new File(System.getProperty("user.dir") + "/code-generators/oceanengine-code-generator/" + key);
          if (!file.exists()) {
            if (file.createNewFile()) {
              FileOutputStream fos = new FileOutputStream(file);
              IOUtils.write(sw.toString(), fos, "UTF-8");
              IOUtils.closeQuietly(sw);
              fos.close();
            }
          }
          if ((file.exists() && fileNameMap.get(key))) {
            FileOutputStream fos = new FileOutputStream(file);
            IOUtils.write(sw.toString(), fos, "UTF-8");
            IOUtils.closeQuietly(sw);
            fos.close();
          }
        } catch (Exception e) {
          throw new RuntimeException("渲染模板失败：", e);
        }
      }
    }
  }

  private static Map<String, String> getTypeMap() {
    Map<String, String> map = new HashMap<>();
    map.put("number", "Long");
    map.put("numberf", "Float");
    map.put("num", "Long");
    map.put("long", "Long");
    map.put("Long", "Long");
    map.put("int", "Integer");
    map.put("integer", "Integer");
    map.put("Integer", "Integer");
    map.put("string", "String");
    map.put("String", "String");
    map.put("enum", "String");
    map.put("bool", "Boolean");
    map.put("boolean", "Boolean");
    map.put("Boolean", "Boolean");
    map.put("float", "Float");
    map.put("Float", "Float");
    map.put("double", "Double");
    map.put("Double", "Double");

    // 集合
    map.put("number[]", "List<Long>");
    map.put("num[]", "List<Long>");
    map.put("long[]", "List<Long>");
    map.put("Long[]", "List<Long>");
    map.put("int[]", "List<Integer>");
    map.put("integer[]", "List<Integer>");
    map.put("Integer[]", "List<Integer>");
    map.put("string[]", "List<String>");
    map.put("String[]", "List<String>");
    map.put("enum[]", "List<String>");
    map.put("bool[]", "List<Boolean>");
    map.put("boolean[]", "List<Boolean>");
    map.put("Boolean[]", "List<Boolean>");
    map.put("float[]", "List<Float>");
    map.put("Float[]", "List<Float>");
    map.put("numberf[]", "List<Float>");
    map.put("double[]", "List<Double>");
    map.put("Double[]", "List<Double>");
    map.put("file", "File");
    return map;
  }

  private static Set<String> getObjectTypeSet() {
    Set<String> set = new HashSet<>();
    set.add("object");
    set.add("object[]");
    set.add("json");
    set.add("json[]");
    set.add("list");
    set.add("List");
    set.add("array");
    set.add("Array");
    return set;
  }

  private static Set<String> getListTypeSet() {
    Set<String> set = new HashSet<>();
    set.add("[]");
    set.add("list");
    set.add("List");
    set.add("array");
    set.add("Array");
    return set;
  }

  private static void setArrayBaseEntity(String type, BaseEntity baseEntity, String className) {
    if (isListType(type)) {
      baseEntity.setType("List<" + className + ">");
    }
  }

  private static void addImportList(BaseEntity entity, SingleFileEntity sfe) {
    if (isListType(entity.getType())) {
      List<String> importList = sfe.getImportList();
      if (importList == null) {
        importList = new ArrayList<>();
      }
      if (importList.contains("import java.util.List")) {
        return;
      }
      importList.add("import java.util.List");
      sfe.importList(importList);
    }
    if (entity.getType().contains("file")) {
      List<String> importList = sfe.getImportList();
      if (importList == null) {
        importList = new ArrayList<>();
      }
      if (importList.contains("import java.io.File")) {
        return;
      }
      importList.add("import java.io.File");
      sfe.importList(importList);
    }
  }

  private static boolean isListType(String type) {
    for (String listType : LIST_TYPE_SET) {
      if (type.contains(listType)) {
        return true;
      }
    }
    return false;
  }
}
