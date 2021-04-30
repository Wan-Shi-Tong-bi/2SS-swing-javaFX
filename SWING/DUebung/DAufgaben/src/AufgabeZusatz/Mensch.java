/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AufgabeZusatz;

import java.io.Serializable;




/**
 *
 * @author jgruenauer17
 */
public class Mensch implements Serializable{
    private int id;
    private String vorname;

    public Mensch(int id, String vorname) {
        this.id = id;
        this.vorname = vorname;
    }

    public Mensch() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public String toString() {
        return id + ", " + vorname;
    }
    
    
}
