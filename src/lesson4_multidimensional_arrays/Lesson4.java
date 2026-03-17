package lesson4_multidimensional_arrays;

import java.util.Arrays;

public class Lesson4 {
    // row - строка
    // column - столбец
    public static void main(String[] args) {
        int[] array = new int[3];
        //                     row/column
        int[][] array2 = new int[3][4];
        array2[0][0] = 2;
        array2[2][1] = 3;

        System.out.println(Arrays.deepToString(array2));

        int[][] array2Init = {
                {0, 3, 6, 7},
                {1, 5, 7, 9},
                {0, 5, 7, 9}
        };

        System.out.println(Arrays.toString(array2Init[1]));

        int[] newArray = array2Init[1];

        int length = array2Init.length;

        System.out.println(array2Init[1].length);

        int lengthColumn = array2.length;
        System.out.println(lengthColumn);

        int lengthRow = array2[0].length;
        System.out.println(lengthRow);
//        array2
        //

        int[][] array4Init = {
                {0, 3, 6, 7},
                {1, 5, 7, 9},
                {1, 5, 7, 9},
                {0, 6, 7, 9}

        };
        //              1
        for (int i = 0; i < array2Init.length; i++) {
            //              0
            for (int j = 0; j < array2Init[i].length; j++) {
                //
                System.out.println(array2Init[i][j]); // 1, 3, 6, 7, 1
            }
        }

//        int[][] array2Init = { {1, 3, 6, 7}, {1, 5, 10, 9}, {1, 5, 7, 9} };
        int maxValue = array2Init[0][0];
        for (int i = 0; i < array2Init.length; i++) {
            for (int j = 0; j < array2Init[i].length; j++) {
                int number = array2Init[i][j];
                maxValue = number > maxValue ? maxValue = number : maxValue;
            }
        }
        System.out.println(maxValue);

        System.out.println("------");

        int sum = 0;
        //              1 < 4
        for (int i = 0; i < array2Init.length; i++) {
            //                1  1
            sum += array2Init[i][i]; // 6
        }

        System.out.println("Сумма ГЛАВНОЙ диагонали: " + sum);


        int sum2 = 0;

        for (int i = 0; i < array4Init.length; i++) {
            for (int j = 0; j < array4Init[i].length; j++) {
                //  1    1
                if (i == j) {
                    //                 1  1
                    sum2 += array4Init[i][j]; // 1 + 5 = 6
                }
            }
        }

        System.out.println("Sum: " + sum2);

//    !!! интересная информация

        int[] arrayNew = {1, 4, 6};
        int[] secondNew = {};
        secondNew = arrayNew;

        secondNew[0] = 4;

        System.out.println(Arrays.toString(arrayNew));


        int[][] array3Init = {{1, 3, 6}, {1, 5, 7}, {1, 5, 7}};
        int minValue = array2Init[0][0];

//        for (int i = 0; i < array3Init.length; i++) { // неверно, но близко
//            for (int j = 0; j < array3Init[i].length; j++) {
//                if (array2Init[i][j] < minValue) {
//                    minValue = array2Init[i][0];
//                }
//            }
//            System.out.println("Минимальный элемент для строки " + i + ": " + minValue);
//
//        }


//
//         int minElement = array2Init[0][3];
        for (int i = 0; i < array2Init.length; i++) { // верно
            //                          1  0
            int minElement = array2Init[i][i]; // 5
            //              1
            for (int j = 0; j < array2Init[i].length; j++) {
//                int minElement = array2Init[0][3];
                //       3     0  1        1
                if (array2Init[i][j] < minElement) {
                    minElement = array2Init[i][j]; // 1
                }
            }
            System.out.println("Минимальный элемент для строки " + i + ": " + minElement);

        }

        for (int i = 0; i < array4Init.length; i++) { // верно
            //
            int min = array4Init[i][0]; //  для чего?
            for (int j = 0; j < array4Init[i].length; j++) {
                if (array4Init[i][j] <= min) {
                    min = array4Init[i][j];
                }
            }
            System.out.println("index " + i + " min " + min);
        }

        int sum5 = 0;
        //              0      4
        for (int i = 0; i < array4Init.length; i++) {
            //              4       1               3
            int number = array4Init[i].length - 1 - i; // 0
            //                 3    0
            sum5 += array4Init[i][number]; //
        }
        System.out.println(sum5);

//
//        int[][] array4Init = {
//                {0, 3, 6, 7},
//                {1, 5, 7, 9},
//                {1, 5, 7, 9},
//                {0, 6, 7, 9}
//
//        };

        int sum4 = 0;
        //                   2
        for (int i = array4Init.length - 1; i >= 0; i--) {
            //              0 <   4
            for (int j = 0; j < array4Init[i].length; j++) {
                //  2 + 1 ==      3
                if (i + j == array4Init.length - 1) {
                    //                 2  1
                    sum4 += array4Init[i][j]; // 0 + 5
                }
            }
        }
        System.out.println("sum4: " + sum4);

    }

}
