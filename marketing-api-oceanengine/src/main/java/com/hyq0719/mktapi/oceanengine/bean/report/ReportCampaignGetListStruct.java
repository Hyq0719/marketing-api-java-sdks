/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.report;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * 
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 12:53:59
 */
@Data
public class ReportCampaignGetListStruct {
  /**
   * 广告组id，分组条件包含STAT_GROUP_BY_FIELD_ID时，返回具体值
   */
  @SerializedName("campaign_id")
  private Long campaignId = null;

  /**
   * 广告组name，分组条件包含STAT_GROUP_BY_FIELD_ID时，返回具体值
   */
  @SerializedName("campaign_name")
  private String campaignName = null;

  /**
   * 数据起始时间，分组条件包含 STAT_GROUP_BY_FIELD_STAT_TIME 时返回，格式为：yyyy-MM-dd HH:mm:ss
   */
  @SerializedName("stat_datetime")
  private String statDatetime = null;

  /**
   * 投放广告位，分组条件包含STAT_GROUP_BY_INVENTORY时返回，具体可查看【附录-首选投放位置】
   */
  @SerializedName("inventory")
  private String inventory = null;

  /**
   * 创意类型，分组条件包含STAT_GROUP_BY_CREATIVE_MATERIAL_MODE时返回，允许值：STATIC_ASSEMBLE（程序化创意）、INTERVENE（自定义创意）
   */
  @SerializedName("creative_material_mode")
  private String creativeMaterialMode = null;

  /**
   * 推广目的类型，分组条件包含STAT_GROUP_BY_LANDING_TYPE时返回，具体可查看【附录-首选投放位置】
   */
  @SerializedName("landing_type")
  private String landingType = null;

  /**
   * 出价类型，分组条件包含STAT_GROUP_BY_PRICING时返回，具体可查看【附录-首选投放位置】
   */
  @SerializedName("pricing")
  private String pricing = null;

  /**
   * 素材类型，分组条件STAT_GROUP_BY_IMAGE_MODE返回，具体可查看【附录-首选投放位置】
   */
  @SerializedName("image_mode")
  private String imageMode = null;

  /**
   * 省份。如果分组条件中包括 STAT_GROUP_BY_PROVINCE_NAME 时返回。
   */
  @SerializedName("province_name")
  private String provinceName = null;

  /**
   * 城市。如果分组条件中包括 STAT_GROUP_BY_CITY_NAME 时返回。
   */
  @SerializedName("city_name")
  private String cityName = null;

  /**
   * 性别。如果分组条件中包括 STAT_GROUP_BY_GENDER 时返回。
   */
  @SerializedName("gender")
  private String gender = null;

  /**
   * 年龄。如果分组条件中包括 STAT_GROUP_BY_AGE 时返回。
   */
  @SerializedName("age")
  private String age = null;

  /**
   * 平台。如果分组条件中包括 STAT_GROUP_BY_PLATFORM 时返回。
   */
  @SerializedName("platform")
  private String platform = null;

  /**
   * 网络类型。如果分组条件中包括 STAT_GROUP_BY_AC 时返回。
   */
  @SerializedName("ac")
  private String ac = null;

  /**
   * 展现数据-总花费 表示广告在投放期内的预估花费金额,当天数据可能会有波动，次日稳定
   */
  @SerializedName("cost")
  private Float cost = null;

  /**
   * 展现数据-展示数 广告展示给用户的次数。计算方式：经平台判定有效且被计费的展示次数
   */
  @SerializedName("show")
  private Long show = null;

  /**
   * 展现数据-平均千次展现费用 广告平均每一千次展现所付出的费用，计算公式是：总花费/展示数*1000
   */
  @SerializedName("avg_show_cost")
  private Float avgShowCost = null;

  /**
   * 展现数据-点击数 当头条用户点击广告素材时，触发点击事件，该事件被认为是一次有效的广告点击
   */
  @SerializedName("click")
  private Long click = null;

  /**
   * 展现数据-平均点击单价 广告主为每次点击付出的费用成本，计算公式是：总花费/点击数
   */
  @SerializedName("avg_click_cost")
  private Float avgClickCost = null;

  /**
   * 展现数据-点击率 广告被点击的次数占展示次数的百分比。计算方法：点击数/展示数*100%
   */
  @SerializedName("ctr")
  private Float ctr = null;

  /**
   * 转化数据-转化数 将转化数记录在转化事件发生的时间上。建议广告主考核成本时参考“转化数据（计费时间）”例如您的广告在早上8点进行了展示和点击，用户晚上19点发生了激活行为，我们会把激活数披露在晚上19...
   */
  @SerializedName("convert")
  private Long convert = null;

  /**
   * 转化数据-转化成本 广告主为每个转化所付出的平均成本，计算方式：总花费/转化数。当天数据可能会有波动
   */
  @SerializedName("convert_cost")
  private Float convertCost = null;

  /**
   * 转化数据-转化率 广告被用户转化的次数占点击次数的百分比。计算方式：转化数/点击数*100%
   */
  @SerializedName("convert_rate")
  private Float convertRate = null;

  /**
   * 转化数据-深度转化数 将深度转化数记录在转化事件发生的时间上。建议广告主考核深度转化成本时参考“深度转化数（计费时间）”例如您的广告在早上8点进行了展示和点击，用户晚上19点发生了激活行为，我们会把激...
   */
  @SerializedName("deep_convert")
  private Long deepConvert = null;

  /**
   * 转化数据-深度转化成本 广告主为每个深度转化所付出的平均成本，计算方法：总花费/深度转化数。当天数据可能会有波动，次日早8点后稳定
   */
  @SerializedName("deep_convert_cost")
  private Float deepConvertCost = null;

  /**
   * 转化数据-深度转化率 广告被用户进行深度转化的次数占转化次数的百分比。计算方式：深度转化数/转化数*100%
   */
  @SerializedName("deep_convert_rate")
  private Float deepConvertRate = null;

  /**
   * 转化数据（计费时间）-转化数（计费时间） 在转化行为发生（或回传）后，将转化行为回记到过去7天内的扣费（消耗产生）时间上。 例如：广告在8月20日展示给用户，此时广告花费10元，用户点击广告后于8月2...
   */
  @SerializedName("attribution_convert")
  private Long attributionConvert = null;

  /**
   * 转化数据（计费时间）-转化成本（计费时间） 转化成本(计费时间) = 消耗 / 转化数(计费时间)。例如：广告在8月20日展示给用户，此时广告花费10元，用户点击广告后，于8月23日产生2笔购买，则8...
   */
  @SerializedName("attribution_convert_cost")
  private Float attributionConvertCost = null;

  /**
   * 转化数据（计费时间）-深度转化数（计费时间） 在转化行为发生（或回传）后，将转化行为回记到过去7天内的扣费（消耗产生）时间上。 例如：广告在8月20日展示给用户，此时广告花费10元，用户点击广告后于8...
   */
  @SerializedName("attribution_deep_convert")
  private Long attributionDeepConvert = null;

  /**
   * 转化数据（计费时间）-深度转化成本（计费时间） 是一个准确的深度转化成本评估指标。计算方式：消耗 / 深度转化数(计费时间)。例如：广告在8月20日展示给用户，此时广告花费10元，用户点击广告后，于 ...
   */
  @SerializedName("attribution_deep_convert_cost")
  private Float attributionDeepConvertCost = null;

  /**
   * 应用下载广告数据-安卓下载开始数 用户在落地页中开始安装包下载进程的次数，仅安卓下载可以监测到该行为
   */
  @SerializedName("download_start")
  private Long downloadStart = null;

  /**
   * 应用下载广告数据-安卓下载开始成本 计算方法：总花费/安卓下载开始数
   */
  @SerializedName("download_start_cost")
  private Float downloadStartCost = null;

  /**
   * 应用下载广告数据-安卓下载开始率 计算方法：安卓下载开始数/点击数
   */
  @SerializedName("download_start_rate")
  private Float downloadStartRate = null;

