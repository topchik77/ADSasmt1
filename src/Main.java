import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the task to run");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                Task1 task1 = new Task1();
                task1.runTask();
                break;
            case 2:
                Task1 task1 = new Task1();
                task1.runTask();
                break;
            case 3:
                Task1 task1 = new Task1();
                task1.runTask();
                break;
            case 4:
                Task1 task1 = new Task1();
                task1.runTask();
                break;
            case 5:
                Task1 task1 = new Task1();
                task1.runTask();
                break;
            case 6:
                Task1 task1 = new Task1();
                task1.runTask();
                break;
            case 7:
                Task1 task1 = new Task1();
                task1.runTask();
                break;
            case 8:
                Task1 task1 = new Task1();
                task1.runTask();
                break;
            case 9:
                Task1 task1 = new Task1();
                task1.runTask();
                break;
            case 10:
                Task1 task1 = new Task1();
                task1.runTask();
                break;
            default:
                System.out.println("Wrong task number");
        }
        scanner.close();
    }
}