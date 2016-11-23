/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaabstractclassmethods;

/**
 *
 * @author Kenneth R. Kutschera
 */
public class JavaAbstractClassMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("This program familiarizes us with how abstract calsses and methods work.");
        
        Record newArtist = new Record("Kaskade", 2001, "One Heart");
        
        newArtist.setLabel("Ultra");
        newArtist.setGenre("House Music");
        newArtist.setExpDate(2016);
        
        System.out.println(newArtist);
        
        
    }
    
}
