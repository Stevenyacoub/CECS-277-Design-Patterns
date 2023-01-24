/**
This exception reports an illegal withdrawal request from a bank account.
*/
public class IllegalWithdrawalException extends RuntimeException{
    public IllegalWithdrawalException(){
    }

    public IllegalWithdrawalException(String message){
        super(message);
    }
    
}
