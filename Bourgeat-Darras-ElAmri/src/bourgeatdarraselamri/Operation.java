/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bourgeatdarraselamri;
import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author maely
 */
public class Operation {
    String lieu;
    DateTimeFormatter date;
    DateTimeFormatter tempsnow;
    
    
   public  Operation(){
       lieu="zone 1";
       date=DateTimeFormatter.ofPattern("yyyy/MM/dd");
       tempsnow = DateTimeFormatter.ofPattern("HH:mm:ss");
   }
    
   
   public Operation(String m_s){
       lieu=m_s;
       date=DateTimeFormatter.ofPattern("yyyy/MM/dd");
       tempsnow=DateTimeFormatter.ofPattern("HH:mm:ss");
   } 
   
   
   public String gets(){
        return lieu;
    }  
    
    public void sets(String bou ){
        lieu=bou;
    } 
    
    public DateTimeFormatter getdate(){
        return date;
    }  
    
    public void setb(DateTimeFormatter bou ){
        date=bou;
    } 
    
    public DateTimeFormatter gettempsnow(){
        return tempsnow;
    } 
    
    public void settempsnow(DateTimeFormatter bou){
        tempsnow=bou;
    }  
   
    @Override
    public String toString() {
        return new String(date + " "+ tempsnow + " | " + lieu  ); 
    }
   
}
