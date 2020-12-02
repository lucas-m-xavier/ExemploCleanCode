/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.exemplocleancode.main;

import java.util.List;
import ufes.exemplocleancode.DAO_Memory.Banco;
import ufes.exemplocleancode.DAO_Memory.Oracle;
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
    
        Banco banco = new Oracle();
        banco.insertParticipante(new Participante("Valdomiro", "valdim@gmail.com", 8));
        banco.insertParticipante(new Participante("Clovis", "clovis@gmail.com", 2));
        banco.insertParticipante(new Participante("Amilton", "amilton@gmail.com", 9));
        banco.insertParticipante(new Participante("Rodrigo", "rodrigo@gmail.com", 22));
        banco.insertParticipante(new Participante("Sergio", "sergio@gmail.com", 6));
    
        AdicionarParticipanteAoSorteio addParticipanteAoSorteio = new AdicionarParticipanteAoSorteio(sorteio, banco);
        addParticipanteAoSorteio.addParticipantesAoSorteio();

        RetornarVencedoresDoSorteio rvds = new RetornarVencedoresDoSorteio(sorteio); 
        List<Participante> vencedores = rvds.retornarVencedoresDoSorteio(1);
        
        int flag = 1;
        
        for(Participante participante : vencedores) {
          System.out.println(flag++);
          System.out.println("Nome: " + participante.getNome());
          System.out.println("Email: " + participante.getEmail());
          System.out.println("Score: " + participante.getPontuacao());
          System.out.println("=======================");
        }
    }
}
