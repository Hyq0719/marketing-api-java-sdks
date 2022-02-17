package com.hyq0719.mktapi.tencent;

import java.util.Arrays;
import java.util.List;

public class TencentDefaultFields {
  // GDT
  /**
   * 广告组全部字段
   */
  public final static List<String> BASE_ADGROUP_GET_FIEDS = Arrays.asList("campaign_id", "adgroup_id", "adgroup_name",
          "site_set", "automatic_site_enabled", "optimization_goal", "billing_event", "bid_amount", "daily_budget",
          "promoted_object_type", "promoted_object_id", "app_android_channel_package_id", "mini_game_program_id",
          "targeting_id", "targeting", "targeting_translation", "is_include_unsupported_targeting", "scene_spec",
          "begin_date", "first_day_begin_time", "end_date", "time_series", "configured_status", "customized_category",
          "created_time", "last_modified_time", "ad_count", "dynamic_ad_spec", "user_action_sets",
          "additional_user_action_sets", "is_deleted", "dynamic_creative_id", "is_rewarded_video_ad",
          "cost_guarantee_message", "cost_guarantee_status", "bid_strategy", "cold_start_audience", "auto_audience",
          "expand_enabled", "expand_targeting", "deep_conversion_spec", "deep_optimization_action_type", "poi_list",
          "conversion_id", "deep_conversion_behavior_bid", "deep_conversion_worth_rate",
          "android_channel_package_audit_message", "system_status", "bid_mode", "status", "bid_adjustment",
          "auto_acquisition_enabled", "auto_acquisition_budget", "creative_display_type",
          "auto_derived_creative_enabled", "smart_bid_type", "smart_cost_cap");

  /**
   * 广告创意全部字段
   */
  public final static List<String> BASE_ADCREATIVE_GET_FIEDS = Arrays.asList("campaign_id", "adcreative_id",
          "adcreative_name",
          "adcreative_template_id", "adcreative_elements", "page_type", "page_spec", "link_page_type",
          "link_name_type", "link_page_spec", "conversion_data_type", "conversion_target_type",
          "qq_mini_game_tracking_query_string", "deep_link_url", "android_deep_link_app_id", "ios_deep_link_app_id",
          "universal_link_url", "site_set", "automatic_site_enabled", "promoted_object_type", "promoted_object_id",
          "profile_id", "created_time", "last_modified_time", "share_content_spec", "dynamic_adcreative_spec",
          "is_deleted", "is_dynamic_creative", "component_id", "online_enabled", "revised_adcreative_spec",
          "category", "label", "union_market_switch", "playable_page_material_id", "video_end_page",
          "feeds_video_comment_switch", "webview_url", "simple_canvas_sub_type", "floating_zone",
          "marketing_pendant_image_id", "countdown_switch", "page_track_url");

  /**
   * 广告计划全部字段
   */
  public final static List<String> BASE_CAMPAIGN_GET_FIEDS = Arrays.asList("campaign_id", "campaign_name",
          "configured_status", "campaign_type", "promoted_object_type", "daily_budget", "budget_reach_date",
          "created_time", "last_modified_time", "speed_mode", "is_deleted");

  /**
   * 广告全部字段
   */
  public final static List<String> BASE_ADS_GET_FIEDS = Arrays.asList("campaign_id", "adgroup_id", "ad_id", "ad_name",
          "adcreative_id", "adcreative", "configured_status", "system_status", "audit_spec",
          "impression_tracking_url", "click_tracking_url", "feeds_interaction_enabled", "reject_message",
          "is_deleted", "is_dynamic_creative", "created_time", "last_modified_time");

  /**
   * 微信资金账户信息全部字段
   */
  public final static List<String> BASE_WECHAT_FUND_GET_FIEDS = Arrays.asList("fund_type", "balance",
          "credit_roll_spec", "miniprogram_spec");
  /**
   * 资金账户信息全部字段
   */
  public final static List<String> BASE_FUND_GET_FIEDS = Arrays.asList("fund_type", "balance",
          "fund_status", "realtime_cost", "effect_funds");

}
