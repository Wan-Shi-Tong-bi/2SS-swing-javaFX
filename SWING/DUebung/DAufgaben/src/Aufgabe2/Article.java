/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe2;

/**
 *
 * @author jgruenauer17
 */
public class Article {
    private String hersteller;
    private String bezeichnung;

    public Article() {
    }

    public Article(String hersteller, String bezeichnung) {
        this.hersteller = hersteller;
        this.bezeichnung = bezeichnung;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    @Override
    public String toString() {
        return "" + hersteller + ", " + bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
    
    
}
