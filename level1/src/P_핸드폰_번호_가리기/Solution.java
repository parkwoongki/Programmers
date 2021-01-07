package P_핸드폰_번호_가리기;

public class Solution {
    public static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);

        for (int i = 1; i <= phone_number.length() - 4; i++) {
            sb.replace(i - 1, i, "*");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("0123348207"));
    }
}
