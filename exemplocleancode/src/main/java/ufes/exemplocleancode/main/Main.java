/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.exemplocleancode.main;

import java.util.List;
import ufes.exemplocleancode.DAO_Memory.Vetor;
import ufes.exemplocleancode.entity.Participante;
import ufes.exemplocleancode.entity.Sorteio;
import ufes.exemplocleancode.usecases.AdicionarParticipanteAoSorteio;
import ufes.exemplocleancode.usecases.CriarSorteio;
import ufes.exemplocleancode.usecases.RetornarVencedoresDoSorteio;

/**
 *
 * @author Lucas
 */
public class Main {
    
    public static void main(String[] args) {
        Sorteio sorteio = new CriarSorteio().criarSorteio(4);
    
        Vetor vetorDeCandidatos = new Vetor();
        vetorDeCandidatos.insertParticipante(new Participante("Valdomiro", "valdim@gmail.com", 8));
        vetorDeCandidatos.insertParticipante(new Participante("Clovis", "clovis@gmail.com", 2));
        vetorDeCandidatos.insertParticipante(new Participante("Amilton", "amilton@gmail.com", 9));
        vetorDeCandidatos.insertParticipante(new Participante("Rodrigo", "rodrigo@gmail.com", 22));
        vetorDeCandidatos.insertParticipante(new Participante("Sergio", "sergio@gmail.com", 6));
    
        AdicionarParticipanteAoSorteio addpas = new AdicionarParticipanteAoSorteio(sorteio, vetorDeCandidatos);
        addpas.addParticipantesAoSorteio();

        RetornarVencedoresDoSorteio rvds = new RetornarVencedoresDoSorteio(sorteio); 
        List<Participante> vencedores = rvds.retornarVencedoresDoSorteio(1);
        
        int flag = 1;
        
        for(Participante p : vencedores) {
          System.out.println(flag++);
          System.out.println("Nome: " + p.getNome());
          System.out.println("Email: " + p.getEmail());
          System.out.println("Score: " + p.getPontuacao());
          System.out.println("=======================");
        }
    }
}
