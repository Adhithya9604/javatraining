public class AverageCalculator {
       public static void main(String[] args) {
    
        int intNum1 = (2);
         int intNum2 = (4);
         int intNum3 = (6);

        float floatNum1 = (6.5f);
         float floatNum2 = (8.5f);
         float floatNum3 = (10.5f);

         int sumOfIntegers = intNum1 + intNum2 + intNum3;
          double averageOfIntegers = (double) sumOfIntegers / 3;
          double sumOfFloats = floatNum1 + floatNum2 + floatNum3;
          double averageOfFloats = sumOfFloats / 3;

            System.out.println("Average of three integers: " + averageOfIntegers);
           System.out.println("Average of three floats: " + averageOfFloats);
    }
}