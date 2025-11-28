package NivelIntermediario.Desafios.DesafioTres;

public class Main {
    public static void main(String[] args) {

        ContaCorrente naruto = new ContaCorrente("Naruto", 150.5);

        naruto.consultarSaldo();

        naruto.depositar(49.5);


    }
}
