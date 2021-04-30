/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eins;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matthäus
 */
public class CodeEinlseenAuslesen {
    public static void main(String[] args){
        LinkedList<Person> personen = new LinkedList<>();
//        personen.add(new Person("Hans", 12));
//        personen.add(new Person("Hubert", 23));
//        Auslesen(personen);
          personen = Einlesen2();
          for(Person p : personen){
              System.out.println(p);
          }
        
//        LinkedList<Person> personen = new LinkedList<>();
//        personen.add(new Person("Georg", 12));
//        personen.add(new Person("Hubertus", 23));
//        Auslesen2(personen);
    }
    
    public static void Auslesen(LinkedList<Person> personen){
        try {
            XMLEncoder xmle = new XMLEncoder(new FileOutputStream("Personen"));
            xmle.writeObject(personen);
            xmle.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CodeEinlseenAuslesen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static LinkedList<Person> Einlesen(){
        
        try {
            XMLDecoder xmld = new XMLDecoder(new FileInputStream("Personen"));
            LinkedList<Person> personen = (LinkedList<Person>) xmld.readObject();
            xmld.close();
            return personen;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CodeEinlseenAuslesen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void Auslesen2(LinkedList<Person> personen){
        
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Personen2"));
            oos.writeObject(personen);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CodeEinlseenAuslesen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CodeEinlseenAuslesen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static LinkedList<Person> Einlesen2(){
        
        
        try {
            ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("Personen2"));
            LinkedList<Person> p = (LinkedList<Person>) ooi.readObject();
            ooi.close();
            return p;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CodeEinlseenAuslesen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(CodeEinlseenAuslesen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
