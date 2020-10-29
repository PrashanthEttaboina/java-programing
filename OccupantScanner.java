import java.util.Scanner; 
class Employee  
{
String employee_name;
int employee_id;
int employee_salary;
String employee_address;
String employee_contact;
String employee_designation;
String employee_blood;
static String company_name;

Employee(String employee_name,int employee_id,int employee_salary,String employee_address,String employee_contact,String employee_blood,String employee_designation)
{
this.employee_name=employee_name;
this.employee_id=employee_id;
this.employee_salary=employee_salary;
this.employee_address=employee_address;
this.employee_contact=employee_contact;
this.employee_blood=employee_blood;
this.employee_designation=employee_designation;
this.company_name="Apashyampak kirikiri";
this.display();
this.display("details");
}

void display()
{
System.out.println("==============Employee Details===============");

System.out.println("Employee name : "+employee_name);
System.out.println("Employee ID : "+employee_id);
System.out.println("Salary : "+employee_salary);
System.out.println("Company Name : "+company_name);
}
void display(String s)
{
System.out.println("==============Personal Details==============");
System.out.println("Address : "+employee_address);
System.out.println("Mobile Number : "+employee_contact);
System.out.println("Blood group : "+employee_blood);
System.out.println("Designation : "+employee_designation);

}
}

public class OccupantScanner 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Employee name : "); 
String name=sc.next();
System.out.println("Enter Id : ");
int id=sc.nextInt();
System.out.println("Enter Salary : ");
int salary=sc.nextInt();
sc.nextLine();
System.out.println("Enter Address : ");
String address=sc.nextLine();
System.out.println("Enter Mobile number :" );
String number=sc.next();
sc.nextLine();
System.out.println("Enter Designation : ");
String add=sc.nextLine();
System.out.println("Enter Blood Group : ");
String blood=sc.next();

Employee prashanth= new Employee(name,id,salary,address,number,blood,add);

}
}

