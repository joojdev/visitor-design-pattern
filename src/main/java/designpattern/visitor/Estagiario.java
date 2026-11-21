package designpattern.visitor;

public class Estagiario extends Funcionario {

    private double bolsa;
    private double auxilioTransporte;

    public Estagiario(String nome, double bolsa, double auxilioTransporte) {
        super(nome);
        this.bolsa = bolsa;
        this.auxilioTransporte = auxilioTransporte;
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
}
