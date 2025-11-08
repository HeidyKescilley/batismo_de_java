package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de Repetição: Vão repetir infinitamente ou até atender a sua condição
        * WHILE = FOR
        *
        * */

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        /*while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O Naturo fez um clone das sombras, já são: " + numeroDeClones + " clones.");

        }*/

        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Naturo fez um clone das sombras, já são: " + (i+1) + " clones.");
        }
    }
}
