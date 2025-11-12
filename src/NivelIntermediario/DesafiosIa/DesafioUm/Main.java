package NivelIntermediario.DesafiosIa.DesafioUm;

public class Main {
    public static void main(String[] args) {

        Alchemist roy = new Alchemist();

        roy.name = "Roy Mustang";
        roy.rank = "Major";
        roy.transmutationsPerformed = 0;

        Alchemist edward = new Alchemist();

        edward.name = "Edward";
        edward.rank = "Major";
        edward.transmutationsPerformed = 0;

        roy.performTransmutation();
        roy.performTransmutation();
        roy.performTransmutation();

        edward.performTransmutation();

        System.out.println(edward.name + " quantidades de transmutações: " + edward.transmutationsPerformed);
        System.out.println(roy.name + " quantidades de transmutações: " + roy.transmutationsPerformed);

        System.out.println(roy.name + " é um " + roy.rank);

        roy.promote("Colonel");

        System.out.println(roy.name + " agora é um " + roy.rank);

    }
}
