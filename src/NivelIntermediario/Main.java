package NivelIntermediario;

import java.lang.invoke.StringConcatFactory;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.habilidadeEspecial();


        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.habilidadeEspecial();

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Folha", 27);

    }
}