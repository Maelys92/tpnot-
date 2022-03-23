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
public class PasseZone extends Passe {

    boolean zone_1 ;
    boolean zone_2;
    boolean act ;
    
    public  PasseZone (){
        this.numero= 0;
        
        Proprietaire= "la belle dame";
    }
    
    public  PasseZone(int m_a, double m_b, String m_c){
    numero=m_a;
    Proprietaire=m_c;
} 
    
    public boolean getzone1(){
        return zone_1;
    } 
    
    public void setzone1(boolean bou){
        zone_1=bou;
    } 
    
    public boolean getzone2(){
        return zone_2;
    } 
    
    public void setzone2(boolean bou){
        zone_2=bou;
    }
    
    public boolean getact(){
        return act;
    } 
    
    public void setact(boolean bou){
        act=bou;
    }
   
}
