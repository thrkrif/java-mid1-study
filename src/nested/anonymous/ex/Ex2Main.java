package nested.anonymous.ex;

import java.util.Scanner;

public class Ex2Main {


    Print2 print = new Print2() {
        public void print(String str) {
            System.out.println("프로그램 시작");
            System.out.println(str);
            System.out.println("프로그램 종료");
        }
    };

    public static void main(String[] args) {
        Ex2Main ex = new Ex2Main();
        ex.print.print("Hello java");

    }

}
