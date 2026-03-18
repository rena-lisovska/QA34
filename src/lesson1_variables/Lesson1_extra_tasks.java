package lesson1_variables;
// 1. АРИФМЕТИЧЕСКИЕ ОПЕРАЦИИ
// +   Сложение            (5 + 2 = 7)
// -   Вычитание           (5 - 2 = 3)
// *   Умножение           (5 * 2 = 10)
// /   Деление             (5 / 2 = 2) -> результат целое число, т.к. оба операнда int
// %   Остаток от деления  (5 % 2 = 1) -> часто для проверки на четность (x % 2 == 0)

// ИНКРЕМЕНТ И ДЕКРЕМЕНТ (Бывают двух видов):
// ++a (Префиксный): сначала увеличивает переменную на 1, потом использует её в коде
// a++ (Постфиксный): сначала использует текущее значение, а потом увеличивает на 1
// --a (Префиксный): сначала уменьшает переменную на 1, потом использует её
// a-- (Постфиксный): сначала использует текущее значение, а потом уменьшает на 1


// 2. ОПЕРАЦИИ СРАВНЕНИЯ (Результат всегда boolean: true или false)
// ==  Равно               (5 == 5 -> true)
// !=  Не равно            (5 != 3 -> true)
// >   Больше              (10 > 5 -> true)
// <   Меньше              (2 < 1  -> false)
// >=  Больше или равно    (5 >= 5 -> true)
// <=  Меньше или равно    (4 <= 5 -> true)

// ! ВАЖНО: Объекты (String и др.) сравниваются через .equals(), а не ==

// 3. ЛОГИЧЕСКИЕ ОПЕРАЦИИ СРАВНЕНИЯ (работают с boolean)
// &&  Логическое "И" (Сокращенное): true, только если ОБА значения true.        (5 > 3 && 10 > 5) -> true
//     Если первое значение false, второе даже не проверяется (экономит время).

// &   Логическое "И" (Полное): работает так же, но ВСЕГДА проверяет оба значения.
//     Обычно используется реже, в специфических задачах.

// ||  Логическое "ИЛИ" (Сокращенное): true, если ХОТЯ БЫ ОДНО значение true.    (5 > 10 || 10 > 5) -> true
//     Если первое значение true, второе не проверяется.

// |   Логическое "ИЛИ" (Полное): работает так же, но ВСЕГДА проверяет оба значения.

// ^   Логическое "Исключающее ИЛИ" (XOR): true, только если значения РАЗНЫЕ.
//     (true ^ false) -> true
//     (true ^ true)  -> false (одинаковые — значит ложь)

// !   Логическое "НЕ" (Отрицание): переворачивает значение.
//     !(5 > 10) -> true (потому что 5 > 10 это false, а "не false" это true)

// 4. ОПЕРАЦИИ ПРИСВАИВАНИЯ
// =   Простое присваивание           (x = 10)
// +=  Сложение с присваиванием       (x += 5  =>  x = x + 5)
// -=  Вычитание с присваиванием      (x -= 3  =>  x = x - 3)
// *=  Умножение с присваиванием      (x *= 2  =>  x = x * 2)
// /=  Деление с присваиванием        (x /= 2  =>  x = x / 2)
// %=  Остаток с присваиванием        (x %= 3  =>  x = x % 3)

