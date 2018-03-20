package com.janus.futuquant.Constant;

import java.util.HashMap;
import java.util.Map;

public class QUOTE {
  public static final Map<Integer, String> REV_MKT_MAP = new HashMap<>();
  public static final Map<Integer, String> REV_WRT_TYPE_MAP = new HashMap<>();
  public static final Map<Integer, String> REV_PLATE_CLASS_MAP = new HashMap<>();
  public static final Map<Integer, String> REV_SEC_TYPE_MAP = new HashMap<>();
  public static final Map<Integer, String> REV_SUBTYPE_MAP = new HashMap<>();
  public static final Map<Integer, String> REV_KTYPE_MAP = new HashMap<>();
  public static final Map<Integer, String> REV_AUTYPE_MAP = new HashMap<>();
  public static final Map<Integer, String> REV_TICKER_DIRECTION = new HashMap<>();

  static {
    Constant.MKT_MAP.forEach((s, integer) -> REV_MKT_MAP.put(integer, s));
    Constant.WRT_TYPE_MAP.forEach((s, integer) -> REV_WRT_TYPE_MAP.put(integer, s));
    Constant.PLATE_CLASS_MAP.forEach((s, integer) -> REV_PLATE_CLASS_MAP.put(integer, s));
    Constant.SEC_TYPE_MAP.forEach((s, integer) -> REV_SEC_TYPE_MAP.put(integer, s));
    Constant.SUBTYPE_MAP.forEach((s, integer) -> REV_SUBTYPE_MAP.put(integer, s));
    Constant.KTYPE_MAP.forEach((s, integer) -> REV_KTYPE_MAP.put(integer, s));
    Constant.AUTYPE_MAP.forEach((s, integer) -> REV_AUTYPE_MAP.put(integer, s));
    Constant.TICKER_DIRECTION.forEach((s, integer) -> REV_TICKER_DIRECTION.put(integer, s));
  }
}
