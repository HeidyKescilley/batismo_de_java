package NivelIntermediario;

public class Ninja {
    String name;
    int age;
    String village;

    /*
    * Metodo String vai ter que retornar uma String
    * */
    public String EuSouUmNinja() {
        return "Oi, eu sou um ninja!";
    }

    /*
     * Metodo int vai ter que retornar uma int
     * */
    public int AnosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - age;
    }
}
