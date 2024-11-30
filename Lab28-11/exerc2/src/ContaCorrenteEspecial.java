public class ContaCorrenteEspecial extends ContaCorrente {

  public ContaCorrenteEspecial(String nomeCliente) {
    super(nomeCliente);
  }

  @Override
  public double getTaxaSaque() {
    return 0.01;
  }
}
