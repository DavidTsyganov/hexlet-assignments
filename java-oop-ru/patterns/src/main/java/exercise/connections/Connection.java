package exercise.connections;

public interface Connection {
    public String getCurrentState();
    public void connect();
    public void disconnect();
    public void write(String data);

}
