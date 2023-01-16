package sg.edu.nus.iss;

import java.io.Console;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String dirPath = "\\data2";
        String fileName = "";

        File newDirectory = new File(dirPath);
        if (newDirectory.exists()){

            System.out.println("Directory already exits");
             
        } else {
            newDirectory.mkdir();
        }

        System.out.println("welcome to my shopping cart");

        List<String> cartItems = new ArrayList<String>();

        Console con = System.console();
        String input = "";

        while(!input.equals("quit")) {
            input = con.readLine("What do you want to perfom? (Type 'quit' to exit program)") ;

            switch(input){

                case "help":
                
                    break;
                case "list":
                    if (cartItems.size()> 0){
                        for(String item: cartItems){
                            System.out.println(item);
                        } else {
                            displayMessage("Your cart is empty");
                        }
                    }
                    break;
                case "users":
                    break;
                default:
            
            }
        }

        if (input.startsWith("add")){

            input = input.replace (',', ' ');
            
            String strValue = "";
            Scanner scanner = new Scanner(input.substring(4));

            while(scanner.hasNext()){
                strValue  = scanner.next();
            }
        }

        public static void displayMessage(String message) {

            System.out.println(message);
        }
        
    
}
