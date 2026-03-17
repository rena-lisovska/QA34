package lesson1_variables;

public class Lesson1 {

    private static float orderFirstPrice;

    public static void main(String[] args) { // точка входа
//        Целые: byte (1 байт) -> short (2 байта) -> int (4 байта) -> long (8 байт)
//        Дробные: float (4 байта) -> double (8 байт)
//        Логический: boolean (true / false)
//        Символьный: char (2 байта, Unicode)
//        Ссылочные (Reference types): String(строковый)
//


        String description = "";
        int sneakersCount = 1;
        int capsulesCount = 1;

        float sneakersPrice = 177.50f * sneakersCount;

        float capsulePrice =  55.15f * capsulesCount;

        float sneakersPriceWithoutDiscount = 334.55f;
        float capsulePriceWithoutDiscount = 78.03f;

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

//        int a = 4;
//        int b = 2;
//        int c = a % b;
//        System.out.println(c);
        description = "Price total is equal expected price: ";
        System.out.println(description + isEqualPrice);
        description = "Total discount is equal expected discount: ";
        System.out.println(description + isEqualDiscount);

        float deliveryPrice = 11.47f;

        float orderFirstPrice = 43.49f;
        float discountFirstPrice = -3.62f;
        float actualFirstOrderPrice = 51.33f;

        float expectedOrderPrice = orderFirstPrice + deliveryPrice + discountFirstPrice;

        System.out.println((orderFirstPrice + deliveryPrice + discountFirstPrice) == actualFirstOrderPrice);

//        float orderSecondPrice = 324.07f;
//        float discountSecondPrice = -3.62f;
//        float actualSecondOrderPrice = 51.33f;

        float actualTotalPrice = 390.48f;
        float expectedTotalPrice = 373.20f;

        float discount = expectedTotalPrice - actualTotalPrice - deliveryPrice;
    }




}
