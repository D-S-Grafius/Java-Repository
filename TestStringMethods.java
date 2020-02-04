
public class TestStringMethods {
	
	public static void main(String[] args) {
		String s = "1234567890";
		StringMethods2 prog = new StringMethods2(s);
		
		prog.testSubstring(2, 7);
		prog.testLength();
		String s2 = "abcdefghijklmnop";
		StringMethods2 prog2 = new StringMethods2(s2);
		prog2.testCompareTo(0,  6,  "abcde");
		prog2.testCompareTo(2,  6,  "abcde");
		prog2.testCompareTo(2,  6,  "cde");
		prog2.testCharAt(4);
		prog2.testGetChars(2, 6);
		prog2.testReplaceAll(s2, "ABCDEFGHIJKLMNOP");
		prog2.testSplit("DEFG");
		prog2.testRegionMatches(0, "hello", 3);
		prog2.testStartsWith("hello", 0);
		prog2.testEndsWith("hello", 4);
		prog2.testToUpperCase();
		prog2.testToLowerCase();
	}
}
