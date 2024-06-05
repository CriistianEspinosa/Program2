module com.example.program2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.program2 to javafx.fxml;
    exports com.example.program2;
}