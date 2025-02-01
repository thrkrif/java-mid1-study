package exception.basic.checked;

/*
 체크 예외는 잡아서 처리하거나 던지거나 둘 중 하나는 무조건 해야한다.
 */
public class Service {
    Client client = new Client();

    /*
    예외 잡아서 처리하는 코드
     */

    public void callCatch(){
        try {
            client.call();
        }
        catch (MyCheckedException e){
            System.out.println("예외 처리 message = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /*
    예외를 던지는 코드
     */
    public void callThrow() throws MyCheckedException{
        client.call();
    }
}
