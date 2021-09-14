public class program2
{
    static int count=0;
    program2()
    {
        count++;
    }
    public static void main(String args[])
    {
        program2 obj1=new program2();
        program2 obj2=new program2();
        program2 obj3=new program2();
        program2 obj4=new program2();
        System.out.println("count of objects:"+count);
    }
}