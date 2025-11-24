module com.fburgos.logindigitalizacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.fburgos.logindigitalizacion to javafx.fxml;
    exports com.fburgos.logindigitalizacion;
}