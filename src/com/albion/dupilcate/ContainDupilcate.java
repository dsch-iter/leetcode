package com.albion.dupilcate;

import java.util.HashSet;
import java.util.Set;

public class ContainDupilcate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}
