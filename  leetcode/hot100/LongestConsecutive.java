package hot100;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Serendipity
 * @description 最长连续序列
 * @date 2025-02-23 16:09
 *
 * <a href="https://leetcode.cn/problems/longest-consecutive-sequence/?envType=study-plan-v2&envId=top-100-liked"/>
 *
 * 限制需要进行On的时间复杂度，首先将其加入一个set，然后对原数组/set进行遍历均可，但是原数组存在大量重复元素，所以对set进行遍历更省时间，其实都是On罢了
 **/
public class LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        if ( nums == null || nums.length == 0) return 0;
        Set<Integer> smallerSet = new HashSet<>();
        for (int num : nums) {
            smallerSet.add(num);
        }
        int maxLength = 1;
        // 修改为对set进行便利，可以极大减少时间，因为set会对原始数组进行大量去重操作
        for (int num : smallerSet) {
            if (!smallerSet.contains(num - 1)) {
                int key = num + 1;
                int temp = 1;
                while (smallerSet.contains(key)) {
                    temp++;
                    key++;
                }
                maxLength = Math.max(maxLength, temp);
            }
        }
        return maxLength;
    }


    public static void main(String[] args) {
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        int[] ints = new int[]{100, 4, 200, 1, 3, 2};
        int i = longestConsecutive.longestConsecutive(ints);
        System.out.println("i = " + i);
    }
}
