package NivelIntermediario.Desafios;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + name + "\nIdade: " + age + "\nMissão: "+ mission + "\nNivel de Dificuldade: " + difficultLevel + "\nStatus da Missão: " + missionStatus + "\nHabilidade Especial: " + habilidadeEspecial + "\n");
    }

}
