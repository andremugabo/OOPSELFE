//	QUESTION 4
public class StringClass {
	public static void main(String[] args) {
		char[] s= {'n','M','5','6','&','H'};
		
		for(int i = 0; i < s.length; i++) {
			if(Character.isDigit(s[i]))
				System.out.println(s[i]+" Is a digit");
			if(Character.isLetter(s[i]))
				System.out.println(s[i]+" Is a letter");
			if(Character.isWhitespace(s[i]))
				System.out.println(s[i]+" Is a white space");
			if(Character.isUpperCase(s[i]))
				System.out.println(s[i]+" Is upper case Letter");
			if(Character.isLowerCase(s[i]))
				System.out.println(s[i]+" Is lower case letter");
		}
	}
}
