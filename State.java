import java.util.ArrayList;

public class State{
	
	private String name;
	private int size;
	private String sizeUnits = "square miles";
	private int population;
	private String acronym;//e.g. NC for North Carolina
	private ArrayList<City> cityList;
	
	
	public State(String name, int population, String sizeUnits, int size) {
		this.size = size;
		this.sizeUnits = sizeUnits;
		this.name = name;
		this.population = population;
		this.cityList = new ArrayList<City>();
	}
	
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
		
	public void setSizeUnits(String sizeUnits) {
		this.sizeUnits = sizeUnits;
	}
		
	public int getPopulation() {
		return population;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public String getAcro() {
		return acronym;
	}
	
	public void setAcro(String acronym) {
		this.acronym = acronym;
	}
	
	public void addCity(City city) {
		this.cityList.add(city);
		System.out.println("The city of " + city.getName() + " has been added to " + this.name);
	}
	
	public void StoString(State state) { 
	   System.out.println("The state, " + this.getName() + " (" + this.acronym + ") has a size of " + this.getSize() 
	   	+ " and has " + this.getSizeUnits() + " with a population of " + this.getPopulation() + " people.");
	}
	
	public void changeSize(String name, int size) {
		for(City city : cityList) {
			if(city.getName() == name) {
				int past_size = city.getSize();
				city.setSize(size);
				System.out.println("\n" + city.getName() + "'s size was just changed from " + past_size + " to " + city.getSize());
			}
		}
	}
	
	public void greaterSize() {
        int max = 0;
        int lister = 1;
        System.out.println("\n" + "List of cities from largest to smallest: ");
        for(City city : cityList) {
            if (city.getSize() > max) {
                max = city.getSize();
                System.out.println(lister + ". " + city.getName());
                lister++;
            }
        }
    }
	
	public void listCities() {
		int lister = 1;
		System.out.println("\n" + "List of all added cities: ");
		for(City city : cityList) {
			System.out.println(lister + ". " + city.getName());
			lister++;
		}
	}
	
	public void deleteCity(City city) {
		this.cityList.remove(city);
		System.out.println("\n" + "The city " + city.getName() + " was deleted.");
		System.out.println("Current list of cities: ");
		int lister = 1;
		for(City city1 : cityList) {
			System.out.println(lister + ". " + city1.getName());
			lister++;
		}	
	}
	
	public void searchFor(int size, int population) {
		System.out.println("\n" + "Searching for cities that have a size bigger than " + size + " and a population bigger than " + population + ":");
		int lister = 1;
		for(City city : cityList) {
			if(city.getSize() > size && city.getPopulation() > population){
				System.out.println(lister + ". " + city.getName() + ", size = " + city.getSize() + ": population = " + city.getPopulation());
				lister++;
			}
		}
	}
}//end of class State
		
