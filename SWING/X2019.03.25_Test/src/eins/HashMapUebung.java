/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Matthäus
 */
public class HashMapUebung {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap();
        hm.put(20, "Hans");
       hm.put(22, "Berta");
       hm.put(21, "Alber");
       hm.put(2023, "Caeser");
       
       
       for(Map.Entry m: hm.entrySet()){
           System.out.println(""+ m.getKey() +" "+ m.getValue());
       }
       
       ArrayList<Person> al = new ArrayList();
       
       al.add(new Person("Hans", 12));
       al.add(new Person("Brut", 123));
       al.add(new Person("Bram", 8));
       al.add(new Person("Brum", 8));
       al.add(new Person("Brem", 8));
       al.add(new Person("Auto", 12));
       Collections.sort(al, new NamenComparator());
       Collections.sort(al);
       System.out.println(""+al);
       Iterator<Person> it = al.iterator();
       
       while(it.hasNext()){
           System.out.println(""+it.next());
       }
       
    }
    
    public static void anfang(){
        
    }
}
