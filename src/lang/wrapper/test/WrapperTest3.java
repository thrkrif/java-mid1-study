package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        // 박싱, 언박싱, valueOf(), xxxValue() 이용하거나 오토 박싱, 오토 언박싱 이용
        String str = "100";
        Integer integer1 = Integer.valueOf(str);
        int i = integer1.intValue();
        Integer integer2 = Integer.valueOf(i);



    }
}
