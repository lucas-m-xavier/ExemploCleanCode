/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.exemplocleancode.usecases;

import java.util.ArrayList;
import java.util.List;
import ufes.exemplocleancode.entity.Participante;
import ufes.exemplocleancode.entity.Sorteio;

/**
 *
 * @author Lucas
 */
public class RetornarVencedoresDoSorteio {
    public final Sorteio sorteio;

    public RetornarVencedoresDoSorteio(Sorteio sorteio) {
        this.sorteio = sorteio;
    }
    
    public List<Participante> retornarVencedoresDoSorteio(int numero) {
        List<Participante> vencedores = new ArrayList<Participante>();
        
        for(int cont = 0; cont < numero; cont++) {
            vencedores.add(sorteio.retornaParticipanteAleatorio());
        }
        
        return vencedores;
    }
}
