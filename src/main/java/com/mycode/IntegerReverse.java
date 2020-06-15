package com.mycode;

public class IntegerReverse {

  public static void main(String[] args) {
    //
    System.out.println(intReverse(1534236469));
    System.out.println(intReverse(-125));

    System.out.println(intReverseWithoutLong(1534236469));
    System.out.println(intReverseWithoutLong(-125));
  }

  public static int intReverse(int input) {
    long reversed = 0;
    while (input != 0) {
      int digit = input % 10;
      reversed = reversed * 10 + digit;
      input = input / 10;
    }
    return (reversed >= Integer.MAX_VALUE || reversed <= Integer.MIN_VALUE) ? 0 : (int) reversed;
  }

  public static int intReverseWithoutLong(int x) {
    int prevRev = 0, rev = 0;
    while (x != 0) {
      rev = rev * 10 + x % 10;
      if ((rev - x % 10) / 10 != prevRev) {
        return 0;
      }
      prevRev = rev;
      x = x / 10;
    }
    return rev;
  }
}
