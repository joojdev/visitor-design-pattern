package designpattern.visitor;

public class SalarioLiquidoVisitor implements FuncionarioVisitor<Double> {

    private ImpostoVisitor imposto = new ImpostoVisitor();

    @Override
    public Double visitClt(Clt clt) {
        return clt.salarioBruto() - imposto.visitClt(clt);
    }

    @Override
    public Double visitPj(Pj pj) {
        return pj.salarioBruto() - imposto.visitPj(pj);
    }

    @Override
    public Double visitEstagiario(Estagiario estagiario) {
        return estagiario.salarioBruto() + estagiario.getAuxilioTransporte();
    }

    @Override
    public Double visitFreelancer(Freelancer freelancer) {
        return freelancer.salarioBruto() - imposto.visitFreelancer(freelancer);
    }
}
