package com.mycode;

import org.junit.Assert;
import org.junit.Test;

public class StringPalindrome {

  @Test
  public void isPalindrome() {
    Assert.assertTrue(isPalindrome("TURUT"));
    Assert.assertFalse(isPalindrome("POLIDROME"));
  }

  public static boolean isPalindrome(String s) {
    char[] chars = s.toCharArray();
    for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
      if (chars[i] != chars[j]) {
        return false;
      }
    }
    return true;
  }
}
