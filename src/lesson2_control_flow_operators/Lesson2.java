package lesson2_control_flow_operators;

public class Lesson2 {

    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        int c = 10;

        //                   false   или  false
        boolean isTrue = true && false || false;
        //                     true
        boolean isFalse = (true || false) && false;

        System.out.println(isTrue);

        // ? - тернарный оператор
        //                     true    false
        String name = a > b ? "name" : "null";

        System.out.println(name);


        // && - и , || - или
        // && true  и  false = false
        // ||  true или false = true

        //  false || false
//        if (a > b || b > c) {
//            System.out.println("a max");
//        } else if (b > c) {
//            System.out.println("b > c");
//        } else {
//            System.out.println("all numbers is eqauls");
//        }

        if (a > b && a > c) {
            System.out.println("a max value");
        } else if (b > c) {
            System.out.println("b max value");
        } else {
            System.out.println("c max value");
        }

        String nameJunior = "senior";
        String nameSenior = "senior";
        String nameProgrammist = nameJunior == nameSenior ? "name" : "null";
        System.out.println(nameProgrammist);
//                     ==
        if (nameJunior.equals(nameSenior)) {
            System.out.println("output");
        }

//        String dayOfWeek = "Tuesday1";
//        switch (dayOfWeek) {
//            case "Monday", "Monday1":
////                if (){
////
////                }
//                System.out.println("today monday");
//                break;
//            case "Tuesday", "Tuesday1":
//                System.out.println("today is tuesday");
//                break;
//            case "Wensday":
//                System.out.println("today is wensday");
//                break;
//            default:
//                System.out.println("rest");
////                break;
//        }

//        if (dayOfWeek == "Tuesday" || dayOfWeek == "Tuesday1"){
//
//        }

//        switch (dayOfWeek) { // перебор, когда занчения заранее известны
//            case "Monday", "Monday1" -> {
////                if (){}
//                System.out.println("today monday");
//            }
//            case "Tuesday", "Tuesday1" -> System.out.println("today is tuesday");
//            case "Wensday" -> System.out.println("today is wensday");
//            default -> System.out.println("rest");
////                break;
//        }

        // while, do while, for (2 вида)
        int f = 6;
        f++; // increment
        f--; // decrement
        System.out.println("decrement: " + f--);

        int increment = 0;
        while (increment < 10) {
            System.out.println("output: " + increment);
            increment++;
        }

//        do {
//            increment++;
//            System.out.println("something");
//        } while(increment < 10);


        // Practice
        // 1 task
        int number = 12345; // првоерить число положительное или нет, если положительное, то чётное или нет (if)

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("number is even and more than 0");
            } else {
                System.out.println("number is odd add more than 0");
            }
        } else {
            System.out.println("number less than 0 or eqauls 0");
        }

//        int ter = number % 2 == 0 ? 0 : 1;
//        System.out.println(ter);

        // найти сумму от 1 до number 1 + 2 + 3 ... number

//        int increment = 0;
//        while (increment < 10) {
//            System.out.println("output: " + increment);
//            increment++;
//        }

//        int sum1 = 0;
//        sum1 = sum1 + 1;
//
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

        int totalSeconds = 12623;
        int hours = 0;
        int min = 0;

        while(totalSeconds >= 3600){
            totalSeconds = totalSeconds - 3600;
            hours++;
//            hours += 1;
        }

        while (totalSeconds >= 60){
//            if () {
//
//            }
            totalSeconds = totalSeconds - 60;
            min++;
        }

        System.out.println(hours + " " + min + " " + totalSeconds);

    }

}
