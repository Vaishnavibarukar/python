 class1 string methods

package mypack;

public class str_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java program";
		String s2="jain polytechnic";
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('p'));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat(s2));
		System.out.println(s1.substring(2));
		System.out.println(s1.equals(s2));
		System.out.println(s2=s1.replace('j', 'J'));
		System.out.println(s1.contains(s2));
		
		

	}


class2 string palindrom

package mypack;

public class string_palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String string="MALAYALA";
		boolean flag =true;
		for(int i=0;i<string.length()/2;i++) {
			if(string.charAt(i)!=string.charAt(string.length()-i-1)) {
			flag=false;
			break;
			
		}
		}
	
	if(flag) 
		System.out.println("given string is palindrom");
	
	else 
		System.out.println("given string is not palindrom");
	
	}

}

