/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;

import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matthäus
 */
public class encoder {
    
    public static void main(String[] args){
        String[] arr = new String[]{"hu","ha","he"};
        try {
            XMLEncoder xmle = new XMLEncoder(new FileOutputStream(new File("huhu.xml")));
            xmle.writeObject(arr);
            xmle.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(encoder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
