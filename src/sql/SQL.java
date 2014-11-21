package sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQL {
	
	public void checkpwd(Connection con, String username, String password){
		try {
			Statement stmt = con.createStatement();
			String sqlQuery = "SELECT pwd FROM USERS WHERE username =" + username + ";";
			stmt.executeQuery(sqlQuery);
			/*
			 * 
			 * do smth else with it
			 */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void genstatement(Connection con, String name){
		try {
			String statement = "Select * from users where username = ?";
			PreparedStatement stmt = con.prepareStatement(statement);
			stmt.setString(0, name);
			ResultSet set = stmt.executeQuery(statement);
			/*
			 * 
			 * do smth else with it
			 */
			set.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
