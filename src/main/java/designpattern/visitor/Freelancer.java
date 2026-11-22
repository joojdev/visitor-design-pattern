package designpattern.visitor;

public class Freelancer implements Funcionario {

    private String nome;
    private int horas;
    private double valorHora;

    public Freelancer(String nome, int horas, double valorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public String getNome() {
        return nome;
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
    public <T> T accept(FuncionarioVisitor<T> visitor) {
        return visitor.visitFreelancer(this);
    }
}
