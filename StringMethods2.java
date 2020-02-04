import java.lang.*;


public class StringMethods2 implements IString {
	private String text;
	
	public StringMethods2(String s2) {
		this.text = s2;
	}
	
	@Override
	public void testSubstring(int start, int end) {
		String ans = text.substring(start, end);
		System.out.println("The substring from index is " + start + " to index " + end + " is " + ans);
	}
	
	@Override 
	public int testLength() {
		int ans = this.text.length();
		System.out.println("The text is " + ans + " charcters long.");
		return 0;
	}
	@Override
	public void testCharAt(int index) {
		char[] characters = text.toCharArray();
		System.out.println("The char at index " + index + " is " + characters[index]);
	}
	@Override
	public int testGetChars(int start, int end) {
		String newsub = text.substring(start, end);
		System.out.println("The characters " + newsub + " were taken from the string " + text);
		return 0;
	}
	@Override
	public void testEqualsIgnoreCase(int start, int end, String str) {
		String s = this.text.substring(start, end);
		boolean ans = s.contentEquals(s);
		if(ans == true) {
			System.out.println(str + " is equal to substring " + s);
		}
		else
			System.out.println(str + " is NOT equal to the substring " + s);
	} 
	@Override
	public void testCompareTo(int start, int end, String str) { 
		String s = this.text.substring(start, end);
		int n = str.length();
		//int n = str.compareTo(s);
		if(n == 0) {
			System.out.println(str + " is equal to substring " + s);		 
		}
		else
			if(n < 0) 
			System.out.println(str + " is less than " + s);
			else 
				System.out.println(str + " is greater than " + s); 
	}
	@Override
	public void testReplace(CharSequence oldStuff, CharSequence newStuff) {
		
	}
	@Override
	public void testReplaceAll(String regExpr, String replacement) {
		this.text = regExpr;
		text = replacement;
		System.out.println("The string " + regExpr + " is replaced by " + replacement);
	}
	@Override
	public void testSplit(String pattern) {
		String[] arrOfStr = text.split(pattern);
		System.out.print("The split string is now ");
		for(int i = 0; i < arrOfStr.length; i++) {
			System.out.print(arrOfStr[i]);
		}
		System.out.println("");
	}
	@Override
	public void testRegionMatches(int start, String str, int start2) {
		String first = str.substring(start, start2);
		String second = str.substring(start2, str.length());
		if(first.equals(second)) {
			System.out.println("The string" + first  + " matches " + second);
		}
		else {
			System.out.println("The string " + first + " do not match " + second);
		}
	}
	@Override
	public void testStartsWith(String str, int start) {
		String word = str.substring(start, start + 1);
		String word2 = str.substring(0, 1);
		if(word.equals(word2)) {
			System.out.println("The string " + str + " begins with " + word);
		}
		else {
			System.out.println("The string " + str + " does not begin with " + word);
		}
	}
	@Override
	public void testEndsWith(String str, int start) {
		String end = str.substring(start, start + 1);
		String end2 = str.substring(str.length() - 1, str.length());
		if(end.contentEquals(end2)) {
			System.out.println("The string " + str + " ends with " + end);
		}
		else {
			System.out.println("The string " + str + " does not end with " + end);
		}
	}
	@Override
	public void testToUpperCase() {
		String up = text.toUpperCase();
		System.out.println("The upper case of the text is " + up);
	}
		
	@Override
	public void testToLowerCase() {
		String low = text.toLowerCase();
		System.out.println("The lower case of the text is " + low);
	}
}
