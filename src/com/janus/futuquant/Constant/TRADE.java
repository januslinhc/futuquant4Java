package com.janus.futuquant.Constant;

import java.util.HashMap;
import java.util.Map;

public class TRADE {
  public static final Map<Integer, String> REV_MKT_MAP = new HashMap<>();
  public static final Map<Integer, String> REV_SEC_TYPE_MAP = new HashMap<>();
  public static final Map<Integer, String> REV_SUBTYPE_MAP = new HashMap<>();
  public static final Map<Integer, String> REV_KTYPE_MAP = new HashMap<>();
  public static final Map<Integer, String> REV_AUTYPE_MAP = new HashMap<>();
  public static final Map<Integer, String> REV_TICKER_DIRECTION = new HashMap<>();
  public static final Map<Integer, String> REV_ORDER_STATUS = new HashMap<>();
  public static final Map<Integer, String> REV_ENVTYPE_MAP = new HashMap<>();
  public static final Map<String, String> REV_ENVTYPE_STR_MAP = new HashMap<>();

  static {
    Constant.MKT_MAP.forEach((s, integer) -> REV_MKT_MAP.put(integer, s));
    Constant.SEC_TYPE_MAP.forEach((s, integer) -> REV_SEC_TYPE_MAP.put(integer, s));
    Constant.SUBTYPE_MAP.forEach((s, integer) -> REV_SUBTYPE_MAP.put(integer, s));
    Constant.KTYPE_MAP.forEach((s, integer) -> REV_KTYPE_MAP.put(integer, s));
    Constant.AUTYPE_MAP.forEach((s, integer) -> REV_AUTYPE_MAP.put(integer, s));
    Constant.TICKER_DIRECTION.forEach((s, integer) -> REV_TICKER_DIRECTION.put(integer, s));
    Constant.ORDER_STATUS.forEach((s, integer) -> REV_ORDER_STATUS.put(integer, s));
    Constant.ENVTYPE_MAP.forEach((s, integer) -> REV_ENVTYPE_MAP.put(integer, s));
    Constant.ENVTYPE_MAP.forEach(
        (s, integer) -> REV_ENVTYPE_STR_MAP.put(String.valueOf(integer), s));
  }

  // 港股支持模拟和真实环境
  public static boolean check_envtype_hk(Integer envtype) {
    return REV_ENVTYPE_STR_MAP.containsKey(String.valueOf(envtype));
  }

  // 美股目前不支持模拟环境
  public static boolean check_envtype_us(Integer envtype) {
    return String.valueOf(envtype).equals("0");
  }
}
