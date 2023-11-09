package Object;
class Sample 
{
	
}
class Demo
{
	public Demo()
	{
	  System.out.println("In Construction");	
	}
	protected void finalize() throws Throwable
	{
		System.out.println("In Finalize");
	}
}

public class ObjectClassDemo {

	public static void main(String[] args)
	{
		Sample s= new Sample();
		Sample s1= new Sample();
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		Demo d= new Demo();
		System.out.println(d.hashCode());
		
		

	}

}
