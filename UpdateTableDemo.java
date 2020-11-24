import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTableDemo {

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
		System.out.println("Enter the row(1.name, 2.marks, 3.section) to be updated from student table using id : ");
		int n=sc.nextInt();
		
		if(n==1)
		{
			System.out.println("Enter the id where the name is to be updated :");
			int id=sc.nextInt();
			System.out.println("Enter the new name : ");
			String newname=sc.next();
			String update="update student set name='"+newname+"'where sid="+id;
			int a=st.executeUpdate(update);
			if(a==1)
				System.out.println("Name Updated");			
		}
		else if(n==2)
		{
			System.out.println("Enter the id where the marks are to be updated :");
			int id=sc.nextInt();
			System.out.println("Enter the marks to be incremented :");
			int marks=sc.nextInt();
			String update="update student set marks= marks+"+marks+" where sid= "+id;
			int a=st.executeUpdate(update);
			if(a==1)
				System.out.println("Marks Updated");				
		}
	else if(n==3)
		{
			System.out.println("Enter the id where the section to be updated :");
			int id=sc.nextInt();
			System.out.println("Enter the new section :");
			String newsec=sc.next();
			String update="update student set section='"+newsec+"'where sid="+id;
			int a=st.executeUpdate(update);
			if(a==1)
				System.out.println("Section Updated");			
		}
		else
			System.out.println("Enter a correct option");
		
	}

}
