public class RationalNumber extends RealNumber{
  RationalNumber(double input){
    super(input);
  }

  RationalNumber(int num, int den){
    super((num+0.0)/(den+0.0));
  }

}
