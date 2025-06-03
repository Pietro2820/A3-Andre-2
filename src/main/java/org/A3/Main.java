package org.A3;

import org.A3.Limpador;
import org.A3.PastaCursos.Conteudo;
import org.A3.PastaCursos.Curso;
import org.A3.PastaCursos.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Limpador limpador = new Limpador();
        ArrayList<Curso> curso = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        // Português =====================================================================
        ArrayList<Material> materiaisPortugues = new ArrayList<>();
        materiaisPortugues.add(new Material(" Interpretação de textos", new ArrayList<>(Arrays.asList(
                new Conteudo(" Compreensão e inferência"),
                new Conteudo(" Intenção comunicativa"),
                new Conteudo(" Análise de discurso"),
                new Conteudo(" Elementos linguísticos e extralinguísticos")
        ))));
        materiaisPortugues.add(new Material(" Gêneros textuais", new ArrayList<>(Arrays.asList(
                new Conteudo(" Artigo de opinião"),
                new Conteudo(" Charge"),
                new Conteudo(" Tira"),
                new Conteudo(" Propaganda"),
                new Conteudo(" Poema"),
                new Conteudo(" Notícia"),
                new Conteudo(" Crônica"),
                new Conteudo(" Resenha")
        ))));
        materiaisPortugues.add(new Material(" Norma culta vs. linguagem coloquial", new ArrayList<>(Arrays.asList(
                new Conteudo(" Diferenças estruturais"),
                new Conteudo(" Adequação ao contexto"),
                new Conteudo(" Variedades linguísticas")
        ))));
        materiaisPortugues.add(new Material(" Gramática ", new ArrayList<>(Arrays.asList(
                new Conteudo(" Ortografia"),
                new Conteudo(" Pontuação"),
                new Conteudo(" Crase"),
                new Conteudo(" Concordância verbal e nominal"),
                new Conteudo(" Regência verbal e nominal"),
                new Conteudo(" Colocação pronominal"),
                new Conteudo(" Pronomes, verbos, substantivos, adjetivos, advérbios")
        ))));

        // Redação ==================================

        ArrayList<Material> materiaisRedacao = new ArrayList<>();
        materiaisRedacao.add(new Material(" Estrutura da Redação Dissertativo-Argumentativa", new ArrayList<>(Arrays.asList(
                new Conteudo(" Introdução: apresentação do tema e tese"),
                new Conteudo(" Desenvolvimento: argumentos e contra-argumentos"),
                new Conteudo(" Conclusão: proposta de intervenção")
        ))));
        materiaisRedacao.add(new Material(" Competências Avaliadas no ENEM", new ArrayList<>(Arrays.asList(
                new Conteudo(" Domínio da norma padrão da língua escrita"),
                new Conteudo(" Compreensão da proposta e aplicação dos conhecimentos"),
                new Conteudo(" Seleção e organização de argumentos"),
                new Conteudo(" Coesão e coerência textual"),
                new Conteudo(" Proposta de intervenção respeitando os direitos humanos")
        ))));
        materiaisRedacao.add(new Material(" Tipos de Argumentação", new ArrayList<>(Arrays.asList(
                new Conteudo(" Argumento de autoridade"),
                new Conteudo(" Argumento por exemplificação"),
                new Conteudo(" Argumento lógico"),
                new Conteudo(" Comparação e analogia")
        ))));
        materiaisRedacao.add(new Material(" Proposta de Intervenção", new ArrayList<>(Arrays.asList(
                new Conteudo(" Ação"),
                new Conteudo(" Agente"),
                new Conteudo(" Modo de execução"),
                new Conteudo(" Efeito esperado"),
                new Conteudo(" Detalhamento e viabilidade")
        ))));
        materiaisRedacao.add(new Material(" Dicas para Redação Nota 1000", new ArrayList<>(Arrays.asList(
                new Conteudo(" Planejamento antes de escrever"),
                new Conteudo(" Evitar clichês e frases prontas"),
                new Conteudo(" Cuidar da progressão textual"),
                new Conteudo(" Revisar o texto final")
        ))));


        // Matemática ===============================================================
        ArrayList<Material> materiaisMatematica = new ArrayList<>();
        materiaisMatematica.add(new Material(" Aritmética", new ArrayList<>(Arrays.asList(
                new Conteudo(" operações"),
                new Conteudo(" porcentagem"),
                new Conteudo(" razão"),
                new Conteudo(" proporção")
        ))));
        materiaisMatematica.add(new Material(" Álgebra", new ArrayList<>(Arrays.asList(
                new Conteudo(" equações do 1º"),
                new Conteudo(" equações do 2º"),
                new Conteudo(" inequações"),
                new Conteudo(" sistemas lineares")
        ))));
        materiaisMatematica.add(new Material(" Funções", new ArrayList<>(Arrays.asList(
                new Conteudo(" afim"),
                new Conteudo(" quadrática"),
                new Conteudo(" exponencial"),
                new Conteudo(" logarítmica")
        ))));
        materiaisMatematica.add(new Material(" Geometria", new ArrayList<>(Arrays.asList(
                new Conteudo(" plana"),
                new Conteudo(" espacial"),
                new Conteudo(" analítica")
        ))));
        materiaisMatematica.add(new Material(" Trigonometria básica", new ArrayList<>(Arrays.asList(
                new Conteudo(" oi"),
                new Conteudo(" oi")
        ))));
        materiaisMatematica.add(new Material(" Estatística e probabilidade", new ArrayList<>(Arrays.asList(
                new Conteudo(" média"),
                new Conteudo(" mediana"),
                new Conteudo(" moda"),
                new Conteudo(" gráficos"),
                new Conteudo(" tabelas")
        ))));
        materiaisMatematica.add(new Material(" Problemas envolvendo raciocínio lógico e interpretação", new ArrayList<>(Arrays.asList(
                new Conteudo(" oi"),
                new Conteudo(" oi")
        ))));

        // Humanas =====================================================================================

        ArrayList<Material> materiaisHumanas = new ArrayList<>();
        materiaisHumanas.add(new Material(" História do Brasil", new ArrayList<>(Arrays.asList(
                new Conteudo(" Brasil Colônia"),
                new Conteudo(" Brasil Império"),
                new Conteudo(" Brasil República")
        ))));
        materiaisHumanas.add(new Material(" Ditadura Militar e Redemocratização", new ArrayList<>(Arrays.asList(
                new Conteudo(" Golpe de 1964"),
                new Conteudo(" Regime Militar"),
                new Conteudo(" Processo de redemocratização")
        ))));
        materiaisHumanas.add(new Material(" História Geral", new ArrayList<>(Arrays.asList(
                new Conteudo(" Antiguidade"),
                new Conteudo(" Idade Média"),
                new Conteudo(" Idade Moderna"),
                new Conteudo(" Idade Contemporânea")
        ))));
        materiaisHumanas.add(new Material(" Revoluções", new ArrayList<>(Arrays.asList(
                new Conteudo(" Revoluções Industriais"),
                new Conteudo(" Revoluções Francesa, Russa e outras")
        ))));
        materiaisHumanas.add(new Material(" Movimentos Sociais", new ArrayList<>(Arrays.asList(
                new Conteudo(" Movimentos por direitos civis"),
                new Conteudo(" Movimentos operários"),
                new Conteudo(" Movimentos estudantis"),
                new Conteudo(" Movimentos sociais no Brasil")
        ))));

        // Ciências da Natureza ========================================================================

        ArrayList<Material> materiaisCienciasNatureza = new ArrayList<>();
        materiaisCienciasNatureza.add(new Material(" Física", new ArrayList<>(Arrays.asList(
                new Conteudo(" Cinemática"),
                new Conteudo(" Dinâmica"),
                new Conteudo(" Trabalho e Energia"),
                new Conteudo(" Termodinâmica"),
                new Conteudo(" Óptica"),
                new Conteudo(" Eletricidade e Magnetismo")
        ))));
        materiaisCienciasNatureza.add(new Material(" Química", new ArrayList<>(Arrays.asList(
                new Conteudo(" Química Geral: Átomos, Moléculas e Reações"),
                new Conteudo(" Química Orgânica: Funções e Reações Orgânicas"),
                new Conteudo(" Química Inorgânica: Ligações e Propriedades"),
                new Conteudo(" Soluções e Equilíbrios Químicos"),
                new Conteudo(" Termoquímica"),
                new Conteudo(" Radioatividade")
        ))));
        materiaisCienciasNatureza.add(new Material(" Biologia", new ArrayList<>(Arrays.asList(
                new Conteudo(" Citologia e Histologia"),
                new Conteudo(" Genética"),
                new Conteudo(" Evolução"),
                new Conteudo(" Ecologia e Meio Ambiente"),
                new Conteudo(" Fisiologia Humana"),
                new Conteudo(" Botânica e Zoologia")
        ))));

        // Adicionando na Classe
        curso.add(new Curso(" Português", materiaisPortugues));
        curso.add(new Curso(" Redação", materiaisRedacao));
        curso.add(new Curso(" Matemática", materiaisMatematica));
        curso.add(new Curso(" Humanas", materiaisHumanas));
        curso.add(new Curso(" Ciências da Natureza", materiaisCienciasNatureza));

        System.out.println("Escolha sua opção: \n");
        int i = 1;
        for (Curso curso1 : curso) {
            System.out.println(i + " - " + curso1.getNome());
            i++;
        }

        int opcaoCurso = entrada.nextInt();
        entrada.nextLine(); // consumir quebra de linha
        Limpador.limpador();

        // Listar materiais do curso selecionado
        Curso cursoSelecionado = curso.get(opcaoCurso - 1);
        System.out.println("======= MATERIAIS DE " + cursoSelecionado.getNome().toUpperCase() + " =======\n");

        int j = 1;
        for (Material material : cursoSelecionado.getMaterias()) {
            System.out.println(j + " - " + material.getNome());
            j++;
        }

        System.out.print("\nDigite o número do material para ver os conteúdos: ");
        int opcaoMaterial = entrada.nextInt();
        entrada.nextLine(); // consumir quebra de linha
        Limpador.limpador();

        // Listar conteúdos do material escolhido
        Material materialSelecionado = cursoSelecionado.getMaterias().get(opcaoMaterial - 1);
        System.out.println("======= CONTEÚDOS DE " + materialSelecionado.getNome().toUpperCase() + " =======\n");

        int k = 1;
        for (Conteudo conteudo : materialSelecionado.getConteudo()) {
            System.out.println(k + " - " + conteudo.getNome());
            k++;
        }
    }
}
