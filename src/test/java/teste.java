import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        // Altere esse caminho conforme o nome real do seu arquivo
        String caminho = "C:\\Users\\cardo\\Desktop\\materiais\\portugues\\pontuacao.txt";

        File arquivo = new File(caminho);

        // Verifica se o arquivo existe
        if (!arquivo.exists()) {
            System.out.println("Arquivo não encontrado: " + caminho);
            return;
        }

        // Verifica se o sistema suporta Desktop
        if (!Desktop.isDesktopSupported()) {
            System.out.println("Desktop não é suportado no sistema.");
            return;
        }

        try {
            // Tenta abrir com o programa padrão (Bloco de Notas, normalmente)
            Desktop.getDesktop().open(arquivo);
            System.out.println("Arquivo aberto com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
    }
}
