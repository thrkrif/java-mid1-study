package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis(); // 밀리초 단위
        System.out.println("currentTimeMillis = " + currentTimeMillis);
        long nanoTime = System.nanoTime(); // 나노초 단위
        System.out.println("nanoTime = " + nanoTime);

        // 환경 변수를 읽는다.
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties = " + System.getProperties());

        // 배열 고속 복사
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray,0,copiedArray,0,originalArray.length);
        System.out.println(Arrays.toString(copiedArray));

    }
}
