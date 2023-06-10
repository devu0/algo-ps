package programmers.solutions;

/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/68935
 */
public class PG68935 {

    public static final int n1 = 45; // 7
    public static final int n2 = 125; // 229

    public int solution(int n) {
        String s = Integer.toString(n, 3);
        return Integer.valueOf(new StringBuilder(s).reverse().toString(), 3);
    }
}
