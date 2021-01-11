package L2_튜플;

import java.util.*;

public class Solution {
    public static int[] solution(String s) {
        Map<Integer, Integer> keyMap = new HashMap<>();
        Map<Integer, Integer> valueMap = new HashMap<>();

        String[] strs = s.replace("{", "").replace("}", "").split(",");

        for (String str : strs) {
            int key = Integer.parseInt(str);
            keyMap.put(key, keyMap.getOrDefault(key, 0) + 1);
        }

        for (Integer key : keyMap.keySet()) {
            System.out.println(key + ", " + keyMap.get(key));
        }
        System.out.println();

        for (Integer key : keyMap.keySet()) {
            valueMap.put(keyMap.get(key), key);
        }

        for (Integer key : valueMap.keySet()) {
            System.out.println(key + ", " + valueMap.get(key));
        }

        int n = valueMap.size();
        int[] answer = new int[n];

        for (int i = 1; i <= n; i++) {
            answer[n - i] = valueMap.get(i);
        }

        return answer;
    }

    public static int[] solution2(String s) {
        int[] answer = {};
        StringTokenizer st = new StringTokenizer(s, "{},");

        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        while (st.hasMoreTokens()) {
            int tmp = Integer.parseInt(st.nextToken());
            if (max < tmp)
                max = tmp;
            list.add(tmp);
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        int ref = list.get(0);
        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            if (ref == list.get(0)) {
                count++;
            } else {
//                if ()
            }
        }

//        int[] check = new int[max + 1];
//        for (int i : list) {
//            check[i]++;
//        }
//
//        for (int i : check) {
//            System.out.print(i + " ");
//        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        int[] a = solution(s);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
