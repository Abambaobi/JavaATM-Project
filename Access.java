public class Access extends Bank {
   public Access (){}


   public Access (String cardNumber, String cvv, String exp, String accBal, String pin){
       super(cardNumber, cvv,  accBal, pin);
   }
}

