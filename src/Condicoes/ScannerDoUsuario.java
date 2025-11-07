package Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
         * Scanner = É um feito de trazer o usuario para dentro da aplicação.
         * Objetivo: O usuario vai criar um ninja e vamos validar os dados.
         * */

        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Digite o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("Nome do ninja: " + nomeDoNinja);

        // Receber idade do ninja
        System.out.println("Qual a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("Idade do ninja: " + idadeDoNinja + " anos");

        // Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja já é maior de idade, pode fazer missões fora da aldeia.");
        } else {
            System.out.println("Esse ninja é muito novo, treine mais antes de sair da aldeia.");
        }

        // Sempre fechar o Scanner
        caixaDeTexto.close();
    }
}
