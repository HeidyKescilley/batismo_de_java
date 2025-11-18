package NivelIntermediario.Desafios.DesafioDois;

public class NinjaVancado implements Ninja {
    String name;
    int age;
    String skill;
    String specialty;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + name + "\nIdade: " + age + "\nHabilidade: " + skill);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando: " + skill);
        System.out.println("Por essa você não esperava, habilidade especial: " + specialty);
    }

    public NinjaVancado (String name, int age, String skill, String specialty) {
        this.name = name;
        this.age = age;
        this.skill = skill;
        this.specialty = specialty;

    }

    public NinjaVancado () {}
}
