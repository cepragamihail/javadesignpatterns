package com.java.practical.exercises;

import java.util.Arrays;

public class ZigZagSequence {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr3 = { 2, 3, 5, 1, 4 };

        for (int[] arr : Arrays.asList(arr1, arr2, arr3)) {
            findZigZagSequence(arr, arr.length);
        }
    }
    

    private static void findZigZagSequence(int[] arr, int n) {
        Arrays.sort(arr);
        System.out.println("arr: " + Arrays.toString(arr));
        int mid = (n + 1)/2;
        System.out.printf("n: %d, mid: %d", n, mid);
        System.out.println();
        int st = mid - 1;
        int ed = n - 1;
        do{
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        } while(st <= ed);
        System.out.println("--------------------------------");
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("--------------------------------");
    }

}
