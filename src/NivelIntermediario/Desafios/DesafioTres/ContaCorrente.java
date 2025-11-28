package NivelIntermediario.Desafios.DesafioTres;

public class ContaCorrente extends ContaBancaria {

    @Override
    public void depositar(double valor) {
        double valorTaxa = valor * 0.01;

        System.out.println("Saldo antes do deposito: R$ " + saldo);

        saldo = saldo + valorTaxa;

        System.out.println("A taxa de deposito cobrada nessa operação foi de: R$ " + valorTaxa);
        System.out.println("Seu novo saldo é: " + saldo);
    }

    public ContaCorrente(String usuario, double saldo) {
        super(usuario, saldo);
    }

    public ContaCorrente() {
    }

}
