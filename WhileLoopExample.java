import java.util.Scanner;
class WhileLoopExample {

    public static void main(String[] args) {

      Scanner scanner=new Scanner (System.in);
      System.out.printf("Enter a number");
    int multiplyBy= scanner.nextInt();

    int i = 1;
    while(i <=10){
      
            System.out.printf("%d * %d = %d \n", i,multiplyBy,i *multiplyBy);
            i++;
         
         }
   
    }
         
   }

    



