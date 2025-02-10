import java.util.Scanner;
//TODO: Программа для создания пирамиды из звездочек с заданным количеством уровней
public class TaskThird {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество уровней пирамиды: ");
        int levelStart = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < levelStart; i++) {
            for (int j = 0; j < levelStart * 2; j++) {
                if (j >= levelStart - 1 - count && j <= levelStart - 1 + count) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            count++;
        }
        scanner.close();
    }
}
