package NivelIntermediario;

import java.lang.invoke.StringConcatFactory;

public class Main {
    public static void main(String[] args) {

        Senju Hashirama = new Senju();
        Hashirama.nome = "Hashirama Senju";
        Hashirama.idade = 62;
        Hashirama.vivoOuMorto = false;

        Senju Tobirama = new Senju("Tobirama Senju", 35, false);
        System.out.println(Tobirama.nome);

        Senju Hiruzen = new Senju("Hiruzen Sarutobi", 70, false);
        System.out.println(Hiruzen.nome + Hiruzen.idade + Hiruzen.vivoOuMorto);

    }
}