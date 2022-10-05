package application.Autohaus;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FahrzeugeController {
	
	@FXML TextField txt_FahrzeugID;
	@FXML TextField txt_FahrzeugMarke;
	@FXML TextField txt_FahrzeugModell;
	@FXML TextField txt_FahrzeugKM;
	@FXML TextField txt_FahrzeugEZ;
	@FXML TextField txt_FahrzeugHU;
	@FXML TextField txt_FahrzeugKennzeichen;
	@FXML TextArea txta_FahrzeugLog;

    @FXML
    private void switchToDBVerbindung() throws IOException {
    	appReferences.setRoot("dbVerbindung");
    }
    
    
    public void createCar(ActionEvent actionEvent) throws ClassNotFoundException, SQLException {
    	try {
    		DAO_Fahrzeuge.insertFahrzeug(txt_FahrzeugMarke.getText(), txt_FahrzeugModell.getText(), Integer.parseInt(txt_FahrzeugKM.getText()), 
    			txt_FahrzeugEZ.getText(), txt_FahrzeugHU.getText(), txt_FahrzeugKennzeichen.getText());
    		System.out.println("Car added");
    		txta_FahrzeugLog.appendText("Der " + txt_FahrzeugMarke.getText()+" "+ txt_FahrzeugModell.getText() + " mit dem Kennzeichen " + txt_FahrzeugKennzeichen.getText() + " wurde hinzugefügt\n");
    		} catch (SQLException e) {
    			txta_FahrzeugLog.appendText("Das Fahrzeug konnte nicht hinzugefügt werden: " + e + "\n");
                throw e;            
    		}
    	}
    	
    public void deleteCar(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        try {
                DAO_Fahrzeuge.deleteFahrzeug(Integer.parseInt(txt_FahrzeugID.getText()));
                System.out.println("Car deleted");
                txta_FahrzeugLog.appendText("Das Fahrzeug wurde gelöscht\n");
            } catch (SQLException e) {
            	txta_FahrzeugLog.appendText("Das Fahrzeug konnte nicht gelöscht werden: " + e + "\n");
                throw e;
            }
        
    }
}
