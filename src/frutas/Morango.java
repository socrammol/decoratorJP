/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frutas;

import Complementos.Complementos;
import Coquetel.Coquetel;


/**
 *
 * @author mmol
 */
public class Morango extends Complementos {

    public Morango(Coquetel coquetel) {
        //super(coquetel);
        this.coquetel = coquetel;
    }

    @Override
    public String getDescrição() {
        return this.coquetel.getDescrição() + "morango \n";// + super.getDescricao();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPreco() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return this.coquetel.getPreco() + 1.50;// + super.getPreco();
    }
    

  
    
}
