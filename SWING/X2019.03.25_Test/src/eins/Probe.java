/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eins;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matthäus
 */
public class Probe {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a="";
        
        try {
            a = br.readLine();
            a += br.readLine();
            
        } catch (IOException ex) {
            Logger.getLogger(Probe.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(""+a);
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Probe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            bw.write(a);
        } catch (IOException ex) {
            Logger.getLogger(Probe.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Probe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
