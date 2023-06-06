module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
            requires net.synedra.validatorfx;
            requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;

            requires com.almasb.fxgl.all;
    requires java.prefs;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.vista;
    opens com.example.demo.vista to javafx.fxml;
}