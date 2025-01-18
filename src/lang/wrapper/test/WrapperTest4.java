package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        // 오토 박싱, 오토 언박싱 이용
        String str = "100";
        Integer integer1 = Integer.valueOf(str);
        int i = integer1;
        Integer integer2 = i;



    }
}