  /**
   * 应用下载广告数据-安卓下载完成数 用户在落地页中下载安装包进程完成的次数，仅安卓下载可以监测到该行为
   */
  @SerializedName("download_finish")
  private Long downloadFinish = null;

  /**
   * 应用下载广告数据-安卓下载完成成本 计算方式：总花费/安卓下载完成数
   */
  @SerializedName("download_finish_cost")
  private Float downloadFinishCost = null;

  /**
   * 应用下载广告数据-安卓下载完成率 计算方式：安卓下载完成数/安卓下载开始数
   */
  @SerializedName("download_finish_rate")
  private Float downloadFinishRate = null;

  /**
   * 应用下载广告数据-点击安装数 用户点击安装完成的次数
   */
  @SerializedName("click_install")
  private Long clickInstall = null;

  /**
   * 应用下载广告数据-安卓安装完成数 用户在落地页中将安装包安装完成的次数，仅安卓下载可以监测到该行为
   */
  @SerializedName("install_finish")
  private Long installFinish = null;

  /**
   * 应用下载广告数据-安卓安装完成成本 计算方式：总花费/安卓安装完成数
   */
  @SerializedName("install_finish_cost")
  private Float installFinishCost = null;

  /**
   * 应用下载广告数据-安卓安装完成率 计算方式：安卓安装完成数/安卓下载完成数
   */
  @SerializedName("install_finish_rate")
  private Float installFinishRate = null;

  /**
   * 应用下载广告数据-激活数 如果您对接了API，激活数是您认可且回传成功的的激活数。如果您对接了SDK，则激活数是指用户下载您的APP后打开的次数
   */
  @SerializedName("active")
  private Long active = null;

  /**
   * 应用下载广告数据-激活成本 计算方式：总花费/激活数
   */
  @SerializedName("active_cost")
  private Float activeCost = null;

  /**
   * 应用下载广告数据-激活率 计算方式：激活数/点击数*100%
   */
  @SerializedName("active_rate")
  private Float activeRate = null;

  /**
   * 应用下载广告数据-注册数 如果您对接了API，注册数是您认可且回传成功的的注册数。如果您对接了SDK，则注册数是用户实现注册行为的次数
   */
  @SerializedName("register")
  private Long register = null;

  /**
   * 应用下载广告数据-注册成本 广告主为每个注册所付出的成本，计算公式是：总花费/注册数，当天数据可能会有波动，次日早8点后稳定
   */
  @SerializedName("active_register_cost")
  private Float activeRegisterCost = null;

  /**
   * 应用下载广告数据-注册率 注册用户占激活用户的比例
   */
  @SerializedName("active_register_rate")
  private Float activeRegisterRate = null;

  /**
   * 应用下载广告数据-次留（未对回） 在次留行为发生或回传后，将次留数匹配到相应的激活时间上，用来查看当天在第二天的次留数。当天数据不产出（不精准）
   */
  @SerializedName("next_day_open")
  private Long nextDayOpen = null;

  /**
   * 应用下载广告数据-次留成本（未对回） 次留成本=消耗/次留数（不精准）
   */
  @SerializedName("next_day_open_cost")
  private Float nextDayOpenCost = null;

  /**
   * 应用下载广告数据-次留率（未对回） 次留率=次留数/激活数（不精准）
   */
  @SerializedName("next_day_open_rate")
  private Float nextDayOpenRate = null;

  /**
   * 应用下载广告数据-次留数 在次留行为发生或回传后，将次留数匹配到相应的激活时间上，用来查看当天在第二天的次留数。当天数据不产出
   */
  @SerializedName("attribution_next_day_open_cnt")
  private Long attributionNextDayOpenCnt = null;

  /**
   * 应用下载广告数据-次留成本 次留成本=消耗/次留数
   */
  @SerializedName("attribution_next_day_open_cost")
  private Float attributionNextDayOpenCost = null;

  /**
   * 应用下载广告数据-次留率 次留率=次留数/激活数
   */
  @SerializedName("attribution_next_day_open_rate")
  private Float attributionNextDayOpenRate = null;

  /**
   * 应用下载广告数据-关键行为数 有APP内关键行为的用户数量
   */
  @SerializedName("game_addiction")
  private Long gameAddiction = null;

  /**
   * 应用下载广告数据-关键行为成本 广告主为每个有APP内关键行为的用户所付出的成本，计算公式是总花费/关键行为数。当天数据可能会有波动，次日早8点后稳定
   */
  @SerializedName("game_addiction_cost")
  private Float gameAddictionCost = null;

  /**
   * 应用下载广告数据-关键行为率 关键行为用户占激活用户的比例
   */
  @SerializedName("game_addiction_rate")
  private Float gameAddictionRate = null;

  /**
   * 应用下载广告数据-首次付费次数 用户在应用内首次完成付费的次数
   */
  @SerializedName("pay_count")
  private Long payCount = null;

  /**
   * 应用下载广告数据-首次付费成本 用户在应用内首次完成付费的成本，计算方式：消耗/首次付费数
   */
  @SerializedName("active_pay_cost")
  private Float activePayCost = null;

  /**
   * 应用下载广告数据-首次付费率 计算方式：首次付费数/激活数
   */
  @SerializedName("active_pay_rate")
  private Float activePayRate = null;

  /**
   * 应用下载广告数据-完件数 互联网金融-贷款行业中，用户成功提交贷款额度申请的行为
   */
  @SerializedName("loan_completion")
  private Long loanCompletion = null;

  /**
   * 应用下载广告数据-完件成本 计算方式：总花费／完件数。当天数据可能会有波动，次日早8点后稳定
   */
  @SerializedName("loan_completion_cost")
  private Float loanCompletionCost = null;

  /**
   * 应用下载广告数据-完件率 计算方式：完件数／注册数
   */
  @SerializedName("loan_completion_rate")
  private Float loanCompletionRate = null;

  /**
   * 应用下载广告数据-预授信数 互联网金融-贷款行业中，用户提交一部分个人信息后，广告主初步审批通过，并引导用户进行更加详细的信息填写以完成最终授信
   */
  @SerializedName("pre_loan_credit")
  private Long preLoanCredit = null;

  /**
   * 应用下载广告数据-预授信成本 计算方式：总花费／预授信数。当天数据可能会有波动，次日早8点后稳定
   */
  @SerializedName("pre_loan_credit_cost")
  private Float preLoanCreditCost = null;

  /**
   * 应用下载广告数据-授信数 互联网金融-贷款行业中，用户提交贷款额度申请后，广告主审批通过，给予用户可贷款的额度
   */
  @SerializedName("loan_credit")
  private Long loanCredit = null;

  /**
   * 应用下载广告数据-授信成本 计算方式：总花费／授信数。当天数据可能会有波动，次日早8点后稳定
   */
  @SerializedName("loan_credit_cost")
  private Float loanCreditCost = null;

  /**
   * 应用下载广告数据-授信率 计算方式：授信数／完件数
   */
  @SerializedName("loan_credit_rate")
  private Float loanCreditRate = null;

  /**
   * 应用下载广告数据-APP内访问 用户调起APP后到达的次数，一般在DPA广告中使用
   */
  @SerializedName("in_app_uv")
  private Long inAppUv = null;

  /**
   * 应用下载广告数据-APP内访问详情页 用户调起APP后到达指定详情页的次数，一般在DPA广告中使用
   */
  @SerializedName("in_app_detail_uv")
  private Long inAppDetailUv = null;

  /**
   * 应用下载广告数据-APP内加入购物车 用户调起APP后到达指定详情页的次数，一般在DPA广告中使用
   */
  @SerializedName("in_app_cart")
  private Long inAppCart = null;

  /**
   * 应用下载广告数据-APP内付费 用户调起APP后完成付费的次数，一般在DPA广告中使用
   */
  @SerializedName("in_app_pay")
  private Long inAppPay = null;

  /**
   * 应用下载广告数据-APP内下单 用户调起APP后提交订单的次数，一般在DPA广告中使用
   */
  @SerializedName("in_app_order")
  private Long inAppOrder = null;

