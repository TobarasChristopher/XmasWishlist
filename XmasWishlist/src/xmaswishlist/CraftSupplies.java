/**
 *
 * CraftSupplies.java
 * 09/01/2022
 * @author Christopher Tobaras, x20324573
 * 
 */
package xmaswishlist;

public class CraftSupplies extends Gifts {
    private String type, brand, colour;

    public CraftSupplies(){
        super();
        type = "";
        brand = "";
        colour = "";
    }

    public CraftSupplies(int itemNo, String description, int price, String URL, String type, String brand, String colour){
        super(itemNo, description, price, URL);
        this.type = type;
        this.brand = brand;
        this.colour = colour;
    }

    @Override
    public String printDetails(){
        return "Type: "+type+"\nBrand: "+brand+"\nColour: "+colour+"\n"+super.printDetails();
    }

}
