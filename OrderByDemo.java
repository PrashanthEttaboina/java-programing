import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OrderByDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection Established");	
		System.out.println("Select the colomn name which is to be retrieved based on order by :");
		Scanner sc=new Scanner(System.in);
		String col=sc.next();
		Statement st=con.createStatement();
		String select="select * from student order by "+col;
		ResultSet rs=st.executeQuery(select);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4));
		}
		
	}

}
