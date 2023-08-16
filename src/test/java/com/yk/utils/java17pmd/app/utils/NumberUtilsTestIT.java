package com.yk.utils.java17pmd.app.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberUtilsTestIT {

  @Test
  void testNumberIsConverted() {
    // given:
    int number = 0;

    // when:
    String convertedNumber = NumberUtils.convertNumberToString(number);

    // then:
    assertThat(convertedNumber).isEqualTo("[0]");
  }
}