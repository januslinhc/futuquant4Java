package com.janus.futuquant.Constant;

import java.util.*;

public class KL_FIELD {
  public static final String ALL = "";
  public static final String DATE_TIME = "1";
  public static final String OPEN = "2";
  public static final String CLOSE = "3";
  public static final String HIGH = "4";
  public static final String LOW = "5";
  public static final String PE_RATIO = "6";
  public static final String TURNOVER_RATE = "7";
  public static final String TRADE_VOL = "8";
  public static final String TRADE_VAL = "9";
  public static final String CHANGE_RATE = "10";

  public static final List<String> ALL_REAL = new ArrayList<>();
  public static final Map<String, String> DICT_KL_FIELD_STR = new HashMap<>();

  public static List<String> get_field_list(String str_filed) {
    List<String> ret_list = new ArrayList<>();
    String[] data = str_filed.split(",");

    if (Arrays.stream(data).anyMatch(s -> s.equals(ALL))) {
      ret_list = ALL_REAL;
    } else {
      for (String x : data) {
        if (ALL_REAL.contains(x)) {
          ret_list.add(x);
        }
      }
    }
    return ret_list;
  }

  public static List<String> normalize_field_list(List<String> fields) {
    List<String> list_ret = new ArrayList<>();
    if (fields.contains(ALL)) {
      list_ret = ALL_REAL;
    } else {
      for (String x : fields) {
        if (ALL_REAL.contains(x) && !list_ret.contains(x)) {
          list_ret.add(x);
        }
      }
    }
    return list_ret;
  }

  static {
    ALL_REAL.add(DATE_TIME);
    ALL_REAL.add(OPEN);
    ALL_REAL.add(CLOSE);
    ALL_REAL.add(HIGH);
    ALL_REAL.add(LOW);
    ALL_REAL.add(PE_RATIO);
    ALL_REAL.add(TURNOVER_RATE);
    ALL_REAL.add(TRADE_VOL);
    ALL_REAL.add(TRADE_VAL);
    ALL_REAL.add(CHANGE_RATE);

    DICT_KL_FIELD_STR.put(DATE_TIME, "time_key");
    DICT_KL_FIELD_STR.put(OPEN, "open");
    DICT_KL_FIELD_STR.put(CLOSE, "close");
    DICT_KL_FIELD_STR.put(HIGH, "high");
    DICT_KL_FIELD_STR.put(LOW, "low");
    DICT_KL_FIELD_STR.put(PE_RATIO, "pe_ratio");
    DICT_KL_FIELD_STR.put(TURNOVER_RATE, "turnover_rate");
    DICT_KL_FIELD_STR.put(TRADE_VOL, "volume");
    DICT_KL_FIELD_STR.put(TRADE_VAL, "turnover");
    DICT_KL_FIELD_STR.put(CHANGE_RATE, "change_rate");
  }
}
