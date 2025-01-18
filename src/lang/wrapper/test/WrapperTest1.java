package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        // 코드 작성 parseInt()의 반환값은 기본형이다. 문자열을 기본형으로 반환해준다.

        String str1 = "10";
        String str2 = "20";

        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);
        System.out.println("str1ToI1 + str2ToI2 = " + Integer.sum(i1,i2));

        // sum()의 인자가 int형이 아니므로 오류가 발생한다.
        // System.out.println("str1ToI1 + str2ToI2 = " + Integer.sum(str1,str2));


    }
}
