package com.janus.futuquant.Constant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KL_FIELDTest {

  @Test
  public void DICT_KL_FIELD_STRTest() {
    assertEquals(KL_FIELD.DICT_KL_FIELD_STR.get(KL_FIELD.DATE_TIME), "time_key");
  }

}
