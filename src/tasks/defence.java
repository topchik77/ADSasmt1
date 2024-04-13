package tasks;

import java.util.Scanner;

public class defence {
    public void runTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scanner.nextLine();
        System.out.println("enter a character you want to count");
        char ch = scanner.nextLine();

        int count = countOccurance(str, ch);
        System.out.println("the occurance of "+ ch + " equal to" + count);
        scanner.close();


        public int countOccurance(String str, char ch) {
            ch=ch.toLowerCase();
            str=str.toLowerCase();
            int count = 0;
            for (int i = 0; i<str.length(); i++) {
                if(str.charAt(i) ==ch){
                    count++;
                }
            }
            return count;
        }
    }
}
