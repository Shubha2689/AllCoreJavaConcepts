package core.java.allconcept.arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		String s="welcome";
		String s1="to java";
		
		System.out.println(s.length());//lenght od a string
		
		System.out.println(s.concat(s1));//joining of strings
		
		s=   "welcom"  ;
		System.out.println(s.trim());
		
		//charAt
		
		s="welcome";
		System.out.println(s.charAt(4));//return character based on index number
		
		//contains() -->return true
		
		s="welcome";
		
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("wel"));
		
		//comparing string equels()
		
		s="welcome";
		s1="wel come";
		System.out.println(s.equals(s1));
		
		//replacing characters
		
		s="welcome to my home";
		s.replace('w','a');
		System.out.println("Print:-"+s.replace('w','a'));
		
		//extracting substring from main string
		
		s="welcome";
		System.out.println(s.substring(0,5));
		
		//toLowercase
		
		s="Come My Home";
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());

	}

}
