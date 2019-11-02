package pack1;
import java.sql.*;
public class InsertData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-geDrivnerated method stub
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");//step 1
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","HR");
		Statement smt = connection.createStatement();
		smt.executeUpdate("INSERT INTO student values (100,'Ram',123)");
		connection.close();
		}
		
		catch (ClassNotFoundException e){
			System.out.println(e);
		}
		
		catch (SQLException e){
			System.out.println(e);
		}
	}
		

}
