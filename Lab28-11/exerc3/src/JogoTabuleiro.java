public class JogoTabuleiro extends Produto {

  private int idadeMinima;

  public int getIdadeMinima() {
    return idadeMinima;
  }

  public void setIdadeMinima(int idadeMinima) {
    this.idadeMinima = idadeMinima;
  }

  public JogoTabuleiro(String nome, double preco, int idadeMinima) {
    super(nome, preco);
    this.idadeMinima = idadeMinima;
  }

  @Override
  public String toString() {
    return "Jogo de tabuleiro: " + this.getNome() + ", Idade miníma: " + this.idadeMinima + ", Preço: R$ "
        + this.getPreco();
  }

}
