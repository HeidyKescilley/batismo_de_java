package NivelIntermediario.DesafiosIa.DesafioTres;

public class Main {
    public static void main(String[] args) {

        Tsunade tsunade = new Tsunade();

        tsunade.fazerMissao();

        System.out.println("\\n--- Testando Polimorfismo ---");

        hospitalDeKonoha(tsunade);
        arenaDeLuta(tsunade);

    }

    // --- MÉTODOS FICAM FORA DO MAIN ---

    // Este metodo só enxerga a Tsunade como "Curador"
    public static void hospitalDeKonoha(Curador ninjaMedico) {
        System.out.println("O Hospital solicitou ajuda...");
        ninjaMedico.curar();
        // ninjaMedico.socar(); // DARIA ERRO! O contrato Curador não sabe socar.
    }

    // Este metodo só enxerga a Tsunade como "Lutador"
    public static void arenaDeLuta(LutadorTaijutsu ninjaLutador) {
        System.out.println("A Arena chamou um lutador...");
        ninjaLutador.socar();
    }
}
