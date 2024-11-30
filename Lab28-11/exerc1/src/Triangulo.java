public class Triangulo {

  Ponto p1, p2, p3;

  public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }

  public double getPerimetro() {
    return p1.calculaDistanciaPonto(p2) + p2.calculaDistanciaPonto(p3) + p1.calculaDistanciaPonto(p3);
  }

}