package coreJava;

public class StringAll {

	public static void main(String[] args) {
		String abc;
		abc = "testing";

		// String abc = "testing";
		String bcd = "Selenium";

		System.out.println(abc);
		System.out.println(bcd);

		System.out.println(bcd + " " + abc);

		System.out.println(abc.toUpperCase());
		System.out.println(bcd.toLowerCase());

		// compare two strings
		String a = "Apple";
		String b = "apple";
		String c = "Mango";

		// validation
		if (a.equals(b)) {
			System.out.println("Both the Strings are same");
		} else {
			System.out.println("the Strings are NOT same");
		}

		if (a.equalsIgnoreCase(b)) {
			System.out.println("Both the Strings are same****");
		} else {
			System.out.println("the Strings are NOT same*****");
		}

		//length of String
		System.out.println(a.length());
		System.out.println(a.indexOf('l'));
		
		
		String e = "123";
		int f = 456;
		int g = Integer.parseInt(e);
		System.out.println(e+f);//579 or 123456
		System.out.println(g+f);
		String h = String.valueOf(f);
		System.out.println(e+h);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
