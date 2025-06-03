package org.A3.PastaCursos;

import java.util.ArrayList;

public class Material {
    private String nome;
    private ArrayList<Conteudo> conteudo = new ArrayList<Conteudo>();

    public Material(String nome, ArrayList<Conteudo> conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(ArrayList<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }
}
