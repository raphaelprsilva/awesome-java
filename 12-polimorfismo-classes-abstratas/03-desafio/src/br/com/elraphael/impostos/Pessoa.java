package br.com.elraphael.impostos;

public abstract class Pessoa {
  private String nome;

  Pessoa(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public abstract double calcularImpostos();
}
