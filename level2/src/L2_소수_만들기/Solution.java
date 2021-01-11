package L2_소수_만들기;

public class Solution {
    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
//                    System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    if (getPrime(nums[i] + nums[j] + nums[k])) {
//                        System.out.println(nums[i] + nums[j] + nums[k]);
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static boolean getPrime(int num) {
        boolean isPrime = true;

        if (num < 2) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(solution(nums));
    }
}
