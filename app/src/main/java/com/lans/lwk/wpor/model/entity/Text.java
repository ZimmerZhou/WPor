package com.lans.lwk.wpor.model.entity;

import java.io.Serializable;

/**
 * Created by Li on 2017/11/19.
 */

public class Text implements Serializable{
    public Text(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    private String name;
    private int ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
