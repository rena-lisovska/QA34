package lesson2_control_flow_operators;

import java.util.Arrays;


public class Lesson2_homework {
    public static void main(String[] args) {
// 1) Определение високосного года.
// Год високосный если: делится на 4, НО если делится на 100 — не високосный, НО если делится на 400 — снова високосный.
        System.out.println();
        System.out.println("Home work 2, task 1:");
        int year = 1900;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }


// 2) Калькулятор тарифов доставки.
// Standard: до 5 кг → 5 €, до 20 кг → 10 €, больше → 20 €
// Express:  до 5 кг → 10 €,  до 20 кг → 20 €, больше → 35 €
// VIP: любой вес → 50 €
        System.out.println();
        System.out.println("Home work 2, task 2:");
        int weightPack = 1;
        String deleveryType = "Express"; // Standard, Express, VIP
        String currency = "€";
        int standardMin = 5;
        int standartMedium = 10;
        int standartMax = 20;
        int expressdMin = 10;
        int expressMedium = 20;
        int expressMax = 35;
        int vipMin = 50;
        switch (deleveryType) {
            case "Standard" -> {
                if (weightPack <= 5) {
                    System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + standardMin + currency);
                } else if (weightPack <= 20) {
                    System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + standartMedium + currency);
                } else {
                    System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + standartMax + currency);
                }
            }
            case "Express" -> {
                if (weightPack <= 5) {
                    System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + expressdMin + currency);
                } else if (weightPack <= 20) {
                    System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + expressMedium + currency);
                } else {
                    System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + expressMax + currency);
                }
            }
            case "vipMin" -> System.out.println("Тип доставки: " + deleveryType + ". Стоимость: " + vipMin + currency);
            default -> System.out.println("Неизвестный тип доставки");
        }


// 3) Задача: Дано число. Нужно:
// Определить, сколько в нём чётных цифр.
// Определить, сколько нечётных цифр.
// Найти сумму всех цифр.
// Использовать: while     if
        System.out.println();
        System.out.println("Home work 2, task 3:");
        int someNum = 145; // не получилось сделать условия под вариант, когда число отрицательное
        int evenNum = 0;
        int oddNum = 0;
        int sumNum = 0;

        if (someNum == 0) {
            System.out.println("Количество чётных чисел: " + (evenNum = 1));
            System.out.println("Количество нечётных чисел: " + (oddNum = 0));
            System.out.println("Сумма всех чисел: " + sumNum);
        } else {
            while (someNum > 0) {
                int variable = someNum % 10;
                if (variable % 2 == 0) {
                    evenNum++;
                } else {
                    oddNum++;
                }
                someNum /= 10;
                sumNum += variable;
            }
        }
        System.out.println("Количество чётных чисел: " + evenNum);
        System.out.println("Количество нечётных чисел: " + oddNum);
        System.out.println("Сумма всех чисел: " + sumNum);


//    1) Дан массив целых чисел. Нужно:
//    a) Найти сумму элементов, которые: больше 10 И чётные
//    б) Подсчитать количество элементов, которые: отрицательные ИЛИ равны 0
//    Вывести оба результата.
        System.out.println();
        System.out.println("Home work 3, task 1:");
        int[] arrayNum = new int[]{-16, -1, 0, 4, 20, 89};
        int sumFirstCount = 0;
        int sumSecondCount = 0;
        // иницилизация счётчика; условия с размером массива; изменение счётчика
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] > 10 && arrayNum[i] % 2 == 0) {
                sumFirstCount += arrayNum[i];
            }
            if (arrayNum[i] <= 0) {
                sumSecondCount++;
            }
        }
        System.out.println("Сумма элементов, которые больше 10 и чётные: " + sumFirstCount);
        System.out.println("Количество элементов, которые отрицательные или равны 0: " + sumSecondCount);


//2) Есть массив чисел. Создать новый массив без отрицательных чисел.
// Похожего задания мы не делали, но суть в том, что нам нужно создать новый массив, такой же длины, и складывать в него положительные числа
// (или может у вас будет свой варинат решения)
        System.out.println();
        System.out.println("Home work 3, task 2:");
//      int[] arrayNum = new int[]{-16, -1, 0, 4, 20, 89}; // массив чисел из предыдущего задания
        int[] arrayPlusNum = new int[arrayNum.length];
        int arrayIndex = 0; // указывает, в какую ячейку нового массива мы положим следующее число. Пока мы в самом начале (индекс 0).

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] >= 0) {
                arrayPlusNum[arrayIndex] = arrayNum[i];
                arrayIndex++;
            }
        }
        System.out.println("Новый массив: " + Arrays.toString(arrayPlusNum));

//3*) Найти второй максимальный элемент
        System.out.println();
        System.out.println("Home work 3, task 3:");
//      int[] arrayNum = new int[]{-16, -1, 0, 4, 20, 89}; // массив чисел из предыдущего задания
        int maxNum = 0;
        int secondMaxNum = 0;

        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] > maxNum) {
                secondMaxNum = maxNum;
                maxNum = arrayNum[i];
            } else if (arrayNum[i] > secondMaxNum) {
                secondMaxNum = arrayNum[i];
            }
        }
        System.out.println("Второй максимальный элемент: " + secondMaxNum);

    }
}