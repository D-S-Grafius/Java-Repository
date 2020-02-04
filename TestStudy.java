
public class TestStudy {
	public static void main(String[] args) {
		Study study = new Study();
		
		System.out.println("This program will show the different methods of ArrayLists.");
		System.out.println("-----------------------------------------------------------------------");
		
		//add values to the ArrayList
		study.addVal(4);
		study.addVal(7);
		study.addVal(1);
		study.addVal(12);
		study.addVal(8);
		study.addVal(21);
		study.addVal(10);
		study.addVal(23);
		study.addVal(2);
		study.addVal(5);
		study.addVal(6);
		study.addVal(3);
		study.addVal(-9);
		
		//search for value
		System.out.println("");
		study.searchFor(12);
		study.searchFor(3);
		study.searchFor(30);
		
		//change values of ArrayList
		study.setVal(4, 16);
		System.out.println("");
		
		//get values at specific indexes
		study.getVal(7);
		study.getVal(2);
		study.getVal(10);
		study.getVal(6);
	
		
		//sum the ArrayList
		study.sumOf();
		
		//find average of ArrayList
		study.averageOf();
		
		//print the current ArrayList
		study.printList();
		
		//sort and print the ArrayList
		study.sortList();
		
		//delet value
		study.deleteVal(11);
		
		//sort in reverse order
		study.reverseSort();
		
	}
}
