/*
*Name:  Jonathan Knopp Anchieta
*Assignment:  Assignment 3
*Program: PROG24178 Object Oriented Programming 2 Java
*Date:  Feb 14, 2020.
*   
*Description:
*Enumeration class of the program, it creates the avabailable sizes and set
*the cost coefficient of them. 
*
*/
package knoppanc;

/**
 *
 * @author Jonathan
 */
public enum Size {
    //Initiate Enum constants using the private constructor
    XS("Extra Small", 0.8),
    S("Small", 0.9),
    M("Medium", 1.0),
    L("Large", 1.1),
    XL("Extra Large", 1.2);

    // data members for this Enum
    private String sizeName;
    private double costCoefficient;

    //the constructor of the Enum must be private
    private Size(String sizeName, double costCoefficient) {
        this.sizeName = sizeName;
        this.costCoefficient = costCoefficient;
    }

    /**
     * Accessor for getting the size name.
     *
     * @return the number of a card
     */
    public String getSizeName() {
        return sizeName;
    }

    /**
     * Accessor for getting the cost coefficient of the size.
     *
     * @return the long name of a card
     */
    public double getCostCoefficient() {
        return costCoefficient;
    }

}
