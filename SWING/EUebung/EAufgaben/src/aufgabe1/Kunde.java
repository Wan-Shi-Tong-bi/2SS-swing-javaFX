/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1;

/**
 *
 * @author jgruenauer17
 */
public class Kunde {
    private String vorname;
    private String nachname;
    private int plz;
    private String strasse;
    private String wohnort;
    private int hausnr;
    private int kundennummer;
    private static int laufnr = 0;

    public Kunde(String vorname, String nachname, int plz, String strasse, String wohnort, int hausnr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.plz = plz;
        this.strasse = strasse;
        this.wohnort = wohnort;
        this.hausnr = hausnr;
        this.kundennummer = laufnr;
        laufnr++;
    }
    
    public Kunde(String vorname, String nachname, int plz, String strasse, String wohnort, int hausnr, int kundennummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.plz = plz;
        this.strasse = strasse;
        this.wohnort = wohnort;
        this.hausnr = hausnr;
        this.kundennummer = kundennummer;
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

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public int getHausnr() {
        return hausnr;
    }

    public void setHausnr(int hausnr) {
        this.hausnr = hausnr;
    }

    public int getKundennummer() {
        return kundennummer;
    }

    @Override
    public String toString() {
        return "Kunde{" + "vorname=" + vorname + ", nachname=" + nachname + ", plz=" + plz + ", strasse=" + strasse + ", wohnort=" + wohnort + ", hausnr=" + hausnr + ", kundennummer=" + kundennummer + '}';
    }
    
    
    
}
