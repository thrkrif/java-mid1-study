package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        // 래퍼 클래스의 메서드
        Integer v1 = new Integer(10);
        Integer v2 = Integer.valueOf(10);
        Integer v3 = Integer.parseInt("10");

        // 비교
        int compareInt = v1.compareTo(20);
        System.out.println("compareInt = " + compareInt);

        // 산술 연산
        System.out.println("sum = " + Integer.sum(10,20));
        System.out.println("sum = " + Integer.min(10,20));
        System.out.println("sum = " + Integer.max(10,20));
    }
}