  /**
   * 应用下载广告数据-7日付费次数（激活时间） 用户激活应用后的7天内，在应用内完成付费的总次数，并将付费次数披露在每个用户的激活时间上
   */
  @SerializedName("attribution_game_pay_7d_count")
  private Long attributionGamePay7dCount = null;

  /**
   * 应用下载广告数据-7日付费成本（激活时间） 用户激活应用后的7天内，在应用内完成付费的平均成本，计算方式：消耗/7日付费次数(激活时间)
   */
  @SerializedName("attribution_game_pay_7d_cost")
  private Float attributionGamePay7dCost = null;

  /**
   * 应用下载广告数据-7日人均付费次数（激活时间） 7天内用户的平均付费次数，计算方式：7日付费次数（激活时间）/7日首次付费数(激活时间)，对首次付费数的统计仅在计划内去重且披露在每个用户的激活时间上
   */
  @SerializedName("attribution_active_pay_7d_per_count")
  private Long attributionActivePay7dPerCount = null;

  /**
   * 应用下载广告数据-付费成本 当天用户在应用内完成付费的平均成本，计算方式：消耗/付费次数
   */
  @SerializedName("game_pay_cost")
  private Long gamePayCost = null;

  /**
   * 应用下载广告数据-付费次数 当天用户在应用内完成付费的总次数，多次付费会重复计数
   */
  @SerializedName("game_pay_count")
  private Long gamePayCount = null;

  /**
   * 落地页转化数据-点击电话按钮 用户点击POI页面的电话按钮的次数
   */
  @SerializedName("phone")
  private Long phone = null;

  /**
   * 落地页转化数据-表单提交 用户在门店落地页多线沟通提交表单的次数
   */
  @SerializedName("form")
  private Long form = null;

  /**
   * 落地页转化数据-地图搜索 用户进行地图搜索的次数
   */
  @SerializedName("map_search")
  private Long mapSearch = null;

  /**
   * 落地页转化数据-按钮button 用户点击按钮button的次数
   */
  @SerializedName("button")
  private Long button = null;

  /**
   * 落地页转化数据-关键页面浏览 用户在关键页面的浏览次数
   */
  @SerializedName("view")
  private Long view = null;

  /**
   * 落地页转化数据-下载开始 用户点击下载开始的次数
   */
  @SerializedName("download")
  private Long download = null;

  /**
   * 落地页转化数据-QQ咨询 用户点击QQ咨询按钮的次数
   */
  @SerializedName("qq")
  private Long qq = null;

  /**
   * 落地页转化数据-抽奖 用户点击抽奖按钮的次数
   */
  @SerializedName("lottery")
  private Long lottery = null;

  /**
   * 落地页转化数据-投票 用户点击投票按钮的次数
   */
  @SerializedName("vote")
  private Long vote = null;

  /**
   * 落地页转化数据-短信咨询 用户点击短信咨询的次数
   */
  @SerializedName("message")
  private Long message = null;

  /**
   * 落地页转化数据-页面跳转 用户跳转至其他页面的次数
   */
  @SerializedName("redirect")
  private Long redirect = null;

  /**
   * 落地页转化数据-商品购买 用户购买商品的次数
   */
  @SerializedName("shopping")
  private Long shopping = null;

  /**
   * 落地页转化数据-在线咨询 用户点击在线咨询按钮的次数
   */
  @SerializedName("consult")
  private Long consult = null;

  /**
   * 落地页转化数据-微信复制 用户通过长按复制微信号的次数
   */
  @SerializedName("wechat")
  private Long wechat = null;

  /**
   * 落地页转化数据-智能电话-确认拨打 用户点击确认拨打电话按钮的次数
   */
  @SerializedName("phone_confirm")
  private Long phoneConfirm = null;

  /**
   * 落地页转化数据-智能电话-确认接通 用户在门店落地页点击多线沟通的电话按钮并接通的次数
   */
  @SerializedName("phone_connect")
  private Long phoneConnect = null;

  /**
   * 落地页转化数据-有效咨询 用户在门店落地页多线沟通的在线咨询中有效咨询的次数
   */
  @SerializedName("consult_effective")
  private Long consultEffective = null;

  /**
   * 落地页转化数据-建站卡券领取 用户点击POI页面卡券领取按钮的次数
   */
  @SerializedName("coupon")
  private Long coupon = null;

  /**
   * 落地页转化数据-卡券页领取 用户点击卡券页领取按钮的次数
   */
  @SerializedName("coupon_single_page")
  private Long couponSinglePage = null;

  /**
   * 落地页及门店数据-调起店铺 用户调起第三方店铺的次数
   */
  @SerializedName("redirect_to_shop")
  private Long redirectToShop = null;

  /**
   * 落地页及门店数据-店铺收藏 用户点击POI页面的收藏按钮的次数
   */
  @SerializedName("poi_collect")
  private Long poiCollect = null;

  /**
   * 落地页及门店数据-查看店铺地址 用户点击顶部地图图标区域展开详细地图/点击图片下方地址展开详细地图/点击图片下方地址展开详细地图的次数
   */
  @SerializedName("poi_address_click")
  private Long poiAddressClick = null;

  /**
   * 落地页及门店数据-鲁班订单量 该条广告产生的订单数量
   */
  @SerializedName("luban_order_cnt")
  private Long lubanOrderCnt = null;

  /**
   * 落地页及门店数据-鲁班订单金额 该条广告产生订单的实际销售金额，不含优惠券和退款。当前仅支持商品推广的计划
   */
  @SerializedName("luban_order_stat_amount")
  private Float lubanOrderStatAmount = null;

  /**
   * 落地页及门店数据-鲁班ROI 计算公式：订单金额/广告消耗。当前仅支持商品推广的计划
   */
  @SerializedName("luban_order_roi")
  private Float lubanOrderRoi = null;

  /**
   * 落地页及门店数据-直播间观看数 用户进入您直播间的次数
   */
  @SerializedName("luban_live_enter_cnt")
  private Long lubanLiveEnterCnt = null;

  /**
   * 落地页及门店数据-直播间超过1分钟观看数 用户在您的直播间单次观看时长超过1分钟的次数，目前仅支持鲁班直播、抖音号推广直播、品牌Feeds Live直播和品牌TopLive直播
   */
  @SerializedName("live_watch_one_minute_count")
  private Long liveWatchOneMinuteCount = null;

  /**
   * 落地页及门店数据-直播间关注数 您的直播间新增的关注数，目前仅支持鲁班直播、抖音号推广直播、品牌Feeds Live直播和品牌TopLive直播
   */
  @SerializedName("luban_live_follow_cnt")
  private Long lubanLiveFollowCnt = null;

  /**
   * 落地页及门店数据-直播间加入粉丝团 用户在您的直播间成功加入粉丝团的次数，目前仅支持鲁班直播、抖音号推广直播、品牌Feeds Live直播和品牌TopLive直播
   */
  @SerializedName("live_fans_club_join_cnt")
  private Long liveFansClubJoinCnt = null;

  /**
   * 落地页及门店数据-直播间评论数 用户在您的直播间输入评论并点击发送消息的次数，目前仅支持鲁班直播、抖音号推广直播、品牌Feeds Live直播和品牌TopLive直播
   */
  @SerializedName("luban_live_comment_cnt")
  private Long lubanLiveCommentCnt = null;

  /**
   * 落地页及门店数据-直播间分享数 用户在您的直播间点击分享到其他社交媒体的次数，目前仅支持鲁班直播、抖音号推广直播、品牌Feeds Live直播和品牌TopLive直播
   */
  @SerializedName("luban_live_share_cnt")
  private Long lubanLiveShareCnt = null;

  /**
   * 落地页及门店数据-直播间打赏次数 用户在您的直播间成功打赏的次数，目前仅支持鲁班直播、抖音号推广直播、品牌Feeds Live直播和品牌TopLive直播
   */
  @SerializedName("luban_live_gift_cnt")
  private Long lubanLiveGiftCnt = null;

