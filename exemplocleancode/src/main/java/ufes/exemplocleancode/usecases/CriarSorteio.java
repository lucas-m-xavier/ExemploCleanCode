/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.exemplocleancode.usecases;

import ufes.exemplocleancode.entity.Sorteio;

/**
 *
 * @author Lucas
 */
public class CriarSorteio {
    
    public Sorteio criarSorteio(int pontuacaoMinima) {
        return new Sorteio(pontuacaoMinima);
    }
    
}
