/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe3;

/**
 *
 * @author jgruenauer17
 */
public class Patient {
    private int id;
    private String vorname;
    private String nachname;
    private int alter;

    public Patient(int id, String vorname, String nachname, int alter) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name:" + vorname + " " + nachname + ", " + alter;
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

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
    
    
    
    
}
