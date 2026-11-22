package designpattern.visitor;

public class ImpostoVisitor implements FuncionarioVisitor<Double> {

    @Override
    public Double visitClt(Clt clt) {
        double inss = clt.salarioBruto() * 0.11;
        double ir = 0;
        if (clt.salarioBruto() > 3000) {
            ir = clt.salarioBruto() * 0.075;
        }
        return inss + ir;
    }

    @Override
    public Double visitPj(Pj pj) {
        if (pj.getTipo() == TipoPj.MEI) {
            return 80.0;
        }
        return pj.salarioBruto() * 0.06;
    }

    @Override
    public Double visitEstagiario(Estagiario estagiario) {
        return 0.0;
    }

    @Override
    public Double visitFreelancer(Freelancer freelancer) {
        return freelancer.salarioBruto() * 0.05;
    }
}
