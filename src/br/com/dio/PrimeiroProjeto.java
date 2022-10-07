package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProjeto {
    public static void main(String[] args) {
        Livro livro = new Livro("nome: O problema das mulheres", 12);
        Gato gato = new Gato();
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World!" + (a + b));*/
        System.out.println(livro);
    }
}
class Livro {
    private String nome;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    private Integer numPaginas;

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
