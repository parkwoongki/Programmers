package 이해가안됨_L2_조이스틱;

public class Solution {
    public static int solution(String name) {
        int answer = 0;

        int len = name.length();

        // 최대로 가질 수 있는 min값은 끝까지 가는 것
        int min_move = len - 1;

        for (int i = 0; i < len; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            int next = i + 1;

            while (next < len && name.charAt(next) == 'A')
                next++;

            min_move = Math.min(min_move, i + len - next + Math.min(i, len - next));
        }

        // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
//        for (int i = 0; i < name.length(); i++) {
//            System.out.println(String.valueOf(name.charAt(i)).compareTo("A"));
//        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("JEAAROEN"));
    }
}