  /**
   * 落地页及门店数据-直播间礼物总金额 用户在您的直播间打赏的总金额，单位：音浪。目前仅支持鲁班直播、抖音号推广直播、品牌Feeds Live直播和品牌TopLive直播
   */
  @SerializedName("luban_live_gift_amount")
  private Float lubanLiveGiftAmount = null;

  /**
   * 落地页及门店数据-直播间查看购物车数 用户在您的直播间点击查看购物车的次数，目前仅支持鲁班直播、抖音号推广直播、品牌Feeds Live直播和品牌TopLive直播
   */
  @SerializedName("luban_live_slidecart_click_cnt")
  private Long lubanLiveSlidecartClickCnt = null;

  /**
   * 落地页及门店数据-直播间点击商品数 用户在您的直播间点击商品的次数，目前仅支持鲁班直播、抖音号推广直播、品牌Feeds Live直播和品牌TopLive直播
   */
  @SerializedName("luban_live_click_product_cnt")
  private Long lubanLiveClickProductCnt = null;

  /**
   * 落地页及门店数据-直播间订单量 用户在您直播间的支付成功的订单量
   */
  @SerializedName("luban_live_pay_order_count")
  private Long lubanLivePayOrderCount = null;

  /**
   * 落地页及门店数据-直播间订单金额 用户在您直播间的支付成功的订单金额，单位：元。
   */
  @SerializedName("luban_live_pay_order_stat_cost")
  private Float lubanLivePayOrderStatCost = null;

  /**
   * 落地页及门店数据-直播间组件点击数。用户点击小风车+卡片组件的总次数
   */
  @SerializedName("live_component_click_count")
  private Long liveComponentClickCount = null;

  /**
   * 落地页及门店数据-直播间组件点击成本。总花费/组件点击数
   */
  @SerializedName("live_component_click_cost")
  private Float liveComponentClickCost = null;

  /**
   * 落地页及门店数据-直播间组件点击率。组件点击数/组件曝光数
   */
  @SerializedName("live_component_click_rate")
  private Float liveComponentClickRate = null;

  /**
   * 落地页及门店数据-微信内注册数 当天用户在微信内完成注册的总次数，将注册数记录在事件发生的时间上。例如，您的广告在8月20日展示给用户，用户点击广告后于8月23日在微信内产生注册行为，则这个注册行为将...
   */
  @SerializedName("wechat_login_count")
  private Long wechatLoginCount = null;

  /**
   * 落地页及门店数据-微信内注册数(计费时间) 微信内注册行为发生（或回传）后，将注册行为记录到过去30天内的扣费（消耗产生）时间上。例如，广告在8月20日展示给用户，用户点击广告后于8月23日在微信内产...
   */
  @SerializedName("attribution_wechat_login_30d_count")
  private Long attributionWechatLogin30dCount = null;

  /**
   * 落地页及门店数据-微信内注册成本 当天用户在微信内完成注册的平均成本，计算公式：消耗/微信内注册数
   */
  @SerializedName("wechat_login_cost")
  private Float wechatLoginCost = null;

  /**
   * 落地页及门店数据-微信内注册成本(计费时间) 计算方式： 消耗 / 微信内注册数(计费时间)。例如，广告在8月20日展示给2位用户，此时广告计划10元，2位用户点击广告后于8月23日在微信内产生注册行...
   */
  @SerializedName("attribution_wechat_login_30d_cost")
  private Float attributionWechatLogin30dCost = null;

  /**
   * 落地页及门店数据-微信内首次付费数 当天用户在微信内首次完成付费的总次数，将付费数记录在事件发生的时间上。例如，用户于8月20日产生注册行为，8月23日在微信内产生首次付费行为，则这个付费行为将会展示...
   */
  @SerializedName("wechat_first_pay_count")
  private Long wechatFirstPayCount = null;

  /**
   * 落地页及门店数据-微信内首次付费数(计费时间) 微信内付费行为发生（或回传）后，将付费行为记录到过去30天内的扣费（消耗产生）时间上。例如，广告在8月20日展示给用户，用户点击广告后于8月23日在微信...
   */
  @SerializedName("attribution_wechat_first_pay_30d_count")
  private Long attributionWechatFirstPay30dCount = null;

  /**
   * 落地页及门店数据-微信内首次付费成本 当天用户在微信内完成首次付费的平均成本，计算公式：消耗/微信内首次付费数
   */
  @SerializedName("wechat_first_pay_cost")
  private Float wechatFirstPayCost = null;

  /**
   * 落地页及门店数据-微信内首次付费成本(计费时间) 计算方式：消耗 / 微信内首次付费数（计费时间）。例如，广告在8月20日展示给2位用户，此时广告计划10元，2位用户点击广告后于8月23日在微信内产生...
   */
  @SerializedName("attribution_wechat_first_pay_30d_cost")
  private Float attributionWechatFirstPay30dCost = null;

  /**
   * 落地页及门店数据-微信内首次付费率 计算公式：微信内首次付费数/微信内注册数
   */
  @SerializedName("wechat_first_pay_rate")
  private Float wechatFirstPayRate = null;

  /**
   * 落地页及门店数据-微信内首次付费率(计费时间) 计算公式：微信内首次付费数(计费时间)/微信内注册数(计费时间)
   */
  @SerializedName("attribution_wechat_first_pay_30d_rate")
  private Float attributionWechatFirstPay30dRate = null;

  /**
   * 落地页及门店数据-微信内首次付费金额 当天用户在微信内完成首次付费的总金额
   */
  @SerializedName("wechat_pay_amount")
  private Float wechatPayAmount = null;

  /**
   * 落地页及门店数据-微信内首次付费金额(计费时间) 当天用户在微信内完成首次付费的总金额，将付费金额记录到过去30天内的扣费（消耗产生）时间上。例如，广告在8月20日展示给用户，用户点击广告后于8月23...
   */
  @SerializedName("attribution_wechat_pay_30d_amount")
  private Float attributionWechatPay30dAmount = null;

  /**
   * 落地页及门店数据-微信内首次付费ROI 所选时间范围内的微信内首次付费ROI，计算公式：微信内首次付费金额（计费时间）/消耗
   */
  @SerializedName("attribution_wechat_pay_30d_roi")
  private Float attributionWechatPay30dRoi = null;

  /**
   * 落地页及门店数据-智能电话-有效接通 用户在门店落地页点击多线沟通的电话按钮并有效接通的次数
   */
  @SerializedName("phone_effective")
  private Long phoneEffective = null;

  /**
   * 视频数据-播放数 播放时间大于0S的数量，在某些蜂窝网络环境下，需要您手动点击开始才会开始播放，因此有时播放数小于展示数
   */
  @SerializedName("total_play")
  private Long totalPlay = null;

  /**
   * 视频数据-有效播放数 竞价广告播放时间大于等于10秒的数量，如果视频总时长不足10秒，则记录播放完成的次数。品牌广告在部分APP（头条、头条lite、抖音、西瓜、抖音火山版、皮皮虾）播放时间大于等于5...
   */
  @SerializedName("valid_play")
  private Long validPlay = null;

  /**
   * 视频数据-有效播放成本 计算公式：总花费/有效播放数，当天数据可能会有波动，次日早8点后稳定
   */
  @SerializedName("valid_play_cost")
  private Float validPlayCost = null;

  /**
   * 视频数据-有效播放率 计算公式：有效播放数/展示数
   */
  @SerializedName("valid_play_rate")
  private Float validPlayRate = null;

  /**
   * 视频数据-25%进度播放数 用户播放至视频长度25%及以上的次数，包括跳跃播放至此长度的播放次数
   */
  @SerializedName("play_25_feed_break")
  private Long play25FeedBreak = null;

  /**
   * 视频数据-50%进度播放数 用户播放至视频长度50%及以上的次数，包括跳跃播放至此长度的播放次数
   */
  @SerializedName("play_50_feed_break")
  private Long play50FeedBreak = null;

  /**
   * 视频数据-75%进度播放数 用户播放至视频长度75%及以上的次数，包括跳跃播放至此长度的播放次数
   */
  @SerializedName("play_75_feed_break")
  private Long play75FeedBreak = null;

