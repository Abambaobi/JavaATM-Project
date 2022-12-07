public class Bank {

       protected String cardNumber;
       Protected String cvv;
       Protected String accBal;
       protected String pin;
       Bank(){

}

    public  Bank (String cardNumber, String cvv,  String accBal, String pin){
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.accBal = accBal;
        this.pin = pin;
    }
};
