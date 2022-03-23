/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bourgeatdarraselamri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author maely
 */
public class class4 {
    PasseZone essaie;
    
   
    public static void main(String[] args) {
        // TODO code application logic here 
       int bouger = 23;
       Scanner s = new Scanner(System.in);
       //System.out.println("donner le chiffre :  ");  
       PasseZone a = new PasseZone(); 
       
       try {
       double longeur = s.nextDouble();  
       if(longeur <0)
           throw new exepctionda(); 
       if (longeur>44)
            throw new exepctionda("daam men tu est trop haut là"); 
       
       }catch (exepctionda e) {
            System.out.println(e);
        } 
        
       
        
    } 
    
  
    
    
}
