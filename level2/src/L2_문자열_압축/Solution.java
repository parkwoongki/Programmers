package L2_문자열_압축;

public class Solution {
    public static int solution(String s) {
        int answer = s.length();
        int length = s.length() / 2;

        for (int i = 1; i <= length; i++) {
            String copy = s;

            StringBuilder sb = new StringBuilder();
            String before = copy.substring(0, i);
            int count = 1;
            for (int j = i; j < copy.length(); j += i) {
                String sub;
                if (j + i > copy.length())
                    sub = copy.substring(j);
                else
                    sub = copy.substring(j, j + i);

//                System.out.print(sub + " ");

                if (before.equals(sub)) {
                    count++;
                } else {
                    if (count == 1)
                        sb.append(before);
                    else
                        sb.append(count).append(before);
                    count = 1;
                    before = sub;
                }
            }
            if (count == 1)
                sb.append(before);
            else
                sb.append(count).append(before);

            if (answer > sb.length())
                answer = sb.length();

//            System.out.println();
//            System.out.println(sb.toString());
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("xababcdcdababcdcd"));
    }
}
