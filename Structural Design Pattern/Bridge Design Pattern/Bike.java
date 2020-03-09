package MD_ARBAAZ_KHAN.Epam_Task_on_Design_pattern;

class Bike extends Vehicle { 
    public Bike(Workshop workShop1, Workshop workShop2) 
    { 
        super(workShop1, workShop2); 
    } 
  
    @Override
    public void manufacture() 
    { 
        System.out.print("Bike "); 
        workShop1.work(); 
        workShop2.work(); 
    } 
} 