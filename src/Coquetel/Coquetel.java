/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coquetel;

/**
 *
 * @author mmol
 */
public abstract class Coquetel {
    private String descricao = "coquetel\n";
    public String getDescrição(){
        return descricao ;
    }
    public abstract double getPreco();
    
    
}
