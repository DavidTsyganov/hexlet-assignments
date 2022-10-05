package exercise.connections;

public interface Connection {
    void connect();
    void disconnect();
    void write(String string);
    String getSTATE_NAME();
}
