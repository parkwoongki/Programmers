package P_실패율;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] per = new double[N][2];

        for (int i = 1; i <= N; i++) {
            int fi = i;
            long completed = Arrays.stream(stages).asDoubleStream().filter(s -> s >= fi).count();
            long challenging = Arrays.stream(stages).asDoubleStream().filter(s -> s == fi).count();

            if (completed != 0)
                per[i - 1][0] = (double) challenging / (double) completed;
            else
                per[i - 1][0] = 0;
            per[i - 1][1] = i;
        }

        Arrays.sort(per, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o2[0], o1[0]);
            }
        });

        for (int i = 0; i < per.length; i++)
            answer[i] = (int) per[i][1];

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {4, 4, 4, 4, 4};
        a = solution(4, a);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
