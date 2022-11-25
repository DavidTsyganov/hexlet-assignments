package exercise;

import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.ArrayList;
import java.util.List;


public class TcpConnection {
    private String ip;
    private int port;
    private Connection state;
    private List<String> buffer = new ArrayList<>();

    public TcpConnection(final String ip, final int port) {
        this.ip = ip;
        this.port = port;
        this.state = new Disconnected(this);
    }

    public String getCurrentState() {
        return this.state.getName();
    }

    public void connect() {
        this.state.connect();
    }

    public void disconnect() {
        this.state.disconnect();
    }

    public void write(String data) {
        this.state.write(data);
    }

    public void setState(Connection stateObject) {
        state = stateObject;
    }

    public void addToBuffer(String data) {
        buffer.add(data);
    }

}

