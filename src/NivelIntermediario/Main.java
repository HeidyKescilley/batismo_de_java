package NivelIntermediario;

import java.lang.invoke.StringConcatFactory;

public class Main {
    public static void main(String[] args) {

        // Criar ninja Sasuke Uchiha - Sasuke é um objeto

        Ninja Naruto = new Ninja();
        Naruto.name = "Naruto Uzumaki";
        Naruto.age = 15;
        Naruto.village = "Hidden Leaf Village";

        // Criar ninja Sasuke Uchiha - Sasuke é um objeto

        Ninja Sasuke = new Ninja();
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.age = 18;
        Sasuke.village = "Hidden Leaf Village";

        // Aplicando metodos aos meus objetos
        Sasuke.SharinganAtivado();
        String message = Sasuke.EuSouUmNinja();
        System.out.println(message);

        int ageToHokage = Sasuke.AnosParaSeTornarHokage(30);
        System.out.println("Você tem: " + Sasuke.age + " e faltam " + ageToHokage + " pra tu virar prefeito.");



    }
}
