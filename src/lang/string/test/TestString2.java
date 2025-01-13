package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int num = 0;
        for (String s : arr) {
            num += s.length();
        }
        System.out.println(num);
    }
}
