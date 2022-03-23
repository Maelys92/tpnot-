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
public class exepctionda  extends Exception {
    public exepctionda(){
        super("Attention : la valeur n'est pas bonne ");
    } 
    
    public exepctionda(String questcequisepasse) {
        super(questcequisepasse);
        
    } 
}
