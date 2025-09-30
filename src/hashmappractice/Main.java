package hashmappractice;

import java.util.HashMap;
import java.util.Scanner;
class Main{
public static void main(String[] args) {
    HashMap<String,Double> map = new HashMap<>();
    System.out.println("Hello. This is Hashmap Collection Training!");
    System.out.println("What do you want to do today?");
    Scanner scan = new Scanner(System.in);
    while(true){
        System.out.println("1. Add a new fruit to the list\n2. Know the price of the fruit");
        String userOperation = scan.nextLine().toLowerCase();
        if(userOperation.equals("1")){
            while(true){
                System.out.println("Okay, buddy. Enter the name of the fruit you would like to add.");
                String chosenFruit = scan.nextLine();
                if(chosenFruit.equalsIgnoreCase("exit")) {
                    break;
                }
                if(!chosenFruit.isEmpty()){
                    while(true) {
                        System.out.println("Okay,mister twister, you got it. Now choose the price of your fruit. Enter value in 50.00 20.00 21.00 0.50 format.");
                        double userPrice;
                        try{
                            userPrice = Double.parseDouble(scan.nextLine());
                            map.put(chosenFruit,userPrice);
                            System.out.println("Nice work.Buddy");
                            break;
                        }
                        catch(NumberFormatException e) {
                            System.out.println("Nope...enter a valid price value, pal");
                        }
                        break;
                    }
                }
                else if(chosenFruit.equals("exit") || chosenFruit.equals("Exit")){
                    break;
                }
                else{
                    System.out.println("Please be a good guy and enter only valid names.");
                }

            }

        }
        else if(userOperation.equals("2")){
            while(true){
                System.out.println("Please choose a fruit to know it's price:");
                String userChoice = scan.nextLine().toLowerCase();
                if(map.containsKey(userChoice)){
                    System.out.println("The price of " + userChoice + " is " + map.get(userChoice));
                }
                else if(userChoice.equals("exit")){
                    System.out.println("Hoping that you will come back soon. Bye!");
                    break;
                }
                else{
                    System.out.println("There is no fruit with name: " + userChoice);
                }
            }

        }
        else if(userOperation.equals("exit") || userOperation.equals("Exit")){
            break;
        }
        else{
            System.out.println("Please choose only correct operations.");
        }
    }


    scan.close();
    }

}