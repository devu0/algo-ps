package programmers.solutions;

/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/70129
 */
public class PG70129 {

    public static final String s1 = "110010101001"; // [3,8]
    public static final String s2 = "01110"; // [3,3]
    public static final String s3 = "1111111"; // [4,1]

    public int[] solution(String s) {
        int[] answer = new int[2];
        while (!s.equals("1")) {
            int originalLen = s.length();

            s = s.replaceAll("0", "");
            int afterLen = s.length();
            answer[1] += originalLen - afterLen;
            answer[0]++;

            s = Integer.toString(afterLen, 2);
        }

        return answer;
    }
}
