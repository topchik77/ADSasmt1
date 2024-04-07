package tasks;

import java.util.Scanner;

public class Task4 {
    public void runTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number ");
        int n = scanner.nextInt();

        int factorial = Factorial(n);
        System.out.println(n+"!= "+ factorial);
        scanner.close();
    }
    private int Factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }
}
