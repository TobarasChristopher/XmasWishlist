/**
 *
 * BoardGame.java
 * 09/01/2022
 * @author Christopher Tobaras, x20324573
 * 
 */

package xmaswishlist;


public class BoardGame extends Gifts {
    private String name, publisher;

    public BoardGame(){
        super();
        name = "";
        publisher = "";
    }

    public BoardGame(int itemNo, String description, int price, String URL, String name, String publisher){
        super(itemNo, description, price, URL);
        this.name = name;
        this.publisher = publisher;
    }

    @Override
    public String printDetails(){
        return "Name: "+name+"\nPublisher: "+publisher+"\n"+super.printDetails();
    }
}
