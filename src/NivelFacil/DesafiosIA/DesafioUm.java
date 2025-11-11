package NivelFacil.DesafiosIA;

import java.util.Scanner;

public class DesafioUm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("           CADASTRO DE HUNTER          ");
        System.out.println("=======================================");

        System.out.println("Qual seu nome de Hunter?");
        String hunterName = input.nextLine();

        System.out.println("Qual sua idade?");
        int hunterAge = input.nextInt();

        if (hunterAge >= 12) {
            System.out.println("Parabens! " + hunterName + " você entrou no Exame!");
        } else  {
            System.out.println("Você tem uma carta de recomendação de um Hunter? (s/n)");
            input.nextLine();
            String recomendacao = input.nextLine();
            if (recomendacao.equals("s") && recomendacao.equals("n")) {
                System.out.println("Responda apenas s para sim e n para não.");
                System.out.println("Você tem uma carta de recomendação de um Hunter? (s/n)");
                input.nextLine();
                recomendacao = input.nextLine();
            } else if (recomendacao.equals("s")) {
                System.out.println("Parabens! " + hunterName + " você entrou no Exame!");
            } else {
                System.out.println(hunterName + " infelizmente você não tem a idade mínima. Volte em " + (12-hunterAge) + " anos.");
            }
        }
    }
}
