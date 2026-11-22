package designpattern.visitor;

public class Estagiario implements Funcionario {

    private String nome;
    private double bolsa;
    private double auxilioTransporte;

    public Estagiario(String nome, double bolsa, double auxilioTransporte) {
        this.nome = nome;
        this.bolsa = bolsa;
        this.auxilioTransporte = auxilioTransporte;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public double getBolsa() {
        return bolsa;
    }

    public double getAuxilioTransporte() {
        return auxilioTransporte;
    }

    @Override
    public double salarioBruto() {
        return bolsa;
    }

    @Override
    public <T> T accept(FuncionarioVisitor<T> visitor) {
        return visitor.visitEstagiario(this);
    }
}
