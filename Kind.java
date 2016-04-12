public class Kind extends Dog{
  
  public enum Breed{ BULLDOG,POODLE,PUG };
  
  private Breed breed;
  private int size;
  
  public Kind(Gender gender, String color, String name, Breed breed, Type type){
    super(gender,color, name);
    this.breed = breed;
    this.type =type;}
 
  public Breed getBreed(){return this.breed;}
  public int getSize(){return this.size;}
  
  public void intro(){
    System.out.println("Heloo my name is "+ this.getName() + ", I am a student and i never sleep.");
  }
}
