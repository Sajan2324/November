package com.sajan.scaler.nov.DAY3;

public class FindlargestnumberinArray {
    public int largestNumber(final int[] A) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }
    public static void main(final String[] args) {
        final FindlargestnumberinArray obj = new FindlargestnumberinArray();
        final int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        final int result = obj.largestNumber(arr);
        System.out.println("The largest number in the array is: " + result);

    }
    //
}
