package com.janus.futuquant.Constant;

import java.util.HashMap;
import java.util.Map;

public class Constant {
  // 需要安装的最低牛牛客户端版本号
  public static final String NN_VERSION_MIN = "3.42.4962";
  public static final Map<String, Integer> MKT_MAP = new HashMap<>();
  public static final Map<String, Integer> WRT_TYPE_MAP = new HashMap<>();
  public static final Map<String, Integer> PLATE_CLASS_MAP = new HashMap<>();
  public static final Map<String, Integer> SEC_TYPE_MAP = new HashMap<>();
  public static final Map<String, Integer> SUBTYPE_MAP = new HashMap<>();
  public static final Map<String, Integer> KTYPE_MAP = new HashMap<>();
  public static final Map<String, Integer> AUTYPE_MAP = new HashMap<>();
  public static final Map<String, Integer> TICKER_DIRECTION = new HashMap<>();
  public static final Map<String, Integer> ORDER_STATUS = new HashMap<>();
  public static final Map<String, Integer> ENVTYPE_MAP = new HashMap<>();
  public static final int RET_OK = 0;
  public static final int RET_ERROR = -1;
  public static final String ERROR_STR_PREFIX = "ERROR. ";
  public static final String EMPTY_STRING = "";

  // 指定时间为非交易日时，对应的k线数据取值模式， get_multi_points_history_kline 参数用到
  public static final String KL_NO_DATA_MODE_NONE = "0";
  public static final String KL_NO_DATA_MODE_FORWARD = "1";
  public static final String KL_NO_DATA_MODE_BACKWARD = "2";

  static {
    MKT_MAP.put("HK", 1);
    MKT_MAP.put("US", 2);
    MKT_MAP.put("SH", 3);
    MKT_MAP.put("SZ", 4);
    MKT_MAP.put("HK_FUTURE", 6);

    WRT_TYPE_MAP.put("CALL", 1);
    WRT_TYPE_MAP.put("PUT", 2);
    WRT_TYPE_MAP.put("BULL", 3);
    WRT_TYPE_MAP.put("BEAR", 4);
    WRT_TYPE_MAP.put("N/A", 0);

    PLATE_CLASS_MAP.put("ALL", 0);
    PLATE_CLASS_MAP.put("INDUSTRY", 1);
    PLATE_CLASS_MAP.put("REGION", 2);
    PLATE_CLASS_MAP.put("CONCEPT", 3);

    SEC_TYPE_MAP.put("STOCK", 3);
    SEC_TYPE_MAP.put("IDX", 6);
    SEC_TYPE_MAP.put("ETF", 4);
    SEC_TYPE_MAP.put("WARRANT", 5);
    SEC_TYPE_MAP.put("BOND", 1);
    SEC_TYPE_MAP.put("N/A", 0);

    SUBTYPE_MAP.put("TICKER", 4);
    SUBTYPE_MAP.put("QUOTE", 1);
    SUBTYPE_MAP.put("ORDER_BOOK", 2);
    SUBTYPE_MAP.put("K_1M", 11);
    SUBTYPE_MAP.put("K_5M", 7);
    SUBTYPE_MAP.put("K_15M", 8);
    SUBTYPE_MAP.put("K_30M", 9);
    SUBTYPE_MAP.put("K_60M", 10);
    SUBTYPE_MAP.put("K_DAY", 6);
    SUBTYPE_MAP.put("K_WEEK", 12);
    SUBTYPE_MAP.put("K_MON", 13);
    SUBTYPE_MAP.put("RT_DATA", 5);
    SUBTYPE_MAP.put("BROKER", 14);

    KTYPE_MAP.put("K_1M", 1);
    KTYPE_MAP.put("K_5M", 6);
    KTYPE_MAP.put("K_15M", 7);
    KTYPE_MAP.put("K_30M", 8);
    KTYPE_MAP.put("K_60M", 9);
    KTYPE_MAP.put("K_DAY", 2);
    KTYPE_MAP.put("K_WEEK", 3);
    KTYPE_MAP.put("K_MON", 4);

    AUTYPE_MAP.put("None", 0);
    AUTYPE_MAP.put("qfq", 1);
    AUTYPE_MAP.put("hfq", 2);

    TICKER_DIRECTION.put("TT_BUY", 1);
    TICKER_DIRECTION.put("TT_SELL", 2);
    TICKER_DIRECTION.put("TT_NEUTRAL", 3);

    ORDER_STATUS.put("CANCEL", 0);
    ORDER_STATUS.put("INVALID", 1);
    ORDER_STATUS.put("VALID", 2);
    ORDER_STATUS.put("DELETE", 3);

    ENVTYPE_MAP.put("TRUE", 0);
    ENVTYPE_MAP.put("SIMULATE", 1);
  }
}
