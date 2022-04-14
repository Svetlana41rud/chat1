package chat.chat1.server;

import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private  final AuthService authService;
    private  final List<ClientHandler> client;

    public ChatServer() {
        authService = null;
        client = new ArrayList<>();

    }


    public void run() {

    }
}
