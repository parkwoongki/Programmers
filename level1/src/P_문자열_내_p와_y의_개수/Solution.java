package P_문자열_내_p와_y의_개수;

public class Solution {
    static boolean solution(String s) {
        boolean answer = true;

        char[] carr = s.toUpperCase().toCharArray();

        int p = 0;
        int y = 0;
        for (char c : carr) {
            if (c == 'P')
                p++;
            else if (c == 'Y')
                y++;
        }

        if (p != y)
            answer = false;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution(\"\") = " + solution("pPoooyY"));
    }
}
