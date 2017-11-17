package com.digitalstar.suraj.grocerylist.Model;

import java.util.Date;

/**
 * Created by odoo on 9/9/17.
 */

public class Grocery {

    private String name;
    private String quantity;
    private String itemAdded;
    private int id;

    public Grocery() {
    }

    public Grocery(String name, String quantity, String itemAdded, int id) {
        this.name = name;
        this.quantity = quantity;
        this.itemAdded = itemAdded;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getItemAdded() {
        return itemAdded;
    }

    public void setItemAdded(String itemAdded) {
        this.itemAdded = itemAdded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
