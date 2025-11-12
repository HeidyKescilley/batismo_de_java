package NivelIntermediario;

public class Ninja {
    String name;
    int age;
    String village;

    // Criar um metodo publico personalizado
    /*
    * O metodo VOID não retorna valor nenhum!
    * */
    public void SharinganAtivado() {
        System.out.println("O sharingan Ativou!");
    }

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
