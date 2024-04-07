package tasks;
////time complexity O(n^2)
import java.util.Scanner;

public class Task9 {
    public void runTask(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter n ");
        int n = scanner.nextInt();
        System.out.print("enter k ");
        int k = scanner.nextInt();

        System.out.println("C(" +n+ ", "+k + ") = " + binCoef(n, k));
        scanner.close();
    }
    private static int binCoef(int n, int k){
        if(k==0 || k==n){
            return 1;
        }
        return binCoef(n-1,k-1)+ binCoef(n-1,k);
    }
}
