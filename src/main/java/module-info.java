module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;

    exports view to javafx.graphics;
    exports controller to javafx.fxml;

    opens controller to javafx.fxml;
}