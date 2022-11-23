import java.util.ArrayList;
import java.util.Scanner;

public class GT extends Bank{

    public  GT(){};
    public GT ( String cardNumber , String cvv,  String accBal, String pin){
        super(cardNumber, cvv, accBal, pin);
    }

    Scanner customerInput = new Scanner(System.in);

    public void question( Object efe, Object David){
        System.out.println("What is your name");
        String user = customerInput.nextLine().toLowerCase();

        System.out.println("What do you want to do ? " +
                            "1. Withdraw"  +
                             "2. Transfer " +
                             "3. Check balance");
        String question =customerInput.nextLine().toLowerCase();
        if (question.equals("withdraw") || question.equals("transfer") || question.equals("check balance")){cardNumber(efe, David, user, question);}
        else {System.out.println("invalid entry"); question(efe, David);}


}

    public void cardNumber(Object ef, Object Da, String user, String question){
        GT efe = (GT)ef;
        GT  david = (GT)Da;
        System.out.println("Enter your card number");
        String cardNumber = customerInput.nextLine();
       switch(user){
           case "efe": if(cardNumber.compareTo(efe.cardNumber)==0){cvv(ef, Da, user, question);}
                       else {System.out.println("invalid entry"); cardNumber(ef,Da, user, question);};

           case "david": if(cardNumber.compareTo(david.cardNumber)==0){cvv(ef, Da,user, question);}
                         else {System.out.println("invalid entry"); cardNumber(ef,Da, user, question);};
       }

    };
    public void cvv(Object ef, Object Da, String user, String question){
        GT efe = (GT)ef;
        GT  david = (GT)Da;
        System.out.println("Enter your cvv");
        String cvv = customerInput.nextLine();
        switch(user){
            case "efe": if(cvv.compareTo(efe.cvv)==0){pin(ef, Da, user, question);}
                        else {System.out.println("invalid entry"); cvv(ef,Da, user, question);};

            case "david": if(cardNumber.compareTo(david.cvv)==0){pin(ef, Da, user, question);}
                          else {System.out.println("invalid entry"); cvv(ef, Da, user, question);};
        }

    }

    public void pin (Object ef, Object Da, String user, String question) {

        GT efe = (GT) ef;
        GT david = (GT) Da;
        System.out.println("Enter your card pin");
        String pin = customerInput.nextLine();
        switch (user) {
            case "efe":
                if (pin.compareTo(efe.pin) == 0) {
                    if (question.equals("withdraw")) {
                        withdraw(ef, Da, user);}
                    else if (question.equals("bal")) {
                        bal(ef, Da, user);}
                    else if (question.equals("transfer")) {
                        transfer();}

                    } else {
                        System.out.println("invalid entry");
                        pin(ef, Da, user, question);

                    }


                    case "david":
                        if (pin.compareTo(david.pin) == 0) {
                            if (question.equals("withdraw")) {
                                withdraw(ef, Da, user);}
                                else if (question.equals("bal")) {
                                bal(ef, Da, user);}
                                else if (question.equals("transfer")) {
                                transfer();
                            }
                        } else {
                            System.out.println("invalid entry");
                            pin(ef, Da, user, question);
                        }
                }};







    public void withdraw (Object ef, Object Da, String user) {
        GT efe = (GT) ef;
        GT david = (GT) Da;
        System.out.println("Enter amount you want to withdraw");
        String amount = customerInput.nextLine();
        switch (user){
            case "efe": efe.accBal = String.valueOf((Integer.parseInt(efe.accBal) - Integer.parseInt(amount)));
                System.out.println("Done");
                System.out.println("Your new accound balance is" + " " + efe.accBal);
                break;
            case "david": david.accBal = String.valueOf(Integer.parseInt(david.accBal) - Integer.parseInt(amount));
                System.out.println("Done");
                System.out.println("Your new accound balance is"+ " " + david.accBal);
                break;
        }

    }


    public void transfer () {

    }

    public void bal (Object ef, Object Da, String user) {

        GT efe = (GT) ef;
        GT david = (GT) Da;
        String amount = customerInput.nextLine();
        switch (user){
            case "efe": System.out.println(efe.accBal);
                break;
            case "david": System.out.println(david.accBal);
                break;
        }

    }


};


