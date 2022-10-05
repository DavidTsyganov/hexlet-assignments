package exercise.connections;

import exercise.TcpConnection;

public class Connected implements Connection {
    private TcpConnection tcpConnection;
    private final String STATE_NAME = "connected";

    public Connected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void connect() {
        System.out.println("Error. You're already connected.");
    }

    @Override
    public void disconnect() {
        TcpConnection newTcp = this.tcpConnection;
        newTcp.setConnection(new Disconnected(this.tcpConnection));
        System.out.println("disconnected");
    }

    @Override
    public void write(String string) {
        System.out.println(string + " was added to the buffer.");
    }

    public String getStateName() {
        return STATE_NAME;
    }
}


