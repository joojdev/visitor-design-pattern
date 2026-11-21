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

    public double totalImpostos() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.calculaImposto();
        }
        return total;
    }

    public double totalLiquido() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.salarioLiquido();
        }
        return total;
    }

    public String holerites() {
        StringBuilder sb = new StringBuilder();
        for (Funcionario f : funcionarios) {
            sb.append(f.holerite());
            sb.append("\n----------------\n");
        }
        return sb.toString();
    }
}
