import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ManageWords implements IWords {
	private ArrayList<String> testAL = new ArrayList<String>();
	
	@Override
	public void insert(String word) {
		testAL.add(word);
		System.out.println("The word " + word + " has been added to the ArrayList.");
	}

	@Override
	public boolean delete(String word) {
		testAL.remove(word);
		System.out.println("The word " + word + " has been removed from the ArrayList.");
		System.out.println("\t" + "- The ArrayList now contains " + testAL.size() + " elements.");
		return false;
	}

	@Override
	public void find(String word) {
		if(testAL.contains(word)) {
			System.out.println("Found " + word + " at index " + testAL.indexOf(word));
		}
		else {
			System.out.println("The word " + word + " is not in the ArrayList.");
		}
	}

	@Override
	public void lessThanLength(int length) {
		ArrayList<String> wordsOfLength = new ArrayList<String>();
		for(String n : testAL) {
			if(n.length() < length) {
				wordsOfLength.add(n);
			}
		}
		int lister = 1;
		System.out.println("Words less than length " + length + ": ");
		for(String print : wordsOfLength) {
			System.out.println(lister + ". " + print);
			lister++;
		}
	}

	@Override
	public void greaterThanLength(int length) {
		ArrayList<String> wordsOfLength2 = new ArrayList<String>();
		for(String n : testAL) {
			if(n.length() > length) {
				wordsOfLength2.add(n);
			}
		}
		int lister = 1;
		System.out.println("Words greater than length " + length + ": ");
		for(String print : wordsOfLength2) {
			System.out.println(lister + ". " + print);
			lister++;
		}
	}

	@Override
	public void longest() {
		int length_holder = 0;
		for(String n : testAL) {
			if(n.length() > length_holder) {
				length_holder = n.length();
			}
		}
		for(String now : testAL) {
			if(now.length() == length_holder) {
				System.out.println("Longest word in ArrayList: " + now + " , length = " + length_holder + ".");
			}
		}		
	}

	@Override
	public double averageLength() {
		double sumOfLength = 0;
		double counter = 0;
		for(String n : testAL) {
			if(n.length() > 0) {
				sumOfLength += n.length();
				counter++;
			}
		}
		double average = sumOfLength/counter;
		System.out.println("Average character length: " + average + " characters.");
		return 0;
	}
	
	public void ascendingOrder() {
		int lengthOf = testAL.size();
		String[] Ascend = new String[lengthOf];
		int testVal = 0;
		int i = 0;
		for(String n : testAL) {
			if(n.length() > testVal) {
				Ascend[i] = n;
				i++;
			}
		}
		System.out.println("\n" + "ArrayList in ascending order: ");
		Arrays.sort(Ascend, Comparator.comparingInt(String::length));		
		int lister = 1;
		for(String print : Ascend) {
			System.out.println(lister + ". " + print);
			lister++;
		}
	}
	
	public void descendingOrder() {
		int lengthOf = testAL.size();
		String[] Descend = new String[lengthOf];
		int testVal = 0;
		int i = 0;
		for(String n : testAL) {
			if(n.length() > testVal) {
				Descend[i] = n;
				i++;
			}
		}
		System.out.println("\n" + "ArrayList in descending order: ");
		Arrays.sort(Descend, Comparator.comparingInt(String::length).reversed());		
		int lister = 1;
		for(String print : Descend) {
			System.out.println(lister + ". " + print);
			lister++;
		}
	}
}
