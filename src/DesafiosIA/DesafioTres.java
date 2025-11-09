package DesafiosIA;

import java.util.Scanner;

public class DesafioTres {
    public static void main(String[] args) {
        String[] teamUra = new String[5];
        Scanner input = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println("Vamos recrutar nossa equipe para o Torneio das Trevas");
        System.out.println("=====================================================");

        for (int i = 0; i < 5; i++) {
            System.out.println("Escolha o nome para o membro nº " + (i+1));
            teamUra[i] = input.nextLine();
            System.out.println(teamUra[i] + " escolhido com sucesso!");
        }

        System.out.println("=====================================================");
        System.out.println("                     NOSSA EQUIPE                    ");
        System.out.println("=====================================================");

        for (int i = 0; i < teamUra.length; i++) {
            System.out.println("O membro de nº " + (i+1) + " é o " + teamUra[i]);
        }
    }
}
