import java.util.*;

// Задание 1: Для введенной с клавиатуры буквы английского алфавита нужно вывести слева стоящую букву на стандартной клавиатуре. При этом клавиатура замкнута, т.е. справа от буквы «p» стоит буква «a», а слева от "а" буква "р", также соседними считаются буквы «l» и буква «z», а буква «m» с буквой «q».

// public class homework5 {
//   public static void main(String[] args) {
//        char[] алфавит = {
//                'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p',
//                'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
//                'z', 'x', 'c', 'v', 'b', 'n', 'm'
//        };

//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Введите букву английского алфавита маленьким регистром: ");
//        char inputLetter = scanner.next().charAt(0);

//        int index = -1;
//        for (int i = 0; i < алфавит.length; i++) {
//            if (алфавит[i] == inputLetter) {
//                index = i;
//                break;
//            }
//        }


//        if (index != -1) {
//            char левостоящая;
//            if (index == 0) {
//                левостоящая = алфавит[алфавит.length - 1];
//            } else {
//                левостоящая = алфавит[index - 1];
//            }
//            System.out.println("Слева от буквы '" + inputLetter + "' стоит буква '" + левостоящая + "'.");
//        } else {
//            System.out.println("Проверьте, что вводите букву английского алфавита и маленьким регистром. Повторите ввод.");
//        }

//        scanner.close();
//    }
// }

// Задание 2. Задана последовательность, состоящая только из символов ‘>’, ‘<’ и ‘-‘. Требуется найти количество стрел, которые спрятаны в этой последовательности. Стрелы – это подстроки вида ‘>>-->’ и ‘<--<<’.

public class homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку, состоящую из символов '<', '>', '-' без пробелов: ");
        String input = scanner.nextLine();

        if (input.length() > 106) {
            System.out.println("Повторите ввод. Длина строки не должна превышать 106 символов.");
            return;
        }

        int стрелки = 0;

        for (int i = 0; i <= input.length() - 5; i++) {
            String substring = input.substring(i, i + 5);
            if (substring.equals(">>-->") || substring.equals("<--<<")) {
                стрелки++;
            }
        }

        System.out.println(стрелки);
    }
}