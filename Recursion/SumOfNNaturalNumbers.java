package Recursion;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int i = sc.nextInt();

        SumOfNNaturalNumbers summation = new SumOfNNaturalNumbers();
        System.out.printf("Sum of the first %s natural number is %s",i, summation.sumOfNumbers(i));
    }

    public int sumOfNumbers(int n) {
        // base condition
        if(n == 0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        return n + sumOfNumbers(n-1);
    }
}
