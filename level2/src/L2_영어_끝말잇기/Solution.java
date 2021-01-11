package L2_영어_끝말잇기;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Map<String, Boolean> hm = new HashMap<>();

        String s = words[0];
        hm.put(s, true);
        char lastAlpha = s.charAt(s.length() - 1);
        int turn = 0;
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            turn++;

            System.out.println(turn + " " + word);

            if (!hm.getOrDefault(word, false)) { // 없으면 추가
                hm.put(word, true);
                char startAlpha = word.charAt(0);
                if (lastAlpha != startAlpha) {
                    answer[0] = turn % n + 1;
                    answer[1] = turn / n + 1;
                    break;
                } else {
                    lastAlpha = word.charAt(word.length() - 1);
                }
            } else {
                System.out.println(word);
                answer[0] = turn % n + 1;
                answer[1] = turn / n + 1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] s = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] s1 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        String[] s2 = {"hello", "one", "even", "never", "now", "world", "draw"};
        int[] a = solution(3, s);

        System.out.println(Arrays.toString(a));
    }
}
