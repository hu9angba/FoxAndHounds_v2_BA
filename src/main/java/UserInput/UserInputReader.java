package UserInput;

import java.util.Scanner;

public class UserInputReader {

    Scanner sc = new Scanner(System.in);

    public String getInput() {
        return input;
    }

    public UserInputReader(){
        FirstName = null;
        input = null;
    }

    public static String FirstName;
    public String input;


    public void begin(){

        System.out.print("Whats your name?");
        FirstName = sc.nextLine();
        System.out.println("Hi "+FirstName+", Would you like to start a new game [y]  or continue an old one [c] ?");
        input = sc.nextLine();
    }
}
