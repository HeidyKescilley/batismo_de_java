package NivelIntermediario.DesafiosIa.DesafioTres;

public class Tsunade extends Shinobi implements Curador, LutadorTaijutsu {

    @Override
    public void curar() {
        System.out.println("Curando...");
    }

    @Override
    public void socar() {
        System.out.println("Socando...");
    }

    @Override
    public void fazerMissao() {
        System.out.println("Missão iniciada.");
    }
}
