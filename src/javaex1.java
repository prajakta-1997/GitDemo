
public class javaex1 {
	
	public static void main (String[] args)
	{
		String a = "aka";
		String p = "";
		System.out.println(a);
		System.out.println(p);
		for(int i = a.length()-1;i>= 0;i--)
		{
			p =p + a.charAt(i);
					//System.out.println(a.charAt(i-1));
		}
		System.out.println(p);
		if(a.equalsIgnoreCase(p))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
			
	}

}
