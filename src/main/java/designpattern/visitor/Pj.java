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

    @Override
    public double calculaImposto() {
        if (tipo == TipoPj.MEI) {
            return 80;
        }
        return valorNota * 0.06;
    }

    @Override
    public double salarioLiquido() {
        return valorNota - calculaImposto();
    }

    @Override
    public String holerite() {
        return "Nome: " + nome + "\n"
                + "Tipo: PJ (" + tipo + ")\n"
                + "Bruto: " + String.format("%.2f", salarioBruto()) + "\n"
                + "Descontos: " + String.format("%.2f", calculaImposto()) + "\n"
                + "Liquido: " + String.format("%.2f", salarioLiquido());
    }
}
