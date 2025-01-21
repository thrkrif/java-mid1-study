package enumeration.ex3;

public class ClassRefMain {
    public static void main(String[] args) {
        int price = 10000;
//        System.out.println("BASIC 등급의 할인율 : " + Grade.BASIC.discount(price));
//        System.out.println("GOLD 등급의 할인율 : " + Grade.GOLD.discount(price));
//        System.out.println("DIAMOND 등급의 할인율 : " + Grade.DIAMOND.discount(price));
        printDiscount(Grade.BASIC,price);
        printDiscount(Grade.GOLD,price);
        printDiscount(Grade.DIAMOND,price);
        System.out.println(Grade.BASIC.getDiscountPercent());

    }

    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }
}
