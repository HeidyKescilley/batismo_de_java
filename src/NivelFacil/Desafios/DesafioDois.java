package NivelFacil.Desafios;

import java.util.Scanner;

public class DesafioDois {

    public static void main(String[] args) {

        int option = 0;
        String[] ninjas = new String[10];
        Scanner input = new Scanner(System.in);

        System.out.println(ninjas[0]);

        while (option != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Qual nome do novo ninja?");
                    for (int i = 0; i < ninjas.length; i++) {

                        if (ninjas[i] == null) {
                            ninjas[i] = input.nextLine();
                            System.out.println(ninjas[i] + " adicionado a lista!");
                            break;
                        }

                        if (i == ninjas.length - 1) {
                            System.out.println("Acabou a vaga!");
                        }
                    }
                    break;

                case 2:
                    int count = 1;
                    System.out.println("===== Lista de Ninjas =====");
                    for (String ninja : ninjas) {
                        System.out.println("Ninja " + count + " - " + ninja);
                        count++;
                    }
                    break;

                case 3:
                    System.out.println("Encerrando programa");
                    break;

                default:
                    System.out.println("Opção invalida, vamos tentar de novo...");
                    break;

            }
        }
    }

}
