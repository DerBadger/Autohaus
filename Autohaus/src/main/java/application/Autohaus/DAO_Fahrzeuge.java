package application.Autohaus;

import java.sql.SQLException;

public class DAO_Fahrzeuge {

	//INSERT an employee
    //*************************************
    public static void insertFahrzeug (String marke, String modell, int km, String ez, String hu, String nummernschild) throws SQLException, ClassNotFoundException {
        //Declare a Insert statement 
        String updateStmt = "INSERT INTO Fahrzeuge (Marke, Modell, KM, Erstzulassung, Hauptuntersuchung, Nummernschild) "
        					+ "VALUES (' " + marke + "','" + modell + "', '" + km + "', '" + ez + "', '" + hu + "', '" + nummernschild + "')" ;
        //Execute Insert operation 
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while Insert Operation: " + e);
            throw e;
        }
    }

    public static void deleteFahrzeug (int ID) throws SQLException, ClassNotFoundException {
        //Declare a DELETE statement 
        String updateStmt = "DELETE FROM Fahrzeuge WHERE FahrzeugID = '" + ID + "'";
        //Execute DELETE operation 
        try {
            DBUtil.dbExecuteUpdate(updateStmt);
        } catch (SQLException e) {
            System.out.print("Error occurred while DELETE Operation: " + e);
            throw e;
        }
    }
}
