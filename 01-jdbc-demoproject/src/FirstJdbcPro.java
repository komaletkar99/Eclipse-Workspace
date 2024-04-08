import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbcPro {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("executing started");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root","Komal@123");
		
//		String sqlquery = "create table Samplejdbc (id int, name varchar(20))";
		
		String sql = "insert into Samplejdbc values(101,'komal')";
		
		String sql1 = "insert into Samplejdbc values(102,'anuja')";
		
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate(sql);
		
		stmt.executeUpdate(sql1);
		
		System.out.println("Data inserted");
		
		con.close();
		

	}

}
