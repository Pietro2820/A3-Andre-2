package org.A3.PastaCursos;
import java.util.Scanner;
import java.io.File;

public class Explicacao {
    private String nome;
    private File arquivo;

    public Explicacao(String nome, String caminhoDoArquivo) {
        this.nome = nome;
        this.arquivo = new File(caminhoDoArquivo);
    }

    public String getNome() {
        return nome;
    }

    public File getArquivo() {
        return arquivo;
    }

    public String lerExplicacao() {
        StringBuilder conteudo = new StringBuilder();
        try (Scanner entrada = new Scanner(arquivo)) {
            while (entrada.hasNextLine()) {
                conteudo.append(entrada.nextLine()).append("\n");
            }
        } catch (Exception e) {
            return "Erro ao ler explicação: " + e.getMessage();
        }
        return conteudo.toString();
    }

    @Override
    public String toString() {
        return "Explicação: " + nome + "\nArquivo: " + arquivo.getPath();
    }
}
