package com.mycode;

import org.junit.Assert;
import org.junit.Test;

/*Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2

Input: [1,3,5,6], 2
Output: 1*/
public class SearchInsertPosition {
  @Test
  public void testSearchInsert() {
    Assert.assertEquals(2, searchInsert(new int[] {1, 3, 5, 6}, 5));
    Assert.assertEquals(1, searchInsert(new int[] {1, 3, 5, 6}, 2));
    Assert.assertEquals(4, searchInsert(new int[] {1, 3, 5, 6}, 7));
  }

  public int searchInsert(int[] A, int target) {
    int low = 0, high = A.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (A[mid] == target) {
        return mid;
      } else if (target > A[mid]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return low;
  }
}
