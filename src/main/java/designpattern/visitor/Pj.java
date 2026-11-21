package designpattern.visitor;

public class Pj extends Funcionario {

    private double valorNota;
    private TipoPj tipo;

    public Pj(String nome, double valorNota, TipoPj tipo) {
        super(nome);
        this.valorNota = valorNota;
        this.tipo = tipo;
    }

    public double getValorNota() {
        return valorNota;
    }

    public TipoPj getTipo() {
        return tipo;
    }

    @Override
    public double salarioBruto() {
        return valorNota;
    }
}
