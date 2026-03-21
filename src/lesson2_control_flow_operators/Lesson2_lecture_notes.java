package lesson2_control_flow_operators;

public class Lesson2_lecture_notes {

    public static void main(String[] args) {
// Немного про конструкции && и ||, и тернарный оператор --- ?
//         && - и , || - или
//         && true  и  false = false
//         ||  true или false = true

        int a2 = 12;
        int b2 = 10;
        int c2 = 10;
//                           false    или true
        boolean isTrue = true && false || true;
//                             true        и false
        boolean isFalse = (true || false) && false;
        System.out.println(isTrue);
        System.out.println(isFalse);

//       ? - тернарный оператор
//      переменная  = (условие) ? значение_если_true : значение_если_false;
        String name = a2 > b2 ? "name" : "null";
        System.out.println(name);


// 1. КОНСТРУКЦИЯ if (если) - else (иначе) . Всегда работает с типом boolean (результат должен быть либо true, либо false).
//  1.1. Одинарная форма (Проверка условия).
//  Используется, когда  нужно совершить действие только в одном случае, а в остальное время — просто ничего не делать.
//  Пример: Система уведомлений
        int messages = 5;
        if (messages > 0) {
            System.out.println("У вас есть непрочитанные сообщения!"); // Если сообщений 0, программа просто пойдёт дальше, ничего не печатая.
        }
//  1.2. Полная форма if-else (Развилка).
//  Когда у нас есть два взаимоисключающих пути. Либо одно, либо другое — третьего не дано.
//  Пример: Вход в систему
        String password = "1234";
        if (password.equals("1234")) {
            System.out.println("Доступ разрешен. Добро пожаловать!");
        } else {
            System.out.println("Ошибка! Неверный пароль.");
        }
//  1.3. Лестница else if (Множественный выбор)
//  Используется, когда вариантов много, и нам нужно найти первый подходящий. Как только Java находит true, она выполняет этот блок и игнорирует все остальные, что ниже.
//  Пример: Расчет скидки в магазине
        int purchaseAmount = 5000;
        if (purchaseAmount >= 10000) {
            System.out.println("Ваша скидка 15%");
        } else if (purchaseAmount >= 5000) {
            System.out.println("Ваша скидка 10%"); // Сработает этот блок
        } else if (purchaseAmount >= 1000) {
            System.out.println("Ваша скидка 5%");
        } else {
            System.out.println("Скидки нет, купите еще что-нибудь!");
        }
//  1.4. Вложенные условия (Уточнение)
//  Когда второе решение зависит от результата первого. Это как матрешка: чтобы проверить внутреннее условие, нужно сначала пройти через внешнее.
//  Пример: Покупка билета в кино
        int age = 16;
        boolean hasMoney = false;
        if (age >= 16) {
            if (hasMoney) {
                System.out.println("Билет куплен, приятного просмотра!");
            } else {
                System.out.println("Денег нет, возвращайтесь завтра.");
            }
        } else {
            System.out.println("Извините, этот фильм только для тех, кто старше 16.");
        }
//  1.5. Комбинирование условий (&&, ||)
//  Часто вместо вложенных if удобнее использовать логические операторы прямо в скобках. Это делает код чище.
//  Пример: Допуск к экзамену
        int attendance = 85; // посещаемость в %
        int grades = 4; // средний балл
        if (attendance > 80 && grades >= 4) {
            System.out.println("Вы допущены к экзамену автоматически!");
        } else {
            System.out.println("Нужно сдать дополнительные зачеты.");
        }
//  Примеры из лекции:
//  Пример 1: int a2 = 12; int b2 = 10;  int c2 = 10;
        if (a2 > b2 && a2 > c2) {
            System.out.println("a max value");
        } else if (b2 > c2) {
            System.out.println("b max value");
        } else {
            System.out.println("c max value");
        }
// Пример 2: Првоерить число положительное или нет, если положительное, то чётное или нет (if)
        int number = 12345;
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("number is even and more than 0");
            } else {
                System.out.println("number is odd add more than 0");
            }
        } else {
            System.out.println("number less than 0 or eqauls 0");
        }
