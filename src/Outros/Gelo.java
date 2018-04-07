/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outros;

import Complementos.Complementos;
import Coquetel.Coquetel;

/**
 *
 * @author mmol
 */
public class Gelo extends Complementos {
    
    public Gelo(Coquetel coquetel) {
        this.coquetel = coquetel;        
//super(coquetel);
    }
    @Override
    public String getDescrição() {
        return this.coquetel.getDescrição() +"Gelo \n";// + super.getDescricao();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPreco() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return this.coquetel.getPreco() + 1.00;//  + super.getPreco();
    }
    
}
