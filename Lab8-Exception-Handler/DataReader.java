import java.util.Scanner;
import java.util.InputMismatchException;

public class DataReader{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      int chances = 0;
      boolean done = false;
      double sum = 0;
      
      while (!done){
         double value = 0;                  
         try{  
            value = in.nextDouble(); //Input the double value
            sum += value; //Accumulate
            
         }catch (InputMismatchException e){   
            System.out.println("Input error. Try again."); 
            in.next(); //Read the bad input
            chances++; 
            if(chances == 2){
                done = true;
                in.close();
            }
         }
      }
      System.out.println("The total is " + sum);  //Display the sum
      
   }
}
