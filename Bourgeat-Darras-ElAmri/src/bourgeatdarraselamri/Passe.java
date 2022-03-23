/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bourgeatdarraselamri; 
import java.util.*;


/**
 *
 * @author maely
 */
public abstract class Passe { 
    int numero;
    String Proprietaire ;
     ArrayList<Operation> liste;
     
    public int geta(){
        return numero;
    }  
    
    public void seta(int bou ){
        numero=bou;
    } 
    
    public ArrayList<Operation> getoperation(){
        return liste;
    }  
    
    public void setoperation(Operation bou ){
        
    } 
    
    public String getc(){
        return Proprietaire;
    } 
    
    public void setc(String bou){
        Proprietaire=bou;
    }  
    
    public abstract void charger();
    
    
    
}
