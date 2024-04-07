package tasks;

import java.util.Scanner;

public class Task3 {
    public void runTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number ");

        int n = scanner.nextInt();
        boolean is_prime = is_prime(n);
        if(n<=1) {
            System.out.println(n+ " is prime number");
        }
        else {
            System.out.println(n+ " is composite numer");
        }
        scanner.close();
    }
    private boolean is_prime(int n) {
        if (n<=1){
            return false;
        }
        for (int i = 2; i<=Math.sqrt(n); i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}