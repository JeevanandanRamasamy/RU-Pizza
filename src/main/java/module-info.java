module com.pizza {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pizza to javafx.fxml;
    exports com.pizza;
}