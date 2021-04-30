/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AufgabeSignieren;

/**
 *
 * @author jgruenauer17
 */
public class Signatar {
    private String name;
    private String date;
    private String hashcode;

    public Signatar(String name, String date, String hashcode) {
        this.name = name;
        this.date = date;
        this.hashcode = hashcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }
    
    
    
}
