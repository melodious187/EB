import java.util.Objects;
import java.util.Scanner;

public class GetAccountNames {
    private static String acctName;

    public static void main(String[] args) {
        askForAcct();
    }

    public static void askForAcct () {

        String acctName = "TEMP";
        boolean notEnd = false;
        Scanner accObj = new Scanner(System.in); //create a scanner object
        while (notEnd = !acctName.equals("END")){
            System.out.println("Please Enter Account Name, end with 'END':");
            acctName = accObj.nextLine(); //read user input
            System.out.println("Account name entered = " + acctName);
            System.out.println("boolean notEND = " + notEnd);
        }

        if (Objects.equals("END", acctName)){
            System.out.println("Ended");
        }
        else {
            System.out.println("Did not enter END");

        }

    }


}
