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
public class Record extends Artist{
    private String label; 
    private String genre;
    private int contractExpires;
    
    public Record(String name, int year, String hit){
        
        super(name, year, hit);
    }
    
    /**We override the abstract method from the abstract superclass
     @retur the Record label in which the artist signed for.*/
    @Override
    public String getLabel(){
        return label;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public int getContractExpDate() {
        return contractExpires;
    }
    
    public void setLabel(String label){
        this.label = label;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setExpDate(int date){
        this.contractExpires = date; 
    }    
    
    @Override
    public String toString(){
        String str = "\nRecord Label: " + label +" \nGenre: " + genre +
                     "\nContract Expiration Date: " + contractExpires; 
        return (super.toString() + str);
    }
}
