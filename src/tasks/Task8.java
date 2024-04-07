package tasks;
import java.util.Scanner;
//time complexity O(n)
public class Task8 {
    public void runTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println(allDigits(str) ? "Yes" : "No");
    }

    private boolean allDigits(String str){
        if (str == null || str.length() == 0) {
            return false;
        }
        int size = str.length();
        for (int i = 0; i < size; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
