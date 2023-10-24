package practiceProject8;

public class StringExe {

	public static void main(String[] args) {
		
		String s1="This is a Demo of String Class";
		
		System.out.println("Length= "+s1.length());
		System.out.println("Character at= "+s1.charAt(0));
		
		int start=10;
		int end=14;
		
		char c[]=new char[end-start];
		s1.getChars(start,end,c,0);
		System.out.println(c);
		System.out.println("Upper Case= "+s1.toUpperCase());
		System.out.println("Lower Case= "+s1.toLowerCase());
		System.out.println("Index of "+s1.indexOf('a'));
		System.out.println("Index of "+s1.indexOf('F'));
		System.out.println("After 9th position 'a' appers "+s1.indexOf('a',9));
		System.out.println("Last index of 'a' "+s1.lastIndexOf('a'));
		System.out.println("Comparison "+"Java".compareTo("java"));
		System.out.println("java".compareTo("Java"));
		System.out.println("java".compareTo("java"));
		String s2="      Java Advance     ";
		System.out.println("trim & concatenate: "+s2.trim().concat(" Core"));
		System.out.println("trim & conacanate : "+"core ".concat(s2.trim()));
		
		if((s1.startsWith("This"))&& (s1.endsWith("Class")))
			System.out.println("java");
		else
			System.out.println("C");
		
		String temp=s1.substring(1,4);
		System.out.println("Substring is : "+temp);
		
		String st1="Java";
		String st2="java";
		
		if(st1.equals(st2))
			System.out.println("They are equal");
		else
			System.out.println("They are not equal");
		String st3=st1.replace('J','L');
		System.out.println("New string after replace: "+st3);
		
		String st4=s1.replace('s','o');
		System.out.println("New string: "+st4);
		
		//System.out.println("String Buffer");
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("Java");
		System.out.println("Append  :"+sb);
		
		sb.insert(1,"TIGER");
		System.out.println("Insert  :"+sb);
		
		sb.replace(1,8,"XYZ");
		System.out.println("Repalce  :"+sb);
		
		sb.delete(1,3);
		System.out.println("Delete  :"+sb);
		
		sb.reverse();
		System.out.println("Reverse  :"+sb);
		
		StringBuffer sb1=new StringBuffer();
		System.out.println("Capacity  :"+sb1.capacity());
		
		sb1.append("Hello");
		System.out.println("Capacity after appending  :"+sb1.capacity());
		sb1.append("Java is my favourite language");
		System.out.println("New capacity  :"+sb1.capacity());

	}

}
