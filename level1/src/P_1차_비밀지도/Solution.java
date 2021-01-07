package P_1차_비밀지도;

public class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] map1 = new String[n];
        String[] map2 = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int tmp1 = arr1[i];
            for (int j = 0; j < n; j++) {
                sb.append(tmp1 % 2);
                tmp1 /= 2;
            }
            map1[i] = sb.reverse().toString();

            sb = new StringBuilder();
            int tmp2 = arr2[i];
            for (int j = 0; j < n; j++) {
                sb.append(tmp2 % 2);
                tmp2 /= 2;
            }
            map2[i] = sb.reverse().toString();
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (map1[i].charAt(j) == '1' || map2[i].charAt(j) == '1')
                    sb.append("#");
                else
                    sb.append(" ");
            }

            answer[i] = sb.toString();
        }

        for (String s : answer) {
            System.out.println(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] s = solution(n, arr1, arr2);
    }
}
