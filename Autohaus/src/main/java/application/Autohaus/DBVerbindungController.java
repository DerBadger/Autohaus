package application.Autohaus;


import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class DBVerbindungController implements Initializable {

    @FXML
    private void switchToFahrzeuge() throws IOException {
        appReferences.setRoot("fahrzeuge");
    }
    
    
    @FXML TextArea txtA_dbstat;
    @FXML Label lbl_dbstatus;
  
    
    public void dbstat_con() throws SQLException
	{
    	DBUtil.dbCon();
    	lbl_dbstatus.setText("Die Datenbank ist verbunden");
    	txtA_dbstat.appendText("Connected\n");
	}
    
    	
    
    public void dbstat_discon() throws SQLException
    {
    	DBUtil.dbDiscon();
    	lbl_dbstatus.setText("Die Datenbank ist nicht verbunden");
    	txtA_dbstat.appendText("Disconnected\n");
    }   

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	

}