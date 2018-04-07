/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sucos;

import Complementos.Complementos;
import Coquetel.Coquetel;
//import copos.Copo200;

/**
 *
 * @author mmol
 */
public class Abacaxi extends Complementos {
   
    public Abacaxi(Coquetel coquetel) {
       //super(coquetel);
       this.coquetel = coquetel;
    }
    

    @Override
    public String getDescrição() {
        return this.coquetel.getDescrição() + "suco de abacaxi \n"; 
    }

    @Override
    public double getPreco() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return coquetel.getPreco() + 5.00 ;
    }

    

}
