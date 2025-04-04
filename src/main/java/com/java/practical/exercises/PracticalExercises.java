package com.java.practical.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticalExercises {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static void main(String[] args) {
        // fizzBuzz(15);
        List<Integer> list = Arrays.asList(0, 0, 0, 1, 2, 1);
        // middleOfArray(list);
        uniqueItem(list);
    }


    public static void middleOfArray(List<Integer> list) {
        int middle = list.size()/2;
        if (list.size()%2 != 0) {
            // middle += 1;
        }
        list.sort(null);
        System.out.println("Sorted list: " + list);
        System.out.println("Middle index: " + middle);
        System.out.println("Middle of the list is: " + list.get(middle));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
            int primaryDiagonal = 0;
            int secondaryDiagonal = 0;
            int squareMatrixSize = arr.size();
            for(int i =0; i < squareMatrixSize; i++) {
                primaryDiagonal += arr.get(i).get(i);
                secondaryDiagonal += arr.get(i).get(squareMatrixSize - (i+1));
            }
            int diagonalsDifernece = primaryDiagonal - secondaryDiagonal;
            return Math.abs(diagonalsDifernece);
        }

    public static void uniqueItem(List<Integer> a) {
            // Write your code here
                int unique = 0;
                System.out.println("List: " + a);
                for(int item : a) {
                    System.out.println("Element " + item);
                    if(item > 0 && a.lastIndexOf(item) == a.indexOf(item)) {
                        System.out.println("Unique element: " + item);
                        unique = item;
                    }
                }
                System.out.println( "Unique item: " + unique);
        
    }

    public static int lonelyinteger(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("The list is empty or null. No unique items.");
            return 0;
        }
    
        // Use a HashMap to count occurrences of each element
        Set<Integer> uniqueItems = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
    
        for (int num : list) {
            if (!uniqueItems.add(num)) {
                duplicates.add(num);
            }
        }
    
        // Remove duplicates from the unique set
        uniqueItems.removeAll(duplicates);
    
        // Print the unique items
            return uniqueItems.iterator().next();
    
        }
    
        public static void uniqueItemImproved(List<Integer> list) {
            

        }


    public static void fizzBuzz(int n) {
    // Write your code here
        for (int i = 1; i <= n; i++) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.printf("%s%s\n", FIZZ, BUZZ);
            } else if (i%3 == 0) {
                System.out.printf("%s\n", FIZZ);
            } else if (i%5 == 0) {
                System.out.printf("%s\n", BUZZ);
            } else {
                System.out.println(i);
            }
        }
    }
}
