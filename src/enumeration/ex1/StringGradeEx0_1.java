package enumeration.ex1;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService service = new DiscountService();
        int basic = service.discount(StringGrade.BASIC, price);
        int gold = service.discount("GOLD", price);
        int diamond = service.discount("DIAMOND", price);

        // 문자열 상수를 이용해도 이외의 String을 모두 사용 가능하다.
        // BASIC, GOLD, DIAMOND 세 개 이외에는 모두 오류가 나도록 할 수 없을까? -> 열거형 사용 목적

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
