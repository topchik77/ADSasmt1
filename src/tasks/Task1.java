package tasks;

import java.util.Scanner;

public class Task1 {
    public void runTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of elements :");

        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min value is " + min);
        scanner.close();
    }
    public static void main(String[] args) {
        new Task1().runTask();
    }
}
