package NivelIntermediario.Desafios.DesafioTres;

public abstract class ContaBancaria implements Conta {

    String usuario;
    double saldo;

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo inicial é: " + saldo);
    }

    @Override
    public abstract void depositar(double valor);

    public ContaBancaria(String usuario, double saldo) {
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }
}
