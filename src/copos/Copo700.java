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
public class Copo700 extends Coquetel {
    public String getDescricao(){
        return descricao  + "de 700ml \n";
    }

    /**
     *
     * @return
     */
    @Override
    public double getPreco() {
        return 7.00;
    }
    
}