package exercise.connections;

import exercise.TcpConnection;

public class Disconnected implements Connection {
    private TcpConnection tcpConnection;
    private final String STATE_NAME = "disconnected";

    public Disconnected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }
    @Override
    public void connect() {
        TcpConnection tcp = this.tcpConnection;
        tcp.setConnection(new Connected(this.tcpConnection));
        System.out.println("connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Error. You're already disconnected.");
    }

    @Override
    public void write(String string) {
        System.out.println("Error. You are disconnected. Connect before write.");
    }

    public String getSTATE_NAME() {
        return STATE_NAME;
    }
}
