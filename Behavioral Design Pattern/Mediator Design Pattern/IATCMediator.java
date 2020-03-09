package MD_ARBAAZ_KHAN.Epam_Task_on_Design_pattern;

interface IATCMediator 
{ 
  
    public void registerRunway(Runway runway); 
  
    public void registerFlight(Flight flight); 
  
    public boolean isLandingOk(); 
  
    public void setLandingStatus(boolean status); 
} 