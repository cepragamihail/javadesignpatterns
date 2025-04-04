package com.java.practical.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        readConsoleInputData();
    }
    public static void minMaxSumm(List<Integer> arr) {
        int max = 0;
        int min = 0;
        // Find the minimum and maximum values in the list
        System.out.println("This is a method in MyClass.");
        for(int i = 0; i < arr.size(); i++) {
            int sum = 0;
            System.out.println("Element " + i + ": " + arr.get(i));
            for(int j= 0; j < arr.size(); j++) {
                System.out.println("Element " + j + ": " + arr.get(j));
                if(i == j) {
                    // Skip the current iteration if i and j are equal
                    System.out.println("Skipping iteration where i and j are equal.");
                    continue;
                }
                // Calculate the sum of the list excluding the current element
                sum += arr.get(j);
            }
            if (i == 0) {
                max = sum;
                min = sum;
            }
            // Update the maximum and minimum sums
            if (sum > max) {
                max = sum;
            } else if (sum < min) {
                min = sum;
            }
            System.out.printf("sum: %d, max: %d, min: %d", sum, max, min);
            System.out.println();
        }
        // Print the minimum and maximum sums
        System.out.println("Minimum sum: " + min);
        System.out.println("Maximum sum: " + max);
    }

    public static void minMaxSumImproved(List<Integer> arr) {
        // Calculate the total sum of the list
        // int totalSum = arr.stream().mapToInt(Integer::intValue).sum();
        long totalSum = arr.stream().mapToInt(Integer::intValue).sum();
        // Find the minimum and maximum values in the list
        long min = arr.stream().mapToInt(Integer::intValue).min().orElse(0);
        long max = arr.stream().mapToInt(Integer::intValue).max().orElse(0);
        // Calculate the minimum and maximum sums
        long minSum = totalSum - max;
        long maxSum = totalSum - min;
        // Print the minimum and maximum sums
        System.out.println("Minimum sum: " + minSum);
        System.out.println("Maximum sum: " + maxSum);

        System.out.printf("%d %d", minSum, maxSum);
        System.out.println();

    }

    public static void readConsoleInputData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter some data: ");
        // Read a line of text from the console
        List<Integer> inputList = Stream.of(reader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .toList();
        System.out.println("You entered: " + inputList); 
        // Call the minMaxSumm method with the input list
        minMaxSumm(inputList);
        // Close the BufferedReader
        reader.close();
        // Print the input list
        System.out.println("Input list: " + inputList);
        // Print the size of the input list
        System.out.println("Size of input list: " + inputList.size());   
        // Call the minMaxSumImproved method with the input list
        minMaxSumImproved(inputList);   
    }
    
}
