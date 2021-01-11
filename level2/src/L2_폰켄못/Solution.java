package L2_폰켄못;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        if (set.size() <= nums.length / 2)
            return set.size();
        else
            return nums.length / 2;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 3};
        int[] a1 = {3,3,3,2,2,4};
        System.out.println(solution(a1));
    }
}