//  Пример 2: с тернарным оператором
        String nameJunior = "senior";
        String nameSenior = "senior";
        String nameProgrammist = nameJunior == nameSenior ? "name" : "null";
        System.out.println(nameProgrammist);
//                       ==                  ! именно через equals идёт сравнение для строковых данных
        if (nameJunior.equals(nameSenior)) {
            System.out.println("Имена одинаковые!");
        } else {
            System.out.println("Это разные люди.");
        }
//        А что если нам всё равно, большая буква или маленькая в имени (помним в Java у нас есть регистрозависомость)? Тогда используем продвинутый вариант этого метода equalsIgnoreCase:
        if (nameJunior.equalsIgnoreCase(nameSenior)) {
            System.out.println("Имена совпадают, регистр не важен");
        }

//  2. КОНСТРУКЦИЯ switch
//  2.1. Главные правила работы
//  break — это стена. Если ты его забудешь, Java выполнит код текущего case и провалится во все следующие, пока не встретит break или конец конструкции.
//  default — это план «Б». Он сработает, если ни один case не совпал с твоей переменной. Это как else в конце длинной цепочки.
//  Типы данных. switch дружит с int, char, String и enum. Но он не умеет работать с double, float или сложными логическими условиями (например, case > 10 написать нельзя).
//  Пример: представь, что мы пишем программу для кофейного автомата. Пользователь вводит номер напитка:
        int choice = 2;
        switch (choice) {
            case 1:
                System.out.println("Готовлю Эспрессо");
                break;
            case 2:
                System.out.println("Готовлю Капучино");
                break;
            case 3:
                System.out.println("Готовлю Латте");
                break;
            default:
                System.out.println("Ошибка: напитка под таким номером нет");
                break;
        }
//  2.2. Группировка кейсов
//  Иногда для разных вариантов нужно выполнить одно и то же действие. Тогда case можно «пакетировать»:
        int day = 6;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Рабочий день...");
                break;
            case 6:
            case 7:
                System.out.println("Ура, выходные!");
                break;
        }
//  2.3. Современный switch (Java 14+)
//  В новых версиях Java (которые ты, скорее всего, и учишь) появился более крутой синтаксис со стрелочками. Он автоматически делает break и выглядит намного чище:
        String fruit = "Apple";
        switch (fruit) {
            case "Apple" -> System.out.println("Красное или зеленое");
            case "Banana" -> System.out.println("Желтое");
            default -> System.out.println("Неизвестный фрукт");
        }

//  Примеры из лекции:
//  Пример 1
        String dayOfWeek = "Tuesday1";
        switch (dayOfWeek) {
            case "Monday", "Monday1":
                System.out.println("today monday");
                break;
            case "Tuesday", "Tuesday1":
                System.out.println("today is tuesday");
                break;
            case "Wensday":
                System.out.println("today is wensday");
                break;
            default:
                System.out.println("rest");
                break;
        }

//        if (dayOfWeek == "Tuesday" || dayOfWeek == "Tuesday1"){
//        }
//  Пример 2
        switch (dayOfWeek) { // перебор, когда значения заранее известны
            case "Monday", "Monday1" -> System.out.println("today monday");
            case "Tuesday", "Tuesday1" -> System.out.println("today is tuesday");
            case "Wensday" -> System.out.println("today is wensday");
            default -> System.out.println("rest");
        }

//  Пример 3
        int num1 = 10;
        int num2 = 12;
        String operation = "*";
        int summa;
        switch (operation) {
            case "+" -> {
                summa = num1 + num2;
            }
            case "-" -> {
                summa = num1 - num2;
            }
            default -> {
                summa = 0;
                System.err.println("unknown operation"); // error
            }
        }
        System.out.println("summa: " + summa);

//  3. ЦИКЛЫ
//  3.1. Цикл for (счетчик)
//   Его используют, когда мы заранее знаем, сколько раз нужно повторить действие (например, пройти по массиву из 6 элементов).
//        for (инициализация; условие; шаг) {
//            // Код, который повторится
//        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Итерация №" + i);
        }
//   int i = 1 — создаем переменную-счетчик.
//   i <= 5 — цикл работает, пока это правда.
//   i++ — после каждого круга увеличиваем i на 1.

