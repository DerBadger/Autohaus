module application.Autohaus {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
	requires javafx.base;
	requires java.desktop;
	requires transitive java.sql;

    opens application.Autohaus to javafx.fxml;
    exports application.Autohaus;
    /*opens application.Autohaus.Controller to javafx.fxml;
    exports application.Autohaus.Controller;
    opens application.Autohaus.DAO to javafx.fxml;
    exports application.Autohaus.DAO;
    opens application.Autohaus.Model to javafx.fxml;
    exports application.Autohaus.Model;*/
    
}
