package mysqlstart;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		DBconnect dbc  = new DBconnect();
		// System.out.println("jhfg");
		dbc.getData();
		
	}

}