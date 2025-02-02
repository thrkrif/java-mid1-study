package exception.ex4;

public class NetworkServiceV4 {

    // connect, send를 호출하면 NetworkClientV4에서 메서드가 실행되며 예외가 발생하면 알아서 밖으로 던진다.
    // 여기서도 처리를 못하니 NetworkServiceV4를 호출한 MainV4로 예외를 던진다.
    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);
        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}
