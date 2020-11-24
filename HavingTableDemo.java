import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HavingTableDemo {

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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the colomn name to be used for using having : ");
		String col=sc.next();
		System.out.println("Enter the value for "+col+" :");
		String val=sc.next();
		String select = "select * from student having "+col+" = '"+val+"'";
		ResultSet rs=st.executeQuery(select);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
		}			
	}
}
