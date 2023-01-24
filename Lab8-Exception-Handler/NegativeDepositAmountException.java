/**
This exception reports a negative deposit request from a bank account.
*/
public class NegativeDepositAmountException extends RuntimeException{
    public NegativeDepositAmountException(){
    }

    public NegativeDepositAmountException(String message){
        super(message);
    }
}