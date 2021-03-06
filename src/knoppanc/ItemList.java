/*
*Name:  Jonathan Knopp Anchieta
*Assignment:  Assignment 3
*Program: PROG24178 Object Oriented Programming 2 Java
*Date:  Feb 14, 2020.
*   
*Description:
*Array list class called itemList, if creates the methods to manipulate the
* array list and perform checks.
*
*/
package knoppanc;

import java.util.*;

/**
 *
 * @author Jonathan
 */
public class ItemList {
    //crate an ArrayList
    ArrayList<Item> itemList = new ArrayList<>();
    
    /**
     * Public method to return the index of the item
     * @param index
     * @return 
     */
    public Item get(int index){
        
        return itemList.get(index);
    }
    
    /**
     * Add method to add an item to the list, it also checks using the findItem
     * method if there is already an item with the same side inse the list.
     * If there is it adds the base cost of the new item with the existing
     * item.
     * @param item 
     */
    public void add(Item item){
        //if find item equals -1 means there already and item with that size
        //therefore add the base cost to the existing item base cost.
      int index = findItem(item.itemSize);
        if (findItem(item.itemSize) >=0) {
            //Sums the basecost of the item with the new basecost for the
            //same size
            double aux = item.getBaseCost()+ itemList.get(index).getBaseCost();
            itemList.get(index).setBaseCost(aux);
        }else{
        itemList.add(item);
        }
    }
    
    /**
     * The findItem() method receives a specific Size enum constant and returns 
     * the index of the Item element in the itemList that has the same 
     * size (remember there will never be more than one match). 
     * 
     * If there is no element in the itemList matching the size, then -1 is 
     * returned. 
     * This method will be used by add() method to determine if a new Item will 
     * be added to the ArrayList (no matching sizes were found) or if that size 
     * exists, then the existing item's base cost will be updated by adding the 
     * new baseCost to it
     * @param size
     * @return 
     */
    public int findItem(Size size){
        //scans the list and returns the index of the item that has the same 
        //size
        for (int i = 0; i < itemList.size(); i++) {
            //code to check with the item is in the array list

            if (itemList.get(i).itemSize.equals(size)) {
                //System.out.println(itemList.get(i).itemSize.equals(size));
                return i;
            }
        }
        
        //return -1 if no size was found
        return -1;
    }
    
    /**
     * Method that returns the size of the array list.
     * @return 
     */
    public int lenght(){
        return itemList.size();
    }
    
    /**
     * toString method that was overrided to print the result of the array
     * @return 
     */
    @Override
    public String toString() {
        System.out.println("=================================\n"
                         + "Item Name   Base Cost   Item Cost   \n"
                         + "=================================");
        for (Item item : itemList) {
            System.out.println(item);
        }
        return String.format("\n");
    }
    
    
}
