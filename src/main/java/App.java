import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if(parts.length != 3) {
            System.out.println("Ошибка: Введите выражение в формате 'число оператор число'");
            return;
        }
        int num1;
        try {
            num1 = Integer.parseInt(parts[0]);
        }catch (NumberFormatException e) {
            System.out.println("Не удалось получить число из: ");
            return;
            }
        int num2;
        try {
            num2 = Integer.parseInt(parts[2]);
        }catch (NumberFormatException e) {
            System.out.println("Не удалось получить число из: ");
            return;
        }
        char operator = parts[1].charAt(0);
        int result = 0;

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
        System.out.println("Ошибка: Деление на ноль!");
                    return;
                }
                break;
            default:

        System.out.println("Ошибка: Неверный оператор!");
                    return;
                }
                System.out.println("Результат: " + result);
    }
}
