package Lessons.Arrays;

import java.util.Random;

/**
 * Created by lucan on 09.08.2016.
 */
public class CyclicRotation {

    public static void main(String[] args) {
        int[] a = new int[5000000];
        int[] b = new int[5000000];

        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10) + 1;
            ;
        }

        long startTime = System.currentTimeMillis();
        sol_luca(a, 1);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

        startTime = System.currentTimeMillis();
        sol_fabian(b, 1);
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println(totalTime);
    }

    public static int[] sol_luca(int[] a, int k) {

        int swapA = a[1];
        int swapB;

        for (int j = 0; j < k; j++) {
            int end = a[a.length - 1];
            for (int i = 0; i < a.length; i++) {
                if (i <= a.length - 2) {
                    if (i == 0) {
                        swapA = a[i + 1];
                        a[i + 1] = a[i];
                    } else {
                        swapB = a[i + 1];
                        a[i + 1] = swapA;
                        swapA = swapB;
                    }
                } else {
                    a[0] = end;
                }
            }
        }
        return a;
    }

    public static int[] sol_fabian(int[] a, int k) {
        int arrayLastIndex = a.length - 1;
        for (int j = 0; j < k; j++) {
            int temp = a[arrayLastIndex];
            for (int i = arrayLastIndex; i >= 0; i--) {
                if (i == 0) {
                    a[0] = temp;
                } else {
                    a[i] = a[i - 1];
                }
            }
        }
        return a;
    }
}
