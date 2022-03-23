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

    public  PasseZone (){
        this.numero= 0;
        
        Proprietaire= "la belle dame";
    }
    
    public  PasseZone(int m_a, double m_b, String m_c){
    numero=m_a;
    
    Proprietaire=m_c;
}
    
   
}
