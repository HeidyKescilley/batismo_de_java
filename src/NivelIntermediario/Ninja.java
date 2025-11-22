package NivelIntermediario;

public abstract class Ninja implements Estrategia {
    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial, to certo!");
    }

    @Override
    public void estrategia() {
        System.out.println("Essa é minha estrategia ninja.");
    }
}