  /**
   * 视频数据-99%进度播放数 用户播放至视频长度99%及以上的次数，包括跳跃播放至此长度的播放次数
   */
  @SerializedName("play_100_feed_break")
  private Long play100FeedBreak = null;

  /**
   * 视频数据-平均单次播放时长，单位：秒 计算方法：视频播放总实际时长／播放总次数（不包含跳跃的时长）
   */
  @SerializedName("average_play_time_per_play")
  private Float averagePlayTimePerPlay = null;

  /**
   * 视频数据-播完率 计算公式：播放完成数/播放数
   */
  @SerializedName("play_over_rate")
  private Float playOverRate = null;

  /**
   * 视频数据-WiFi播放占比 在wifi环境下视频的播放数/视频播放总数
   */
  @SerializedName("wifi_play_rate")
  private Float wifiPlayRate = null;

  /**
   * 视频数据-WiFi播放量 在wifi环境下视频的播放数
   */
  @SerializedName("wifi_play")
  private Long wifiPlay = null;

  /**
   * 视频数据-播放时长，单位ms 计算方法：视频播放总实际时长／播放总次数（不包含跳跃的时长）
   */
  @SerializedName("play_duration_sum")
  private Long playDurationSum = null;

  /**
   * 附加创意-附加创意电话按钮点击 用户查看创意的附加创意后，点击电话拨打按钮的次数
   */
  @SerializedName("advanced_creative_phone_click")
  private Long advancedCreativePhoneClick = null;

  /**
   * 附加创意-附加创意在线咨询点击 用户查看创意的附加创意后，点击在线咨询的次数
   */
  @SerializedName("advanced_creative_counsel_click")
  private Long advancedCreativeCounselClick = null;

  /**
   * 附加创意-附加创意表单按钮点击 用户查看创意的附加创意后，点击表单提交按钮的次数
   */
  @SerializedName("advanced_creative_form_click")
  private Long advancedCreativeFormClick = null;

  /**
   * 附加创意-附加创意卡券领取 用户查看创意的附加创意后，领取卡券的次数
   */
  @SerializedName("advanced_creative_coupon_addition")
  private Long advancedCreativeCouponAddition = null;

  /**
   * 附加创意-附加创意表单提交 用户查看创意的附加创意后，提交表单的次数
   */
  @SerializedName("advanced_creative_form_submit")
  private Long advancedCreativeFormSubmit = null;

  /**
   * 视频数据3秒卡片展现 对于视频卡片类广告，在视频播放到3秒时进行卡片展现的数量
   */
  @SerializedName("card_show")
  private Long cardShow = null;

  /**
   * 互动数据-分享数 用户把分享广告到其他社交媒体的次数，成功完成一次分享行为记一次分享数
   */
  @SerializedName("share")
  private Long share = null;

  /**
   * 互动数据-评论数 用户在评论区对广告创意输入评论并点击提交的次数，仅限有评论区的APP（西瓜目前没有评论区）
   */
  @SerializedName("comment")
  private Long comment = null;

  /**
   * 互动数据-点赞数 广告被用户点赞的数量
   */
  @SerializedName("like")
  private Long like = null;

  /**
   * 互动数据-新增关注数 广告被受众新增关注的数量，目前抖音、头条号外、微头条、抖音火山版可新增关注
   */
  @SerializedName("follow")
  private Long follow = null;

  /**
   * 互动数据-主页访问量 点击广告头像进入主页进行访问的次数，目前抖音、头条号外、抖音火山版可进行主页访问
   */
  @SerializedName("home_visited")
  private Long homeVisited = null;

  /**
   * 互动数据-挑战赛查看数 抖音广告中，用户点击挑战赛查看的数量
   */
  @SerializedName("ies_challenge_click")
  private Long iesChallengeClick = null;

  /**
   * 互动数据-音乐查看数 抖音广告中，用户点击音乐查看的数量
   */
  @SerializedName("ies_music_click")
  private Long iesMusicClick = null;

  /**
   * 互动数据-POI点击数 抖音广告中，用户点击POI组件的次数，一般出现在信息流或评论页面。POI为Point of Interest缩写
   */
  @SerializedName("location_click")
  private Long locationClick = null;

  /**
   * 互动数据-私信数 用户在广告主抖音号主页中发起私信的次数，按人次记数
   */
  @SerializedName("message_action")
  private Long messageAction = null;

  /**
   * 互动数据-推广页访问量 用户在广告主抖音号主页内访问落地页的次数
   */
  @SerializedName("click_landing_page")
  private Long clickLandingPage = null;

  /**
   * 互动数据-主页商品橱窗访问量 用户在广告主抖音号主页中访问商品橱窗的次数
   */
  @SerializedName("click_shopwindow")
  private Long clickShopwindow = null;

  /**
   * 互动数据-主页内落地页访问量（主页官网访问量） 用户在广告主抖音号主页内访问落地页的次数
   */
  @SerializedName("click_website")
  private Long clickWebsite = null;

  /**
   * 互动数据-主页下载链接点击量 用户在广告主抖音号主页内点击下载的次数
   */
  @SerializedName("click_download")
  private Long clickDownload = null;

  /**
   * 互动数据-主页内电话拨打点击量 用户在广告主抖音号主页内点击电话拨打的次数
   */
  @SerializedName("click_call_dy")
  private Long clickCallDy = null;

  /**
   * 提交身份认证数-出行行业司机在应用内提交身份认证的次数 司机端，司机提交身份认证的次数
   */
  @SerializedName("submit_certification_count")
  private Long submitCertificationCount = null;

  /**
   * 通过身份认证数-出行行业司机在应用内成功通过身份认证的次数 司机端，司机通过身份认证的次数
   */
  @SerializedName("approval_count")
  private Long approvalCount = null;

  /**
   * 乘客首次下单数-出行行业乘客在应用内首次成功下单的数量 乘客端，乘客首次发单的次数
   */
  @SerializedName("first_order_count")
  private Long firstOrderCount = null;

  /**
   * 司机首次完单数-出行行业司机在应用内首次成功完成订单的数量 司机端，司机首次完成订单的次数
   */
  @SerializedName("first_rental_order_count")
  private Long firstRentalOrderCount = null;

  /**
   * 乘客首次支付数-出行行业乘客在应用内首次成功支付订单的数量 乘客端，乘客首次支付订单的次数
   */
  @SerializedName("commute_first_pay_count")
  private Long commuteFirstPayCount = null;

