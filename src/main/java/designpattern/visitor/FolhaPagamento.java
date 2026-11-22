package designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adiciona(Funcionario f) {
        funcionarios.add(f);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public <T> List<T> aplica(FuncionarioVisitor<T> visitor) {
        List<T> resultado = new ArrayList<>();
        for (Funcionario f : funcionarios) {
            resultado.add(f.accept(visitor));
        }
        return resultado;
    }

    public double totalImpostos() {
        double total = 0;
        for (double v : aplica(new ImpostoVisitor())) {
            total += v;
        }
        return total;
    }

    public double totalLiquido() {
        double total = 0;
        for (double v : aplica(new SalarioLiquidoVisitor())) {
            total += v;
        }
        return total;
    }

    public String holerites() {
        StringBuilder sb = new StringBuilder();
        for (String h : aplica(new HoleriteVisitor())) {
            sb.append(h);
            sb.append("\n----------------\n");
        }
        return sb.toString();
    }
}
