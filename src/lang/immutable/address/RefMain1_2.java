package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        // side effect 막는 방법 1. 인스턴스를 따로 생성한다.
        // Address a = new Address("서울");
        // Address b = a;

        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
