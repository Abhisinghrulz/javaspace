package datastructures.arrays;

public class MaxSubArray {

    public static void main1(String[] args) {
        int[] a = {4, -3, -2, 2, 3, 1, -2, -3, 4, 2, -6, -3, -1, 3, 1, 2};
        //int [] a = {4, -3, 1, 3, -6, 2};
        int max_so_far = a[0];
        int max_ending_here = 0;

        for (int i = 0; i < a.length; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }

        System.out.println(max_so_far);
    }

    public static void main(String[] args) {
        int[] a = {4, -3, -2, 2, 3, 1, -2, -3, 4, 2, -6, -3, -1, 3, 1, 2};
        int max_so_far = a[0];
        int max_ending_here = 0;
        int start = 0, end = 0, s = 0;

        for (int i = 0; i < a.length; i++) {
            max_ending_here = max_ending_here + a[i];

            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }

        System.out.println("max_so_far " + max_so_far);
        System.out.println("start " + start);
        System.out.println("end " + end);
    }
}
