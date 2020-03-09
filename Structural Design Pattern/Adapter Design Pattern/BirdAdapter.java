package MD_ARBAAZ_KHAN.Epam_Task_on_Design_pattern;

class BirdAdapter implements ToyDuck 
{ 
   
    Bird bird; 
    public BirdAdapter(Bird bird) 
    { 
       
        this.bird = bird; 
    } 
  
    public void squeak() 
    { 
      
        bird.makeSound(); 
    } 
} 