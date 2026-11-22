package designpattern.visitor;

public class Clt implements Funcionario {

    private String nome;
    private double salario;

    public Clt(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public double salarioBruto() {
        return salario;
    }

    @Override
    public <T> T accept(FuncionarioVisitor<T> visitor) {
        return visitor.visitClt(this);
    }
}
