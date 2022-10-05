package exercise;
import exercise.connections.Connected;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

public class TcpConnection {
    private Connection connection;
    private final String ip;
    private final int port;

    public TcpConnection(final String ip, final int port) {
        this.ip = ip;
        this.port = port;
        this.connection = new Disconnected(this);
    }

    public String getCurrentState() {
        return this.connection.getSTATE_NAME();
    }

    public void connect() {
        ;
    }

    public void disconnect() {
        getCurrentState().disconnect();
    }

    public void write(String string) {
        getCurrentState().write(string);
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

}

