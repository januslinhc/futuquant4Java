package com.janus.futuquant.Constant;

/**
 * 港股报价需符合价位表的要求， 详见https://www.futu5.com/faq/topic1683 价格依据价位表规整模式,如腾讯当前的价位差是0.2, price = 471.1,
 * UPPER price = 471.2 LOWER price = 471.0 price_mode参数会调整price至符合价位的正确报价
 */
public class PriceRegularMode {
  public static String IGNORE = "0";
  public static String UPPER = "1";
  public static String LOWER = "2";
}
