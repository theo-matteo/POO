public class Livro extends Produto {

  private String autor;

  public Livro(String nome, String autor, Double preco) {
    super(nome, preco);
    this.autor = autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getAutor() {
    return autor;
  }

  @Override
  public String toString() {
    return "Livro: " + this.getNome() + ", Autor: " + this.autor + ", Preço: R$ " + this.getPreco();
  }

}
