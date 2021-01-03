package P_소수_찾기;

public class Solution {
    public static int solution(int n) {
        int answer = 0;

        boolean[] arr = new boolean[n + 1];
        arr[0] = arr[1] = false;
        for (int i = 2; i <= n; i += 1) {
            arr[i] = true;
        }

        for (int i = 2; i * i <= n; i += 1) {
            for (int j = i * i; j <= n; j += i) {
                arr[j] = false;
            }
        }

        for (int i = 0; i <= n; i += 1) {
            if (arr[i]) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
