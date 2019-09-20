import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
		try { 
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			String url = "jdbc:sqlserver://localhost:1433;database=sysb13";
			String user = "user1";
			String password = "data";
			
			Connection myConnection = DriverManager.getConnection(url, user, password);
			
			String myQuery = "SELECT * FROM Student";
			
			PreparedStatement myPreparedStatement = myConnection.prepareStatement(myQuery);
			
			ResultSet myResultSet = myPreparedStatement.executeQuery();
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			}
		}

	}


