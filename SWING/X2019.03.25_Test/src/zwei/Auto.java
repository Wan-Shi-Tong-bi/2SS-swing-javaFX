/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zwei;

import java.util.LinkedList;

/**
 *
 * @author Matthäus
 */
public class Auto {
    private Typ typ;
    private String staerke;
    private int jahr;

    public Auto(Typ typ, String staerke, int jahr) {
        this.typ = typ;
        this.staerke = staerke;
        this.jahr = jahr;
    }

    public Auto() {
    }

    public Typ getTyp() {
        return typ;
    }

    public void setTyp(Typ typ) {
        this.typ = typ;
    }

    public String getStaerke() {
        return staerke;
    }

    public void setStaerke(String staerke) {
        this.staerke = staerke;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    @Override
    public String toString() {
        return "" + typ + ", " + staerke + ", " + jahr;
    }
    
    
}
