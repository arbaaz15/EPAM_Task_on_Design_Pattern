class SimpleRemoteControl 
{ 
    Command slot;  // only one button 
  
    public SimpleRemoteControl() 
    { 
    } 
  
    public void setCommand(Command command) 
    { 
        
        slot = command; 
    } 
  
    public void buttonWasPressed() 
    { 
        slot.execute(); 
    } 
} 