package NivelIntermediario;

public class Senju extends Hokage {
    public void sabedoriaHokage() {
        System.out.println("Você ganhou sabedoria");
    }

    public Senju(String nome, int idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }

    public Senju() {
    }
}
