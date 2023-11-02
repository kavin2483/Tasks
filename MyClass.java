package Block;

public class MyClass 
{
	private int section;
	private static int srNo;
	static
	{
		System.out.println("-------> within static block <--------");
	}
	MyClass()
	{
		System.out.println("-------> within default constructer <--------");
		srNo++;
		section++;
}
	@Override
	public String toString() {
		return "MyClass [section=" + section + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	static void display()
	{
		//System.out.println("section: " +section);
		System.out.println("serialNo: " +srNo);
	}
	
	

}

