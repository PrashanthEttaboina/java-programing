import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection Established");	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of colomns to be retrieved :");
		int num=sc.nextInt();
		String cols="";
		System.out.println("Enter the colomn names : ");
		for(int i=0;i<num;i++)
		{
			cols+=","+sc.next();
		}
		cols=cols.substring(1,cols.length());
		String select="select "+cols+" from student";
		//System.out.println(select);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(select);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  " +rs.getString(2)+"  "+rs.getInt(3));
		}
		
	}

}
