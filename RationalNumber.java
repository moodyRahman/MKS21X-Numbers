public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    this.numerator = nume;
    this.denominator = deno;

    if(deno == 0){
      this.numerator = 0;
      this.denominator = nume;
    }
  }

  public double getValue(){
    return (double)numerator/ denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return this.numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return this.denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber output = new RationalNumber(this.denominator, this.numerator);
   return output;
 }
 /**
 *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
 */
 public boolean equals(RationalNumber other){
   return (this.numerator == other.getNumerator()) && (this.denominator == other.getDenominator());
 }


 /**
 *@return the value expressed as "3/4" or "8/3"
 */
 public String toString(){
   return this.numerator + "/" + this.denominator;
 }

 /**Calculate the GCD of two integers.
 *@param a the first integers
 *@param b the second integer
 *@return the value of the GCD
 */
 private static int gcd(int a, int b){
   /*use euclids method or a better one*/
   http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
   if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
 }

 private static int lcm(int a, int b){
   return (a*b) / (gcd(a, b));
 }
 /**
*Divide the numerator and denominator by the GCD
*This must be used to maintain that all RationalNumbers are
*reduced after construction.
*/
private void reduce(){
  int common = gcd(this.numerator, this.denominator);
  this.numerator = this.numerator/common;
  this.denominator = this.denominator/common;
}

/******************Operations Return a new RationalNumber!!!!****************/
/**
*Return a new RationalNumber that is the product of this and the other
*/
public RationalNumber multiply(RationalNumber other){
  return new RationalNumber(this.numerator * other.getNumerator(),
                            this.denominator * other.getDenominator());
}

/**
*Return a new RationalNumber that is the this divided by the other
*/
public RationalNumber divide(RationalNumber other){
  return new RationalNumber(this.numerator * other.getDenominator(),
                            this.denominator * other.getNumerator());
}

/**
*Return a new RationalNumber that is the sum of this and the other
*/
public RationalNumber add(RationalNumber other){
  int low = lcm(this.numerator, other.getNumerator());
  int factthis = low / this.denominator;
  int factother = low / other.getDenominator();
  RationalNumber expandthis = new RationalNumber(this.numerator*factthis, this.denominator*factthis);
  RationalNumber expandother = new RationalNumber(other.getNumerator()*factother, other.getDenominator()*factother);
  return new RationalNumber(expandthis.getNumerator() + expandother.getNumerator(), expandthis.getDenominator());
}
/**
*Return a new RationalNumber that this minus the other
*/
public RationalNumber subtract(RationalNumber other){
  return null;
}
}
