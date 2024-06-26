package tasks;
//time complexity O(log n)
import java.util.Scanner;

public class Task6 {
    public void runTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the base number ");
        double a = scanner.nextDouble();
        System.out.println("enter the exponent ");
        int n = scanner.nextInt();

        double result = power(a,n);
        System.out.println(a+ " to the power of "+ n);

        scanner.close();
    }

    //this main part of the code executes the nth power
    private static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * power(a, n - 1);
        } else {
            return 1 / power(a, -n);
        }
    }
}
