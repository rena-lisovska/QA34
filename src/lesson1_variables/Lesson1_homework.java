package lesson1_variables;

public class Lesson1_homework {
    public static void main(String[] args) {
// 1.Даны две переменные: a=5, b=10. Напишите программу, которая меняет значением a и b местами (a должно стать 10, b - 5)
        System.out.println();
        System.out.println("Homework 1, task 1:");
        int a = 5;
        int b = 10;
        int newValueA = b;
        int newValueB = a;
        System.out.println("Replacing values: " + "a = " + newValueA + " and b = " + newValueB);

// 2. Найти среднее арифметическое и вывести результат для следующих значений: int a = 5; int b = 7; int c = 9;
        System.out.println();
        System.out.println("Homework 1, task 2:");
        int a1 = 5;
        int b1 = 7;
        int c1 = 9;
        int divider = 3;
        int arifMean = (a1 + b1 + c1) / divider; // эту переменную можно убрать и формулу перенести в println - логичнее здеь было бы использовать double
        System.out.println("Arithmetic mean for values: " + arifMean);

// 3. Создайте логические переменные (boolean):
// Совершеннолетний ли человек?  Пример: boolean c = age < 20
        System.out.println();
        System.out.println("Homework 1, task 3:");
        int age = 17;
        boolean adult = age >= 18;
        System.out.println("The user is of legal age: " + adult);
// Зарплата больше 1000?
        int salaryUser = 1010;
        boolean moreValueSalary = salaryUser >= 1000;
        System.out.println("The user's salary is above 1000: " + moreValueSalary);

// 4. Дана переменная: int seconds = 3672. Переведите секунды в: часы, минуты, оставшиеся секунды. Использовать только деление / и остаток %.
        System.out.println();
        System.out.println("Homework 1, task 4:");
        int seconds = 3672;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainder = seconds % 60;
        System.out.println("This value contains: " + hours + " hours " + minutes + " minutes " + remainder + " seconds");

    }

}








