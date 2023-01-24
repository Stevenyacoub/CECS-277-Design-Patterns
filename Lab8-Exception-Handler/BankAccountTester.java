/**
   A class to test the BankAccount class.
*/
public class BankAccountTester{
   public static void main(String[] args) throws NegativeBalanceException
   {
      BankAccount harrysChecking = new BankAccount();
      
      try{
         harrysChecking.deposit(300);
         System.out.println("success");
      
         System.out.println("Expected: success");

         harrysChecking.withdraw(100);
         System.out.println("success");
         System.out.println("Expected: success");

         harrysChecking.deposit(-100);
         System.out.println("success");
         System.out.println("exception");
      
         System.out.println("Expected: exception");

         harrysChecking.withdraw(300);
         System.out.println("success");
      }catch (IllegalArgumentException e){
         e.getMessage();
      }
      System.out.println("Expected: exception");
   }
}
