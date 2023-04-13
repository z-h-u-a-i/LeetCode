package com.zjh.medium;

import java.util.*;

public class GoupAnagrams49 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strs);
        System.out.println(lists);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        int i, j;
        for (String str : strs) {
            int[] letters = new int[26];
            char[] chars = str.toCharArray();
            for ( i = 0; i < chars.length; i++ ) {
                letters[chars[i] - 'a'] += 1;
            }
            StringBuilder sb = new StringBuilder();
            for (j = 0; j < letters.length; j++) {
                sb.append("#");
                sb.append(letters[j]);
            }
            String key = sb.toString();
            List<String> strings = map.get(key);
            if (strings == null) {
                strings = new ArrayList<>();
            }
            strings.add(str);
            map.put(key, strings);
        }
        return new ArrayList<>(map.values());
    }

//    public static List<List<String>> groupAnagrams(String[] strs) {
//        Map<String, Integer> hashmap = new HashMap<>();
//        List<List<String>> result = new ArrayList<>();
//        int index = 0;
//        for (String str : strs) {
//            char[] chars = str.toCharArray();
//            Arrays.sort(chars);
//            if (!hashmap.containsKey(new String(chars))) {
//                ArrayList<String> arrayList = new ArrayList<>();
//                arrayList.add(str);
//                result.add(arrayList);
//                hashmap.put(new String(chars), index);
//                index++;
//            } else {
//                List<String> list = result.get(hashmap.get(new String(chars)));
//                list.add(str);
//            }
//        }
//        return result;
//    }

}
