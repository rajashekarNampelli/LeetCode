package com.mycode;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class RemoveElementFromArrayInt {

  @Test
  public void testRemoveElements() {
    Assert.assertEquals(7, removeElements(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 1));
    Assert.assertEquals(5, removeElements(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));

    Assert.assertEquals(7, removeElementsInJava7(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 1));
    Assert.assertEquals(5, removeElementsInJava7(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));
  }

  public int removeElements(int[] nums, int val) {
    // ArrayUtils.removeElements(nums, val);
    return (int) IntStream.of(nums).filter(value -> val != value).count();
  }

  public int removeElementsInJava7(int[] nums, int val) {
    int l = nums.length;
    for (int i = 0; i < l; i++) {
      if (nums[i] == val) {
        nums[i--] = nums[l-- - 1];
      }
    }
    return l;
  }
}
