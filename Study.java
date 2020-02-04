import java.util.ArrayList;
import java.util.Collections;

public class Study {
	private ArrayList<Integer> numberList = new ArrayList<Integer>();
	
	public void addVal(int value) {
		if(value >= 0) {
			numberList.add(value);
			System.out.println("The value " + value + " has been added to the numberList ArrayList!");
		}
		else {
			System.out.println("The value " + value + " can't be added to the ArrayList because it isn't a positive integer.");
		}
	}
	
	public void deleteVal(int index) {
		numberList.remove(index);
		System.out.println("\n" + "The value at index " + index + " has been removed from the numberList ArrayList!");
		System.out.println("The curent contents of the numberList after removing the value at index " + index + ": ");
		int lister = 1;
		for(int i : numberList) {
			System.out.println(lister + ". " + i);
			lister++;
		}
	}
	
	public void searchFor(int value) {
		if(numberList.contains(value)) {
			System.out.println("The value " + value + " was located at index: " + numberList.indexOf(value));
		}
		else {
			System.out.println("The value " + value + " is not in the ArrayList.");
		}
	}
	
	public void sumOf() {
		int sum = 0;
		for(int i : numberList) {
			sum += i;
			i++;
		}
		System.out.println("The sum of the ArrayList is: " + sum);
	}
		
	public void averageOf() {
		int sum = 0;
		int counter = 0;
		for(int i : numberList) {
			sum += i;
			i++;
			counter++;
		}
		double average = sum/counter;
		System.out.println("The average of the ArrayList is: " + average);
	}
	
	public void printList() {
		int lister = 1;
		System.out.println("\n" + "The contents of the ArrayList: ");
		for(int i : numberList) {
			System.out.println(lister + ". " + i);
			lister++;
		}
	}
	
	public void sortList() {
		Collections.sort(numberList);
		System.out.println("\n" + "The contents of the sorted ArrayList: ");
		int lister = 1;
		for(int i : numberList) {
			System.out.println(lister + ". " + i);
			lister++;
		}
	}
	
	public void reverseSort() {
		Collections.reverse(numberList);
		System.out.println("\n" + "The contents of the ArrayList sorted from largest to smallest: ");
		int lister = 1;
		for(int i : numberList) {
			System.out.println(lister + ". " + i);
			lister++;
		}
	}
	
	public void getVal(int index) {
		System.out.println("The value at index " + index + ": " + numberList.get(index));
	}

	public void setVal(int index, int value) {
		numberList.set(index, value);
		System.out.println("The value at index " + index + " was changed to " + value);	
		int lister = 1;
		System.out.println("The current contents of the ArrayList: ");
		for(int i : numberList) {
			System.out.println(lister + ". " + i);
			lister++;
		}
	}
}
