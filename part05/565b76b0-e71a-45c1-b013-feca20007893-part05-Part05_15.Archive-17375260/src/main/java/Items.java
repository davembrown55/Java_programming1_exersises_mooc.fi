/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davem
 */
public class Items {

    private String id;
    private String name;

    public Items(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return this.id + ": " + this.name;
    }

    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        if (!(compare instanceof Items)) {
            return false;
        }
        Items compareItem = (Items) compare;

        if (this.id.equals(compareItem.id) /*&& this.name.equals(compareItem.name)*/) {
            return true;
        } else {
            return false;
        }

    }
}
