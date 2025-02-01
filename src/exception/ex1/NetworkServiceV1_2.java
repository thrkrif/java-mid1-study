package exception.ex1;

// 문제점 어떤 오류가 발생하든 disconnect()는 항상 호출 되어야한다.
public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        // 내가 입력한 값이 error1 이라면 connectError = true , error2라면 sendError = true
        client.initError(data);

        String connectResult = client.connect();
        // 1. 연결 시도 : error1을 입력했다면 connectError = true, "connectError"를 반환함.
        // connectResult = "connectError" 이므로 isError = true, if문이 실행된다.
        // 2. error1 이 아니라면 connectError = false 가 된다. client.connect() = "success"이다.
        // isError(connectResult = "success") = false가 되어 if문을 실행시키지 않는다. 즉, 연결 성공이다.
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return;
        }
        // connect, 즉 연결은 완료 된 상태이고 이제 메세지를 전송하는 단계
        // 1. 전송 실패 : error2를 입력했다면 sendError = true, client.send(sendError = true) 이므로 데이터 전송 실패, "sendError"를 반환한다.
        // 그러면 sendResult = "sendError" 이고 isError = true 이므로 아래 오류 코드가 실행된다.
        // 2. 전송 성공 : erro2가 아니라면 sendError = false, 반환값은 "success" 따라서 sendResult = "success" 이다.
        // isError(sendResult = "success") = false 이므로 if문은 실행되지 않는다. 즉, 전송 선공이다.
        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }
        client.disconnect();
    }

    private static boolean isError(String resultCode){
        return !resultCode.equals("success");
    }


}
