module application.Autohaus {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
	requires javafx.base;
	requires java.desktop;

    opens application.Autohaus to javafx.fxml;
    exports application.Autohaus;
}
