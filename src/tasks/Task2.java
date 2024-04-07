package tasks;

import java.util.Scanner;

public class Task2 {
    public void runTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of elements :");

        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int i =0; i<n; i++){
            sum += arr[i];
        }

        double average= sum / n;
        System.out.println("average = "+ average);
        scanner.close();
    }
}
