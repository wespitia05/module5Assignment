module com.example.module5assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.module5assignment to javafx.fxml;
    exports com.example.module5assignment;
}