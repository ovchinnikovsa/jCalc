import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        print("Простой калькулятор на Java");
        print("Введите первое число: ");
        try {
            num1 = scanner.nextDouble();
        } catch (Exception e) {
            print("Ошибка ввода первого числа");
            return;
        }

        print("Введите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        print("Введите второе число: ");
        try {
            num2 = scanner.nextDouble();
        } catch (Exception e) {
            print("Ошибка ввода второго числа");
            return;
        }

        double result = 0;

        switch (operator) {
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
                    print("Ошибка: деление на ноль.");
                    return;
                }
                break;
            default:
                print("Ошибка: неверная операция.");
                return;
        }

        print("Результат: " + result);
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
