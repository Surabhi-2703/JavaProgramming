package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();

        int[] arrays = new int[n];
        for(int i = 0; i<n;i++) {
            System.out.println("Enter the number :");
            arrays[i] = sc.nextInt();
        }

        ArraySum summation = new ArraySum();
        System.out.printf("Sum of the first %s natural number is %s",n, summation.sumOfNumbers(arrays,n-1));
    }

    public int sumOfNumbers(int[] arr, int n) {
        // base condition
        if(n <= 0) {
            return arr[0];
        }
        return arr[n] + sumOfNumbers(arr,n-1);
    }
}
