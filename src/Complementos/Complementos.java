/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complementos;

import Coquetel.Coquetel;

/**
 *
 * @author mmol
 */
public abstract class Complementos extends Coquetel {
    public Coquetel coquetel;

    /**
     *
     * @return
     */
    @Override
    public abstract String getDescrição();  
   

    /**
     *
     * @return
     */
    @Override
    public abstract double getPreco();
    
}
