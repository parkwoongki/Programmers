package L2_스킬트리;

public class Solution {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] cs = skill.toCharArray();

        answer = skill_trees.length;

        for (int i = 0; i < skill_trees.length; i++) {
            String s = skill_trees[i];
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < cs.length; k++) {
                    if (s.charAt(j) == cs[k])
                        sb.append(s.charAt(j));
                }
            }

            char[] tmp = sb.toString().toCharArray();
            for (int j = 0; j < tmp.length; j++) {
                if (tmp[j] != cs[j]) {
                    answer--;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] a = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution("CBD", a));
    }
}
