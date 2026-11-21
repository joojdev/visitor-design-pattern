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
}
