package P_시저_암호;

public class Solution {
    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ')
                sb.append(' ');
            else if (c >= 97 && c <= 122) {
                char ic = (char) (c + n);
                if (ic > 'z')
                    ic = (char) (ic - 26);
                sb.append(ic);
            } else {
                char ic = (char) (c + n);
                if (ic > 'Z')
                    ic = (char) (ic - 26);
                sb.append(ic);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("a B z", 4));
    }
}
