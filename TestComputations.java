import java.io.FileNotFoundException;

public class TestComputations {
	
	public static void main(String[] args) throws FileNotFoundException {
		Computations prog = new Computations(); //object for the computations class
		prog.processFile("inputfile.txt");
	}
}
