package MD_ARBAAZ_KHAN.Epam_Task_on_Design_pattern;

class Flight implements Command  
{ 
    private IATCMediator atcMediator; 
  
    public Flight(IATCMediator atcMediator)  
    { 
        this.atcMediator = atcMediator; 
    } 
  
    public void land()  
    { 
        if (atcMediator.isLandingOk())  
        { 
            System.out.println("Successfully Landed."); 
            atcMediator.setLandingStatus(true); 
        } 
        else
            System.out.println("Waiting for landing."); 
    } 
  
    public void getReady()  
    { 
        System.out.println("Ready for landing."); 
    } 
  
} 
