module lt.itacademy.java.basics {
    requires javafx.controls;
    requires javafx.fxml;


    opens lt.itacademy.java.basics to javafx.fxml;
    exports lt.itacademy.java.basics;
}