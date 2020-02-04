
public class TestState {
	public static void main(String[] args) {
		State state = new State("North Carolina", 9000000, "50000000 suqare miles", 1000000);
		state.setAcro("NC");
		
		//add Wilmington
		City city = new City();
		city.setName("Wilmington");
		city.setSize(100000);
		city.setPopulation(50000);
		city.setSizeUnit("200000");
		state.addCity(city);
		
		//add Charlotte
		City city1 = new City();
		city1.setName("Charlotte");
		city1.setSize(300000);
		city1.setPopulation(800000);
		city1.setSizeUnit("400000");
		state.addCity(city1);
		
		
		//add Raleigh
		City city2 = new City();
		city2.setName("Raleigh");
		city2.setSize(200000);
		city2.setPopulation(350000);
		city2.setSizeUnit("300000");
		state.addCity(city2);
		
		//add Boone
		City city3 = new City();
		city3.setName("Boone");
		city3.setSize(150000);
		city3.setPopulation(30000);
		city3.setSizeUnit("274000");
		state.addCity(city3);
		
		//add Durham
		City city4 = new City();
		city4.setName("Durham");
		city4.setSize(250000);
		city4.setPopulation(550000);
		city4.setSizeUnit("365400");
		state.addCity(city4);
		
		//add Chapel Hill
		City city5 = new City();
		city5.setName("Chapel Hill");
		city5.setSize(254300);
		city5.setPopulation(410000);
		city5.setSizeUnit("400000");
		state.addCity(city5);
		
		//add Winston-Salem
		City city6 = new City();
		city6.setName("Winston-Salem");
		city6.setSize(342000);
		city6.setPopulation(350000);
		city6.setSizeUnit("445600");
		state.addCity(city6);
		
		//add Greensboro
		City city7 = new City();
		city7.setName("Greensboro");
		city7.setSize(275000);
		city7.setPopulation(643000);
		city7.setSizeUnit("300000");
		state.addCity(city7);
		
		//add Greenville
		City city8 = new City();
		city8.setName("Greenville");
		city8.setSize(222000);
		city8.setPopulation(150000);
		city8.setSizeUnit("398000");
		state.addCity(city8);
		
		//add Asheville
		City city9 = new City();
		city9.setName("Asheville");
		city9.setSize(720000);
		city9.setPopulation(219000);
		city9.setSizeUnit("199000");
		state.addCity(city9);
		
		
		state.StoString(state);
		state.listCities();
		state.deleteCity(city6);
		state.changeSize("Greenville", 264000);
		state.searchFor(100000, 50000);
		state.searchFor(150000, 500000);
		state.greaterSize();
	}
}
