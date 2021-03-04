import java.util.*;
class lcm
{
public static void main(String args[])
{

int a=4,b=8;
int lcm=1;

for(int i=2;a!=1||b!=1;i++)
{
	if((a%i==0)||(b%i==0))
	{	
		if(a%i==0)
		{
			a=a/i;
		}
		if(b%i==0)
		{
			b=b/i;	
		}	
		lcm=lcm*i;
		i=i-1;
	}	
}
System.out.println(lcm);
}
}