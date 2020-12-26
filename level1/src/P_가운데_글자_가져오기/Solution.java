package P_가운데_글자_가져오기;

class Solution {
    public static String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 1) {
            answer = String.valueOf(s.charAt(s.length() / 2));
        } else {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("qwerqwe"));
    }
}