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

    @Override
    public double calculaImposto() {
        return 0;
    }

    @Override
    public double salarioLiquido() {
        return bolsa + auxilioTransporte;
    }

    @Override
    public String holerite() {
        return "Nome: " + nome + "\n"
                + "Tipo: Estagiario\n"
                + "Bruto: " + String.format("%.2f", salarioBruto()) + "\n"
                + "Auxilio transporte: " + String.format("%.2f", auxilioTransporte) + "\n"
                + "Descontos: " + String.format("%.2f", calculaImposto()) + "\n"
                + "Liquido: " + String.format("%.2f", salarioLiquido());
    }

    @Override
    public <T> T accept(FuncionarioVisitor<T> visitor) {
        return visitor.visitEstagiario(this);
    }
}
