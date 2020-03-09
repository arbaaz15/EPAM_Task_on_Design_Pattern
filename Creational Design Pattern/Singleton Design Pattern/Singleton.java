package MD_ARBAAZ_KHAN.Epam_Task_on_Design_pattern;

class Singleton 
{ 
   
    private static Singleton single_instance = null; 
  
   
    public String s; 
 
    private Singleton() 
    { 
        s = "Hello I am a string part of Singleton class"; 
    } 
  
     
    public static Singleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
    } 
} 
