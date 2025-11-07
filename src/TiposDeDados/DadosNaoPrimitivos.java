package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados não primitivos: String, Array, Class, enum
        * */

        String nome = "Naruto Uzumaki";
        String nomeToUpperCase = nome.toUpperCase();
        System.out.println("Ninja em caixa alta: " + nomeToUpperCase);

        String aldeia = "Aldeia da Folha";
        String aldeiaToLowerCase = aldeia.toLowerCase();
        System.out.println("Aldeia em caixa baixa: " + aldeiaToLowerCase);
    }
}
