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
       int scanchoix;
           int nombreOperations =0;

       Scanner s = new Scanner(System.in);
       //System.out.println("donner le chiffre :  ");  
       PasseZone a = new PasseZone(); 
       
     /*  try {
       double longeur = s.nextDouble();  
       if(longeur <0)
           throw new exepctionda(); 
       if (longeur>44)
            throw new exepctionda("daam men tu est trop haut là"); 
       
       }catch (exepctionda e) {
            System.out.println(e);
        } 
        
       */
            System.out.println("Bonjour, Voulez-vous créer un passeZone tapez 1 ou créer un passeTickets tapez 2 ");  
  scanchoix=s.nextInt();
       
          
       if( scanchoix==1)
       {
          PasseZone PZone;
          //PZone.charger();
             nombreOperations ++;

       }
               
       if (scanchoix==2)
       {
           PasseTickets Ptickets;
         //  Ptickets.charger();
                 nombreOperations ++;
       }
     
       System.out.println("Voulez-vous effectuer la validation d'opération, tapez 1 ou consultez l'historique de validation des passages, tapez 2  ");  
       
       
       scanchoix=s.nextInt();
       
              

       if( scanchoix==1)
       {
           
       }
               
       if (scanchoix==2)
       {
          //Historique(nombreOperations);
          
          
       }
       
        
    } 
    
  
    
    
}
