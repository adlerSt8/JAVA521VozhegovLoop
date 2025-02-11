import java.util.Scanner;
//TODO: Программа, которая запрашивает год и определяет, является ли он високосным
public class TaskFirst {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        scanner.close();
    }
}
