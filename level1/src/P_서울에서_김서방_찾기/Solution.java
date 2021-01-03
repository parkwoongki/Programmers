package P_서울에서_김서방_찾기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static String solution(String[] seoul) {
        List<String> list = new ArrayList<>(Arrays.asList(seoul));

        return "김서방은 " + list.indexOf("Kim") + "에 있다";
    }

    public static void main(String[] args) {
        String[] s = {"Jane", "Long", "Kim"};

        System.out.println(solution(s));
    }
}
