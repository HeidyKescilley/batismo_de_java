package Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        /*
        * SwitchCases: Que servem para gerar casos especificos
        * Objetivo: Pedir pro usuario escolher entre os Ninjas
        * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opções para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuario escolher uma das opções
        int escolhaDoUsario = scanner.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsario);

        // Reação a escolha do personagem
        switch(escolhaDoUsario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki.");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha.");
                break;
            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno.");
                break;
            default:
                System.out.println("Por favor, escolha uma opção valida.");
        }

        scanner.close();
    }
}
