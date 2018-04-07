/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copos;

import Coquetel.Coquetel;

/**
 *
 * @author mmol
 */
public class Copo500 extends Coquetel {
    public String getDescricao(){
        return descricao + "de 500ml \n";
    }

    /**
     *
     * @return
     */
    @Override
    public double getPreco() {
        return 5.00;
    }
    
}
