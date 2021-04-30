/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eins;

import java.util.Comparator;

/**
 *
 * @author Matthäus
 */
public class NamenComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;
        return p1.getName().compareTo(p2.getName());
    }
    
}
