
public class City {
	
	private String name;
	private int size;
	private String sizeUnits = "Square Miles";
	private int population;
	
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getSize() {
			return size;
		}
		
		public void setSize(int size) {
			this.size = size;
		}
		
		public String getSizeUnits() {
			return sizeUnits;
		}
		
		public void setSizeUnit(String sizeUnits) {
			this.sizeUnits = sizeUnits;
		}
		
		public int getPopulation() {
			return population;
		}
		
		public void setPopulation(int population) {
			this.population = population;
		}
		
		public void printCity(City city) {
			System.out.println(city.toString());
		}
		
		public String toString() { 
			return this.getName() + " " + this.getSize() + " " + this.getSizeUnits() + " " + this.getPopulation() + " "
					+ "";
		}
}
