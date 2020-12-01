/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.exemplocleancode.usecases;

import ufes.exemplocleancode.DAO_Memory.Vetor;
import ufes.exemplocleancode.entity.Participante;
import ufes.exemplocleancode.entity.Sorteio;

/**
 *
 * @author Lucas
 */
public class AdicionarParticipanteAoSorteio {
    
    private final Sorteio sorteio;
    
    private final Vetor vetor;

    public AdicionarParticipanteAoSorteio(Sorteio sorteio, Vetor vetor) {
        this.sorteio = sorteio;
        this.vetor = vetor;
    }
    
    public void addParticipantesAoSorteio() {
        for(Participante p : vetor.getAllParticipantes()) {
            Participante participante = new Participante(p.getEmail(), p.getNome(), p.getPontuacao());
            sorteio.addParticipante(participante);
        }
    }
    
}
