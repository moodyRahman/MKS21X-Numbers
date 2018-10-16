public class RationalNumber extends RealNumber{
  private int num;
  private int den;
  RationalNumber(double input){
    super(input);
  }

  RationalNumber(int num, int den){
    super((num+0.0)/(den+0.0));
    this.num = num;
    this.den = den;
  }

  public int getNum(){
    return num;
  }
  public int getDen(){
    return den;
  }

}
