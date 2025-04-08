package com.java.practical.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingSort {

    public static void main(String[] args) throws IOException {
        countingSort();
    }
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int max = arr.stream().max(Integer::compareTo).orElse(0) + 1;
        System.out.println("max = " + max);
            int[] numberFrequency = new int[arr.stream().max(Integer::compareTo).orElse(0) + 1];
            System.out.println("arr.size() = " + arr.size());
            arr.stream().forEach(index -> numberFrequency[index] += 1);
            return Arrays.stream(numberFrequency).boxed().collect(Collectors.toList());
        }

    public static void countingSort() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        List<Integer> result = countingSort(arr);
        System.out.println("--------------------------------------------");
        System.out.println(result.stream()
            .map(Object::toString)
            .collect(Collectors.joining(" "))
        );        
        System.out.println("--------------------------------------------");

        bufferedReader.close();
    }

}
