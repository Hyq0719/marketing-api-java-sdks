package com.hyq0719.mktapi.common.util;

import com.hyq0719.mktapi.common.executor.parameter.Pair;
import org.threeten.bp.LocalDate;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.OffsetDateTime;
import java.util.*;

public class PairUtil {

  /**
   * Format the given parameter object into string.
   *
   * @param param Parameter
   * @return String representation of the parameter
   */
  public static String parameterToString(Object param, JSON json) {
    if (param == null) {
      return "";
    } else if (param instanceof Date
      || param instanceof OffsetDateTime
      || param instanceof LocalDate) {
      // Serialize to json string and remove the " enclosing characters
      String jsonStr = json.serialize(param);
      return jsonStr.substring(1, jsonStr.length() - 1);
    } else if (param instanceof Collection) {
      StringBuilder b = new StringBuilder();
      for (Object o : (Collection) param) {
        if (b.length() > 0) {
          b.append(",");
        }
        b.append(o);
      }
      return b.toString();
    } else {
      return String.valueOf(param);
    }
  }

  /**
   * Formats the specified query parameter to a list containing a single {@code Pair} object.
   * Note that {@code value} must not be a collection.
   *
   * @param name  The name of the parameter.
   * @param value The value of the parameter.
   * @return A list containing a single {@code Pair} object.
   */
  public static List<Pair> parameterToPair(String name, Object value, JSON json) {
    List<Pair> params = new ArrayList<>();

    // preconditions
    if (name == null || name.isEmpty() || value == null || value instanceof Collection) {
      return params;
    }
    if (value instanceof Map) {
      params.add(new Pair(name, json.serialize(value)));
      return params;
    }
    params.add(new Pair(name, parameterToString(value, json)));
    return params;
  }

  /**
   * Formats the specified collection query parameters to a list of {@code Pair} objects.
   * Note that the values of each of the returned Pair objects are percent-encoded.
   *
   * @param collectionFormat The collection format of the parameter.
   * @param name             The name of the parameter.
   * @param value            The value of the parameter.
   * @return A list of {@code Pair} objects.
   */
  public static List<Pair> parameterToPairs(String collectionFormat, String name, Collection value, JSON json) {
    List<Pair> params = new ArrayList<>();

    // preconditions
    if (name == null || name.isEmpty() || value == null || value.isEmpty()) {
      return params;
    }

    // create the params based on the collection format
    if ("multi".equals(collectionFormat)) {
      params.add(new Pair(name, json.serialize(value)));
      return params;
    }

    // collectionFormat is assumed to be "csv" by default
    String delimiter = ",";

    // escape all delimiters except commas, which are URI reserved
    // characters
    if ("ssv".equals(collectionFormat)) {
      delimiter = escapeString(" ");
    } else if ("tsv".equals(collectionFormat)) {
      delimiter = escapeString("\t");
    } else if ("pipes".equals(collectionFormat)) {
      delimiter = escapeString("|");
    }

    StringBuilder sb = new StringBuilder();
    for (Object item : value) {
      sb.append(delimiter);
      sb.append(escapeString(parameterToString(item, json)));
    }

    params.add(new Pair(name, sb.substring(delimiter.length())));

    return params;
  }


  /**
   * Escape the given string to be used as URL query value.
   *
   * @param str String to be escaped
   * @return Escaped string
   */
  public static String escapeString(String str) {
    try {
      return URLEncoder.encode(str, "utf8").replace("\\+", "%20");
    } catch (UnsupportedEncodingException e) {
      return str;
    }
  }
}
