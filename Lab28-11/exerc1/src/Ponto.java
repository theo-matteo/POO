public class Ponto {

  private double x;
  private double y;

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public Ponto(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double calculaDistanciaPonto(Ponto p) {
    return Math.sqrt(Math.pow(this.y - p.getY(), 2) + Math.pow(this.x - p.getX(), 2));
  }

}