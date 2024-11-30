public class ContaCorrente {

  private String nomeCliente;
  private double saldo = 0;

  public String getNomeCliente() {
    return nomeCliente;
  }

  public double getSaldo() {
    return saldo;
  }

  public ContaCorrente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public void deposito(double valor) {
    this.saldo += valor;
  }

  public void saque(double valor) {
    this.saldo -= (valor + (this.getTaxaSaque() * valor));
  }

  public double getTaxaSaque() {
    return 0.05;
  }

  @Override
  public String toString() {
    return "Titular: " + this.getNomeCliente() + " Saldo: " + this.getSaldo();
  }
}
