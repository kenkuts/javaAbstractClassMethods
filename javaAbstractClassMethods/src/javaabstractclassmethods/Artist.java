/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaabstractclassmethods;

/**
 *
 * @author Kenneth R. Kutschera
 * This application is a familiarization of abstract classes and methods. An
 * abstract class cannot be instantiated its only purpose is to be a superclass.
 */
public abstract class Artist {
    
    private String name;
    private int yearSigned;
    private String hitSong;
    
    public Artist(String name, int signed, String song){
        
        this.name = name;
        this.yearSigned = signed;
        this.hitSong = song;
    }
    
    public String toString(){
        String str = "\nName: " + name + "\nSigned: " + yearSigned +
                     "\nHit Song: " + hitSong;
        
        return str;
    }
    /**The getLabel is an abstract method which gets declared in the superclass
     but has no body. The use of an abstract method is so that the subclass will
     declare override and declare a body for the abstract method.
     @return the record label and genre and year the contract expires*/
    
    public abstract String getLabel();
    
}
