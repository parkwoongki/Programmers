package L2_오픈채팅방;

import java.util.*;

public class Solution {
    public static String[] solution(String[] record) {
        String[] answer = {};
        Map<String, String> nicknameDB = new HashMap<>();
        List<Log> entranceLog = new ArrayList<>();

        StringTokenizer st;
        int resultSize = 0;
        for (int i = 0; i < record.length; i++) {
            st = new StringTokenizer(record[i]);
            String entrance = st.nextToken();
            String id = st.nextToken();
            String nickname;
            if (entrance.equals("Enter")) {
                nickname = st.nextToken();
                nicknameDB.put(id, nickname);
                entranceLog.add(new Log(entrance, id));
                resultSize++;
            } else if (entrance.equals("Leave")) {
                entranceLog.add(new Log(entrance, id));
                resultSize++;
            } else {
                nickname = st.nextToken();
                nicknameDB.put(id, nickname);
            }
        }

        answer = new String[resultSize];
        for (int i = 0; i < answer.length; i++) {
            Log log = entranceLog.get(i);
            String entrance = log.getEntrance();
            String id = log.getId();

            StringBuilder sb = new StringBuilder();
            sb.append(nicknameDB.get(id)).append("님이 ");
            if (entrance.equals("Enter"))
                sb.append("들어왔습니다.");
            else
                sb.append("나갔습니다.");

            answer[i] = sb.toString();
        }

        return answer;
    }

    public static class Log {
        private String entrance;
        private String id;

        protected Log() {
        }

        public Log(String entrance, String id) {
            this.entrance = entrance;
            this.id = id;
        }

        public String getEntrance() {
            return entrance;
        }

        public void setEntrance(String entrance) {
            this.entrance = entrance;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        String[] records = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(records)));
    }
}
