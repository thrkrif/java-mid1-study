package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        //substring indexof 사용하여 풀 것

        int cut = str.indexOf(ext);
        System.out.println(str.substring(0,cut));
        System.out.println(str.substring(cut));
    }
}
