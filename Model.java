class Laptop
{
String laptop_name;
float laptop_weight;
float laptop_display_width;
int laptop_harddisk;
String laptop_processor;
static String Brand;
String laptop_display_type;
int laptop_ram;
String laptop_version;
String laptop_graphic_card;
int laptop_battery;
}

public class Model
{
public static void main(String [] args)
{
Laptop l1=new Laptop();
l1.laptop_name="Inspiron i5";
l1.laptop_weight=4.3f;
l1.laptop_display_width=15.6f;
l1.laptop_harddisk=1;
l1.laptop_version="AMD A9 7th Gen";
Laptop.Brand= "DELL";
l1.laptop_display_type="No Touch";
l1.laptop_ram=6;
l1.laptop_graphic_card="Radeon 256mb";
l1.laptop_battery=20000;

System.out.println("============Laptop Details===============");
System.out.println("Laptop Name = "+l1.laptop_name);
System.out.println("Weight = "+l1.laptop_weight);
System.out.println("Display Width = "+l1.laptop_display_width);
System.out.println("Hard disk in GB = "+l1.laptop_harddisk);
System.out.println("Version = "+l1.laptop_version);
System.out.println("Display Type = "+l1.laptop_display_type);
System.out.println("RAM in GB= "+l1.laptop_ram);
System.out.println("Graphic card = "+l1.laptop_graphic_card);
System.out.println("Battery in Mah = "+l1.laptop_battery);
System.out.println("Brand = "+Laptop.Brand);

}
}