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
                Task2 task2 = new Task2();
                task2.runTask();
                break;
            case 3:
                Task3 task3 = new Task3();
                task3.runTask();
                break;
            case 4:
                Task4 task4 = new Task4();
                task4.runTask();
                break;
            case 5:
                Task5 task5 = new Task5();
                task5.runTask();
                break;
            case 6:
                Task6 task6 = new Task6();
                task6.runTask();
                break;
            case 7:
                Task7 task7 = new Task7();
                task7.runTask();
                break;
            case 8:
                Task8 task8 = new Task8();
                task8.runTask();
                break;
            case 9:
                Task9 task9 = new Task9();
                task9.runTask();
                break;
            case 10:
                Task10 task10 = new Task10();
                task10.runTask();
                break;
            default:
                System.out.println("Wrong task number");
        }
        scanner.close();
    }
}