import java.util.Scanner;

public class AutomatedMachine {



    public static  void main(String[] args){
        Access paul = new Access("67978", "135",  "03/23", "1000",  "2086");
        Access james = new Access("45784", "254", "04/23", "2000",  "9085");

        GT gt = new GT();
        GT efe = new GT("674987", "654",  "5000",  "9876" );
        GT David = new GT("679507", "723",  "10000", "8709" );



        gt.question( efe, David);

        }

}

