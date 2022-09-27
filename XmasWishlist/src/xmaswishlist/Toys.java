/**
 *
 * Toys.java
 * 09/01/2022
 * @author Christopher Tobaras, x20324573
 * 
 */
package xmaswishlist;

public class Toys extends Gifts{
    private String name, type;

    public Toys(){
        super();
        name = "";
        type = "";
    }

    public Toys(int itemNo, String description, int price, String URL, String name, String type){
        super(itemNo, description, price, URL);
        this.name = name;
        this.type = type;
    }

    @Override
    public String printDetails(){
        return "Name: "+name+"\nType: "+type+"\n"+super.printDetails();
    }

}
