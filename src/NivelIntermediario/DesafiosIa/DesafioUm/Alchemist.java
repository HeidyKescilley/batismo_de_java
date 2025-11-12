package NivelIntermediario.DesafiosIa.DesafioUm;

public class Alchemist {
    String name;
    String rank;
    int transmutationsPerformed;

    void performTransmutation() {
        transmutationsPerformed++;
    }

    void promote(String newRank) {
        rank = newRank;
    }
}
