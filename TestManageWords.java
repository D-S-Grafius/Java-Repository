
public class TestManageWords {
	
	public static void main(String[] args) {
		ManageWords mw = new ManageWords();
		
		System.out.println("Test 2 Program");
		System.out.println("---------------------------------------------------------------------------");
		
		//add words into the ArrayList
		mw.insert("crazy");
		mw.insert("triumph");
		mw.insert("university");
		mw.insert("unwilling");
		mw.insert("talent");
		mw.insert("perform");
		mw.insert("action");
		mw.insert("no");
		mw.insert("yes");
		mw.insert("indeed");
		mw.insert("super");
		mw.insert("surf");
		mw.insert("later");
		mw.insert("supercalifragialisticexpialidocious");
		System.out.println("");
		
		//delete words from ArrayList
		mw.delete("triumph");
		mw.delete("no");
		System.out.println("");
		
		//find words in ArrayList
		mw.find("action");
		mw.find("university");
		mw.find("no");
		System.out.println("");
		
		//print ArrayList of words less than a given value
		mw.lessThanLength(7);
		System.out.println("");
		
		//print ArrayList of words greater than a given value
		mw.greaterThanLength(5);
		System.out.println("");
		
		//find the longest word
		mw.longest();

		//find the average length
		mw.averageLength();	
		
		//print ArrayList in ascending order
		mw.ascendingOrder();
		
		//print ArrayList in descending order
		mw.descendingOrder();
	}		
}
