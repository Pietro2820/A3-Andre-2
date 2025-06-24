package org.A3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, dentro desse sistema você terá acesso aos conteúdos das matérias essenciais para estudar para o ENEM");
        System.out.println("""
                ==========MENU==========
                1 - Apostilha
                2 - Quiz
                """);
        int escolha = entrada.nextInt();

        if (escolha == 1) {
            Apostilha apostilha = new Apostilha();
            apostilha.abri();
        } else if (escolha == 2) {
            System.out.println("Quiz ainda não implementado.");
        } else {
            System.out.println("Opção inválida.");
        }

        entrada.close();
    }
}
