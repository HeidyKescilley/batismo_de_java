package NivelIntermediario;

public abstract class Hokage {

    String nome;
    int idade;
    boolean vivoOuMorto;

    public abstract void sabedoriaHokage();

    public Hokage(String nome, int idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }

    public Hokage() {
    }
}
