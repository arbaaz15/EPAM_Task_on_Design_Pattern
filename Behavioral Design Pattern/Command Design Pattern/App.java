class App

{ 
    public static void main(String[] args) 
    { 
        SimpleRemoteControl remote = 
                  new SimpleRemoteControl(); 

        Light light = new Light(); 
       
        
        remote.setCommand(new
                    LightOnCommand(light)); 
        remote.setCommand(new
                    LightOffCommand(light)); 
  } 