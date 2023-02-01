module com.example.interface7wonders {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interface7wonders to javafx.fxml;
    exports com.example.interface7wonders;
    exports com.example.interface7wonders.Controller;
    opens com.example.interface7wonders.Controller to javafx.fxml;
    exports com.example.interface7wonders.Cards;
    opens com.example.interface7wonders.Cards to javafx.fxml;
    exports com.example.interface7wonders.Wonders;
    opens com.example.interface7wonders.Wonders to javafx.fxml;
}