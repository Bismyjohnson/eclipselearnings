package stringprgm;

public class stringprogram {

	public static void main(String[] args) {
		String s1="hi";
		String s2="welcome";
		String s4="hello welcome luminar";
		String s3=new String("hi");

		System.out.println(s1.concat(s2));
		System.out.println(1+2+s1+3+4);
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		System.out.println(s1.length());
		
		System.out.println(s4.startsWith("hello"));
		System.out.println(s4.endsWith("Luminar"));
			System.out.println(s4.trim());
			System.out.println(s4.replace("hello", "hi"));
			System.out.println(s4.contains("welcome"));
			String[]AR=s4.split("");
			for(String a:AR)
			{
				System.out.println(a);
				
			}
			
			
			
	}

}
