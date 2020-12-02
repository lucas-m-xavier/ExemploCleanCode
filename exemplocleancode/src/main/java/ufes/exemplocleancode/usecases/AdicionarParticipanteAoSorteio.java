/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.exemplocleancode.usecases;

import ufes.exemplocleancode.DAO_Memory.Banco;
import ufes.exemplocleancode.entity.Participante;
import ufes.exemplocleancode.entity.Sorteio;

/**
 *
 * @author Lucas
 */
public class AdicionarParticipanteAoSorteio {
    
    private final Sorteio sorteio;
    
    private final Banco banco;

    public AdicionarParticipanteAoSorteio(Sorteio sorteio, Banco estrutura) {
        this.sorteio = sorteio;
        this.banco = estrutura;
    }
    
    public void addParticipantesAoSorteio() {
        for(Participante p : banco.getAllParticipantes()) {
            Participante participante = new Participante(p.getNome(), p.getEmail(), p.getPontuacao());
            sorteio.addParticipante(participante);
        }
    }
    
}
