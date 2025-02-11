import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//TODO: Программа, которая проверяет, является ли введенная строка палиндромом
// (читается одинаково с начала и с конца, игнорируя пробелы и регистр букв).

public class TaskSecond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().replace(" ", "").toLowerCase();
        char[] charArray = string.toCharArray();
        boolean isPalindrome = true;

        int startIndex = 0;
        int endIndex = charArray.length - 1;

        while (startIndex < endIndex) {
            if (charArray[startIndex] != charArray[endIndex]) {
                isPalindrome = false;
                break;
            }
            startIndex++;
            endIndex--;
        }
        if (isPalindrome) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}
