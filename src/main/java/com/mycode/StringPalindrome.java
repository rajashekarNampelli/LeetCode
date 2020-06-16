package com.mycode;

import org.junit.Assert;
import org.junit.Test;

public class StringPalindrome {

  @Test
  public void isPalindrome() {
    Assert.assertTrue(isPalindrome("TURUT"));
    Assert.assertFalse(isPalindrome("POLIDROME"));
    Assert.assertTrue(isValidPolidrome("A man, a plan, a canal: Panama"));
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

  public static boolean isValidPolidrome(String s) {
    return isPalindrome(s.replaceAll("[^A-Za-z0-9]", "").toUpperCase());
  }
}
