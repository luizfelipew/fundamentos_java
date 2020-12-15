package devdojo.java8streams.ZZKstreams.classes;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public static List<Pessoa> bancoDePessoas() {
        return Arrays.asList(
                new Pessoa("Luiz Felipe", 22, 2000),
                new Pessoa("Mercy", 22, 1500),
                new Pessoa("Mercy", 22, 1500),
                new Pessoa("Ana", 19, 1985),
                new Pessoa("Thor", 23, 1895),
                new Pessoa("Hulk", 35, 8000),
                new Pessoa("Flash", 29, 3200),
                new Pessoa("Batman", 37, 10000000),
                new Pessoa("Lanterna verde", 24, 5000)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
