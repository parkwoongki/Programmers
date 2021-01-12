package L2_3차_압축;

import java.util.*;

public class Solution {
    public static int[] solution(String msg) {
        int[] answer = {};
        Map<String, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 26; i++) {
            hm.put(String.valueOf((char) (64 + i)), i);
        }
        // KAKAO
        int value = 27;
        list.add(hm.get(String.valueOf(msg.charAt(0))));

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < msg.length(); i++) {
            if (hm.containsKey(sb.toString())) {
                list.add(hm.get(sb.toString()));
                sb = new StringBuilder()
            } else {
                hm.put(sb.toString(), value++);
                sb.append(list.get(list.size() - 1)).append(msg.charAt(i)); // 마지막걸 가져온다.
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        String msg = "KAKAO";
        int[] a = solution(msg);

        System.out.println(Arrays.toString(a));
    }
}
