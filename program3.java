
class vehicle
{
    int seat;
    String model_no;
    vehicle(int s,String m)
    {
        seat=s;
        model_no=m;
    }
    void display()
    {
        System.out.println("Seating capacity:"+seat);
        System.out.println("Model number:"+model_no);
    
    }
}
class color extends vehicle
{
    String chassis_no;
    String color;
    String reg_no;
    String owner;
    color(int s,String m,String a,String b,String c,String d)
    {
        super(s,m);
        chassis_no=a;
        color=b;
        reg_no=c;
        owner=d;
    }
    void display()
    {
        super.display();
        System.out.println("chassis number:"+chassis_no);
        System.out.println("color:"+color);
        System.out.println("register number:"+reg_no);
        System.out.println("owner:"+owner);
    }
}

public class program3
{
	public static void main(String[] args) {
	color c=new color(1,"4dgbs677","4fyuyg","black","KL07N5689","Athira");
	c.display();
	}
}
