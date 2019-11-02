package pack1;
import java.sql.*;
import java.util.*;
public class InsertData3 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-geDrivnerated method stub
		
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student id");
			int id=Integer.parseInt(sc.nextLine());
			
			Class.forName("oracle.jdbc.driver.OracleDriver");//step 1
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","HR");//step2
		PreparedStatement pst = connection.prepareStatement("select * from student where student_id = ? ");
		pst.setInt(1, id); //step3
		;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
		ResultSet  rs = pst.executeQuery();
		if (rs.next()){
			int tot = rs.getInt(3);
			System.out.println("Name " +rs.getString(2));
			System.out.println("Total " +tot);
			System.out.println(tot>=200?"Pass":"Fail");
		
			
		}
		else {
			System.out.println("Rec not found");
		}
		connection.close();
		sc.close();
		}
		
		catch (ClassNotFoundException e){
			System.out.println(e);
		}
		
		catch (SQLException e){
			System.out.println(e);
		}
	}
		

}
