public class HelloDog{
  
  public static void main(String[] args){
    
    Dog yellow = new Dog(Dog.Gender.MALE, 8, "big yellow");
    yellow.intro();
    
    Kind dollar= new Breed (Dog.Gnder.FEMALE, 7, "Lucy dollar", Kind.Breed.POODLE);
    dollar.intro();
    
    CSDog Buddy = new CSDog(Dog.Gender.MALE, 11, "Mimi Buddy",Breed.BULLDOG, "collar");
    buddy.intro();
  }
  
}
