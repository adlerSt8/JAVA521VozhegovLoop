import java.util.Random;
import java.util.Scanner;

//TODO: программу, которая генерирует(Random) случайное число от 1 до 100,
// а затем предлагает пользователю угадать это число.
// Программа должна предоставлять подсказки (слишком маленькое или слишком большое)
// и продолжать игру, пока пользователь не угадает число.

public class TaskFifth {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int playerNumber;

        System.out.println(
                """
                        Добро пожаловать в игру 'Угадай число!':
                        Попробуйте угадать число от 1 до 100.
                """
        );

        do {
            System.out.println("Введите вашу догадку: ");
            playerNumber = scanner.nextInt();

            if (playerNumber < randomNumber) {
                System.out.println("Слишком маленькое число. Попробуйте еще раз.");
                continue;
            } else if (playerNumber > randomNumber) {
                System.out.println("Слишком большое число. Попробуйте еще раз.");
                continue;
            } else {
                System.out.println("Поздравляем! Вы угадали число " + randomNumber);
            }

        } while (playerNumber != randomNumber);
        scanner.close();
    }
}
