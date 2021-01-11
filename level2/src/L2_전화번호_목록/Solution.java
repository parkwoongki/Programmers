package L2_전화번호_목록;

import java.util.Arrays;

public class Solution {
    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for (int i = 1; i < phone_book.length; i++) {
            if (phone_book[i - 1].length() < phone_book[i].length())
                if (phone_book[i - 1].equals(phone_book[i].substring(0, phone_book[i - 1].length())))
                    return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] s1 = {"11890", "112", "119", "97674223", "1195524421"};
        String[] s2 = {"123", "456", "789"};
        String[] s3 = {"12", "123", "1235", "567", "88"};
        String[] s4 = {"819232312", "976", "119552", "2"};
        System.out.println(solution(s4));
    }
}
