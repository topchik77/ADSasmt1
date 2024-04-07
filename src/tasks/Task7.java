package tasks;

import java.util.Scanner;

public class Task7 {
    public void runTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number of elements ");

        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements: ");
        for (int i =0; i<n; i++){
            arr[i]= scanner.nextInt();
        }

        reverseArr(arr, 0, n-1);
        System.out.println("reversed array: ");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i]+ " ");
        }
        scanner.close();
    }

    private void reverseArr(int[] arr, int start, int end){
        if(start >= end) {
            return;
        }
        //this part code swaps elements at the start to the end
        arr[start] += arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] -= arr[end];
        reverseArr(arr, start + 1, end - 1);
    }
}
