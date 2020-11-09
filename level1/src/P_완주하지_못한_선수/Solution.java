package P_완주하지_못한_선수;

import java.util.*;

public class Solution {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }

        if (answer.equals(""))
            answer = participant[participant.length - 1];

        return answer;
    }

    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"mislav", "stanko", "mislav"};

        System.out.println(solution(participant, completion));
    }
}
