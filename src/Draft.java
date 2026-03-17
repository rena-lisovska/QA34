public class Draft {

    public static void main(String[] args) {

//        ! почитать и освоить класс Scaner и  Random


        System.out.println();
        System.out.println("Результат вычислений по задаче:");
        // найти максимальное и минимальное значение в массиве и вывести на экран
//
        int[] mass = {25, 47, 35, 18, 96, 33, 28, 55, 87, 13};
        int max1 = mass[0];
        int min1 = mass[0];
        for (int i : mass) {
            if (i > max1) {
                max1 = i;
            }
            if (i < min1) {
                min1 = i;
            }
        }
        System.out.println(" Максимальное число: " + max1 + " , минимальное число: " + min1);

        // пример решения задачи, когда учитываем, что массив может быть пуст
        // 1. Проверяем, есть ли в массиве вообще элементы
        if (mass.length > 0) {
            int max = mass[0];
            int min = mass[0];

            for (int i : mass) {
                if (i > max) {
                    max = i;
                }
                if (i < min) {
                    min = i;
                }
            }
            System.out.println("Максимальное число: " + max + ", минимальное число: " + min);
        } else {
            // 2. Если массив пустой, выводим понятное сообщение вместо ошибки
            System.out.println("Массив пуст, искать нечего!");
        }


        // массивы пример обработки - подсчёт среднего арифметического температуры
//        int temper[] = {25, 28, 31, 26, 33, 30, 32, 24, 30, 32};
//        double avg;
//        int sum = 0;
//        int n = temper.length;
////        for (int i = 0; i < n; i++) {
////            sum += temper[i];
////        }
////        avg = (double) sum / n;
////        System.out.println(avg);
//
//        /// второй вариант как это можно сделать, он упрощает перебор всех элементов массива
//        for (int a : temper){
//            sum += a;
//        }
//        avg = (double) sum / n;
//        System.out.println(avg);


//        int[] array = new int[]{1, 2, 3, 4, 5};
//
//        for (int a : array) {
//
//            System.out.println(a);
//
//        }
//
//        String[] nums = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
//        for (String a : nums) {
//            System.out.println(a);
//        }
//
//        int k = 10;
//        int summ = 0;
//        while (k <= 55) {
//            if (k % 2 == 0) {
//                summ += k;
//            }
//            k++;
//        }
//        System.out.println(summ);


//        int j = 7;
//        do {
//            System.out.println(j);
//            j--;
//        } while (j > 0);
//
//        int l = 7;
//        while (l > 0) {
//            System.out.println(l);
//            l--;
//        }


        // задача найти максимальный элемент двумерного массива

//        int[][] array2Init = {
//                {1, 3, 6, 7},
//                {1, 5, 7, 9},
//                {1, 5, 7, 9}
//        };

//        int maxNum = array2Init[0][0];
//
//        for (int i = 0; i < array2Init.length; i++) {
//            for (int j = 0; j < array2Init[i].length; j++) {
//                if (array2Init[i][j] > maxNum) {
//                    maxNum = array2Init[i][j];
//                }
//
//            }
//        }
//
//        System.out.println("Максимальный элемент двумерного массива: " + maxNum);
//
//
//// сумма элементов главной диагонали
//        int[][] array3Init = {
//                {1, 3, 6, 7},
//                {1, 5, 7, 9},
//                {1, 5, 7, 9},
//                {1, 6, 7, 9}
//
//        };
////        int sumElements = 0;
////        for (int i = 0; i < array3Init.length; i++) {
////            for (int j = 0; j < array3Init[i].length; j++) {
////                if (i == j) {
////                    sumElements += array3Init[i][j];
////                }
////            }
////        }
////        System.out.println("Сумма элементов главной диагонали: " + sumElements);
//
//        int sum = 0;
//        for (int i = 0; i < array3Init.length; i++) {
//            sum += array3Init[i][i];
//        }
//        System.out.println("Сумма ГЛАВНОЙ диагонали: " + sum); // я не поняла, что это, нужно гуглить, почему два ii
//
//        // для каждой строки в массиве найти минимальный элемент
//        // вывод System.out.println("Минимальный элемент для строки " + i + ": " + minElement);
//
//        int[][] array2Init = {
//                {1, 3, 6, 7},
//                {1, 5, 7, 9},
//                {1, 5, 7, 9}
//        };
//
//        int minElement = 0;
//        int i = array2Init[0].length;
//        for (int a = 0; a < array2Init.length; a++) {
//            for (int j = 0; j < array2Init[a].length; j++) {
//        if (minElement >= array2Init[a][j]){
//            minElement = array2Init[a][j];
//        }
//
//                }
//            }
//        System.out.println("Минимальный элемент для строки " + i + ": " + minElement);


//        int[][] array2Init = {
//                {0, 3, 6, 7},
//                {1, 5, 7, 9},
//                {1, 5, 7, 9}
//        };
//
//        for (int i = 0; i < array2Init.length; i++) {
//            // ВАЖНО: Для каждой новой строки берем первый элемент этой строки как минимальный
//            int minElement = array2Init[i][i];
//
//            for (int j = 0; j < array2Init[i].length; j++) {
//                if (array2Init[i][j] < minElement) {
//                    minElement = array2Init[i][j];
//                }
//            }
//
//            // Печатаем результат СРАЗУ после того, как прошли одну строку
//            System.out.println("Минимальный элемент для строки " + i + ": " + minElement);
//        }


        // нужно найти сумму элементов побочной диагонали

//        int[][] array3Init = {
//                {1, 3, 6, 7},
//                {1, 5, 7, 9},
//                {1, 5, 7, 9},
//                {1, 6, 7, 9}
//
//        };
//        int sumElements = 0;
//        for (int i = 0; i < array3Init.length; i++) {
//            for (int j = 0; j < array3Init[i].length; j++) {
//                if (i == j) {
//                    sumElements += array3Init[i][j];
//                }
//            }
//        }
//        System.out.println("Сумма элементов побочной диагонали: " + sumElements);

//        int sumElements = 0;
//        int massSize = array3Init.length;
//
//        for (int i = 0; i < massSize; i++) {
//            for (int j = 0; j < array3Init[i].length; j++) {
//                if (i + j == massSize - 1) {
//                    sumElements += array3Init[i][j];
//                }
//            }
//        }
//        System.out.println("Сумма элементов побочной диагонали: " + sumElements);


//        int[] arrayNum = new int[]{-16, -1, 0, 4, 20, 89};
//        int sumFirstCount = 0;
//        int sumSecondCount = 0;
//        // иницилизация счётчика; условия с размером массива; изменение счётчика
//
//        for (int i = 0; i < arrayNum.length; i++) {
//            if (arrayNum[i] > 10 && arrayNum[i] % 2 == 0) {
//                sumFirstCount += arrayNum[i];
//            } else if (arrayNum[i] <= 0) {
//                sumSecondCount++;
//            }
//        }
//        System.out.println("Сумма элементов, которые больше 10 и чётные: " + sumFirstCount);
//        System.out.println("Количество элементов, которые отрицательные или равны 0: " + sumSecondCount);
//
//
//        for (int i = 1; i < 9; i++) {
//            System.out.println(i * i);
//        }
//        for (int i = 1; i < 9; i++) {
//
//            System.out.println((int) Math.pow(i, 2)); // Math.pow(base, exponent) — это статический метод, который возводит первое число (основание) в степень второго числа (показатель).
//
//        }
//        int num1 = 8;
//        int num2 = 6;
////                        условие         true             false
//        String result = num1 > num2 ? "num1 > num2" : "num1 < num2";
//        System.out.println(result);
//        switch (num1) {
//            case 1:
//                System.out.println("false");
//                break;
//            case 2:
//                System.out.println("false");
//                break;
//            case 4:
//                System.out.println("true");
//                break;
//            default:
//                System.out.println("ignore");
//        }
//
//// 3) Задача: Дано число. Нужно:
//// Определить, сколько в нём чётных цифр.
//// Определить, сколько нечётных цифр.
//// Найти сумму всех цифр.
//// Использовать: while     if
//        System.out.println("Home work 2, task 3:");
//        int someNum = 145;
//        int evenNum = 0;
//        int oddNum = 0;
//        int sumNum = 0;
//// Сохраняем оригинал для вывода, если нужно, так как someNum изменится в цикле
//        int tempNum = Math.abs(someNum); // Math.abs(): превращает любое отрицательное число в положительное.
//
//        if (tempNum == 0) {
//            evenNum = 1;
//        } else {
//            while (tempNum > 0) {
//                int digit = tempNum % 10; // Получаем последнюю цифру
//
//                if (digit % 2 == 0) {
//                    evenNum++;
//                } else {
//                    oddNum++;
//                }
//
//                sumNum += digit;   // Добавляем к сумме
//                tempNum /= 10;     // Убираем последнюю цифру
//            }
//        }
//
//        System.out.println("Число: " + someNum);
//        System.out.println("Количество чётных цифр: " + evenNum);
//        System.out.println("Количество нечётных цифр: " + oddNum);
//        System.out.println("Сумма всех цифр: " + sumNum);

    }

}
