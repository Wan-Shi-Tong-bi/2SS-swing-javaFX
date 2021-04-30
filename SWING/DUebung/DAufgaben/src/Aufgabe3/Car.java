/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Aufgabe3;

import java.io.Serializable;

/**
 *
 * @author jgruenauer17
 */
public class Car implements Serializable{
    private Color color;
    private Typ type;
    private int yearOfConstruction;
    private int km;

    public Car(Color color, Typ type, int yearOfConstruction, int km) {
        this.color = color;
        this.type = type;
        this.yearOfConstruction = yearOfConstruction;
        this.km = km;
    }

    public Car() {
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Typ getType() {
        return type;
    }

    public void setType(Typ type) {
        this.type = type;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Car{" + "" + color + ", " + type + ", " + yearOfConstruction + ", " + km + "km}";
    }
    
    
}
