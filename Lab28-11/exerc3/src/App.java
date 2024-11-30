public class App {
  public static void main(String[] args) {

    Produto[] produtos = new Produto[5];

    produtos[0] = new Livro("Senhor dos Anéis", "J.R.R. Tolkien", 67.98);
    produtos[1] = new JogoTabuleiro("Xadrez", 120.50, 12);
    produtos[2] = new Livro("1984", "George Orwell", 45.90);
    produtos[3] = new JogoTabuleiro("War", 150.00, 14);
    produtos[4] = new Livro("Two wars", "Autor desconhecido", 12.59);

    for (Produto p : produtos)
      System.out.println(p);

  }
}
