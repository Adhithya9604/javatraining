class MethodOverloading{
    public static void main(String[] args){

     int a = 10;
     int b = 20;
 
     System.out.printf("Result %s", area(10,20));}

     public static double area(int r){
         System.out.println("Calculating result for circle");
          return 3.14*r*r;
     }
 
      public static float area(int a, int b){
         System.out.println("Calculating result for rectangle");
         return a*b;
      }

      public static String area(String a){
         System.out.println("Calculating result for String");
          return a;
      }



}