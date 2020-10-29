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

public class OccupantMethod 
{
public static void main(String args[])
{
System.out.println("==============Employee Details 1===============");
 
Employee prashanth= new Employee("Prashanth",2017,60000,"#11-20-90/D Autonagar Warangal Telangana.","9090123165","B+ve","Java developer");

System.out.println("==============Employee Details 2===============");

Employee Maha= new Employee("Maha Lakshmi",2019,40000,"#19-210-160/c Gudeppad Warangal Telangana.","9010787965","B+ve","Frontend Developer");
}
}

