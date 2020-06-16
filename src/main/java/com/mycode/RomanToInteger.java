package com.mycode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  @Test
  public void testRomanToInteger() {
    Assert.assertEquals(1, romanToInteger("I"));
    Assert.assertEquals(2, romanToInteger("II"));
    Assert.assertEquals(5, romanToInteger("V"));
    Assert.assertEquals(4, romanToInteger("IV"));
    Assert.assertEquals(58, romanToInteger("LVIII"));
  }

  public static int romanToInteger(String s) {
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    int total = 0;
    int prevValue = 0;
    for (int i = 0; i < s.length(); i++) {
      Integer value = map.get(s.charAt(i));
      if (prevValue >= value) {
        total += value;
      } else {
        total += value - 2 * prevValue;
      }
      prevValue = value;
    }
    return total;
  }
}
