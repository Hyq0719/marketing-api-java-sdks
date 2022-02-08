/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.acoountService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-07 22:31:31
 */
@Data
public class AccountFetchResponseData {

  /**
   * 广告主账号id
   */
  @SerializedName("uuid")
  private String uuid = null;

  /**
   * 协议版本号
   */
  @SerializedName("protocolVersion")
  private String protocolVersion = null;

  /**
   * 是否是最新协议
   */
  @SerializedName("isLastProtocol")
  private Boolean isLastProtocol = null;

  /**
   * 数据版本号
   */
  @SerializedName("dataVersion")
  private Long dataVersion = null;

  /**
   * 名称
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 状态: 未完善-0,待审核-1,已通过-2,未通过-3,已注销-4,已冻结-5,资料修改待审核-6
   */
  @SerializedName("status")
  private Short status = null;

  /**
   * 现金+商店虚拟金余额标识：0-正常/1-余额不足
   */
  @SerializedName("balance1State")
  private Short balance1State = null;

  /**
   * 现金+非商店虚拟金余额标识：0-正常/1-余额不足
   */
  @SerializedName("balance2State")
  private Short balance2State = null;

  /**
   * 现金+联盟虚拟金余额标识：0-正常/1-余额不足
   */
  @SerializedName("balance3State")
  private Short balance3State = null;

  /**
   * 日限额状态：0-正常/1-到达日限额
   */
  @SerializedName("dailyBudgetState")
  private Integer dailyBudgetState = null;

  /**
   * 日限额，-1表示不限额;有限额时显示具体限额，单位为毫分，1元=100000毫分;
   */
  @SerializedName("dailyBudget")
  private Long dailyBudget = null;

  /**
   * 最小日限额，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("minDailyBudget")
  private Long minDailyBudget = null;

  /**
   * 最大日限额，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("maxDailyBudget")
  private Long maxDailyBudget = null;

  /**
   * 日预算每次修改最小幅度，即每次修改需在原有预算基础上增加或减少指定金额以上；单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("minDailyBudgetThreshold")
  private Long minDailyBudgetThreshold = null;

  /**
   * 现金余额，现金可在所有资源中使用。单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("balance")
  private Long balance = null;

  /**
   * 注册来源：1.开发者平台 2.CPD 3.广告 4.核代新增二代 5.二代新增广告主 6.阅图锁屏 7.商业化DMP 8.营销平台
   */
  @SerializedName("registerSource")
  private Short registerSource = null;

  /**
   * 商店虚拟金余额，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("disAppstoreBalance")
  private Long disAppstoreBalance = null;

  /**
   * 联盟虚拟金余额，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("disLeagueBalance")
  private Long disLeagueBalance = null;

  /**
   * 非商店虚拟金余额，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("disFeedBalance")
  private Long disFeedBalance = null;

  /**
   * 通用虚拟金余额，，单位为毫分（千分之一分），1元=100000毫分;
   */
  @SerializedName("disGeneralBalance")
  private Short disGeneralBalance = null;

  /**
   * 广告资质审核状态：0-待审核；1-审核通过；2-审核不通过
   */
  @SerializedName("auditState")
  private Short auditState = null;

  /**
   * 邮箱
   */
  @SerializedName("email")
  private String email = null;

  /**
   * 类型:直客 1,代理商 2,个人 3
   */
  @SerializedName("type")
  private Short type = null;

  /**
   * 公司名称
   */
  @SerializedName("companyName")
  private String companyName = null;

  /**
   * 账户等级: 默认-0,核代-1,二代-2,广告主-3,广告主（已解绑）-4
   */
  @SerializedName("level")
  private Short level = null;

  /**
   * 是否有上级账户
   */
  @SerializedName("hasParent")
  private Integer hasParent = null;

  /**
   * 营业执照号:长度最多20位
   */
  @SerializedName("businessLicenseNo")
  private String businessLicenseNo = null;

  /**
   * 营业执照图片
   */
  @SerializedName("businessLicenseScan")
  private String businessLicenseScan = null;

  /**
   * 显示名称
   */
  @SerializedName("showName")
  private String showName = null;

  /**
   * 身份证号
   */
  @SerializedName("idCardNo")
  private String idCardNo = null;

  /**
   * 身份证正面
   */
  @SerializedName("idCardFront")
  private String idCardFront = null;

  /**
   * 广告主所属一级行业（新）
   */
  @SerializedName("adIndustry1")
  private String adIndustry1 = null;

  /**
   * 广告主所属二级行业（新）
   */
  @SerializedName("adIndustry2")
  private String adIndustry2 = null;

  /**
   * 行业分类
   */
  @SerializedName("category")
  private String category = null;

  /**
   * 第一次完善信息状态: 0 非首次更新 1 首次更新
   */
  @SerializedName("firstUpdateState")
  private String firstUpdateState = null;

