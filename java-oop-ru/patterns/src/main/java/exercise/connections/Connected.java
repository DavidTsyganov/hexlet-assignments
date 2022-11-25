package exercise.connections;

import exercise.TcpConnection;

public class Connected implements Connection {
    private TcpConnection connection;

    public Connected(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public String getCurrentState() {
        return "connected";
    }

    @Override
    public void connect() {
        System.out.println("Error! Connection is already set.");
    }

    @Override
    public void disconnect() {
        connection.setState(new Disconnected(connection));
    }

    @Override
    public void write(String data) {
        System.out.println(data);
    }
}
