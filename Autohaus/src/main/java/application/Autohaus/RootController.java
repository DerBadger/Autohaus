package application.Autohaus;

import java.io.IOException;
import javafx.fxml.FXML;

public class RootController {

    @FXML
    private void switchToSecondary() throws IOException {
    	appReferences.setRoot("dbVerbindung");
    }
}
