module com.empresa.acctividad020 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.acctividad020 to javafx.fxml;
    exports com.empresa.acctividad020;
}