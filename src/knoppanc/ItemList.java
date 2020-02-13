/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    public void add(Item item){
        //if find item equals -1 means there already and item with that size
        //therefore add the base cost to the existing item base cost.
        double aux = 0.0;
        if (findItem(item.itemSize) == -1) {
            //Sums the basecost of the item with the new basecost for the
            //same size
            aux = item.getBaseCost();
            //item.setBaseCost(aux);
        }
        itemList.add(item);
    }
    
    /**
     * The findItem() method receives a specific Size enum constant and returns 
     * the index of the Item element in the itemList that has the same 
     * size (remember there will never be more than one match). 
     * 
     * If there is no 
     * element in the itemList matching the size, then -1 is returned. 
     * 
     * This method will be used by add() method to determine if a new Item will 
     * be added to the ArrayList (no matching sizes were found) or if that size 
     * excists, then the existing item's base cost will be updated by adding the 
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
                return itemList.indexOf(i);
            }
        }
        
        //return -1 if no size was found
        return -1;
    }
    
    //findItem();
    
    public int lenght(){
        return itemList.size();
    }

    @Override
    public String toString() {
        return "ItemList{" + "itemList=" + itemList + '}';
    }
    
    
}
