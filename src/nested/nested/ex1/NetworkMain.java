package nested.nested.ex1;

public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("hello java");

        Network2 network2 = new Network2();
        network2.sendMessage("hello java!");


    }
}
