package MD_ARBAAZ_KHAN.Epam_Task_on_Design_pattern;

class CivilEngineer  
{ 
  
    private HouseBuilder houseBuilder; 
  
    public CivilEngineer(HouseBuilder houseBuilder) 
    { 
        this.houseBuilder = houseBuilder; 
    } 
  
    public House getHouse() 
    { 
        return this.houseBuilder.getHouse(); 
    } 
  
    public void constructHouse() 
    { 
        this.houseBuilder.buildBasement(); 
        this.houseBuilder.buildStructure(); 
        this.houseBuilder.bulidRoof(); 
        this.houseBuilder.buildInterior(); 
    } 
} 