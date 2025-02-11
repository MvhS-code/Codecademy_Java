public class Calculator{
  public Calculator(){
  }
  //add input
  public int add(int a, int b){
    return a + b;
  }
  //subtract input
  public int subtract(int a, int b){
    return a - b;
  }
  //multiply input
  public int multiply(int a, int b){
    return a * b;
  }
  //divide input
  public int divide(int a, int b){
    return a / b;
  }

  //modulo input
  public int modulo(int a, int b){
    return a % b;
  }

  public static void main(String[] args){
  // make calculator
    Calculator myCalculator = new Calculator();
  //print calculators
    System.out.println("5 + 7 = " + myCalculator.add(5,7));
    System.out.println("45 - 11 = " + myCalculator.subtract(45,11));

  }
}