  public ReportCampaignGetListStruct campaignId (Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  public ReportCampaignGetListStruct campaignName (String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  public ReportCampaignGetListStruct statDatetime (String statDatetime) {
    this.statDatetime = statDatetime;
    return this;
  }

  public ReportCampaignGetListStruct inventory (String inventory) {
    this.inventory = inventory;
    return this;
  }

  public ReportCampaignGetListStruct creativeMaterialMode (String creativeMaterialMode) {
    this.creativeMaterialMode = creativeMaterialMode;
    return this;
  }

  public ReportCampaignGetListStruct landingType (String landingType) {
    this.landingType = landingType;
    return this;
  }

  public ReportCampaignGetListStruct pricing (String pricing) {
    this.pricing = pricing;
    return this;
  }

  public ReportCampaignGetListStruct imageMode (String imageMode) {
    this.imageMode = imageMode;
    return this;
  }

  public ReportCampaignGetListStruct provinceName (String provinceName) {
    this.provinceName = provinceName;
    return this;
  }

  public ReportCampaignGetListStruct cityName (String cityName) {
    this.cityName = cityName;
    return this;
  }

  public ReportCampaignGetListStruct gender (String gender) {
    this.gender = gender;
    return this;
  }

  public ReportCampaignGetListStruct age (String age) {
    this.age = age;
    return this;
  }

  public ReportCampaignGetListStruct platform (String platform) {
    this.platform = platform;
    return this;
  }

  public ReportCampaignGetListStruct ac (String ac) {
    this.ac = ac;
    return this;
  }

  public ReportCampaignGetListStruct cost (Float cost) {
    this.cost = cost;
    return this;
  }

  public ReportCampaignGetListStruct show (Long show) {
    this.show = show;
    return this;
  }

  public ReportCampaignGetListStruct avgShowCost (Float avgShowCost) {
    this.avgShowCost = avgShowCost;
    return this;
  }

  public ReportCampaignGetListStruct click (Long click) {
    this.click = click;
    return this;
  }

  public ReportCampaignGetListStruct avgClickCost (Float avgClickCost) {
    this.avgClickCost = avgClickCost;
    return this;
  }

  public ReportCampaignGetListStruct ctr (Float ctr) {
    this.ctr = ctr;
    return this;
  }

  public ReportCampaignGetListStruct convert (Long convert) {
    this.convert = convert;
    return this;
  }

  public ReportCampaignGetListStruct convertCost (Float convertCost) {
    this.convertCost = convertCost;
    return this;
  }

  public ReportCampaignGetListStruct convertRate (Float convertRate) {
    this.convertRate = convertRate;
    return this;
  }

  public ReportCampaignGetListStruct deepConvert (Long deepConvert) {
    this.deepConvert = deepConvert;
    return this;
  }

  public ReportCampaignGetListStruct deepConvertCost (Float deepConvertCost) {
    this.deepConvertCost = deepConvertCost;
    return this;
  }

  public ReportCampaignGetListStruct deepConvertRate (Float deepConvertRate) {
    this.deepConvertRate = deepConvertRate;
    return this;
  }

  public ReportCampaignGetListStruct attributionConvert (Long attributionConvert) {
    this.attributionConvert = attributionConvert;
    return this;
  }

  public ReportCampaignGetListStruct attributionConvertCost (Float attributionConvertCost) {
    this.attributionConvertCost = attributionConvertCost;
    return this;
  }

  public ReportCampaignGetListStruct attributionDeepConvert (Long attributionDeepConvert) {
    this.attributionDeepConvert = attributionDeepConvert;
    return this;
  }

  public ReportCampaignGetListStruct attributionDeepConvertCost (Float attributionDeepConvertCost) {
    this.attributionDeepConvertCost = attributionDeepConvertCost;
    return this;
  }

  public ReportCampaignGetListStruct downloadStart (Long downloadStart) {
    this.downloadStart = downloadStart;
    return this;
  }

  public ReportCampaignGetListStruct downloadStartCost (Float downloadStartCost) {
    this.downloadStartCost = downloadStartCost;
    return this;
  }

  public ReportCampaignGetListStruct downloadStartRate (Float downloadStartRate) {
    this.downloadStartRate = downloadStartRate;
    return this;
  }

  public ReportCampaignGetListStruct downloadFinish (Long downloadFinish) {
    this.downloadFinish = downloadFinish;
    return this;
  }

  public ReportCampaignGetListStruct downloadFinishCost (Float downloadFinishCost) {
    this.downloadFinishCost = downloadFinishCost;
    return this;
  }

  public ReportCampaignGetListStruct downloadFinishRate (Float downloadFinishRate) {
    this.downloadFinishRate = downloadFinishRate;
    return this;
  }

  public ReportCampaignGetListStruct clickInstall (Long clickInstall) {
    this.clickInstall = clickInstall;
    return this;
  }

  public ReportCampaignGetListStruct installFinish (Long installFinish) {
    this.installFinish = installFinish;
    return this;
  }

  public ReportCampaignGetListStruct installFinishCost (Float installFinishCost) {
    this.installFinishCost = installFinishCost;
    return this;
  }

  public ReportCampaignGetListStruct installFinishRate (Float installFinishRate) {
    this.installFinishRate = installFinishRate;
    return this;
  }

  public ReportCampaignGetListStruct active (Long active) {
    this.active = active;
    return this;
  }

  public ReportCampaignGetListStruct activeCost (Float activeCost) {
    this.activeCost = activeCost;
    return this;
  }

  public ReportCampaignGetListStruct activeRate (Float activeRate) {
    this.activeRate = activeRate;
    return this;
  }

  public ReportCampaignGetListStruct register (Long register) {
    this.register = register;
    return this;
  }

  public ReportCampaignGetListStruct activeRegisterCost (Float activeRegisterCost) {
    this.activeRegisterCost = activeRegisterCost;
    return this;
  }

  public ReportCampaignGetListStruct activeRegisterRate (Float activeRegisterRate) {
    this.activeRegisterRate = activeRegisterRate;
    return this;
  }

  public ReportCampaignGetListStruct nextDayOpen (Long nextDayOpen) {
    this.nextDayOpen = nextDayOpen;
    return this;
  }

  public ReportCampaignGetListStruct nextDayOpenCost (Float nextDayOpenCost) {
    this.nextDayOpenCost = nextDayOpenCost;
    return this;
  }

  public ReportCampaignGetListStruct nextDayOpenRate (Float nextDayOpenRate) {
    this.nextDayOpenRate = nextDayOpenRate;
    return this;
  }

  public ReportCampaignGetListStruct attributionNextDayOpenCnt (Long attributionNextDayOpenCnt) {
    this.attributionNextDayOpenCnt = attributionNextDayOpenCnt;
    return this;
  }

  public ReportCampaignGetListStruct attributionNextDayOpenCost (Float attributionNextDayOpenCost) {
    this.attributionNextDayOpenCost = attributionNextDayOpenCost;
    return this;
  }

  public ReportCampaignGetListStruct attributionNextDayOpenRate (Float attributionNextDayOpenRate) {
    this.attributionNextDayOpenRate = attributionNextDayOpenRate;
    return this;
  }

  public ReportCampaignGetListStruct gameAddiction (Long gameAddiction) {
    this.gameAddiction = gameAddiction;
    return this;
  }

  public ReportCampaignGetListStruct gameAddictionCost (Float gameAddictionCost) {
    this.gameAddictionCost = gameAddictionCost;
    return this;
  }

  public ReportCampaignGetListStruct gameAddictionRate (Float gameAddictionRate) {
    this.gameAddictionRate = gameAddictionRate;
    return this;
  }

  public ReportCampaignGetListStruct payCount (Long payCount) {
    this.payCount = payCount;
    return this;
  }

  public ReportCampaignGetListStruct activePayCost (Float activePayCost) {
    this.activePayCost = activePayCost;
    return this;
  }

  public ReportCampaignGetListStruct activePayRate (Float activePayRate) {
    this.activePayRate = activePayRate;
    return this;
  }

  public ReportCampaignGetListStruct loanCompletion (Long loanCompletion) {
    this.loanCompletion = loanCompletion;
    return this;
  }

  public ReportCampaignGetListStruct loanCompletionCost (Float loanCompletionCost) {
    this.loanCompletionCost = loanCompletionCost;
    return this;
  }

  public ReportCampaignGetListStruct loanCompletionRate (Float loanCompletionRate) {
    this.loanCompletionRate = loanCompletionRate;
    return this;
  }

  public ReportCampaignGetListStruct preLoanCredit (Long preLoanCredit) {
    this.preLoanCredit = preLoanCredit;
    return this;
  }

  public ReportCampaignGetListStruct preLoanCreditCost (Float preLoanCreditCost) {
    this.preLoanCreditCost = preLoanCreditCost;
    return this;
  }

  public ReportCampaignGetListStruct loanCredit (Long loanCredit) {
    this.loanCredit = loanCredit;
    return this;
  }

  public ReportCampaignGetListStruct loanCreditCost (Float loanCreditCost) {
    this.loanCreditCost = loanCreditCost;
    return this;
  }

  public ReportCampaignGetListStruct loanCreditRate (Float loanCreditRate) {
    this.loanCreditRate = loanCreditRate;
    return this;
  }

  public ReportCampaignGetListStruct inAppUv (Long inAppUv) {
    this.inAppUv = inAppUv;
    return this;
  }

  public ReportCampaignGetListStruct inAppDetailUv (Long inAppDetailUv) {
    this.inAppDetailUv = inAppDetailUv;
    return this;
  }

  public ReportCampaignGetListStruct inAppCart (Long inAppCart) {
    this.inAppCart = inAppCart;
    return this;
  }

  public ReportCampaignGetListStruct inAppPay (Long inAppPay) {
    this.inAppPay = inAppPay;
    return this;
  }

  public ReportCampaignGetListStruct inAppOrder (Long inAppOrder) {
    this.inAppOrder = inAppOrder;
    return this;
  }

  public ReportCampaignGetListStruct attributionGamePay7dCount (Long attributionGamePay7dCount) {
    this.attributionGamePay7dCount = attributionGamePay7dCount;
    return this;
  }

  public ReportCampaignGetListStruct attributionGamePay7dCost (Float attributionGamePay7dCost) {
    this.attributionGamePay7dCost = attributionGamePay7dCost;
    return this;
  }

  public ReportCampaignGetListStruct attributionActivePay7dPerCount (Long attributionActivePay7dPerCount) {
    this.attributionActivePay7dPerCount = attributionActivePay7dPerCount;
    return this;
  }

  public ReportCampaignGetListStruct gamePayCost (Long gamePayCost) {
    this.gamePayCost = gamePayCost;
    return this;
  }

  public ReportCampaignGetListStruct gamePayCount (Long gamePayCount) {
    this.gamePayCount = gamePayCount;
    return this;
  }

  public ReportCampaignGetListStruct phone (Long phone) {
    this.phone = phone;
    return this;
  }

  public ReportCampaignGetListStruct form (Long form) {
    this.form = form;
    return this;
  }

  public ReportCampaignGetListStruct mapSearch (Long mapSearch) {
    this.mapSearch = mapSearch;
    return this;
  }

  public ReportCampaignGetListStruct button (Long button) {
    this.button = button;
    return this;
  }

  public ReportCampaignGetListStruct view (Long view) {
    this.view = view;
    return this;
  }

  public ReportCampaignGetListStruct download (Long download) {
    this.download = download;
    return this;
  }

  public ReportCampaignGetListStruct qq (Long qq) {
    this.qq = qq;
    return this;
  }

  public ReportCampaignGetListStruct lottery (Long lottery) {
    this.lottery = lottery;
    return this;
  }

  public ReportCampaignGetListStruct vote (Long vote) {
    this.vote = vote;
    return this;
  }

  public ReportCampaignGetListStruct message (Long message) {
    this.message = message;
    return this;
  }

  public ReportCampaignGetListStruct redirect (Long redirect) {
    this.redirect = redirect;
    return this;
  }

  public ReportCampaignGetListStruct shopping (Long shopping) {
    this.shopping = shopping;
    return this;
  }

  public ReportCampaignGetListStruct consult (Long consult) {
    this.consult = consult;
    return this;
  }

  public ReportCampaignGetListStruct wechat (Long wechat) {
    this.wechat = wechat;
    return this;
  }

  public ReportCampaignGetListStruct phoneConfirm (Long phoneConfirm) {
    this.phoneConfirm = phoneConfirm;
    return this;
  }

  public ReportCampaignGetListStruct phoneConnect (Long phoneConnect) {
    this.phoneConnect = phoneConnect;
    return this;
  }

  public ReportCampaignGetListStruct consultEffective (Long consultEffective) {
    this.consultEffective = consultEffective;
    return this;
  }

  public ReportCampaignGetListStruct coupon (Long coupon) {
    this.coupon = coupon;
    return this;
  }

  public ReportCampaignGetListStruct couponSinglePage (Long couponSinglePage) {
    this.couponSinglePage = couponSinglePage;
    return this;
  }

  public ReportCampaignGetListStruct redirectToShop (Long redirectToShop) {
    this.redirectToShop = redirectToShop;
    return this;
  }

  public ReportCampaignGetListStruct poiCollect (Long poiCollect) {
    this.poiCollect = poiCollect;
    return this;
  }

  public ReportCampaignGetListStruct poiAddressClick (Long poiAddressClick) {
    this.poiAddressClick = poiAddressClick;
    return this;
  }

  public ReportCampaignGetListStruct lubanOrderCnt (Long lubanOrderCnt) {
    this.lubanOrderCnt = lubanOrderCnt;
    return this;
  }

  public ReportCampaignGetListStruct lubanOrderStatAmount (Float lubanOrderStatAmount) {
    this.lubanOrderStatAmount = lubanOrderStatAmount;
    return this;
  }

  public ReportCampaignGetListStruct lubanOrderRoi (Float lubanOrderRoi) {
    this.lubanOrderRoi = lubanOrderRoi;
    return this;
  }

  public ReportCampaignGetListStruct lubanLiveEnterCnt (Long lubanLiveEnterCnt) {
    this.lubanLiveEnterCnt = lubanLiveEnterCnt;
    return this;
  }

  public ReportCampaignGetListStruct liveWatchOneMinuteCount (Long liveWatchOneMinuteCount) {
    this.liveWatchOneMinuteCount = liveWatchOneMinuteCount;
    return this;
  }

  public ReportCampaignGetListStruct lubanLiveFollowCnt (Long lubanLiveFollowCnt) {
    this.lubanLiveFollowCnt = lubanLiveFollowCnt;
    return this;
  }

  public ReportCampaignGetListStruct liveFansClubJoinCnt (Long liveFansClubJoinCnt) {
    this.liveFansClubJoinCnt = liveFansClubJoinCnt;
    return this;
  }

  public ReportCampaignGetListStruct lubanLiveCommentCnt (Long lubanLiveCommentCnt) {
    this.lubanLiveCommentCnt = lubanLiveCommentCnt;
    return this;
  }

  public ReportCampaignGetListStruct lubanLiveShareCnt (Long lubanLiveShareCnt) {
    this.lubanLiveShareCnt = lubanLiveShareCnt;
    return this;
  }

  public ReportCampaignGetListStruct lubanLiveGiftCnt (Long lubanLiveGiftCnt) {
    this.lubanLiveGiftCnt = lubanLiveGiftCnt;
    return this;
  }

  public ReportCampaignGetListStruct lubanLiveGiftAmount (Float lubanLiveGiftAmount) {
    this.lubanLiveGiftAmount = lubanLiveGiftAmount;
    return this;
  }

  public ReportCampaignGetListStruct lubanLiveSlidecartClickCnt (Long lubanLiveSlidecartClickCnt) {
    this.lubanLiveSlidecartClickCnt = lubanLiveSlidecartClickCnt;
    return this;
  }

  public ReportCampaignGetListStruct lubanLiveClickProductCnt (Long lubanLiveClickProductCnt) {
    this.lubanLiveClickProductCnt = lubanLiveClickProductCnt;
    return this;
  }

  public ReportCampaignGetListStruct lubanLivePayOrderCount (Long lubanLivePayOrderCount) {
    this.lubanLivePayOrderCount = lubanLivePayOrderCount;
    return this;
  }

  public ReportCampaignGetListStruct lubanLivePayOrderStatCost (Float lubanLivePayOrderStatCost) {
    this.lubanLivePayOrderStatCost = lubanLivePayOrderStatCost;
    return this;
  }

  public ReportCampaignGetListStruct liveComponentClickCount (Long liveComponentClickCount) {
    this.liveComponentClickCount = liveComponentClickCount;
    return this;
  }

  public ReportCampaignGetListStruct liveComponentClickCost (Float liveComponentClickCost) {
    this.liveComponentClickCost = liveComponentClickCost;
    return this;
  }

  public ReportCampaignGetListStruct liveComponentClickRate (Float liveComponentClickRate) {
    this.liveComponentClickRate = liveComponentClickRate;
    return this;
  }

  public ReportCampaignGetListStruct wechatLoginCount (Long wechatLoginCount) {
    this.wechatLoginCount = wechatLoginCount;
    return this;
  }

  public ReportCampaignGetListStruct attributionWechatLogin30dCount (Long attributionWechatLogin30dCount) {
    this.attributionWechatLogin30dCount = attributionWechatLogin30dCount;
    return this;
  }

  public ReportCampaignGetListStruct wechatLoginCost (Float wechatLoginCost) {
    this.wechatLoginCost = wechatLoginCost;
    return this;
  }

  public ReportCampaignGetListStruct attributionWechatLogin30dCost (Float attributionWechatLogin30dCost) {
    this.attributionWechatLogin30dCost = attributionWechatLogin30dCost;
    return this;
  }

  public ReportCampaignGetListStruct wechatFirstPayCount (Long wechatFirstPayCount) {
    this.wechatFirstPayCount = wechatFirstPayCount;
    return this;
  }

  public ReportCampaignGetListStruct attributionWechatFirstPay30dCount (Long attributionWechatFirstPay30dCount) {
    this.attributionWechatFirstPay30dCount = attributionWechatFirstPay30dCount;
    return this;
  }

  public ReportCampaignGetListStruct wechatFirstPayCost (Float wechatFirstPayCost) {
    this.wechatFirstPayCost = wechatFirstPayCost;
    return this;
  }

  public ReportCampaignGetListStruct attributionWechatFirstPay30dCost (Float attributionWechatFirstPay30dCost) {
    this.attributionWechatFirstPay30dCost = attributionWechatFirstPay30dCost;
    return this;
  }

  public ReportCampaignGetListStruct wechatFirstPayRate (Float wechatFirstPayRate) {
    this.wechatFirstPayRate = wechatFirstPayRate;
    return this;
  }

  public ReportCampaignGetListStruct attributionWechatFirstPay30dRate (Float attributionWechatFirstPay30dRate) {
    this.attributionWechatFirstPay30dRate = attributionWechatFirstPay30dRate;
    return this;
  }

  public ReportCampaignGetListStruct wechatPayAmount (Float wechatPayAmount) {
    this.wechatPayAmount = wechatPayAmount;
    return this;
  }

  public ReportCampaignGetListStruct attributionWechatPay30dAmount (Float attributionWechatPay30dAmount) {
    this.attributionWechatPay30dAmount = attributionWechatPay30dAmount;
    return this;
  }

  public ReportCampaignGetListStruct attributionWechatPay30dRoi (Float attributionWechatPay30dRoi) {
    this.attributionWechatPay30dRoi = attributionWechatPay30dRoi;
    return this;
  }

  public ReportCampaignGetListStruct phoneEffective (Long phoneEffective) {
    this.phoneEffective = phoneEffective;
    return this;
  }

  public ReportCampaignGetListStruct totalPlay (Long totalPlay) {
    this.totalPlay = totalPlay;
    return this;
  }

  public ReportCampaignGetListStruct validPlay (Long validPlay) {
    this.validPlay = validPlay;
    return this;
  }

  public ReportCampaignGetListStruct validPlayCost (Float validPlayCost) {
    this.validPlayCost = validPlayCost;
    return this;
  }

  public ReportCampaignGetListStruct validPlayRate (Float validPlayRate) {
    this.validPlayRate = validPlayRate;
    return this;
  }

  public ReportCampaignGetListStruct play25FeedBreak (Long play25FeedBreak) {
    this.play25FeedBreak = play25FeedBreak;
    return this;
  }

  public ReportCampaignGetListStruct play50FeedBreak (Long play50FeedBreak) {
    this.play50FeedBreak = play50FeedBreak;
    return this;
  }

  public ReportCampaignGetListStruct play75FeedBreak (Long play75FeedBreak) {
    this.play75FeedBreak = play75FeedBreak;
    return this;
  }

  public ReportCampaignGetListStruct play100FeedBreak (Long play100FeedBreak) {
    this.play100FeedBreak = play100FeedBreak;
    return this;
  }

  public ReportCampaignGetListStruct averagePlayTimePerPlay (Float averagePlayTimePerPlay) {
    this.averagePlayTimePerPlay = averagePlayTimePerPlay;
    return this;
  }

  public ReportCampaignGetListStruct playOverRate (Float playOverRate) {
    this.playOverRate = playOverRate;
    return this;
  }

  public ReportCampaignGetListStruct wifiPlayRate (Float wifiPlayRate) {
    this.wifiPlayRate = wifiPlayRate;
    return this;
  }

  public ReportCampaignGetListStruct wifiPlay (Long wifiPlay) {
    this.wifiPlay = wifiPlay;
    return this;
  }

  public ReportCampaignGetListStruct playDurationSum (Long playDurationSum) {
    this.playDurationSum = playDurationSum;
    return this;
  }

  public ReportCampaignGetListStruct advancedCreativePhoneClick (Long advancedCreativePhoneClick) {
    this.advancedCreativePhoneClick = advancedCreativePhoneClick;
    return this;
  }

  public ReportCampaignGetListStruct advancedCreativeCounselClick (Long advancedCreativeCounselClick) {
    this.advancedCreativeCounselClick = advancedCreativeCounselClick;
    return this;
  }

  public ReportCampaignGetListStruct advancedCreativeFormClick (Long advancedCreativeFormClick) {
    this.advancedCreativeFormClick = advancedCreativeFormClick;
    return this;
  }

  public ReportCampaignGetListStruct advancedCreativeCouponAddition (Long advancedCreativeCouponAddition) {
    this.advancedCreativeCouponAddition = advancedCreativeCouponAddition;
    return this;
  }

  public ReportCampaignGetListStruct advancedCreativeFormSubmit (Long advancedCreativeFormSubmit) {
    this.advancedCreativeFormSubmit = advancedCreativeFormSubmit;
    return this;
  }

  public ReportCampaignGetListStruct cardShow (Long cardShow) {
    this.cardShow = cardShow;
    return this;
  }

  public ReportCampaignGetListStruct share (Long share) {
    this.share = share;
    return this;
  }

  public ReportCampaignGetListStruct comment (Long comment) {
    this.comment = comment;
    return this;
  }

  public ReportCampaignGetListStruct like (Long like) {
    this.like = like;
    return this;
  }

  public ReportCampaignGetListStruct follow (Long follow) {
    this.follow = follow;
    return this;
  }

  public ReportCampaignGetListStruct homeVisited (Long homeVisited) {
    this.homeVisited = homeVisited;
    return this;
  }

  public ReportCampaignGetListStruct iesChallengeClick (Long iesChallengeClick) {
    this.iesChallengeClick = iesChallengeClick;
    return this;
  }

  public ReportCampaignGetListStruct iesMusicClick (Long iesMusicClick) {
    this.iesMusicClick = iesMusicClick;
    return this;
  }

  public ReportCampaignGetListStruct locationClick (Long locationClick) {
    this.locationClick = locationClick;
    return this;
  }

  public ReportCampaignGetListStruct messageAction (Long messageAction) {
    this.messageAction = messageAction;
    return this;
  }

  public ReportCampaignGetListStruct clickLandingPage (Long clickLandingPage) {
    this.clickLandingPage = clickLandingPage;
    return this;
  }

  public ReportCampaignGetListStruct clickShopwindow (Long clickShopwindow) {
    this.clickShopwindow = clickShopwindow;
    return this;
  }

  public ReportCampaignGetListStruct clickWebsite (Long clickWebsite) {
    this.clickWebsite = clickWebsite;
    return this;
  }

  public ReportCampaignGetListStruct clickDownload (Long clickDownload) {
    this.clickDownload = clickDownload;
    return this;
  }

  public ReportCampaignGetListStruct clickCallDy (Long clickCallDy) {
    this.clickCallDy = clickCallDy;
    return this;
  }

  public ReportCampaignGetListStruct submitCertificationCount (Long submitCertificationCount) {
    this.submitCertificationCount = submitCertificationCount;
    return this;
  }

  public ReportCampaignGetListStruct approvalCount (Long approvalCount) {
    this.approvalCount = approvalCount;
    return this;
  }

  public ReportCampaignGetListStruct firstOrderCount (Long firstOrderCount) {
    this.firstOrderCount = firstOrderCount;
    return this;
  }

  public ReportCampaignGetListStruct firstRentalOrderCount (Long firstRentalOrderCount) {
    this.firstRentalOrderCount = firstRentalOrderCount;
    return this;
  }

  public ReportCampaignGetListStruct commuteFirstPayCount (Long commuteFirstPayCount) {
    this.commuteFirstPayCount = commuteFirstPayCount;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
