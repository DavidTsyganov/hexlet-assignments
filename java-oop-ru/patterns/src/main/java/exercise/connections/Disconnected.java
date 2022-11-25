package exercise.connections;

import exercise.TcpConnection;

public class Disconnected implements Connection {
    private TcpConnection connection;
    private final String STATE_NAME = "disconnected";

    public Disconnected(TcpConnection connection) {
        this.connection = connection;
    }
    @Override
    public void connect() {
        connection.setState(new Connected(connection));
    }

    @Override
    public void disconnect() {
        System.out.println("Error! You're already disconnected.");
    }

    @Override
    public void write(String string) {
        System.out.println("Error! You are disconnected. Connect before write.");
    }
    @Override
    public String getName() {
        return STATE_NAME;
    }
}
