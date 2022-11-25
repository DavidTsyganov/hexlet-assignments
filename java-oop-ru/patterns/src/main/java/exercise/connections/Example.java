package exercise.connections;

import exercise.TcpConnection;

public class Example {
    public static void main(String[] args) {
        TcpConnection connection = new TcpConnection("132.223.243.88", 2342);
        connection.connect();
        System.out.println(connection.getCurrentState());

        connection.write("data");
        connection.disconnect();
        System.out.println(connection.getCurrentState());
        connection.disconnect();
    }
}
