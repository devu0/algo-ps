package programmers;

import programmers.solutions.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PG70129 pg = new PG70129();
        int[] result = pg.solution(PG70129.s3);
        System.out.println(Arrays.toString(result));
    }
}
