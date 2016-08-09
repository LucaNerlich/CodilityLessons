package Lessons.Iterations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lucan on 09.08.2016.
 */
public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(561892));

    }

    public static int solution(int N) {
        // write your code in Java SE 8
        String s = "";
        Integer remainder = 0;
        List<Integer> numbers = new ArrayList<>();

        //O(n)
        while (N > 0) {
            remainder = N % 2;
            N /= 2;
            s = remainder.toString() + s;
            numbers.add(remainder);
        }

        //O(n)
        boolean firstOne = false;
        int counter = 0;
        List<Integer> solutions = new ArrayList<>();

        //1001
        for (int y : numbers) {
            if (y == 1) {
                if (!firstOne) {
                    firstOne = true;
                } else {
                    solutions.add(counter);
                    System.out.println(counter);
                    counter = 0;
                }
            } else {
                counter++;
            }
        }

        return Collections.max(solutions);
    }
}