  /**
   * 广告资质审核结果
   */
  @SerializedName("adAuditReviewResult")
  private String adAuditReviewResult = null;

  /**
   * 所属平台，0-商业账户，1-营销平台
   */
  @SerializedName("platform")
  private String platform = null;

  /**
   * 创建时间
   */
  @SerializedName("createTime")
  private String createTime = null;

  public AccountFetchResponseData uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  public AccountFetchResponseData protocolVersion(String protocolVersion) {
    this.protocolVersion = protocolVersion;
    return this;
  }

  public AccountFetchResponseData isLastProtocol(Boolean isLastProtocol) {
    this.isLastProtocol = isLastProtocol;
    return this;
  }

  public AccountFetchResponseData dataVersion(Long dataVersion) {
    this.dataVersion = dataVersion;
    return this;
  }

  public AccountFetchResponseData name(String name) {
    this.name = name;
    return this;
  }

  public AccountFetchResponseData status(Short status) {
    this.status = status;
    return this;
  }

  public AccountFetchResponseData balance1State(Short balance1State) {
    this.balance1State = balance1State;
    return this;
  }

  public AccountFetchResponseData balance2State(Short balance2State) {
    this.balance2State = balance2State;
    return this;
  }

  public AccountFetchResponseData balance3State(Short balance3State) {
    this.balance3State = balance3State;
    return this;
  }

  public AccountFetchResponseData dailyBudgetState(Integer dailyBudgetState) {
    this.dailyBudgetState = dailyBudgetState;
    return this;
  }

  public AccountFetchResponseData dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  public AccountFetchResponseData minDailyBudget(Long minDailyBudget) {
    this.minDailyBudget = minDailyBudget;
    return this;
  }

  public AccountFetchResponseData maxDailyBudget(Long maxDailyBudget) {
    this.maxDailyBudget = maxDailyBudget;
    return this;
  }

  public AccountFetchResponseData minDailyBudgetThreshold(Long minDailyBudgetThreshold) {
    this.minDailyBudgetThreshold = minDailyBudgetThreshold;
    return this;
  }

  public AccountFetchResponseData balance(Long balance) {
    this.balance = balance;
    return this;
  }

  public AccountFetchResponseData registerSource(Short registerSource) {
    this.registerSource = registerSource;
    return this;
  }

  public AccountFetchResponseData disAppstoreBalance(Long disAppstoreBalance) {
    this.disAppstoreBalance = disAppstoreBalance;
    return this;
  }

  public AccountFetchResponseData disLeagueBalance(Long disLeagueBalance) {
    this.disLeagueBalance = disLeagueBalance;
    return this;
  }

  public AccountFetchResponseData disFeedBalance(Long disFeedBalance) {
    this.disFeedBalance = disFeedBalance;
    return this;
  }

  public AccountFetchResponseData disGeneralBalance(Short disGeneralBalance) {
    this.disGeneralBalance = disGeneralBalance;
    return this;
  }

  public AccountFetchResponseData auditState(Short auditState) {
    this.auditState = auditState;
    return this;
  }

  public AccountFetchResponseData email(String email) {
    this.email = email;
    return this;
  }

  public AccountFetchResponseData type(Short type) {
    this.type = type;
    return this;
  }

  public AccountFetchResponseData companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  public AccountFetchResponseData level(Short level) {
    this.level = level;
    return this;
  }

  public AccountFetchResponseData hasParent(Integer hasParent) {
    this.hasParent = hasParent;
    return this;
  }

  public AccountFetchResponseData businessLicenseNo(String businessLicenseNo) {
    this.businessLicenseNo = businessLicenseNo;
    return this;
  }

  public AccountFetchResponseData businessLicenseScan(String businessLicenseScan) {
    this.businessLicenseScan = businessLicenseScan;
    return this;
  }

  public AccountFetchResponseData showName(String showName) {
    this.showName = showName;
    return this;
  }

  public AccountFetchResponseData idCardNo(String idCardNo) {
    this.idCardNo = idCardNo;
    return this;
  }

  public AccountFetchResponseData idCardFront(String idCardFront) {
    this.idCardFront = idCardFront;
    return this;
  }

  public AccountFetchResponseData adIndustry1(String adIndustry1) {
    this.adIndustry1 = adIndustry1;
    return this;
  }

  public AccountFetchResponseData adIndustry2(String adIndustry2) {
    this.adIndustry2 = adIndustry2;
    return this;
  }

  public AccountFetchResponseData category(String category) {
    this.category = category;
    return this;
  }

  public AccountFetchResponseData firstUpdateState(String firstUpdateState) {
    this.firstUpdateState = firstUpdateState;
    return this;
  }

  public AccountFetchResponseData adAuditReviewResult(String adAuditReviewResult) {
    this.adAuditReviewResult = adAuditReviewResult;
    return this;
  }

  public AccountFetchResponseData platform(String platform) {
    this.platform = platform;
    return this;
  }

  public AccountFetchResponseData createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}