public class Lesson1_extra_tasks {
    public static void main(String[] args) {
// Блок 1: Арифметика и приведение типов
// Задача 1: У тебя есть цена товара double price = 19.99; и количество int quantity = 3;
// Вычисли общую стоимость.
// Преобразуй результат в int (отбросив копейки) и выведи на экран.
        System.out.println("\nExtra homework 1, task 1:");
        double price = 19.99;
        int quantity = 3;
        double totalCost = price * quantity;
        int finalPrice = (int) totalCost;
        System.out.println("The total cost of goods is: " + finalPrice);

// Задача 2: Объяви переменную int totalApples = 28;. В корзину помещается 5 яблок.
// Используя оператор %, узнай, сколько яблок останется лишними, если заполнить все целые корзины.
        System.out.println("\nExtra homework 1, task 2:");
        int totalApples = 28;
        int basketSize = 5;
        int restApples = totalApples % basketSize;
        System.out.println("The rest of the apples that don't fit in the basket: " + restApples);

// Задача 3: Даны три целых числа: a = 10, b = 15, c = 20.
// Найди их среднее значение.
        System.out.println("\nExtra homework 1, task 3:");
        int a = 10;
        int b = 15;
        int c = 21;
        int sizeNum = 3;
        double arithMean = (double) (a + b + c) / sizeNum;
        System.out.println("The arithmetic mean of the numbers presented is equal to " + arithMean);

// Блок 2: Инкремент и приоритеты
// Задача 4: Что выведет этот код? Попробуй решить в уме, а потом проверить в IDEA:
        System.out.println("\nExtra homework 1, task 4:");
        int x = 10; // 12
        int y = ++x; // 11
        int z = x++; // 11
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
//  Каждый раз, когда ты видишь ++ рядом с x, представь, что x — это счетчик.
//  Неважно, стоит плюс до или после, как только команда выполнится, значение в коробке x станет на 1 больше.
//  Разница между ++x и x++ влияет только на то, что получит другая переменная (y или z),
//  но для самого x исход один — он увеличивается.

// Задача 5: У тебя есть int score = 10;.
// Напиши одну строку кода, которая умножит score на 2, а затем прибавит к результату 5, используя комбинированные операторы присваивания.
        System.out.println("\nExtra homework 1, task 5:");
        int score = 10;
        score *= 2;
        score += 5;
        // пример в 1 строку, но он сложноват как по мне score = (score *= 2) + 5;
        System.out.println(score);

// Блок 3: Логика и сравнения
// Задача 6: Создай переменные int age = 19; и boolean hasTicket = true;.
// Напиши условие (через логические операторы), которое выведет true, если человеку есть 18 лет И у него есть билет.
        System.out.println("\nExtra homework 1, task 6:");
        int age = 19;
        boolean hasTicket = true;
        boolean systemResponse = age >= 18 && hasTicket;
        System.out.println("The person is over 18 and has a ticket: " + systemResponse);

// Задача 7: Даны две переменные: boolean isWeekend = false; и boolean hasCoffee = true;.
// Напиши выражение, которое будет true, если сейчас выходной ИЛИ если у тебя просто есть кофе (в обоих случаях настроение хорошее).
        System.out.println("\nExtra homework 1, task 7:");
        boolean isWeekend = false;
        boolean hasCoffee = true;
        boolean goodMood = isWeekend || hasCoffee;
        System.out.println("Do you have a day off or a nice cup of coffee in your hand?: " + goodMood);

// Задача 8: У охранной системы два датчика: boolean sensor1 и boolean sensor2. Система подает сигнал тревоги только тогда, когда показатели датчиков разные (один сработал, другой нет).
// Напиши выражение с оператором ^, которое определит, будет ли тревога, если sensor1 = true, а sensor2 = true.
        System.out.println("\nExtra homework 1, task 8:");
        boolean sensor1 = true;
        boolean sensor2 = true;
        boolean triggerSistem = sensor1 ^ sensor2;
        System.out.println("The system gives an alarm signal: " + triggerSistem);

// Блок 4: Ссылочные типы и String
// Задача 9: Создай три строки: String firstName = "Java";, String space = " ";, String lastName = "Developer";.
// Объедини их в одну переменную fullName и выведи длину (length()) получившейся строки.
        System.out.println("\nExtra homework 1, task 9:");
        String firstName = "Java";
        String space = " ";
        String lastName = "Developer";
        String fullName = firstName + space + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

// Задача 10: Что выведет этот код и почему?
        System.out.println("\nExtra homework 1, task 10:");
        String aa = "Home";
        String bb = "Work";
        String cc = aa + bb; // HomeWork
        System.out.println(cc == "HomeWork"); // false, т.к. объекты (String и др.) сравниваются через .equals(), а не ==
        System.out.println(cc.equals("HomeWork")); // true

        // Супер-задача: «Система прокачки героя»
        System.out.println("\nExtra homework 1, super challenge:");
        //Условие: У тебя есть герой с начальными характеристиками:
        String heroName = "JavaKnight"; // имя
        int level = 1; // уровень
        double experience = 0.0; // опыт
        int health = 100; // здоровье

        //Что нужно сделать (алгоритм):
        //Бой: Герой победил монстра! Увеличь experience на 25.5. Уменьши health на 10, используя комбинированный оператор.
        experience += 25.5;
        health -= 10;

        //Магический бонус:
        // * Уровень level должен увеличиться на 1, но сделай это через постфиксный инкремент прямо внутри команды вывода текста:
        System.out.println("Текущий уровень: " + level++);
        //Сразу после этого выведи еще раз:
        System.out.println("Новый уровень: " + level);
        // Посмотри, как изменится число.
        //Проверка состояния (Логика): Создай переменную boolean canContinue, которая будет true, если здоровье health больше 50 И опыт experience больше 20.
        boolean canContinue = health > 50 && experience > 20;
        //Финальный отчет (Строки):
        //Создай строку statusReport, которая объединит имя героя и его текущее здоровье в формате: "Hero JavaKnight has 90 HP".
        String statusReport = "Hero " + heroName + " has " + health + " HP.";
        //Выведи длину этой строки.
        System.out.println(statusReport);
        System.out.println(statusReport.length());
        //Твой «бонус-вопрос»:
        //Если ты прибавишь к health (который int) значение опыта 25.5 через оператор +=, что произойдет с дробной частью?
        // Ответ: дробная часть обрежется без округления

    }
}
