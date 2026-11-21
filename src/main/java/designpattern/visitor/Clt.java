package designpattern.visitor;

public class Clt extends Funcionario {

    private double salario;

    public Clt(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public double salarioBruto() {
        return salario;
    }
}
