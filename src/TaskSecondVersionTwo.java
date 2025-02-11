import java.util.Arrays;
import java.util.Scanner;

//TODO: Программа, которая проверяет, является ли введенная строка палиндромом
// (читается одинаково с начала и с конца, игнорируя пробелы и регистр букв).

/*
   Вторая версия программы проверки строки на палиндром, делать было нечего)
 */

public class TaskSecondVersionTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().replace(" ", "").toLowerCase();
        char[] charArray = string.toCharArray();
        char[] charArrayNew = new char[charArray.length];
        int index = 0;

        for (int i = charArray.length - 1; i >= 0; i--) {
            charArrayNew[index] = charArray[i];
            index++;
        }
        if (Arrays.equals(charArray, charArrayNew)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}
