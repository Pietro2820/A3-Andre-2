package org.A3.PastaCursos;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Explicacao {
    private String nome;
    private String caminhoDoArquivo;

    public Explicacao(String nome, String caminhoDoArquivo) {
        this.nome = nome;
        this.caminhoDoArquivo = caminhoDoArquivo;
    }

    public String getNome() {
        return nome;
    }

    public String getCaminhoDoArquivo() {
        return caminhoDoArquivo;
    }

    public void abrirArquivo() {
        File arquivo = new File(this.caminhoDoArquivo);

        if (!arquivo.exists()) {
            System.out.println("Arquivo não encontrado: " + caminhoDoArquivo);
            return;
        }

        if (!Desktop.isDesktopSupported()) {
            System.out.println("Abertura de arquivos não é suportada neste sistema.");
            return;
        }

        try {
            Desktop.getDesktop().open(arquivo);
            System.out.println("Arquivo aberto com sucesso.");
        } catch (IOException e) {
            if (caminhoDoArquivo.toLowerCase().endsWith(".txt")) {
                try {
                    Runtime.getRuntime().exec("notepad.exe \"" + caminhoDoArquivo + "\"");
                    System.out.println("Arquivo aberto com o Bloco de Notas.");
                } catch (IOException ex) {
                    System.out.println("Erro ao abrir com o Notepad: " + ex.getMessage());
                }
            } else {
                System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
            }
        }
    }
}
