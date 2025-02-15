//TODO: Программа, которая выводит все нечетные числа в диапазоне от 1 до 20

public class TaskSixth {
    public static void main(String[] args) {
        System.out.println("Все нечетные числа в диапазоне от 1 до 20: ");
        for (int i = 1; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
