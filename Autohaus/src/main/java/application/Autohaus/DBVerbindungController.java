package application.Autohaus;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DBVerbindungController implements Initializable {

    @FXML
    private void switchToPrimary() throws IOException {
        appReferences.setRoot("root");
    }
    
    
    @FXML TextField txt_dbstat;
    @FXML TextArea txtA_dbstat;
  
    
    public void dbstat_con()
	{
    	String txt = txtA_dbstat.getText();
    	System.out.println(txt);
    	/*System.out.println(txtA_dbstat.getText());*/
    	txt = "Datenbank ist verbunden";
    	System.out.println(txt + "2");
    	if (txt == "Datenbank ist verbunden")
    		{
    		txtA_dbstat.setText("Datenbank ist nicht verbunden");
    		System.out.println("DB disconnected!!!");
    		}
    	else {
    	txtA_dbstat.setText("Datenbank ist verbunden");
    	System.out.println("DB connected");
    	}
    	
    	//System.out.println(txtA_dbstat.toString());	
	}
    
    
	
    
    public void dbstat_discon()
    {
    	txt_dbstat.setText("Datenbank ist nicht verbunden");
    	System.out.println("DB disconnected");	
    }   

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	

}