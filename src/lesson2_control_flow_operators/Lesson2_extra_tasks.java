package lesson2_control_flow_operators;

public class Lesson2_extra_tasks {
    public static void main(String[] args) {

//  1. Конструкция if - else
//  Задание 1. «Вход в клуб»: Создай переменную age. Если возраст 18 и больше — выведи "Проходи", иначе — "Расти еще".
        System.out.println("\nExtra homework 2, task 1:");
        int age = 16;
        if (age >= 18) {
            System.out.println("Проходи");
        } else {
            System.out.println("Расти ещё");
        }
//  Задание 2. «Температурный датчик»: Есть переменная t. Если t < 0 — "Мороз". Если t от 0 до 15 — "Прохладно". Если t от 16 до 30 — "Тепло". Если выше 30 — "Жара".
        System.out.println("\nExtra homework 2, task 2:");
        double t = 13.5;
        if (t < 0) {
            System.out.println("Мороз");
        } else if (t > 0 && t <= 15) {
            System.out.println("Прохладно");
        } else if (t >= 16 && t <= 30) {
            System.out.println("Тепло");
        } else if (t > 30) {
            System.out.println("Жара");
        }
//  Задание 3. «Логин и Пароль»: Создай две строки login и password. Если логин равен "admin" И пароль равен "12345", выведи "Доступ разрешен". В любом другом случае — "Ошибка доступа".
        System.out.println("\nExtra homework 2, task 3:");
        String login = "admin";
        String password = "12345";
        if (login.equals("admin") && password.equals("12345")) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Ошибка доступа");

        }
//  2. Конструкция switch
//  Задание 4. «Месяцы»: Создай переменную month (от 1 до 12). Через switch выведи название времени года (Зима, Весна и т.д.). Подсказка: можно группировать кейсы.
        System.out.println("\nExtra homework 2, task 4:");
        int month = 5;
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
// Задание 5. «Оценки»: Пользователь вводит чар (символ) grade ('A', 'B', 'C', 'D', 'F'). 'A' -> "Великолепно", 'B' -> "Хорошо" ... и так далее. Добавь default для неизвестной оценки.
        System.out.println("\nExtra homework 2, task 5:");
        char grade = 'М';
        switch (grade) {
            case 'A' -> System.out.println("Великолепно");
            case 'B' -> System.out.println("Хорошо");
            case 'C' -> System.out.println("Нормально");
            case 'D' -> System.out.println("Удовлетворительно");
            case 'F' -> System.out.println("Плохо");
            default -> System.out.println("Неизвестная оценка");
        }
//  Задание 6. «Калькулятор»: Есть две переменные a, b и символ operation ('+', '-', '*', '/'). Через switch выполни нужное действие и выведи результат.
        System.out.println("\nExtra homework 2, task 6:");
        double a = 10;
        double b = 4;
        String operation = "/";
        switch (operation) {
            case "-" -> System.out.println(a - b);
            case "+" -> System.out.println(a + b);
            case "*" -> System.out.println(a * b);
            case "/" -> System.out.println(b != 0 ? a / b : "Деление на ноль!");
            default -> System.out.println("Выполнить действие невозможно");
        }
//  Задание 7. «Четное-нечетное»: Есть число number. Запиши в строку result слово "Четное" или "Нечетное" с помощью тернарного оператора. Подсказка: используй остаток от деления % 2 == 0.
//      переменная  = (условие) ? значение_если_true : значение_если_false;
        System.out.println("\nExtra homework 2, task 7:");
        double number = 90;
        String result = number % 2 == 0 ? "Чётное" : "Нечётное";
        System.out.println(result);
//  Задание 8. «Скидка»: Если сумма чека sum больше 5000, запиши в переменную finalAmount значение со скидкой 10% (умножить на 0.9), иначе оставь как есть.
        System.out.println("\nExtra homework 2, task 8:");
        double sum = 9000;
        double finalAmount = sum > 5000 ? sum * 0.9 : sum;
        System.out.println(finalAmount);
//  Задание 9.«Максимум»: Есть два числа x и y. С помощью тернарного оператора найди большее из них и присвой его переменной max.
        System.out.println("\nExtra homework 2, task 9:");
        int x = 8;
        int y = 9;
        int max = x > y ? x : y;
        System.out.println(max);
    }
}
