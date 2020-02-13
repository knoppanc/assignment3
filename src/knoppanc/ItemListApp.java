/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knoppanc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class ItemListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crate an ArrayList
        ArrayList<Item> products = new ArrayList<>();
        //add elements in the shapes ArrayList
//        products.add(new Item(Size.M, 1000));
//        products.add(new Item(Size.L, 6.7));
//        
//        System.out.println(products.size());
        
        Scanner input = new Scanner(System.in);
        String sizeIn = "";
        double costIn = 0.0;
        boolean isValid = false;
        String userChoice = "";
        
        do {
            //loop for input
            System.out.println("Enter Size Code: (XS|S|M|L|XL): ");
            sizeIn = input.nextLine().toUpperCase();
            
            System.out.println("Enter Item's Base Cost: ");
            costIn = Double.parseDouble(input.nextLine());

            //add product
//        products.add(new Item(sizeIn, costIn));
            products.add(new Item(Size.L, costIn));
            
            //Check if the user wants to add another product
            System.out.println("Would you like to enter another item (Y/N): ");
            userChoice = input.next();
            while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n")) {
                System.out.println("\nPlease type Y or N. Try again.\n");
                userChoice = input.next();
            }
            if (userChoice.equalsIgnoreCase("n")) {
                isValid = false;
            } else {//iterates again
                isValid = true;
            }
         
        } while (isValid);
        
    }
    
    
}
