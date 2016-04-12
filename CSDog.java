public class CSDog extends Kind{
  
  private String collar;
  
  public CSDog(Gender gender, String color, String name, Breed breed, String collar){
    super(gender,color,name,breed);
    this.collar=collar;}
  
  public String getcollar(){return this.collar;}
  
  public void intro(){
    System.out.println("Hey, my name is " + this.getName() + 
                       ". I have a " + this.getcollar() +
                       " and I will hack you.");}
}