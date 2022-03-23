/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bourgeatdarraselamri;
import java.util.*;
import java.util.Scanner;

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
   
    @Override
    public String toString() {
        return new String("la zone 1 est activé : "+zone_1 + " | "+ "la zone 2 est activé : " + zone_2 + " | "+ "le passe est activé : " + act   ); 
    } 
    
    @Override
    public void charger() { 
         String zones ;
         if ((zone_1==true)) 
             zones = "le pass marche dans la zone 1 "; 
         if ((zone_2==true)) 
             zones = "le pass marche dans la zone 2 ";  
         if ((zone_1==false)&&(zone_2==false)) 
             zones = "le pass n'est pas activee "; 
         else 
             zones = "daamm"; 
         
         System.out.println(zones);
         System.out.println("voulez vous activer votre pass taper 1 | changer de zone taper 2 | desactiver votre pass taper 3 | sortir taper 4");
        Scanner s = new Scanner(System.in); 
        int   longeur = s.nextInt();  
        if(longeur==2) {
            if ((zone_1==true)) {
                zone_1 = false ;
                zone_2 =true ;
            } 
            if ((zone_2==true)) {
                zone_1 = true ;
                zone_2 =false ;
            } 
            else {
                 System.out.println("ce n'est pas possible");
            }
                    
                
        }  
        if (longeur ==1){
            act= true;
        }  
        if (longeur ==3){
            act= false;
        }  
        else {
                             System.out.println("retour sur le menu principal");
        }
        
        if ((zone_1==true)) 
             zones = "le pass marche dans la zone 1 "; 
         if ((zone_2==true)) 
             zones = "le pass marche dans la zone 2 ";  
         if ((zone_1==false)&&(zone_2==false)) 
             zones = "le pass n'est pas activee "; 
         else 
             zones = "daamm"; 
         
         System.out.println(zones);
           
    }
}
