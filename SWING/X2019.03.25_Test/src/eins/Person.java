/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eins;

import java.io.Serializable;

/**
 *
 * @author Matthäus
 */
public class Person implements Serializable, Comparable<Object>{
    private String name;
    private int alter;

    public Person() {
    }

    
    
    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", alter=" + alter + '}';
    }

    @Override
    public int compareTo(Object o) {
        Person p1 = (Person) o;
        if(this.alter>p1.alter){
            return 1;
        }
        else if(this.alter<p1.alter){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    
}
