import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcdemo {

	public static void main(String[] args) throws SQLException {
		try {
			System.out.println("jdbc driver started");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "Komal@123");
			
			String sql = "create table demo (id int, name varchar(20))";
			
			String sqlquery = "insert into demo values(101,'komal')";
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate(sqlquery);
			
			System.out.println("record inserted");
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
