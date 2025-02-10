import java.util.Scanner;

public class TaskFourth {
    //TODO: Программа, которая найдет и выведет все простые числа
// в заданном (задает пользователь) диапазоне
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число диапазона: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число диапазона: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            int temp = secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }

        System.out.println("Простые числа в диапазоне от " + firstNumber + " до " + secondNumber + ": ");
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }

    public static boolean isPrime(int num) {
        int count = 0;
        if (num < 2) {
            return false;
        }

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
            if (count > 2) {
                return false;
            }
        }
        return true;
    }
}
