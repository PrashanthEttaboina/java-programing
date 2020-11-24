import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OperationsTableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection Established");
		Statement st=con.createStatement();
		String select="select max(marks), sum(marks), avg(marks), min(marks), count(marks) from student";
		ResultSet rs=st.executeQuery(select);
		while(rs.next())
		{
			System.out.println("Max Marks = "+rs.getInt(1)+"\nSum of Marks = "+rs.getInt(2)+"\nAverage of marks = "+rs.getInt(3)+"\nMinimum marks = "+rs.getInt(4)+"\nTotal no of marks = "+rs.getInt(5));
		}
	}
}
