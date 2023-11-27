public class Calculator{
  public static void main(String[] args){
    int value1 = 500;
    int value2 = 500;
    int sum;
    sum = sum(value1,value2);
    System.out.println(sum);
  }

  public static int sum(int firstValue, int secondValue){
    int sum = firstValue + secondValue;
    return sum;
  }



}