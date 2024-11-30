import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Double previousPoint = 0.0;
        Double currentPoint = 0.0;
        int aux = 1;
        List<Ponto> pontos = new LinkedList<Ponto>();

        for (String s : args) {
            currentPoint = Double.parseDouble(s);
            if (aux % 2 == 0) {
                Ponto p = new Ponto(previousPoint, currentPoint);
                pontos.add(p);
            }
            previousPoint = currentPoint;
            aux++;
        }

        Triangulo triangle = new Triangulo(pontos.get(0), pontos.get(1), pontos.get(2));

        System.out.println(triangle.getPerimetro());
    }
}