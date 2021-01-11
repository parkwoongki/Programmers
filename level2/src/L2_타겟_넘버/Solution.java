package L2_타겟_넘버;

public class Solution {
    private static int count = 0;

    public static int solution(int[] numbers, int target) {
        dfs(numbers, 0, numbers.length - 1, 0, target);

        return count;
    }

    public static void dfs(int[] numbers, int k, int n, int result, int target) {
        if (k == n) {
            if ((result + numbers[k] == target) || (result - numbers[k] == target)) {
                count++;
            }
        } else {
            dfs(numbers, k + 1, n, result + numbers[k], target);
            dfs(numbers, k + 1, n, result - numbers[k], target);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1};
        System.out.println(solution(a, 3));
    }
}
