package MD_ARBAAZ_KHAN.Epam_Task_on_Design_pattern;

public class App {

	 public static void main(String args[]) 
	    { 
	        Sparrow sparrow = new Sparrow(); 
	        ToyDuck toyDuck = new PlasticToyDuck(); 
	  
	        
	        ToyDuck birdAdapter = new BirdAdapter(sparrow); 
	  
	        System.out.println("Sparrow..."); 
	        sparrow.fly(); 
	        sparrow.makeSound(); 
	  
	        System.out.println("ToyDuck..."); 
	        toyDuck.squeak(); 
	  
	      
	        System.out.println("BirdAdapter..."); 
	        birdAdapter.squeak(); 
	    } 
	} 