package tasks;
//time complexity O(log(min(a, b)))
import java.util.Scanner;

public class Task10 {
    public void runTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Greatest common divisor calculator ");
        System.out.print("enter a ");
        int a = scanner.nextInt();
        System.out.print("enter b ");
        int b = scanner.nextInt();
        System.out.println("GCD(" + a + "," + b + ")= " + GCD(a, b));
    }

    private static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}