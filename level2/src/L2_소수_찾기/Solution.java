package L2_소수_찾기;

import java.util.TreeSet;

public class Solution {
    static int answer = 0;
    static TreeSet<Integer> set = new TreeSet<>();

    public static int solution(String numbers) {
        int n = numbers.length();
        char[] arr = numbers.toCharArray();
        char[] output = new char[n];
        boolean[] visited = new boolean[n];

        for (int i = 1; i <= n; i++) {
            perm(arr, output, visited, 0, n, i);
        }

        for (Integer integer : set) {
            if (isPrime(integer))
                answer++;
        }

        return answer;
    }

    static void perm(char[] arr, char[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            print(output, r);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                output[depth] = 0; // 이 줄은 없어도 됨
                visited[i] = false;
            }
        }
    }

    static void print(char[] arr, int r) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r; i++)
            sb.append(arr[i]);

        set.add(Integer.parseInt(sb.toString()));
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("17"));
    }
}
