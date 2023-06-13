package programmers.solutions;

/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */
public class PG12916 {

    public static final String s1 = "pPoooyY"; // true
    public static final String s2 = "Pyy"; // false

    public boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == 'p') pCount++;
            else if (Character.toLowerCase(s.charAt(i)) == 'y') yCount++;
        }

        return pCount == yCount;
    }
}
