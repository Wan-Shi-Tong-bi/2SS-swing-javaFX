/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe1_2;

import javax.swing.JOptionPane;

/**
 *
 * @author jgruenauer17
 */
public class Programm {
    public static void main(String[] args){
        String temp;
        do{
        temp = JOptionPane.showInputDialog(null, "Bitte eine Zahl eingeben (-1 Ende)", "Eingabe", JOptionPane.QUESTION_MESSAGE);
        if(!temp.equals("-1")){
        JOptionPane.showMessageDialog(null, temp, "Ihre Eingabe lautet", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            int x = JOptionPane.showConfirmDialog(null, "Wollen Sie wirklich beenden?", "Beenden?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(x == JOptionPane.CANCEL_OPTION){
                temp = "0";
            }
        }
        }while(!temp.equals("-1"));
    }
}
