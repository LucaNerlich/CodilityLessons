package Lessons.Arrays;

/**
 * Created by lucan on 09.08.2016.
 */
public class CyclicRotation {

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        solution(a, 3);
        System.out.println();

    }

    public static int[] solution(int[] a, int k){

        int swapA = a[1];
        int swapB;

        for(int j = 0; j < k; j++) {
            int end = a[a.length-1];
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

    public static void swap(final int[] arr, final int pos1, final int pos2){
        final int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
