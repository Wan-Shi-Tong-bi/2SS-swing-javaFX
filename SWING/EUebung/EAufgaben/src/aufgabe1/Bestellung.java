/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1;

/**
 *
 * @author Matthäus
 */
public class Bestellung {
    private int artnr;
    private String artname;
    private int preis;
    private int anzahl;

    public Bestellung(int artnr, String artname, int preis, int anzahl) {
        this.artnr = artnr;
        this.artname = artname;
        this.preis = preis;
        this.anzahl = anzahl;
    }

    public int getArtnr() {
        return artnr;
    }

    public void setArtnr(int artnr) {
        this.artnr = artnr;
    }

    public String getArtname() {
        return artname;
    }

    public void setArtname(String artname) {
        this.artname = artname;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    @Override
    public String toString() {
        return artnr + ", "+ artname + ": " + preis + "€, " + anzahl + "Stk.";
    }
    
    
}
