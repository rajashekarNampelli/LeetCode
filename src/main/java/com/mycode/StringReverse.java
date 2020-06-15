package com.mycode;

public class StringReverse {

  public static void main(String[] args) {
    String raj = stringReverse("Raj");
    System.out.println(raj);
    String raj1 = usingStringBuilder("Raj");
    System.out.println(raj1);
  }

  public static String stringReverse(String input) {
    if (input == null) {
      return null;
    }
    String finalString = "";
    for (int i = input.length() - 1; i >= 0; i--) {
      finalString = finalString + input.charAt(i);
    }
    return finalString;
  }

  public static String usingStringBuilder(String input) {
    if (input == null) {
      return null;
    }
    return new StringBuilder(input).reverse().toString();
  }
}
