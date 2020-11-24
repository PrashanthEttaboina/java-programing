import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AlterTableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection Established");		
		
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one of the options 1.add 2.change 3.drop colomns : ");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("Enter the colomn to be added : ");
			String cname=sc.next();
			System.out.println("Enter the datatype of the colomn : ");
			String data=sc.next();
			String alter="alter table student add "+cname+" "+data;
			int x=st.executeUpdate(alter);
			if(x==0)
				System.out.println("Colomn added");
		}
		else if(option==2)
		{
			System.out.println("enter the old col name :");
			String oldname=sc.next();
			System.out.println("Enter the new col name :");
			String newname=sc.next();
			System.out.println("Enter the datatype of the colomn : ");
			String data=sc.next();
			String alter="alter table student change "+oldname+" "+newname+" "+data;
			int x=st.executeUpdate(alter);
			if(x==0)
				System.out.println("Colomn name changed");
		}
		else if(option==3)
		{
			System.out.println("Enter the colomn to be dropped : ");
			String cname=sc.next();
			String alter="alter table student drop "+cname;
			int x=st.executeUpdate(alter);
			if(x==0)
				System.out.println("Colomn dropped");
		
		}
		else
			System.out.println("Enter only the given options");
				
	}

}
