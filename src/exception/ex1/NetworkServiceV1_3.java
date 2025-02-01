package exception.ex1;

// NetworkServiceV1_2 의 disconnect()가 항상 실행되지 않는 문제를 해결
// return 을 하지 않도록 하였다.
// 문제점은 다 해결했지만 정상 흐름이 어느 부분이고 예외 흐름이 어느 부분인지 복잡하다.
public class NetworkServiceV1_3 {
    public void sendMessage(String data) {
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(data);
        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }
        client.disconnect();
    }
    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
