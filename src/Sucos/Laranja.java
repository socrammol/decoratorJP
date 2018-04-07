/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sucos;

import Complementos.Complementos;
import Coquetel.Coquetel;

/**
 *
 * @author mmol
 */
public class Laranja extends Complementos {
    
    public Laranja(Coquetel coquetel) {
        //super(coquetel);
        this.coquetel = coquetel;
    }
    @Override
    public String getDescrição() {
        return coquetel.getDescrição() + "suco de laranja \n";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPreco() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return coquetel.getPreco() + 4.00;
    }
    
}
