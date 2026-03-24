package lesson3_one_dimensional_arrays;

import java.util.Arrays;
import java.util.*;

public class Lesson3_lecture_notes {
    public static void main(String[] args) {
//  #1. Объявить массив можно двумя способами (разницы нет):
//  Тип[] имя;
        int[] nums1;
//  Тип имя[];
        int nums2[];
//  массивы выше объявлены, но под них пока не выделена память. Выделение памяти под массив происходит с помощью ключевого слова new:
// способ 1. Под массив выделили память в 10 целый чисел (так как в нашем примере int). Эти числа можем задавать уже дальше
        int[] iData = new int[10];
//  способ 2. Сразу указали какие числа (так как в нашем примере int) будут входить в массив
        int[] iData2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//  способ 3. создали переменную sizeArray со значением и выделили память для массива в соответствии со значением этой переменной
        int sizeArray = 3;
        int[] array = new int[sizeArray];
        array[0] = 45;
        array[1] = 42;
        array[2] = 43;
//  #2. Обработка. Нумерация элементов в массиве всегда начинается с 0. Следовательно, конечный элемент массива из N элементов имеет номер (индекс) N-1.
//  Значение элементов по умолчанию (если вдруг массив или элемент массива не заполнены данными):
//  - числовые элементы - нулями;
//  - символьные - значениями '\o';
//  - логические - значениями false;
//  - массивы объктов - значениями null.


//  #3. Добавление элемента в массив.
//  Массив имеет фиксированный размер. Чтобы добавить элемент нужно сначала объявить новый массив, который больше старого массива, и скопировать элементы из старого массива во вновь созданный массив.
//  После этого мы можем добавить новый элемент в этот вновь созданный массив. Есть крутой метод Arrays.copyOf() - он позволяет делать это легко.

//  #4. Методы обработки массивов.
//  Используется класс Arrays   из пакета java.util (т.е. данный пакет необходимо импортировать: import java.util.*;)
//    Arrays.fill(array, value) - заполняет массив одинаковыми значениями value;
        Arrays.fill(iData, 13);
//    Arrays.equals(a,b) - сравнивает два массива по элементам;
        System.out.println("============= 1 =============");
        System.out.println(Arrays.equals(array, iData2)); // вывод будет true или false
//    Arrays.sort(a) - мгновенная сортировка массива;
        Arrays.sort(iData2);
//    Arrays.toString() - красивый вывод значений из массива
        System.out.println("============= 2 =============");
        System.out.println(Arrays.toString(array));
//    Arrays.copyOf() - копирование массива. Если нужно, например, создать массив больше на 10 едениц, то мы копируем предыдущий массив и добавляем 10.
        int[] small = {1, 2, 3};
        int[] big = Arrays.copyOf(small, 10);

//  #5. Операторы перехода:
//  break. Он полностью прерывает работу цикла. Как только программа видит break, она выходит из цикла и идет выполнять код, который стоит после него.
        System.out.println("==========================");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 43) {
                System.out.println(array[i]);
                break; // прерывает цикл
            }
        }
//  continue. Он пропускает только текущую итерацию (круг) и сразу переходит к следующей. Цикл не останавливается, он просто «перепрыгивает» через оставшийся код в этом конкретном шаге.
        System.out.println("==========================");
        for (int i = 0; i < array.length; i++) {
            if (i == 1) { // пропускаем итерацию
                continue;
            }
            System.out.println(array[i]);
        }


//  Примеры с самой лекции
//        int sizeArray = 3;
//        int[] array = new int[sizeArray];
//        array[0] = 45;
//        array[1] = 42;
//        array[2] = 43;
        System.out.println("============ 3 ==============");
        System.out.println("Длина массива array: " + array.length);
        int size = array.length;


        System.out.println("============= 4 =============");
        for (int i = 0; i < array.length; i++) { // задаём паравила обхода по массиву
            System.out.println(array[i]);
        }

        System.out.println("============ 5 =============");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма элементов массива: " + sum);


        System.out.println("============ 6 пока не понимаю, что мы пытались решить =============");
        int length = array.length; // 3
        int sumWhile = 0;
        double increment = 0;
        while (length > 0) {
            if (array[length - 1] % 2 == 0) {
                increment++;
                sumWhile = sumWhile + array[length];
            }
            length--;
        }
        System.out.println("sumWhile: " + sumWhile / increment);


        System.out.println("============ 7 =============");
        String name = "jenya";
        System.out.println(name.length()); // name.length позволил нам вывеси длину name


        System.out.println("============ 8 =============");
        int[] arrayNumbers = {-1, -54, -6, -8, -65};
        if (arrayNumbers.length != 0) {
            int maxIndex = 0;
            int max = arrayNumbers[0];
            for (int i = 1; i < arrayNumbers.length; i++) {
                if (arrayNumbers[i] > max) {
                    max = arrayNumbers[i];
                    maxIndex = i;
                }
            }
            System.out.println("max element: " + max + ", max index: " + maxIndex);
        } else {
            System.out.println("array is null");
        }

        System.out.println("=========================");
        for (int num : arrayNumbers) { // по средствам for each выводим все значения из цикла
            System.out.println(num);
        }

        System.out.println("=========================");
        int count = 0;
        for (int num : arrayNumbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        System.out.println("count even numbers: " + count);


        System.out.println("============ 9 =============");
//       выполняем полный перебор всех возможных пар чисел в  массиве и перемножает их друг с другом
//       int[] arrayNumbers = {-1, -54, -6, -8, -65};
        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = 0; j < arrayNumbers.length; j++) { // помним, что сначала спускаемся во второй цмкл, выполняем все действия здесь (умножаем все числа на 1),
                // потом поднимаемся в верхний цикл (получаем второе число из массива) снова спукаемся в нижний цикл и уже с 54 выполняем аналогичные действия. И так с каждым числом.
                System.out.println(arrayNumbers[i] * arrayNumbers[j]);
            }
        }


        System.out.println("============ 10 =============");
        String[] arrayNames = new String[3];
        arrayNames[0] = "Jenya";
        arrayNames[1] = "Ana";
        arrayNames[2] = "Olga";
        System.out.println(arrayNames[2].length());

        System.out.println("============ 10 =============");
        int lengthName = arrayNames[0].length();
        for (int i = 1; i < arrayNames.length; i++) {
            if (arrayNames[i].length() < lengthName) {
                lengthName = arrayNames[i].length();
            }
        }
        System.out.println(lengthName);


        System.out.println("=========================");
        for (String nameEl : arrayNames) { // по средствам for each выводим все значения из цикла
            System.out.println(nameEl);
        }


        System.out.println("============ 11 =============");
        for (int i = arrayNames.length - 1; i >= 0; i--) { // вывели значения в массиве в обратном порядке от последнего индекса к первому
            System.out.println(arrayNames[i]);
        }


        System.out.println("============ 12 =============");
        // Сортриовка пузырьком
        int[] arr = {5, 2, 9, 1, 7};
        int temp;

        System.out.println("Исходный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nОтсортированный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }


        System.out.println("\n=========================");
        // короткий вариант
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println("============ тоже не помню что за задача =============");
        String nullValue = null;
//        if (nullValue != null){
//        }
        if (true) {
            nullValue = "numbers8";
        } else {
            nullValue = "";
        }
        /// //////// nullValue
        int lengthNullValue = nullValue.length();
        System.out.println(lengthNullValue);

    }
}

