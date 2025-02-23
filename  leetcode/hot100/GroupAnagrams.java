package hot100;

import java.util.*;

/**
 * @author Serendipity
 * @description 字母异位词分组
 * @date 2025-02-23 16:03
 *
 * <a href="https://leetcode.cn/problems/group-anagrams/?envType=study-plan-v2&envId=top-100-liked"/>
 *
 * 获得一个原始不变的key，作为比对其是否为同分异构词，记住前面遍历过的所有字母即可
 **/
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            List<String> singleList = map.getOrDefault(key, new LinkedList<>());
            singleList.add(strs[i]);
            map.put(key, singleList);
        }

        return map.values().stream().toList();
    }

    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams.groupAnagrams(strs);
        System.out.println("lists = " + lists);
    }
}
