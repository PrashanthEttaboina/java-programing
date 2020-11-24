import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GroupByDemo {

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
		System.out.println("Enter the colomn to be retrieved : ");
		String col1=sc.next();
		System.out.println("Enter the colomn to be used in group by : ");
		String col2=sc.next();
		String select="select "+col1+" ,"+col2+" from student group by "+col2;
		ResultSet rs=st.executeQuery(select);
		while(rs.next())
		{
			System.out.println("Maximum marks = "+rs.getInt(1)+"  Section = "+rs.getString(2));
		}
	
	}

}