//  3.2. Цикл for-each (переводится как "для каждог"о) - представь, что это как автоматичесий перебор данных по порядку.
//   Не нужно считать (прописывать вручную), сколько элементов в списке, и не нужно обращаться к ним по номеру (индексу). Java сама берет каждый элемент по очереди и выполняет с ним необходимую операцию.
//   Когда for-each идеален? --- 1. Когда нужно просто прочитать все данные из массива, 2. Когда не важен порядковый номер (индекс) элемента.
//   Пример 1. Представь, что у нас есть массив:
        String[] fruits = {"Яблоко", "Банан", "Груша"};
//   Читается так: "Для каждой строки (String f) из массива (fruits)"
        for (String f : fruits) {
            System.out.println("В корзине лежит: " + f);
        }
//   Пример 2. Допустим, у тебя есть цены на товары, и ты хочешь узнать общую сумму:
        int[] prices = {100, 250, 500, 150};
        int total = 0;
        for (int price : prices) {
            total += price; // Просто прибавляем каждую цену к общей сумме
        }
        System.out.println("Итого к оплате: " + total);

//  3.3. Цикл while (пока)
//   Его используют, когда мы не знаем точно, сколько будет повторений. Цикл работает до тех пор, пока условие истинно.
//   Пример: Герой лечится, пока здоровье меньше 100
        int health = 80;
        while (health < 100) {
            health += 5;
            System.out.println("Лечимся... Текущее HP: " + health);
        }
//   Внимание: Если условие изначально false (например, health уже 100), цикл ни разу не выполнится.

//  3.4. Цикл do-while (Сначала делай — потом думай)
//   Этот цикл похож на while, но с одной важной разницей: он гарантированно выполнится хотя бы один раз, даже если условие сразу ложное. Проверка условия идет в самом конце.
//   Пример: Проверка пароля
        int attempts = 0;
        do {
            attempts++;
            System.out.println("Попытка ввода пароля №" + attempts);
        } while (attempts < 0); // Условие ложное, но 1 раз мы всё равно зашли


//  Примеры из лекции на while и do while
        int f = 6;
        f++; // increment
        f--; // decrement
        System.out.println("decrement: " + f--);

        int increment = 0;
        while (increment < 10) {
            System.out.println("output: " + increment);
            increment++;
        }

        do {
            increment++;
            System.out.println("something");
        } while (increment < 10);

        // найти сумму от 1 до number 1 + 2 + 3 ... number
        int increment1 = 0;
        while (increment1 < 10) {
            System.out.println("output: " + increment1);
            increment1++;
        }

        int sum1 = 0;
        sum1 = sum1 + 1;
        int incrementValue = 0;
        int sum = 0; // 15
        // 5        <    7
        while (incrementValue < number) {
            incrementValue++; // 6
            //    15  +   6
            sum += incrementValue; //15
//            sum = sum + incrementValue; //15
        }
        System.out.println("sum: " + sum);

        // 14575 - / 10  , 1457 / 10 - 145, 145 / 10 - 14, 14 / 10, 1 / 10 = 0
        int number2 = 144;
        number2 = number2 / 10;
//        number2 /= 10;
        System.out.println(number2);

        int inc = 0;
//        != неравно
        while (number != 0) {
            number = number / 10;
            inc++;
        }
        System.out.println("count numbers: " + inc);

        int totalSeconds = 12623;
        int hours = 0;
        int min = 0;
        while (totalSeconds >= 3600) {
            totalSeconds = totalSeconds - 3600;
            hours++;
//            hours += 1;
        }

        while (totalSeconds >= 60) {
//            if () {
//
//            }
            totalSeconds = totalSeconds - 60;
            min++;
        }
        System.out.println(hours + " " + min + " " + totalSeconds);


//  4. Ключевые слова break и continue
//  Это "пульт управления" внутри любого цикла:
//   break — полностью останавливает цикл и выходит из него.
//   continue — пропускает текущий круг и сразу переходит к следующему.
//  Пример с continue (пропускаем число 3):
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // Тройка не напечатается
            System.out.println(i);
        }
    }
}
