import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
	public class DbConnector {
	
		public static void main(String args[]) {
		Connection con=null;

	 String url="jdbc:mysql://localhost:3306/first";
	 String username="root";
	String password="0352";
		
			try {
			
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is successful");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			}
	}
		

