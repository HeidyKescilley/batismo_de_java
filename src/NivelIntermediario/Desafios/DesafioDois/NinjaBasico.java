package NivelIntermediario.Desafios.DesafioDois;

public class NinjaBasico implements Ninja{
    String name;
    int age;
    String skill;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + name + "\nIdade: " + age + "\nHabilidade: " + skill);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando: " + skill);
    }

    public NinjaBasico (String name, int age, String skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;

    }

    public NinjaBasico () {}
}
