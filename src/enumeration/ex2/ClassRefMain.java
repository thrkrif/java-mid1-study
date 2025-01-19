package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        int price = 10000;
        System.out.println("BASIC 등급의 할인율 : " + ClassGrade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인율 : " + ClassGrade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인율 : " + ClassGrade.DIAMOND.discount(price));

    }
}
