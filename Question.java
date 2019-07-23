package stringdemos;

import java.util.StringTokenizer;

public class Question {
	public static void main(String[] args) {
		String quote = "The quick brown fox jumps over the lazy dog";
		String mod1 = new String("The quick brown fox jumps over the lazy dog");
		
		//1
		System.out.println("The character at the 12th index:" +mod1.charAt(12));
		
		//2
		if(mod1.contains("is"))
		{
			System.out.println("the String contains the word - is");
		}
		
		//3
		mod1 = mod1.concat("and killed it");
		System.out.println(mod1);
		
		//4
		if(mod1.endsWith("dogs"))
			
		{
			System.out.println("the String ends with the word - dogs");
		}
		
		//5
		if(mod1.equals("The quick brown Fox jumps over the lazy Dog"))
			
		{
			System.out.println("String is equal to - The quick brown Fox jumps over the lazy Dog");
		}
		
		//6
		if(mod1.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"))
			
		{
			System.out.println("the String is equal to - THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
		}
			//7
		mod1.length();
		{
			System.out.println("the length of the string :" +mod1.length());
		}
		
		
		//8
		if(mod1.matches("The quick brown Fox jumps over the lazy Dog"))
		{
			System.out.println("string matches");
		}
		
		//9
		
		mod1.replace("The", "A");
		
		System.out.println(mod1);
		
		//10
		
		mod1.split(mod1);
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		StringTokenizer tokenizer = new StringTokenizer(quote, " ");
		
		System.out.println(tokenizer.countTokens());
		
		while(tokenizer.hasMoreTokens())
		{
			System.out.println(tokenizer.nextToken());
		}
	}

}
