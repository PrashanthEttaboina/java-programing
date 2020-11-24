import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatetableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
		{
			System.out.println("Connection Established");
		}
		Statement st=con.createStatement();
		int a=st.executeUpdate("Create table student (sid int(5),name varchar(20),marks int(10),section varchar(2))");
		if(a!=0)
		{
			System.out.println("table created ");
		}
		
	}

}
