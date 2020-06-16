package com.mycode;

/*Example 1:
Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.*/

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LongestCommonPrefix {

  @Test
  public void testLongestCommonPrefix() {
    Assert.assertEquals("fl", longestCommonPrefix(new String[] {"flower", "flow", "flighte"}));
    Assert.assertEquals("", longestCommonPrefix(new String[] {"dog", "racecar", "car"}));
    Assert.assertEquals("a", longestCommonPrefix(new String[] {"a"}));
  }

  public String codeFromApache() {
    String s = StringUtils.getCommonPrefix("flower", "flow");
    return s;
  }

  public String greatestCommonPrefix(String a, String b) {
    int minLength = Math.min(a.length(), b.length());
    for (int i = 0; i < minLength; i++) {
      if (a.charAt(i) != b.charAt(i)) {
        return a.substring(0, i);
      }
    }
    return a.substring(0, minLength);
  }

  public String longestCommonPrefix(String[] strs) {
    StringBuilder finalString = new StringBuilder();
    if (strs.length == 0) return finalString.toString();
    if (strs.length == 1) {
      return strs[0];
    }
    Arrays.sort(strs);
    char[] first = strs[0].toCharArray();
    char[] last = strs[strs.length - 1].toCharArray();
    int minLength = Math.min(first.length, last.length);
    for (int i = 0; i < minLength; i++) {
      if (first[i] != last[i]) {
        break;
      }
      finalString.append(first[i]);
    }
    return finalString.toString();
  }
}
