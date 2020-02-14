/*
*Name:  Jonathan Knopp Anchieta
*Assignment:  Assignment 3
*Program: PROG24178 Object Oriented Programming 2 Java
*Date:  Feb 14, 2020.
*   
*Description:
*Main program the itemListApp, request the user for input and display the 
*results
*
*/
package knoppanc;


import java.util.*;

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
        Scanner input = new Scanner(System.in);
        //crate an ArrayList of the class item list
        //ItemListApp a = new ItemListApp();
        ItemList products = new ItemList();
        //add elements in the shapes ArrayList
//        products.add(new Item(Size.M, 1000));
//        products.add(new Item(Size.L, 6.7));
//        products.add(new Item(Size.L, 98.97));
//        products.findItem(products.get(0).itemSize);
//        System.out.println(products.findItem(products.get(1).itemSize));

//        for (int i = 0; i < products.lenght(); i++) {
//            System.out.println(products.get(i));
//        }
        // Size userSize=getSizeInput("fff");
        String userChoice = "";
        boolean isValid = false;
        boolean keepRunning = false;
        Size value = null;
        double prodCost = 0.00001;

        do {
            Item i=new Item();
            i = getSizeInput("Enter Size Code: (XS|S|M|L|XL): ",i);
//            while (value == null) {
//                System.out.println("Error! There is no such size!");
//                value = getSizeInput("Enter Size Code: (XS|S|M|L|XL): ");
//            }

            isValid = false;
           // do {
                i = getCostInput("Enter Item's Base Cost: ",i);
//                if (prodCost > 0) {
//                    isValid = true;//leave the while
//                } else if (prodCost <= 0) {
//                    System.out.println("Error: Item price must be positive.");
//                    //prodCost = getCostInput("Enter Item's Base Cost: ");
//                    isValid = false;//iterates
//                }
//            } while (!isValid);

            //Add data to the array list
           
            
             //products.add(new Item(value, prodCost));
            products.add(i);

            System.out.print("Would you like to"
                    + " enter another item (Y/N): ");
            //userChoice = input.next();
            boolean exiti=true;
            while (exiti) {
                
                userChoice = input.next();
            
            if (userChoice.equalsIgnoreCase("n")) {
                //iterates again
                keepRunning = false;
                exiti=false;
            } else if(userChoice.equalsIgnoreCase("y")){
                keepRunning = true;
                exiti=false;
            }else {
                //program stops
                System.out.println("\nPlease type Y or N. Try again: ");
                
            }
            }
        } while (keepRunning);
        
        //Prints the result
        products.toString();

    }//main ends
    
    /**
     * GetSizeInput method so the user can input the Size of the product
     * and the switch statement treats the information for the enum type.
     * @param msg
     * @return 
     */
    public static Item getSizeInput(String msg,Item i) {
        Scanner input = new Scanner(System.in);
        String userIn;
        Size userSize = null;

       System.out.print(msg);
        boolean exit=true;
        while(exit){
            
        userIn = input.nextLine();
        userIn = userIn.toUpperCase();
        
        switch (userIn) {
            case "XS":
                userSize = Size.XS;
                exit=false;
                break;
            case "S":
                userSize = Size.S;
                exit=false;
                break;
            case "M":
                userSize = Size.M;
                exit=false;
                break;
            case "L":
                userSize = Size.L;
                exit=false;
                break;
            case "XL":
                userSize = Size.XL;
                exit=false;
                break;
            default:
//                System.out.println("Error! There is no such size!");
//                userIn = input.nextLine();
                //userSize = null;
                System.out.println("Thats not an Option");
          }
        
        }
        i.itemSize=userSize;
        return i;
    }
    
    /**
     * getCostInput method to retrieve the cost of the item
     * @param msg
     * @return 
     */
    public static Item getCostInput(String msg,Item i){
        double cost=0;
        
        boolean exit=true;
        Scanner input = new Scanner(System.in);
        do{
        try{
            System.out.print(msg);
            cost = input.nextDouble();
            i.setBaseCost(cost);
            exit=false;
        }catch (InputMismatchException e) {
           
            System.out.println("Erro:Enter a double");
            //cost = getCostInput(msg);
        }catch(IllegalArgumentException e){
            
             System.out.println(e.getMessage());
        }
        input.nextLine();
        }while(exit);
        
        return i;
    }
    
}
