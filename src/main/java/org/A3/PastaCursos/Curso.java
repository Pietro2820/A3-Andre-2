package org.A3.PastaCursos;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Material> materials = new ArrayList<>();

    public Curso(String nome, ArrayList<Material> materials) {
        this.nome = nome;
        this.materials = materials;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Material> getMaterias() {
        return materials;
    }
    public void setMaterias(ArrayList<Material> materials) {
        this.materials = materials;
    }
}
