package programmers.p148653;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p148653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(solution(N));
    }

    public static int solution(int storey) {
        int answer = 0;
        List<Integer> arr = Arrays.stream(String.valueOf(storey).split("")).map(Integer::parseInt).collect(Collectors.toList());
        int len = String.valueOf(storey).length();
        for (int i = len - 1; 0 <= i; i--) {
            int a = arr.get(i);
            if (5 < a) {
                if (i > 0) {
                    answer += 10 - a;
                    arr.set(i - 1, arr.get(i - 1) + 1);
                } else {
                    answer += 11 - a;
                }
            } else if (i > 0 && a == 5 && arr.get(i - 1) >= 5) {
                answer += 5;
                arr.set(i - 1, arr.get(i - 1) + 1);
            } else {
                answer += a;
            }
        }
        return answer;
    }
}
