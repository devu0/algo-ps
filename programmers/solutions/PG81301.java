package programmers.solutions;

/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */
public class PG81301 {

    public static final String s1 = "one4seveneight"; // 1478
    public static final String s2 = "23four5six7"; // 234567
    public static final String s3 = "2three45sixseven"; // 234567
    public static final String s4 = "123"; // 123

    public int solution(String s) {
        String tmp = s;
        String[] arr = new String[]{
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine"
        };
        for (int i = 0; i < arr.length; i++) tmp = tmp.replaceAll(arr[i], String.valueOf(i));

        return Integer.parseInt(tmp);
    }
}
