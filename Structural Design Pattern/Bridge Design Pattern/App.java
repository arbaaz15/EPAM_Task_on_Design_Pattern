package MD_ARBAAZ_KHAN.Epam_Task_on_Design_pattern;

public class App {

	 public static void main(String[] args) 
	    { 
	        Vehicle vehicle1 = new Car(new Produce(), new Assemble()); 
	        vehicle1.manufacture(); 
	        Vehicle vehicle2 = new Bike(new Produce(), new Assemble()); 
	        vehicle2.manufacture(); 
	    } 
	} 