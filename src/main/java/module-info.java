module chat.chat1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens chat.chat1 to javafx.fxml;
       exports chat.chat1.client;
    opens chat.chat1.client to javafx.fxml;
    exports chat.chat1;
}