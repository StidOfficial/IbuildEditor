/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ibuildeditor;

import JFrame.IbuildEditorIndex;
import ibuildeditor.configurationfile;
import ibuildeditor.langfile;
import logssystem.logstime;


/**
 *
 * @author Stid
 */
public class IbuildEditor {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        logstime time = new logstime();
        configurationfile conf = new configurationfile();
        langfile lang = new langfile();
        System.out.println("[" + conf.getProperty("logs") + time + "] " + conf.getProperty("msgwelcome") + " " + conf.getProperty("name") + " " + conf.getProperty("version"));
        System.out.println("[" + conf.getProperty("logs") + time + "] " + "Lancement de l'interface graphique...");
        IbuildEditorIndex index = new IbuildEditorIndex();
        index.setVisible(true);
        System.out.println("[" + conf.getProperty("logs") + time + "] " + "Interface graphique [OK]");
    }
    
}
