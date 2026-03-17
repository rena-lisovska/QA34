package lesson3_one_dimensional_arrays;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        int sizeArray = 3;
        int[] array = new int[sizeArray];
        array[0] = 45;
        array[1] = 42;
        array[2] = 43;
        //                    42
//        System.out.println(array[8]);

//        int[] arrayNumbers = {1, 54, 6, 8};
//        System.out.println(arrayNumbers[2]);
//        arrayNumbers[2] = 8;
//        System.out.println(arrayNumbers[2]);

        System.out.println(array.length);

        int size = array.length;

//        int[] array = new int[sizeArray];
//        array[0] = 45;
//        array[1] = 42;
//        array[2] = 43;
        //              3 <    5
        for (int i = 0; i < array.length; i++) { // задаём паравила обхода по массиву
            //                    43
            System.out.println(array[i]);
        }

        System.out.println("===========================");

        int sum = 0;
        //          1 <  3
        for (int i = 0; i < array.length; i++) {
            //        45      42
            sum = sum + array[i]; // 87
        }
        System.out.println("sum: " + sum);

        int length = array.length; // 3

        int sumWhile = 0; // 0
        double increment = 0;
        //     1
        while (length > 0) {
            //         42
            if (array[length - 1] % 2 == 0) {
                increment++;
                //
                sumWhile = sumWhile + array[length]; // 42
            }
            //                    45
//               sumWhile += array[length - 1]; // 130
            length--; // 0
        }

        System.out.println("sumWhile: " + sumWhile / increment);
        String name = "jenya";

        System.out.println(name.length());


        int[] arrayNumbers = {-1, -54, -6, -8, -65};

        if (arrayNumbers.length != 0) {
            int maxIndex = 0;
            int max = arrayNumbers[0]; // -1
//                          1 <    5
            for (int i = 1; i < arrayNumbers.length; i++) {
                //         -54         -1
                if (arrayNumbers[i] > max) {
                    max = arrayNumbers[i];
                    maxIndex = i;
                }
            }
            System.out.println("max element: " + max + ", max index: " + maxIndex);
        } else {
            System.out.println("array is null");
        }

//        // break, continue
//        for (int i = 0; i < arrayNumbers.length; i++) {
//            if(arrayNumbers[i] == -54){
//                System.out.println(arrayNumbers[i]);
//                break; // прерывает цикл
//            }
//        }
//
//        for (int i = 0; i < arrayNumbers.length; i++) {
//            if(i == 1){ // пропускаем 2 итерацию
//                continue;
//            }
//            System.out.println(arrayNumbers[i]);
//        }

        String[] arrayNames = new String[3];
        arrayNames[0] = "Jenya";
        arrayNames[1] = "Anya";
        arrayNames[2] = "Olga";

        System.out.println(arrayNames[0].length());

        int lengthName = arrayNames[0].length();
        //                 1 <    3
        for (int i = 1; i < arrayNames.length; i++) {
            //            4                <  5
            if (arrayNames[i].length() < lengthName) {
                lengthName = arrayNames[i].length(); // 4
            }
        }

        for (int num : arrayNumbers) {
            System.out.println(num);
        }

        for (String nameEl : arrayNames) {
            System.out.println(nameEl);
        }

        int count = 0;
        for (int num : arrayNumbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        System.out.println("count even numbers: " + count);

        String nullValue = null;
//        if (nullValue != null){
//
//        }
        if (true){
            nullValue = "dfsgdfg";
        } else {
            nullValue = "";
        }
        /// //////// nullValue
        int lengthNullValue = nullValue.length();
        System.out.println(lengthNullValue);
//                           2              2 >= 0
        for (int i = arrayNames.length - 1; i >= 0; i--) {
            System.out.println(arrayNames[i]);
        }

//        int[] arrayNumbers = {-1, -54, -6, -8, -65};
        //              1 <    5
        for (int i = 0; i < arrayNumbers.length; i++) {  // O(n2)
            //              0 <   5
            for (int j = 0; j < arrayNumbers.length; j++) {
                //                              1                0
                System.out.println(arrayNumbers[i] * arrayNumbers[j]);
            }

        }

        // Сортриовка пузырьком
        int[] arr = {5, 2, 9, 1, 7}; // 2, 5, 9, 1, 7
        int temp;

        System.out.println("Исходный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //    5    >     2
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j]; // 5
                    arr[j] = arr[j + 1]; // 2
                    arr[j + 1] = temp; // 5
                }
            }
        }

        System.out.println("\nОтсортированный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }


        // короткий вариант
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

