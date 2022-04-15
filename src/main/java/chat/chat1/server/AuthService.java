package chat.chat1.server;

import java.io.Closeable;

public interface AuthService extends Closeable {
    void start();

    String  getNickByLoginAndPassword(String  login, String password);


    void close();

}
