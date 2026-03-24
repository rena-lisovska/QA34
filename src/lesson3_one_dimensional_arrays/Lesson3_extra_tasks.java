package lesson3_one_dimensional_arrays;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Lesson3_extra_tasks {

//  Класс Scanner. Подключаем через import java.util.Scanner;
//  В классе есть методы для чтения очередного символа заданного типа со стандартного потока ввода, а так же для проверки существования такого типа:
//  nextInt()
//  nextLine()
//  hasNextInt() ...

    public static void main(String[] args) {
        System.out.println("==========");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        if (sc.hasNext()) {
            int a = sc.nextInt();
            System.out.println("Вы ввели " + a);
        } else {
            System.out.println("Вы ввели не целое число");
        }

        System.out.println("==========");
//  Шаг 1: Создаем объект сканера
        Scanner scanner = new Scanner(System.in);
//  Шаг 2: Узнаем размер массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
//  Шаг 3: Создаем массив нужной длины
        int[] array = new int[size];
//  Шаг 4: Заполняем массив через цикл
        System.out.println("Введите элементы массива (" + size + " шт.):");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент [" + i + "]: ");
            array[i] = scanner.nextInt(); // Ждем ввода числа от пользователя
        }
// Шаг 5: Выводим результат для проверки
        System.out.print("Ваш массив: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
//  Хорошим тоном считается закрывать сканер в конце

//  Класс Random. Подключается через java.util.Random
//  Представляет собой генератор псевдослучайных чисел. В классе есть методы для генерации очередного числа определённого типа:
//        nextInt()
//        nextDouble()
//        nextBoolean()
        System.out.println("==========");
        Random rnd = new Random();
        int[] numbers = new int[5]; // Массив на 5 мест
        for (int i = 0; i < numbers.length; i++) {
            // Генерируем число от 0 до 99 и прибавляем 1, чтобы получить диапазон 1-100
            numbers[i] = rnd.nextInt(100) + 1;
        }
        System.out.println("Случайный массив: " + Arrays.toString(numbers));


//  Задача. Организовать генерацию массива с использованием класса Random. Размер массива ввести с клавиатуры с использованием класса Scanner.
        System.out.println("==========");
        Random randomTask = new Random();
        Scanner scannerTask = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int sizeMass = scanner.nextInt();
        int[] Mass = new int[sizeMass];
        for (int i = 0; i < Mass.length; i++) {
            Mass[i] = rnd.nextInt(50);
        }
        System.out.println("Массив из задания: " + Arrays.toString(Mass));


        scanner.close();
    }

}

