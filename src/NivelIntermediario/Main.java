package NivelIntermediario;

import java.lang.invoke.StringConcatFactory;

public class Main {
    public static void main(String[] args) {


        Uzumaki Naruto = new Uzumaki();
        Naruto.name = "Naruto Uzumaki";
        Naruto.age = 15;
        Naruto.village = "Hidden Leaf Village";
        Naruto.ModoSabioAtivado();


        Uchiha Sasuke = new Uchiha();
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.age = 18;
        Sasuke.village = "Hidden Leaf Village";
        Sasuke.SharinganAtivado();


        Haruno Sakura = new Haruno();
        Sakura.name = "Sakura Haruno";
        Sakura.age = 18;
        Sakura.village = "Hidden Leaf Village";
        Sakura.AtivarCura();

        Hyuga Hinata = new Hyuga();
        Hinata.name = "Hinata Hyuga";
        Hinata.age = 18;
        Hinata.village = "Hidden Leaf Village";
        Hinata.mainFamily = true;
        Hinata.AtivarByakugan();

        Boruto boruto = new Boruto();
        boruto.name = "Boruta Uzumaki";
        boruto.age = 9;
        boruto.village = "Hidden Leaf Village";
        boruto.AtivarOKarma();
        boruto.ModoSabioAtivado();
        boruto.EuSouUmNinja();

    }
}