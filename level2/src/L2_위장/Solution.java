package L2_위장;

import java.util.HashMap;

public class Solution {
    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hs = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            hs.put(clothes[i][1], hs.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (String key : hs.keySet()) {
            answer *= hs.get(key) + 1;
        }

        return answer - 1; // Wear Nothing
    }

    public static void main(String[] args) {
        String[][] s = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"},
                {"blue_jeans", "jeans"},
        };

        System.out.println(solution(s));
    }
}
