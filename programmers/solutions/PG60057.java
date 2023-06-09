package programmers.solutions;

import java.util.ArrayList;
import java.util.List;

/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/60057
 */
public class PG60057 {

    public static String s1 = "aabbaccc"; // 7
    public static String s2 = "ababcdcdababcdcd"; // 9
    public static String s3 = "abcabcdede"; // 8
    public static String s4 = "abcabcabcabcdededededede"; // 14
    public static String s5 = "xababcdcdababcdcd"; //17

    public int solution(String s) {
        // 가장 길이가 작은 문자열의 길이
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= s.length(); i++) {
            // 압축 결과 담을 StringBuilder
            StringBuilder sb = new StringBuilder();

            // 문자열 자르기
            List<String> tokens = split(s, i);
            // 마지막 처리를 위한 토큰 추가
            tokens.add("");

            int count = 1;
            for (int j = 0; j < tokens.size() - 1; j++) {
                // 현재 토큰이 다음 토큰과 같으면 count 증가
                if (tokens.get(j).equals(tokens.get(j + 1))) count++;
                // 현재 토큰과 다음 토큰이 다르면, count 값에 따라 압축
                else {
                    if (count > 1) {
                        sb.append(count);
                        count = 1;
                    }
                    sb.append(tokens.get(j));
                }
            }

            // 더 작은 값을 선택
            min = Math.min(min, sb.length());
        }

        return min;
    }

    private List<String> split(String s, int length) {
        List<String> tokens = new ArrayList<>();

        for (int i = 0; i < s.length(); i += length) {
            if (i + length >= s.length()) tokens.add(s.substring(i));
            else tokens.add(s.substring(i, i + length));
        }

        return tokens;
    }
}
