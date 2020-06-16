package com.mycode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicatesFromArrayInt {

  @Test
  public void testRemoveDuplicates() {
    Assert.assertEquals(5, removeDuplicates(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    Assert.assertEquals(2, removeDuplicates(new int[] {1, 1, 2}));
    Assert.assertEquals(5, removeDuplicatesJava7(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    Assert.assertEquals(2, removeDuplicatesJava7(new int[] {1, 1, 2}));
  }

  public int removeDuplicates(int[] nums) {

    Set<Integer> collect = IntStream.of(nums).boxed().collect(Collectors.toSet());
    return collect.size();
  }

  public int removeDuplicatesJava7(int[] nums) {
    int i = nums.length > 0 ? 1 : 0;
    for (int n : nums)
      if (n > nums[i - 1]) {
        nums[i++] = n;
      }
    return i;
  }
}
