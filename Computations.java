/*  The purpose of this program is to read in a file titled "inputfile.txt"
 *  and store the numbers or integers contained within the file into an array
 *	and compute the mean, variance, and standard deviation
 */


import java.io.File; //to read in a file
import java.io.FileNotFoundException;
import java.util.Scanner; //to read in a file

	


public class Computations {
	private String line;
	private int[] grades;
	private int mean = 0;
	private int totalnum = 0;
	private int variance = 0;
	private double sd = 0;
	
	
	private void storeValues(String line) {
		this.line = line; //save string
		String[] strArray = line.split(" "); //count # of tokens 
		this.grades = new int[strArray.length]; //create an array to hold the # of tokens 
		for(int i = 0; i < strArray.length; i++) { //assign values to the array 
			grades[i] = Integer.parseInt(strArray[i]); //adds values to array as integers
			//System.out.print(grades[i]);
			totalnum = totalnum + grades[i]; //add the value at index i into the variable totalnum, which is 0 before the operations are carried out
		}
	}
	//end of method
	public void computeMean() {
		mean = totalnum / (grades.length); //totalnum divided by the total number of elements in the array is the average or the mean
		System.out.println("Mean: " + mean); 
	}
	//end of method
	public void computeVariance() {
		int set = 0;
		int a = 0;
		for(int i = 0; i < grades.length; i++) { /* states that while i, which is 0, is less than the length of the array
			set = mean - grades[i];					set is equal to the mean minus the number if the index i,  
			set *= set;								then square the variable set, and then add that number to the variable a,
			a += set;								which is 0 until the operation is carried out. */
		}
		variance = a / grades.length; //divide a by the length of the array to give you the variance
		System.out.println("Variance: " + variance);
	}
	//end of method
	public void computeSD() {
		sd = Math.sqrt(variance); //squareroot the variance to get the standard deviation
		System.out.println("Standard Deviation: " + sd);
	}
	//end of method
	public void processFile(String filename) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(filename)); //Create Scanner object to read input file
		while(scan.hasNextLine()) { //while(file has more lines)
			line = scan.nextLine(); //get the next line of data
			System.out.println(line); //print the data the create a new line to print on
			String newLine = line.substring(7, line.length());
			this.storeValues(newLine); //call the storeValues to store line as an array or string
			this.computeMean(); //call mean method
			this.computeVariance(); //call variance method 
			this.computeSD(); //call standard deviation method
			//print the input line, mean, variance, and standard deviation
			System.out.println(" ");	//Set all of the variables used back to 0
			mean = 0;
			variance = 0;
			sd = 0;
			totalnum = 0;
		}
		scan.close(); //always close the scanner when it is no longer needed
	}
	//end of method
}
//end of program

