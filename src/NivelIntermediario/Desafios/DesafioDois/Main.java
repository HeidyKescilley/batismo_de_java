package NivelIntermediario.Desafios.DesafioDois;

public class Main {
    public static void main(String[] args) {
        NinjaBasico naturo = new NinjaBasico("Naturo Muzuaki", 16, "Zengaran");

        NinjaVancado sukase = new NinjaVancado("Sukase Chiuha", 18, "Ganrinsha", "Tsucuiomi");

        sukase.mostrarInformacoes();
        sukase.executarHabilidade();

        naturo.mostrarInformacoes();
        naturo.executarHabilidade();
    }
}
