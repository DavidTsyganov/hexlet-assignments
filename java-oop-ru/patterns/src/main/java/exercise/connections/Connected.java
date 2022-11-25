package exercise.connections;

import exercise.TcpConnection;

public class Connected implements Connection {
    private TcpConnection connection;
    private final String STATE_NAME = "connected";

    public Connected(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public void connect() {
        System.out.println("Error! You're already connected.");
    }

    @Override
    public void disconnect() {
        connection.setState(new Disconnected(connection));
    }

    @Override
    public void write(String data) {
        connection.addToBuffer(data);
    }
    @Override
    public String getName() {
        return STATE_NAME;
    }
}


