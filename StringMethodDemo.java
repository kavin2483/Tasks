package String;

public class StringMethodDemo 
     {

	public static void main(String[] args)
	{
		String s1= new String("  Indian  ");
		String s2=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println(s2.substring(2,5));
		System.out.println(s1.trim());
		System.out.println(s1.strip());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.isEmpty());

    }

}
