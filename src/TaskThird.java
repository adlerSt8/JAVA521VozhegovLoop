import java.util.Scanner;

//TODO: Программа для создания пирамиды из звездочек с заданным количеством уровней

public class TaskThird {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество уровней пирамиды: ");
        int levelStar = scanner.nextInt();

        for (int i = 0; i < levelStar; i++) {
            for (int j = 0; j < levelStar * 2; j++) {
                if (j >= levelStar - 1 - i && j <= levelStar - 1 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
