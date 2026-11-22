package designpattern.visitor;

public class Pj implements Funcionario {

    private String nome;
    private double valorNota;
    private TipoPj tipo;

    public Pj(String nome, double valorNota, TipoPj tipo) {
        this.nome = nome;
        this.valorNota = valorNota;
        this.tipo = tipo;
    }

    @Override
    public String getNome() {
        return nome;
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

    @Override
    public <T> T accept(FuncionarioVisitor<T> visitor) {
        return visitor.visitPj(this);
    }
}
