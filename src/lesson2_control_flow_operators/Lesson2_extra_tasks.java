package lesson2_control_flow_operators;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


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

//  3. ЦИКЛ for
//  Задание 10. «Обратный отсчет»: Выведи в консоль числа от 10 до 1. В конце добавь строку "Поехали!".
        System.out.println("\nExtra homework 2, task 10:");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Поехали!");
//  Задание 11. «Таблица умножения»: Создай переменную n (например, 5). Выведи таблицу умножения для этого числа от 1 до 10 (например: 5 * 1 = 5, 5 * 2 = 10 и т.д.).
        System.out.println("\nExtra homework 2, task 11:");
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
//  Задание 12. «Через одного»: У тебя есть массив строк (любых). Выведи в консоль только элементы с четными индексами (0, 2, 4...).
        System.out.println("\nExtra homework 2, task 12:");
        int[] mass = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0) {
                System.out.println(mass[i]);
            }
        }
//        вариант от AI, как можно сделать проще
        for (int i = 0; i < mass.length; i += 2) {
            System.out.println(mass[i]);
        }

//  4. ЦИКЛ for-each
//  Задача 13. «Сумма цен»: Создай массив double[] prices = {150.5, 300.0, 45.9, 100.2}. Посчитай общую сумму всех товаров в массиве и выведи её.
        System.out.println("\nExtra homework 2, task 13:");
        double[] prices = {150.5, 300.0, 45.9, 100.2};
        double totalPrices = 0;
        for (double p : prices) {
            totalPrices += p;
        }
        System.out.println(totalPrices);
//  Задача 14.«Поиск буквы»: Создай массив имен. Выведи в консоль только те имена, которые длиннее 4 букв.
        System.out.println("\nExtra homework 2, task 14:");
        String[] names = {"Petr", "Vasiliy", "Dmitriy", "Ivan", "Kuzia", "Michail"};
        for (String name : names) {
            if (name.length() > 4) {
                System.out.println(name);
            }
        }
//  Задача 15. «Налог»: Есть массив зарплат int[] salaries. Выведи каждую зарплату, предварительно вычтя из неё 13% налога.
        System.out.println("\nExtra homework 2, task 15:");
        int[] salaries = {1000, 1200, 1500, 2000, 2300, 2500};
        int finsalaries = 0;
        for (int sal : salaries) {
            finsalaries = sal - ((sal * 13) / 100);
            System.out.println(finsalaries);
        }
//  5. ЦИКЛ while
//  Задача 16. «Копилка»: У тебя есть цель — накопить 1000 рублей. Изначально в копилке 0.
//  Каждый шаг цикла ты "добавляешь" случайное число (от 10 до 100) и выводишь текущую сумму. Цикл должен остановиться, как только сумма станет >= 1000.
        System.out.println("\nExtra homework 2, task 16:");
        int piggyBank = 0;
        while (piggyBank <= 1000) {
            int randomNum = ThreadLocalRandom.current().nextInt(10, 101); // современный способ через класс ThreadLocalRandom. Вверху я прописала import java.util.concurrent.ThreadLocalRandom; 101, потому что верхняя граница не включается
            piggyBank += randomNum;
            System.out.println("Текущий баланс копилки равен: " + piggyBank);
        }
        System.out.println("Ура! Вы накопили: " + piggyBank);
//  Задача 17. «Деление»: Есть число 100. Пока оно больше 10, дели его на 2 и выводи результат.
        System.out.println("\nExtra homework 2, task 17:");
        double num17 = 100;
        while (num17 > 10) {
            num17 /= 2;
            System.out.println(num17);
        }
//  Задача 18. «Счетчик энергии»: Робот идет, пока у него есть заряд. int battery = 20. Каждый шаг выводи "Робот идет, заряд: ..." и уменьшай заряд на 3. Как только заряда не хватит на полный шаг — остановись.
        System.out.println("\nExtra homework 2, task 18:");
        int battery = 20;
        while (battery > 3) {
            battery -= 3;
            System.out.println("Робот идет, заряд: " + battery);
        }
        System.out.println("Робот не может дальше идти. Необходима подзарядка.");
//  Задача 19.«Подтверждение»: Представь проверку: программа просит нажать "1" для выхода. Используй Scanner (если умеешь) или просто имитируй: цикл запрашивает число, и если это не 1, продолжает запрашивать.
        System.out.println("\nExtra homework 2, task 19:");
        int input;
        do {
            input = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.println(input);
            if (input != 1) {
                System.out.println("Неверный пароль для выхода, попробуйте ещё раз");
            }
        } while (input != 1);
        System.out.println("Выход из программы осуществлён успешно");
//  Задача 20. «Генератор кубика»: Бросай игральную кость (генерируй случайное число от 1 до 6).
//  Если выпало меньше 6, бросай снова. Выведи все броски. (Тут важно бросить хотя бы один раз, поэтому do-while).
        System.out.println("\nExtra homework 2, task 20:");
        int sideCube;
        do {
            sideCube = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println(sideCube);
        } while (sideCube < 6);
        System.out.println("Ура! У тебя выпало 6.");
// Задача 21. «Разгон»: Скорость машины 0. Машина разгоняется порциями по 20 км/ч. Выводи скорость, пока она не достигнет 100.
        System.out.println("\nExtra homework 2, task 20:");
        int speed = 0;
        do {
            speed +=20;
            System.out.println("Текущая скорость: " + speed + " км/ч");
        }while (speed < 100);

// Задания со звездочкой (Выбери цикл сама).
// Задание 22. Нужно вывести список всех моделей машин в консоль. (Какой цикл тут самый лаконичный?)
        String [] cars = {"Mazda", "Lada", "Lotos", "BMW", "Volvo", "Geely"};
        System.out.println("\nExtra homework 2, task 22:");
        for (String mark : cars){
            System.out.println("В салоне представлены модели производителя: " + mark);
        }
//  Задание 23. У тебя есть переменная cleanWater = 10 (литры воды).
//  Ты моешь машину, пока вода не кончится. За одну мойку тратится 3 литра.
//  При этом ты обязана помыть хотя бы одну машину, даже если воды изначально меньше 3 литров (такой вот контракт). (Какой цикл тут критически важен?)
        System.out.println("\nExtra homework 2, task 23:");
        int cleanWater = 10;
        do {
            cleanWater -= 3;
            System.out.println("Машина отправлена на мойку");
        }while (cleanWater >= 3);

    }
}
