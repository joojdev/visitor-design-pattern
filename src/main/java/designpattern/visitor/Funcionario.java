package designpattern.visitor;

public abstract class Funcionario {

    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double salarioBruto();

    public abstract double calculaImposto();

    public abstract double salarioLiquido();
}
