/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.exemplocleancode.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Lucas
 */
public class Sorteio {
    private List<Participante> participantes = new ArrayList<Participante>();
    
    private int pontuacaoMinima;

    public Sorteio(int PontuacaoMinima) {
        this.pontuacaoMinima = PontuacaoMinima;
    }
    
    public void addParticipante(Participante part) {
        if(part.getPontuacao() >= pontuacaoMinima) {
            participantes.add(part);
        }   else {
            throw new RuntimeException("Participante não possui um pontuação maior ou igual a minima!");
        }
    }
    
    public Participante retornaParticipanteAleatorio() {
        Random random = new Random();
        Participante part = participantes.get(random.nextInt(participantes.size()));
        participantes.remove(part);
        return part;
    }

    public int getPontuacaoMinima() {
        return pontuacaoMinima;
    }

    public void setPontuacaoMinima(int pontuacaoMinima) {
        this.pontuacaoMinima = pontuacaoMinima;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}
