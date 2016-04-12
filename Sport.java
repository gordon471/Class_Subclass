public class Sport extends Dog{
  
  public enum Type{RUNNING, SWIMMING, SITTING, JUMPING};
  public enum Point{GOOD,FAIR,BAD};
  
  private Type type;
  private Point point;
  
  public Sport(Gender gender, String color, String name, Type type, Point point){
    super(gender,color, name);
    this.type = type;
    this.point = point;}
}
  