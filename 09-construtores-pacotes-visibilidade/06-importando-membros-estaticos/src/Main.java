import static com.elraphael.matematica.CalculadoraArea.*;

public class Main {

  public static void main(String[] args) {
    double areaQuadrado = calcularAreaQuadrado(5.2);
    double areaCirculo = calcularAreaCirculo(10.5);

    System.out.printf("PI: %.2f%n", PI);
    System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
    System.out.printf("Área do círculo: %.2f%n", areaCirculo);
  }

}