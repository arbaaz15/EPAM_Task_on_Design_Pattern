package MD_ARBAAZ_KHAN.Epam_Task_on_Design_pattern;

public class App {

	    public static void main(String[] args) 
	    { 
	        HouseBuilder iglooBuilder = new IglooHouseBuilder(); 
	        CivilEngineer engineer = new CivilEngineer(iglooBuilder); 
	  
	        engineer.constructHouse(); 
	  
	        House house = engineer.getHouse(); 
	  
	        System.out.println("Builder constructed: "+ house); 
	    } 
	} 