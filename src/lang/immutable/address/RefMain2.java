package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산"); 컴파일 오류 발생
        b = new ImmutableAddress("부산"); // b는 a의 참조값인 x001이었다가 새로운 객체의 참조값인 x002로 바뀜
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
