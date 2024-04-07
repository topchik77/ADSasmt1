package tasks;

import java.util.Scanner;
//time complexity O(2^n)
public class Task5 {
    public void runTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter nth number of fibonacci ");

        int n = scanner.nextInt();
        int fibnumber = fib(n);
        System.out.println("the "+ n + "th Fibonacci number = " + fibnumber);
        scanner.close();
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
