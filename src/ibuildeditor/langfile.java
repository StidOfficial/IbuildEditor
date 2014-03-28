/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ibuildeditor;

import java.util.*;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Stid
 */
public class langfile {
    
    Properties langFile;
    
    public langfile() {
        langFile = new java.util.Properties();
        JOptionPane e = new JOptionPane();
	try {
	  langFile.load(this.getClass().getClassLoader().
	  getResourceAsStream("imports-files/FR.lang"));
	}catch(Exception eta){
                e.showMessageDialog(null,"Fichier FR.lang introuvable !", "Fichier Introuvable", JOptionPane.ERROR_MESSAGE);
                System.out.println("[ERROR] " + eta);
                System.exit(0);
	}       
        
    }
    public String getProperty(String key) {
	String value = this.langFile.getProperty(key);
	return value;
    }  
}
