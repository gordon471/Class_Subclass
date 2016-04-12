public class Dog{
  
  public enum Gender{MALE, FEMALE};
  
  private Gender gender;
  private String color;
  private String name;
  
  public Dog(Gender gender, String color, String name){
    this.gender = gender;
    this.color= color;
    this.name = name;
  }
  
  public Gender getGender(){return this.gender;}
  public String getcolor(){return this.color;}
  public String getName(){return this.name;}
  
  public void intro(){
    System.out.println("Hello my name is " + this.getName());
  }
}