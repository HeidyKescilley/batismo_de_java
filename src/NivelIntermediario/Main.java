package NivelIntermediario;

import java.lang.invoke.StringConcatFactory;

public class Main {
    public static void main(String[] args) {

        Hokage Hashirama = new Hokage();
        Hashirama.nome = "Hashirama Senju";
        Hashirama.idade = 62;
        Hashirama.vivoOuMorto = false;

        Hokage Tobirama = new Hokage("Tobirama Senju", 35, false);
        System.out.println(Tobirama.nome);

        Hokage Hiruzen = new Hokage("Hiruzen Sarutobi", 70, false);
        System.out.println(Hiruzen.nome + Hiruzen.idade + Hiruzen.vivoOuMorto);

    }
}