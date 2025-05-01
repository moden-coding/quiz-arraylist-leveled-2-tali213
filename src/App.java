/**
    * You are going to write code to store a list of participant names for a 
    * local event. You will create an ArrayList for Strings, then accept user 
    * input to add names to that ArrayList. There will be additional modifications 
    * you can make:

    * B Level:
    * Accept input from users and add names to the ArrayList.

    * B+ Level:
    * Accept names from users and stop accepting input when the user enters "end". 
    * After this, the full list of names should be printed, one name per line.

    * A- Level:
    * Complete B and B+. Additionally, do not allow duplicates. If the user enters a 
    * name that already exists, tell them that the name has already been entered, but 
    * continue accepting new names.

    * A+ Level:
    * Complete B and B+. Modify A- so that when a duplicate name is entered, the user 
    * is asked whether they want to delete the existing name. If they enter "yes", the 
    * name is removed from the list. If they type anything else, the duplicate name is 
    * ignored, and no change is made to the list.
*/
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        

            while(true){
                System.out.println("Name:");
                String name = scanner.nextLine();
                if(name.equals("end")){
                    System.out.println(names);
                    break;
                }
                if(names.contains(name)){
                    System.out.println("Name already exists. Delete existing name?");
                    String answer = scanner.nextLine();
                    if(answer.equals("yes")){
                        int index = names.indexOf(name);
                        names.remove(index);
                    } 
                }
                else{
                    names.add(name);  
                }
               
            }
           
            
       
    }
}
