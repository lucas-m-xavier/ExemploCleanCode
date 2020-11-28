/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.exemplocleancode.main;

import ufes.exemplocleancode.entity.Participante;
import ufes.exemplocleancode.entity.Sorteio;
import ufes.exemplocleancode.usecases.CriarSorteio;

/**
 *
 * @author Lucas
 */
public class Main {
    Sorteio sorteio = new CriarSorteio().criarSorteio(4);
    
    /*
    int flag = 1;
    for(Participante p : vencedores) {
      System.out.println(flag++);
      System.out.println("Nome: " + p.getName());
      System.out.println("Email: " + p.getEmail());
      System.out.println("Score: " + p.getScore());
      System.out.println("=======================");
    }
    */
}
