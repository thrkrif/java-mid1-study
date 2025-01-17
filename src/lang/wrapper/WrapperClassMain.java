package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);

        Double v = Double.valueOf(20.0);
        System.out.println("doubleObj = " + v);

        System.out.println("래퍼 클래스의 내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);

        // 오토 박싱, 언방식 -> valueOf(), xxxValue() 사용하지 않아도 컴파일러가 알아서 처리해준다.


    }
}
