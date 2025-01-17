package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        // 기본형 사용하여 내가 메서드 따로 구현하기
        int v1 = compareTo(1,10);
        int v2 = compareTo(1, 1);
        int v3 = compareTo(10, 1);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }

    public static int compareTo(int value, int target){
        if(value > target){
            return 1;
        } else if (value < target) {
            return -1;
        }
        else
            return 0;
    }
}
