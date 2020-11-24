import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRowDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection Established");
		
		Scanner sc=new Scanner(System.in);
		Statement st=con.createStatement();
		System.out.println("Enter the number of rows you want to delete 1.single or 2.multiple ??");
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("Enter the id to be deleted : ");
			int id=sc.nextInt();
			String delete="delete from student where sid = "+id;
			int a =st.executeUpdate(delete);
			if(a==1)
				System.out.println("row deleted");
		}
		else if(n==2)
		{
			System.out.println("Enter the number of id's to be deleted : ");
			int num=sc.nextInt();
			System.out.println("Enter the student id's");
			String ids="";
			for(int i=0;i<num;i++)
			{
				ids+=","+sc.next();			
			}
			ids=ids.substring(1,ids.length());
			String delete = "delete from student where sid in ("+ids+")";
			int a=st.executeUpdate(delete);
			if(a==1)
				System.out.println("rows deleted");			
		}
		else
			System.out.println("Enter one of the choice given in the menu");
	}

}
