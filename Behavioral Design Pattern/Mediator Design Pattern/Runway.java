package MD_ARBAAZ_KHAN.Epam_Task_on_Design_pattern;

class Runway implements Command  
{ 
    private IATCMediator atcMediator; 
  
    public Runway(IATCMediator atcMediator)  
    { 
        this.atcMediator = atcMediator; 
        atcMediator.setLandingStatus(true); 
    } 
  
    @Override
    public void land()  
    { 
        System.out.println("Landing permission granted."); 
        atcMediator.setLandingStatus(true); 
    } 
  
} 