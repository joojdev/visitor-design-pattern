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

    @Override
    public double calculaImposto() {
        double inss = salario * 0.11;
        double ir = 0;
        if (salario > 3000) {
            ir = salario * 0.075;
        }
        return inss + ir;
    }

    @Override
    public double salarioLiquido() {
        return salario - calculaImposto();
    }
}
