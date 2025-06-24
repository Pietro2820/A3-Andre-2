package org.A3;

import org.A3.PastaCursos.Conteudo;
import org.A3.PastaCursos.Curso;
import org.A3.PastaCursos.Explicacao;
import org.A3.PastaCursos.Material;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Apostilha {
    private List<Curso> cursos;

    public Apostilha() {

    }
    public void abri() {
        while (true) {
            ArrayList<Curso> curso = new ArrayList<>();
            Scanner entrada = new Scanner(System.in);

            // Português =====================================================================
            ArrayList<Material> materiaisPortugues = new ArrayList<>();
            materiaisPortugues.add(new Material("Interpretação de Textos", new ArrayList<>(Arrays.asList(
                    new Conteudo("Compreensão e Inferência", new ArrayList<>(),
                            new Explicacao("Compreensão e Inferência", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\adequacao ao contexto.txt")),
                    new Conteudo("Intenção Comunicativa", new ArrayList<>(),
                            new Explicacao("Intenção Comunicativa", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\intencao comunicativa.txt")),
                    new Conteudo("Análise de Discurso", new ArrayList<>(),
                            new Explicacao("Análise de Discurso", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\analise de discurso.txt")),
                    new Conteudo("Elementos Linguísticos e Extralinguísticos", new ArrayList<>(),
                            new Explicacao("Elementos Linguísticos e Extralinguísticos", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\elementos linguisticos e extralinguisticos.txt"))
            ))));

            materiaisPortugues.add(new Material("Gêneros Textuais", new ArrayList<>(Arrays.asList(
                    new Conteudo("Artigo de Opinião", new ArrayList<>(),
                            new Explicacao("Artigo de Opinião", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\artigo de opiniao.txt")),
                    new Conteudo("Charge", new ArrayList<>(),
                            new Explicacao("Charge", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\charge.txt")),
                    new Conteudo("Tira", new ArrayList<>(),
                            new Explicacao("Tira", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\tira.txt")),
                    new Conteudo("Propaganda", new ArrayList<>(),
                            new Explicacao("Propaganda", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\propaganda.txt")),
                    new Conteudo("Poema", new ArrayList<>(),
                            new Explicacao("Poema", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\poema.txt")),
                    new Conteudo("Notícia", new ArrayList<>(),
                            new Explicacao("Notícia", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\noticia.txt")),
                    new Conteudo("Crônica", new ArrayList<>(),
                            new Explicacao("Crônica", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\cronica.txt")),
                    new Conteudo("Resenha", new ArrayList<>(),
                            new Explicacao("Resenha", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\resenha.txt"))
            ))));

            materiaisPortugues.add(new Material("Norma Culta vs. Linguagem Coloquial", new ArrayList<>(Arrays.asList(
                    new Conteudo("Diferenças Estruturais", new ArrayList<>(),
                            new Explicacao("Diferenças Estruturais", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\adequacao ao contexto.txt")),
                    new Conteudo("Adequação ao Contexto", new ArrayList<>(),
                            new Explicacao("Adequação ao Contexto", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\adequacao ao contexto.txt")),
                    new Conteudo("Variedades Linguísticas", new ArrayList<>(),
                            new Explicacao("Variedades Linguísticas", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\variedades linguisticas.txt"))
            ))));

            materiaisPortugues.add(new Material("Gramática", new ArrayList<>(Arrays.asList(
                    new Conteudo("Ortografia", new ArrayList<>(),
                            new Explicacao("Ortografia", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\ortografia.txt")),
                    new Conteudo("Pontuação", new ArrayList<>(),
                            new Explicacao("Pontuação", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\pontuacao.txt")),
                    new Conteudo("Crase", new ArrayList<>(),
                            new Explicacao("Crase", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\crase.txt")),
                    new Conteudo("Concordância Verbal e Nominal", new ArrayList<>(),
                            new Explicacao("Concordância Verbal e Nominal", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\concordancia verbal e nominal.txt")),
                    new Conteudo("Regência Verbal e Nominal", new ArrayList<>(),
                            new Explicacao("Regência Verbal e Nominal", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\regencia verbal e nominal.txt")),
                    new Conteudo("Colocação Pronominal", new ArrayList<>(),
                            new Explicacao("Colocação Pronominal", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\colocacao pronominal.txt")),
                    new Conteudo("Pronomes, Verbos, Substantivos, Adjetivos, Advérbios", new ArrayList<>(),
                            new Explicacao("Pronomes, Verbos, Substantivos, Adjetivos, Advérbios", "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\pronomes verbos substantivos adjetivos adverbios.txt"))
            ))));

            // Redação ==================================

            ArrayList<Material> materiaisRedacao = new ArrayList<>();
            materiaisRedacao.add(new Material("Estrutura da Redação Dissertativo-Argumentativa", new ArrayList<>(Arrays.asList(
                    new Conteudo("Introdução: apresentação do tema e tese", new ArrayList<>(),
                            new Explicacao("introducao apresentacao do tema e tese", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\introducao apresentacao do tema e tese.txt")),
                    new Conteudo("Desenvolvimento: argumentos e contra-argumentos", new ArrayList<>(),
                            new Explicacao("desenvolvimento argumentos e contra-argumentos", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\desenvolvimento argumentos e contra-argumentos.txt")),
                    new Conteudo("Conclusão: proposta de intervenção", new ArrayList<>(),
                            new Explicacao("conclusao proposta de intervencao", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\conclusao proposta de intervencao.txt"))
            ))));

            materiaisRedacao.add(new Material("Competências Avaliadas no ENEM", new ArrayList<>(Arrays.asList(
                    new Conteudo("Domínio da norma padrão da língua escrita", new ArrayList<>(),
                            new Explicacao("dominio da norma padrao da lingua escrita", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\dominio da norma padrao da lingua escrita.txt")),
                    new Conteudo("Compreensão da proposta e aplicação dos conhecimentos", new ArrayList<>(),
                            new Explicacao("compreensao da proposta e aplicacao dos conhecimentos", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\compreensao da proposta e aplicacao dos conhecimentos.txt")),
                    new Conteudo("Seleção e organização de argumentos", new ArrayList<>(),
                            new Explicacao("selecao e organizacao de argumentos", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\selecao e organizacao de argumentos.txt")),
                    new Conteudo("Coesão e coerência textual", new ArrayList<>(),
                            new Explicacao("coesao e coerencia textual", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\coesao e coerencia textual.txt")),
                    new Conteudo("Proposta de intervenção respeitando os direitos humanos", new ArrayList<>(),
                            new Explicacao("proposta de intervencao respeitando os direitos humanos", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\proposta de intervencao respeitando os direitos humanos.txt"))
            ))));

            materiaisRedacao.add(new Material("Tipos de Argumentação", new ArrayList<>(Arrays.asList(
                    new Conteudo("Argumento de autoridade", new ArrayList<>(),
                            new Explicacao("argumento de autoridade", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\argumento de autoridade.txt")),
                    new Conteudo("Argumento por exemplificação", new ArrayList<>(),
                            new Explicacao("argumento por exemplificacao", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\argumento por exemplificacao.txt")),
                    new Conteudo("Argumento lógico", new ArrayList<>(),
                            new Explicacao("argumento logico", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\argumento logico.txt")),
                    new Conteudo("Comparação e analogia", new ArrayList<>(),
                            new Explicacao("comparacao e analogia", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\comparacao e analogia.txt"))
            ))));

            materiaisRedacao.add(new Material("Proposta de Intervenção", new ArrayList<>(Arrays.asList(
                    new Conteudo("Ação", new ArrayList<>(),
                            new Explicacao("acao", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\acao.txt")),
                    new Conteudo("Agente", new ArrayList<>(),
                            new Explicacao("agente", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\agente.txt")),
                    new Conteudo("Modo de execução", new ArrayList<>(),
                            new Explicacao("modo de execucao", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\modo de execucao.txt")),
                    new Conteudo("Efeito esperado", new ArrayList<>(),
                            new Explicacao("efeito esperado", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\efeito esperado.txt")),
                    new Conteudo("Detalhamento e viabilidade", new ArrayList<>(),
                            new Explicacao("detalhamento e viabilidade", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\detalhamento e viabilidade.txt"))
            ))));

            materiaisRedacao.add(new Material("Dicas para Redação Nota 1000", new ArrayList<>(Arrays.asList(
                    new Conteudo("Planejamento antes de escrever", new ArrayList<>(),
                            new Explicacao("planejamento antes de escrever", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\planejamento antes de escrever.txt")),
                    new Conteudo("Evitar clichês e frases prontas", new ArrayList<>(),
                            new Explicacao("evitar cliches e frases prontas", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\evitar cliches e frases prontas.txt")),
                    new Conteudo("Cuidar da progressão textual", new ArrayList<>(),
                            new Explicacao("cuidar da progressao textual", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\cuidar da progressao textual.txt")),
                    new Conteudo("Revisar o texto final", new ArrayList<>(),
                            new Explicacao("revisar o texto final", "C:\\Users\\cardo\\Desktop\\materiais\\redacao\\revisar o texto final.txt"))
            ))));


            // Matemática ===============================================================

            ArrayList<Material> materiaisMatematica = new ArrayList<>();
            materiaisMatematica.add(new Material("Aritmética", new ArrayList<>(Arrays.asList(
                    new Conteudo("operações", new ArrayList<>(),
                            new Explicacao("operacoes", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\operacoes.txt")),
                    new Conteudo("porcentagem", new ArrayList<>(),
                            new Explicacao("porcentagem", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\porcentagem.txt")),
                    new Conteudo("razão", new ArrayList<>(),
                            new Explicacao("razao", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\razao.txt")),
                    new Conteudo("proporção", new ArrayList<>(),
                            new Explicacao("proporcao", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\proporcao.txt"))
            ))));

            materiaisMatematica.add(new Material("Álgebra", new ArrayList<>(Arrays.asList(
                    new Conteudo("equações do 1º", new ArrayList<>(),
                            new Explicacao("equacoes do 1", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\equacoes do 1.txt")),
                    new Conteudo("equações do 2º", new ArrayList<>(),
                            new Explicacao("equacoes do 2", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\equacoes do 2.txt")),
                    new Conteudo("inequações", new ArrayList<>(),
                            new Explicacao("inequacoes", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\inequacoes.txt")),
                    new Conteudo("sistemas lineares", new ArrayList<>(),
                            new Explicacao("sistemas lineares", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\sistemas lineares.txt"))
            ))));

            materiaisMatematica.add(new Material("Funções", new ArrayList<>(Arrays.asList(
                    new Conteudo("afim", new ArrayList<>(),
                            new Explicacao("afim", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\afim.txt")),
                    new Conteudo("quadrática", new ArrayList<>(),
                            new Explicacao("quadratica", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\quadratica.txt")),
                    new Conteudo("exponencial", new ArrayList<>(),
                            new Explicacao("exponencial", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\exponencial.txt")),
                    new Conteudo("logarítmica", new ArrayList<>(),
                            new Explicacao("logaritmica", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\logaritmica.txt"))
            ))));

            materiaisMatematica.add(new Material("Geometria", new ArrayList<>(Arrays.asList(
                    new Conteudo("plana", new ArrayList<>(),
                            new Explicacao("plana", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\plana.txt")),
                    new Conteudo("espacial", new ArrayList<>(),
                            new Explicacao("espacial", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\espacial.txt")),
                    new Conteudo("analítica", new ArrayList<>(),
                            new Explicacao("analitica", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\analitica.txt"))
            ))));

            materiaisMatematica.add(new Material("Trigonometria básica", new ArrayList<>(Arrays.asList(
                    new Conteudo("oi", new ArrayList<>(),
                            new Explicacao("oi", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\trigonometria basica.txt")),
                    new Conteudo("oi", new ArrayList<>(),
                            new Explicacao("oi", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\oi.txt"))
            ))));

            materiaisMatematica.add(new Material("Estatística e probabilidade", new ArrayList<>(Arrays.asList(
                    new Conteudo("média", new ArrayList<>(),
                            new Explicacao("media", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\media.txt")),
                    new Conteudo("mediana", new ArrayList<>(),
                            new Explicacao("mediana", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\mediana.txt")),
                    new Conteudo("moda", new ArrayList<>(),
                            new Explicacao("moda", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\moda.txt")),
                    new Conteudo("gráficos", new ArrayList<>(),
                            new Explicacao("graficos", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\graficos.txt")),
                    new Conteudo("tabelas", new ArrayList<>(),
                            new Explicacao("tabelas", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\tabelas.txt"))
            ))));

            materiaisMatematica.add(new Material("Problemas envolvendo raciocínio lógico e interpretação", new ArrayList<>(Arrays.asList(
                    new Conteudo("oi", new ArrayList<>(),
                            new Explicacao("oi", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\oi.txt")),
                    new Conteudo("oi", new ArrayList<>(),
                            new Explicacao("oi", "C:\\Users\\cardo\\Desktop\\materiais\\matematica\\oi.txt"))
            ))));


            // Humanas =====================================================================================

            ArrayList<Material> materiaisHumanas = new ArrayList<>();
            materiaisHumanas.add(new Material("História do Brasil", new ArrayList<>(Arrays.asList(
                    new Conteudo("Brasil Colônia", new ArrayList<>(),
                            new Explicacao("brasil colonia", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\brasil colonia.txt")),
                    new Conteudo("Brasil Império", new ArrayList<>(),
                            new Explicacao("brasil imperio", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\brasil imperio.txt")),
                    new Conteudo("Brasil República", new ArrayList<>(),
                            new Explicacao("brasil republica", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\brasil republica.txt"))
            ))));

            materiaisHumanas.add(new Material("Ditadura Militar e Redemocratização", new ArrayList<>(Arrays.asList(
                    new Conteudo("Golpe de 1964", new ArrayList<>(),
                            new Explicacao("golpe de 1964", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\golpe de 1964.txt")),
                    new Conteudo("Regime Militar", new ArrayList<>(),
                            new Explicacao("regime militar", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\regime militar.txt")),
                    new Conteudo("Processo de redemocratização", new ArrayList<>(),
                            new Explicacao("processo de redemocratizacao", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\processo de redemocratizacao.txt"))
            ))));

            materiaisHumanas.add(new Material("História Geral", new ArrayList<>(Arrays.asList(
                    new Conteudo("Antiguidade", new ArrayList<>(),
                            new Explicacao("antiguidade", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\antiguidade.txt")),
                    new Conteudo("Idade Média", new ArrayList<>(),
                            new Explicacao("idade media", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\idade media.txt")),
                    new Conteudo("Idade Moderna", new ArrayList<>(),
                            new Explicacao("idade moderna", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\idade moderna.txt")),
                    new Conteudo("Idade Contemporânea", new ArrayList<>(),
                            new Explicacao("idade contemporanea", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\idade contemporanea.txt"))
            ))));

            materiaisHumanas.add(new Material("Revoluções", new ArrayList<>(Arrays.asList(
                    new Conteudo("Revoluções Industriais", new ArrayList<>(),
                            new Explicacao("revolucoes industriais", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\revolucoes industriais.txt")),
                    new Conteudo("Revoluções Francesa, Russa e outras", new ArrayList<>(),
                            new Explicacao("revolucoes francesa russa e outras", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\revolucoes francesa russa e outras.txt"))
            ))));

            materiaisHumanas.add(new Material("Movimentos Sociais", new ArrayList<>(Arrays.asList(
                    new Conteudo("Movimentos por direitos civis", new ArrayList<>(),
                            new Explicacao("movimentos por direitos civis", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\movimentos por direitos civis.txt")),
                    new Conteudo("Movimentos operários", new ArrayList<>(),
                            new Explicacao("movimentos operarios", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\movimentos operarios.txt")),
                    new Conteudo("Movimentos estudantis", new ArrayList<>(),
                            new Explicacao("movimentos estudantis", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\movimentos estudantis.txt")),
                    new Conteudo("Movimentos sociais no Brasil", new ArrayList<>(),
                            new Explicacao("movimentos sociais no brasil", "C:\\Users\\cardo\\Desktop\\materiais\\humanas\\movimentos sociais no brasil.txt"))
            ))));


            // Ciências da Natureza ========================================================================

            ArrayList<Material> materiaisCienciasNatureza = new ArrayList<>();
            materiaisCienciasNatureza.add(new Material("Física", new ArrayList<>(Arrays.asList(
                    new Conteudo("Cinemática", new ArrayList<>(),
                            new Explicacao("cinematica", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\cinematica.txt")),
                    new Conteudo("Dinâmica", new ArrayList<>(),
                            new Explicacao("dinamica", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\dinamica.txt")),
                    new Conteudo("Trabalho e Energia", new ArrayList<>(),
                            new Explicacao("trabalho e energia", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\trabalho e energia.txt")),
                    new Conteudo("Termodinâmica", new ArrayList<>(),
                            new Explicacao("termodinamica", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\termodinamica.txt")),
                    new Conteudo("Óptica", new ArrayList<>(),
                            new Explicacao("optica", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\optica.txt")),
                    new Conteudo("Eletricidade e Magnetismo", new ArrayList<>(),
                            new Explicacao("eletricidade e magnetismo", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\eletricidade e magnetismo.txt"))
            ))));

            materiaisCienciasNatureza.add(new Material("Química", new ArrayList<>(Arrays.asList(
                    new Conteudo("Química Geral: Átomos, Moléculas e Reações", new ArrayList<>(),
                            new Explicacao("quimica geral atomos moleculas e reacoes", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\quimica geral atomos moleculas e reacoes.txt")),
                    new Conteudo("Química Orgânica: Funções e Reações Orgânicas", new ArrayList<>(),
                            new Explicacao("quimica organica funcoes e reacoes organicas", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\quimica organica funcoes e reacoes organicas.txt")),
                    new Conteudo("Química Inorgânica: Ligações e Propriedades", new ArrayList<>(),
                            new Explicacao("quimica inorganica ligacoes e propriedades", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\quimica inorganica ligacoes e propriedades.txt")),
                    new Conteudo("Soluções e Equilíbrios Químicos", new ArrayList<>(),
                            new Explicacao("solucoes e equilíbrios quimicos", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\solucoes e equilíbrios quimicos.txt")),
                    new Conteudo("Termoquímica", new ArrayList<>(),
                            new Explicacao("termoquimica", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\termoquimica.txt")),
                    new Conteudo("Radioatividade", new ArrayList<>(),
                            new Explicacao("radioatividade", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\radioatividade.txt"))
            ))));

            materiaisCienciasNatureza.add(new Material("Biologia", new ArrayList<>(Arrays.asList(
                    new Conteudo("Citologia e Histologia", new ArrayList<>(),
                            new Explicacao("citologia e histologia", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\citologia e histologia.txt")),
                    new Conteudo("Genética", new ArrayList<>(),
                            new Explicacao("genetica", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\genetica.txt")),
                    new Conteudo("Evolução", new ArrayList<>(),
                            new Explicacao("evolucao", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\evolucao.txt")),
                    new Conteudo("Ecologia e Meio Ambiente", new ArrayList<>(),
                            new Explicacao("ecologia e meio ambiente", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\ecologia e meio ambiente.txt")),
                    new Conteudo("Fisiologia Humana", new ArrayList<>(),
                            new Explicacao("fisiologia humana", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\fisiologia humana.txt")),
                    new Conteudo("Botânica e Zoologia", new ArrayList<>(),
                            new Explicacao("botanica e zoologia", "C:\\Users\\cardo\\Desktop\\materiais\\ciencias da natureza\\botanica e zoologia.txt"))
            ))));


            // Adicionando na Classe
            curso.add(new Curso(" Português", materiaisPortugues));
            curso.add(new Curso(" Redação", materiaisRedacao));
            curso.add(new Curso(" Matemática", materiaisMatematica));
            curso.add(new Curso(" Humanas", materiaisHumanas));
            curso.add(new Curso(" Ciências da Natureza", materiaisCienciasNatureza));

            // Painel de escolha ==============================================

            System.out.println("Escolha sua opção: \n");
            int i = 1;
            for (Curso curso1 : curso) {
                System.out.println(i + " - " + curso1.getNome());
                i++;
            }
            int opcaoCurso = entrada.nextInt();
            entrada.nextLine();


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


            // Listar conteúdos do material escolhido

            Material materialSelecionado = cursoSelecionado.getMaterias().get(opcaoMaterial - 1);
            System.out.println("======= CONTEÚDOS DE " + materialSelecionado.getNome().toUpperCase() + " =======\n");

            int k = 1;
            for (Conteudo conteudo : materialSelecionado.getConteudo()) {
                System.out.println(k + " - " + conteudo.getNome());
                k++;
            }

            // Explicação ==============

            System.out.print("\nDigite o número do conteúdo para ver a explicação: ");
            Scanner scanner = new Scanner(System.in);
            int opcaoConteudo = scanner.nextInt();

            Conteudo conteudoSelecionado = materialSelecionado.getConteudo().get(opcaoConteudo - 1);
            System.out.println("======= EXPLICAÇÃO DE " + conteudoSelecionado.getNome().toUpperCase() + " =======\n");

            if (conteudoSelecionado.getExplicacao() != null) {
                conteudoSelecionado.getExplicacao().abrirArquivo(); // Aqui é o comando para abrir o documento
            } else {
                System.out.println("Nenhuma explicação disponível para este conteúdo.");
            }
        }
    }

    public class VerificadorDeArquivos {

        public static void verificarArquivos(List<Curso> cursos) {
            for (Curso curso : cursos) {
                System.out.println("Curso: " + curso.getNome());
                for (Material material : curso.getMaterias()) {
                    System.out.println("  Material: " + material.getNome());
                    for (Conteudo conteudo : material.getConteudo()) {
                        System.out.println("    Conteúdo: " + conteudo.getNome());
                        Explicacao explicacao = conteudo.getExplicacao();
                        if (explicacao != null) {
                            String caminho = explicacao.getCaminhoDoArquivo();
                            File arquivo = new File(caminho);
                            if (arquivo.exists()) {
                                System.out.println("      ✔ Arquivo encontrado: " + caminho);
                            } else {
                                System.out.println("      ❌ Arquivo NÃO encontrado: " + caminho);
                            }
                        } else {
                            System.out.println("      ❌ Nenhuma explicação vinculada.");
                        }
                    }
                }
            }
        }
    }

}