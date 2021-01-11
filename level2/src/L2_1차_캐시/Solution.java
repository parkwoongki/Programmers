package L2_1차_캐시;

import java.util.LinkedList;

public class Solution {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();

        for (int i = 0; i < cities.length; i++) {
            if (cache.isEmpty()) {
                cache.add(cities[i].toLowerCase());
                answer += 5;
                continue;
            } else if (cacheSize == 0) {
                answer += 5;
                continue;
            }

            if (cache.contains(cities[i].toLowerCase())) { // 캐시에 있으면
                String tmp = cache.get(cache.indexOf(cities[i].toLowerCase()));
                cache.remove(tmp);
                cache.addLast(tmp);
                answer += 1;
            } else {
                if (cache.size() == cacheSize) {
                    cache.removeFirst();
                }
                cache.addLast(cities[i].toLowerCase());
                answer += 5;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s[] = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(3, s));
    }
}
