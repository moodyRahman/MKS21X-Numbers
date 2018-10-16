public class RealNumber{

  private double number;

  public RealNumber(double input){
    number = input;
  }

  public double getValue(){
    return number;
  }

  public double truncate(){
    return 4.56;
  }

  public boolean greaterThan(RealNumber inp){
    return this.number > inp.getValue();
  }
  public static boolean greaterThan(RealNumber inp1, RealNumber inp2){
    return inp1.getValue() > inp2.getValue();
  }
}
