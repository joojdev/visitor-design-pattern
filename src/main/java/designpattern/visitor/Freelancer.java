package designpattern.visitor;

public class Freelancer extends Funcionario {

    private int horas;
    private double valorHora;

    public Freelancer(String nome, int horas, double valorHora) {
        super(nome);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public int getHoras() {
        return horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double salarioBruto() {
        return horas * valorHora;
    }

    @Override
    public double calculaImposto() {
        return salarioBruto() * 0.05;
    }

    @Override
    public double salarioLiquido() {
        return salarioBruto() - calculaImposto();
    }

    @Override
    public String holerite() {
        return "Nome: " + nome + "\n"
                + "Tipo: Freelancer\n"
                + "Horas: " + horas + " x " + String.format("%.2f", valorHora) + "\n"
                + "Bruto: " + String.format("%.2f", salarioBruto()) + "\n"
                + "Descontos: " + String.format("%.2f", calculaImposto()) + "\n"
                + "Liquido: " + String.format("%.2f", salarioLiquido());
    }

    @Override
    public <T> T accept(FuncionarioVisitor<T> visitor) {
        return visitor.visitFreelancer(this);
    }
}
