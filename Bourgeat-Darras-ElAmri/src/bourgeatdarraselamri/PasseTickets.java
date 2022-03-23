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
public class PasseTickets extends Passe{
    int nombreTickets;
    
    public  PasseTickets (){
        this.nombreTickets= 0;
    }
    
    public  PasseTickets(int m_tickets){
    nombreTickets=m_tickets;
} 
    
     public int gets(){
        return nombreTickets;
    }  
    
    public void sets(int m_ticket){
        nombreTickets=m_ticket;
    } 
    
    @Override
    public String toString() {
        return new String("Le nombre de tickets virtuels non utilisés est égal à"
                +  nombreTickets ); 
    }
    
    
    
    @Override
    public void charger() { 
        int nombre = nombreTickets; 
         System.out.println("il vous reste  " + nombre + "tickets");
         System.out.println("combien de tickets voulez vous :");
        Scanner s = new Scanner(System.in);
        System.out.println("donner la longueur "); 
        int   longeur = s.nextInt(); 
        nombreTickets = nombreTickets + longeur; 
        System.out.println("il vous reste amintenant  " + nombreTickets + "tickets");
    }
}