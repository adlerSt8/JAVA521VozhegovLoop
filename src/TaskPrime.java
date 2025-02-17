import java.util.Scanner;

public class TaskPrime {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число для проверки: ");
            int n = scanner.nextInt();

            if (n <= 1) {
                System.out.println(n + " — не простое и не составное");
            } else {
                boolean isPrime = true;
                int sqrt = (int) Math.sqrt(n);

                for (int i = 2; i <= sqrt; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                System.out.println(n + " — " + (isPrime ? "простое число" : "составное число"));
            }

            scanner.close();
        }
}
