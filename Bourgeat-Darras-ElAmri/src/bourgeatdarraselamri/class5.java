/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bourgeatdarraselamri;

/**
 *
 * @author maely
 */
public class class5 {
    String s;
    String date;
    boolean ne;
    
    
   public  class5(){
       s="vide";
       date="10/10/10";
       ne = true;
   }
    
   
   public class5(String m_s, String m_date, boolean m_ne){
       s=m_s;
       date=m_date;
       ne=m_ne;
   } 
   
   
   public String gets(){
        return s;
    }  
    
    public void sets(String bou ){
        s=bou;
    } 
    
    public String getdate(){
        return date;
    }  
    
    public void setb(String bou ){
        date=bou;
    } 
    
    public boolean getne(){
        return ne;
    } 
    
    public void setc(boolean bou){
        ne=bou;
    }  
   
   
}
