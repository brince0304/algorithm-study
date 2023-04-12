package programmers.p142085;

import java.util.Arrays;
import java.util.OptionalDouble;

public class p142085 {

    public static void main(String[] args) {
        int[] score = {100, 70, 82, 94, 64};
        OptionalDouble avg = Arrays.stream(score).average();
        System.out.println(avg.toString());
    }
}
