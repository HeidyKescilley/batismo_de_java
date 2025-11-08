package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios: usado para enxugar ou reduzir o codigo
        * variavel = (condição) ? valorVerdadeiro : valorSeFalso;
        * */

        short numeroDeMissoes = 1;

        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missoes.";
        System.out.println(nivelDoNinja);
    }
}
