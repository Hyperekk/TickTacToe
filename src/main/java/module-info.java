module com.bartt.cosconiewyjdzie {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.bartt.cosconiewyjdzie to javafx.fxml;
    exports com.bartt.cosconiewyjdzie;
}