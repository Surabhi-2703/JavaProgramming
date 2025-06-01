import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        System.out.printf("Factorial of a number %s is %s",number,fact.getFactorial(number));
    }

    public int getFactorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n-1);
    }
}
