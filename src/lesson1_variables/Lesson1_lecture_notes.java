package lesson1_variables;
//  !Базовые (примитивные) типы данных (8 шт.):
//  1. Целые числа:
//     - byte    (1 байт)  от -128 до 127
//     - short   (2 байта) от -32,768 до 32,767
//     - int     (4 байта) самый ходовой (по умолчанию для целых)
//     - long    (8 байт)  для очень больших чисел (пишется с суффиксом L, например 100L)
//
//  2. Числа с плавающей точкой (дробные):
//     - float   (4 байта) (пишется с суффиксом f, например 3.14f)
//     - double  (8 байт)  высокая точность (по умолчанию для дробных)
//
//  3. Символы:
//     - char    (2 байта) один символ в одинарных кавычках 'A' (Unicode)
//
//  4. Логический:
//     - boolean (размер зависит от JVM) только true или false

//  !Ссылочные типы данных (хранят адрес|ссылку на объект какого-либо класса):
//  1. Встроенные классы:
//     - String  строки (текст в двойных кавычках "Hello")
//     - Scanner для чтения данных из консоли или файлов
//
//  2. Массивы (наборы однотипных данных):
//     - int[], String[], Tree[] (любой тип со скобками [] становится массивом)
//
//  3. Пользовательские классы (твои собственные объекты):
//     - Tree, Main, Dog (любой класс, который ты создала сама)
//
//  4. Классы-оболочки (Wrapper classes - ссылочные копии примитивов):
//     - Integer, Double, Boolean, Character, Long и др. (пишутся с большой буквы)
//
//  5. Интерфейсы:
//     - List, Map, Set (описывают поведение объектов)
//
//  6. Специальное значение:
//     - null    пустая ссылка (означает, что объект еще не создан или удален)

// подключение используемых в программе внешних пакетов
import java.util.Arrays;

// объявление нового класса, где модификатор public указывает, что метод будет доступен из любого места проекта, затем идёт ключевое слово class, затем название класса и тело самого класса в фигурных скобках
public class Lesson1_lecture_notes {
    // требования к имени класса: можно - алфавит, цифры, символ подчёркивания;
    // нельзя - чтобы название начиналось с цифры, не должен быть представлен зарезервированными ключевыми словами (class, int и тд)


    // объявление нового метода: он тоже имеет модефикатор public; static указывает, что метод статический; а void, что он не возвращает никакого значения
    public static void main(String[] args) {
        //  создали переменную sneakersCount типа int
        int sneakersCount = 1;

        // переменная не должна начинаться с цифры + если в переменной несколько слов, то 2,3 и тд слова пишутся с большой буквы - oneMoreWord
        int capsulesCount = 1;

        // несколько перменнных одного типа можно объявлять в одной строке
        int a, c;

        // просто стоит запомнить, что для float используем суффикс f;
        float sneakersPrice = 177.50f * sneakersCount;
        float capsulePrice = 55.15f * capsulesCount;

        // переменные можно объявлять один раз и затем несколько раз присваивать им разные значения
        float sneakersPriceWithoutDiscount = 334.55f;
        sneakersPriceWithoutDiscount = 367.67f;

        // но есть константы (они имеют слово final в начале строки). В отличии от переменных константам можно присвоить значение только один раз
        final float capsulePriceWithoutDiscount = 78.03f;

        float sneakersDiscount = sneakersPriceWithoutDiscount - sneakersPrice;
        float capsuleDiscount = capsulePriceWithoutDiscount - capsulePrice;

        float actualTotalDiscount = capsuleDiscount + sneakersDiscount;

        float expectedPrice = 232.65f;
        float expectedDiscount = 179.93f;

        float actualPrice = sneakersPrice + capsulePrice;

        boolean isEqualPrice = actualPrice == expectedPrice;
        boolean isEqualDiscount = actualTotalDiscount == expectedDiscount;

        float differenceBetweenCards = sneakersPriceWithoutDiscount - capsulePriceWithoutDiscount;

        double discountPrice = (differenceBetweenCards - (sneakersPrice + capsulePrice)) / differenceBetweenCards;

        String description = "";
        description = "Price total is equal expected price: ";
        System.out.println(description + isEqualPrice);
        description = "Total discount is equal expected discount: ";
        System.out.println(description + isEqualDiscount);

//  1. Расширяющее преобразование (Widening)
//  Порядок (от меньшего к большему): byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        double myDouble = myInt; // автоматическое приведение int к double
        System.out.println(myInt);    // Выведет 9
        System.out.println(myDouble); // Выведет 9.0

//  2. Сужающее преобразование (Narrowing)
//  Должно выполняться вручную, когда мы пытаемся положить данные из большего «контейнера» в меньший.
//  Это небезопасно: лишние биты просто «отрезаются», и значение может измениться до неузнаваемости.
//  Синтаксис: в скобках перед значением указываем целевой тип: (тип) значение.
        double myDoub = 9.78;
        int myIntt = (int) myDoub; // ручное приведение double к int
        System.out.println(myDoub); // выведет 9.78
        System.out.println(myIntt);    // выведет 9 (дробная часть просто отсекается!)

    } // конец объявления нового метода
} // конец объявления нового класса