package hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Serendipit
 * @description 两数之和
 * @date 2025-02-23 15:58
 *
 * <a href="https://leetcode.cn/problems/two-sum/description/?envType=study-plan-v2&envId=top-100-liked"/>
 *
 * 两数之和，hash的经典运用罢了。
 **/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key)) {
                return new int[]{map.get(key), i};
            }else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("");
    }
}
