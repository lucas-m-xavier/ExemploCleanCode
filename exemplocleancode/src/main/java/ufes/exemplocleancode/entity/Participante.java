/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.exemplocleancode.entity;

/**
 *
 * @author Lucas
 */
public class Participante {
    private String nome;
    
    private String email;
    
    private int pontuacao;

    public Participante(String nome, String email, int pontuacao) {
        this.nome = nome;
        this.email = email;
        this.pontuacao = pontuacao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
