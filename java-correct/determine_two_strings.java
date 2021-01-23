import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        Map < Character, Integer > map1 = new HashMap < > ();
        Map < Character, Integer > map2 = new HashMap < > ();
        List < Integer > list1 = new ArrayList < > ();
        List < Integer > list2 = new ArrayList < > ();

        // 1. 서로 길이가 다를경우 false
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) + 1);
        }

        // 2. 사용하는 알파벳 종류가 다르면 false
        if (!map1.keySet().equals(map2.keySet())) return false;
        
        for (Character key: map1.keySet()) {
            list1.add(map1.get(key));
        }
        for (Character key: map2.keySet()) {
            list2.add(map2.get(key));
        }

        Collections.sort(list1);
        Collections.sort(list2);

        // 알파벳 별 중복횟수가 다르면 false
        if (!list1.equals(list2)) return false;

        return true;
    }
}