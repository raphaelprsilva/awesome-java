import br.com.elraphael.locadora.*;

public class Main {
  public static void main(String[] args) {
    Notebook notebook = new Notebook("Macbook Pro i7", 5, 100);
    Precificacao precificacao = new PrecificacaoPorHora();
    Seguro seguro = new SeguroItau();

    Locacao locacao = new Locacao(notebook, precificacao, seguro);
    double valorDevido = locacao.calcularValorDevido(10);
    System.out.println("Valor a pagar: " + valorDevido);
  }
}
