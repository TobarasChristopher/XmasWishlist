/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmaswishlist;
import java.io.Serializable;

/**
 *
 * Gifts.java
 * 08/01/2022
 * @author Christopher Tobaras, x20324573
 * 
 */
public abstract class Gifts implements Serializable{
    protected String description,URL;
    protected int itemNo, price;
    
    public Gifts(){
        description = "";
        URL = "";
        itemNo = 0;
        price = 0;
    }
    
    public Gifts(int itemNo, String description, int price, String URL){
        this.itemNo = itemNo;
        this.description = description;
        this.price = price;
        this.URL = URL;
    }
    

    
    public int getItemNo(){
        return itemNo;
    }
    
    public String printDetails(){
        return "Description: "+description+"\nItem Number: "+itemNo+"\nPrice: "+price+" euro\nURL: "+URL;
    }
    
}
