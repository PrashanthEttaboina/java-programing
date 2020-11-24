import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection Established");
		Scanner sc=new Scanner(System.in);
		Statement st=con.createStatement();
		System.out.println("Enter the number of students to be updated : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter student id : ");
			int sid=sc.nextInt();
			System.out.println("Enter the name of the student : ");
			String name=sc.next();
			System.out.println("Enter the marks of the student : ");
			int marks=sc.nextInt();
			System.out.println("Enter the section : ");
			String section=sc.next();
			
			String query="insert into student values("+sid+",'"+name+"',"+marks+",'"+section+"')";
			int a=st.executeUpdate(query);
			if(a==1)
				System.out.println("Inserted values");				
		}	
	}
}
