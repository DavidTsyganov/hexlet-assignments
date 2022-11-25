package exercise;
import exercise.connections.Connected;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

public class TcpConnection implements Connection {
    private Connection state;
    private String ip;
    private int port;

    public TcpConnection(String ip, int port) {
        this.ip = ip;
        this.port = port;
        state = new Disconnected(this);
    }

    public void setState(Connection state) {
        this.state = state;
    }

    @Override
    public String getCurrentState() {
        return state.getCurrentState();
    }

    @Override
    public void connect() {
        state.connect();
    }

    @Override
    public void disconnect() {
        state.disconnect();
    }

    @Override
    public void write(String data) {
        state.write(data);
    }
}
