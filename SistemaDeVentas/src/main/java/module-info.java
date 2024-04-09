module org.example.sistemadeventas {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens org.example.sistemadeventas to javafx.fxml;
    exports org.example.sistemadeventas;
    opens org.example.sistemadeventas.controllers to javafx.fxml;
    exports org.example.sistemadeventas.controllers;
}