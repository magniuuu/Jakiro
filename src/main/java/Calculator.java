import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private char operator;

    public void Entrance(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        if(parts.length != 3) {
            System.out.println("Ошибка: Введите выражение в формате 'число оператор число'");
            return;
        }
        try {
            num1 = Integer.parseInt(parts[0]);
        }catch (NumberFormatException e) {
            System.out.println("Не удалось получить число ");
            return;
            }
        try {
            num2 = Integer.parseInt(parts[2]);
        }catch (NumberFormatException e) {
            System.out.println("Не удалось получить число ");
            return;
        }
            operator = parts[1].charAt(0);
        
    }
    public void Aut() {

        switch (operator) {
            case '+':
                add();
                break;
            case '-':
                subtract();
                break;
            case '*':
                multiply();
                break;
            case '/':
                divide();
                break;
            default:
                System.out.println("Некорректная операция.");
    }
}

        public void add() {
        int result = num1 + num2;
        System.out.println("Результат сложения: " + result);
    }

    public void subtract() {
        int result = num1 - num2;
        System.out.println("Результат вычитания: " + result);
    }

    public void multiply() {
        int result = num1 * num2;
        System.out.println("Результат умножения: " + result);
    }

    public void divide() {
        if (num2 != 0) {
            int result = num1 / num2;
            System.out.println("Результат деления: " + result);
        } else {
            System.out.println("Деление на ноль невозможно.");
        }
    }
}

class main {
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        calculator.Entrance();
        calculator.Aut();
      
}
}
