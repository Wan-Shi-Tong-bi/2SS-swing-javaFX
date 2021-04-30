/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import sun.util.calendar.CalendarDate;

/**
 *
 * @author Matthäus
 */
public class Aktivitaet {
    private String name;
    private Priority priority;
    private Date datum;
    private String beschreibung;

    public Aktivitaet(String name) {
        this.name = name;
        priority = Priority.niedrig;
        datum = new Date();
        beschreibung = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public String toString() {
        return "" + name;
    }
    
    
}
