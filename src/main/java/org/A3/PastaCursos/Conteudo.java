package org.A3.PastaCursos;

import java.util.ArrayList;

public class Conteudo {
    private String nome;
    private ArrayList<String> explicacoes;
    private Explicacao explicacao;

    // Construtor completo
    public Conteudo(String nome, ArrayList<String> explicacoes, Explicacao explicacao) {
        this.nome = nome;
        this.explicacoes = explicacoes;
        this.explicacao = explicacao;
    }

    // Construtor com nome (sem explicação ou texto)
    public Conteudo(String nome) {
        this.nome = nome;
        this.explicacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getExplicacoes() {
        return explicacoes;
    }

    public void setExplicacoes(ArrayList<String> explicacoes) {
        this.explicacoes = explicacoes;
    }

    public void adicionarExplicacao(String explicacao) {
        this.explicacoes.add(explicacao);
    }

    // Getter e setter para a explicação externa (arquivo .txt)
    public Explicacao getExplicacao() {
        return explicacao;
    }

    public void setExplicacao(Explicacao explicacao) {
        this.explicacao = explicacao;
    }

    public void mostrarExplicacaoArquivo() {
        if (explicacao != null) {
            System.out.println(explicacao.lerExplicacao());
        } else {
            System.out.println("Nenhuma explicação de arquivo associada.");
        }
    }
}
