package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV5 {
    // 자바8 이후 람다 사용 가능, 메서드의 매개변수로 코드 조각(메서드, 정확히는 함수)를 전달할 수 있게 되었다.

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        //코드 조각 시작
        process.run();
        //코드 조각 종료
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {


        hello( () -> {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
        });
        hello( () -> {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
        });
    }
}
