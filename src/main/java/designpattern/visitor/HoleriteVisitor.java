package designpattern.visitor;

public class HoleriteVisitor implements FuncionarioVisitor<String> {

    private ImpostoVisitor imposto = new ImpostoVisitor();
    private SalarioLiquidoVisitor liquido = new SalarioLiquidoVisitor();

    @Override
    public String visitClt(Clt clt) {
        return "Nome: " + clt.getNome() + "\n"
                + "Tipo: CLT\n"
                + "Bruto: " + String.format("%.2f", clt.salarioBruto()) + "\n"
                + "Descontos: " + String.format("%.2f", imposto.visitClt(clt)) + "\n"
                + "Liquido: " + String.format("%.2f", liquido.visitClt(clt));
    }

    @Override
    public String visitPj(Pj pj) {
        return "Nome: " + pj.getNome() + "\n"
                + "Tipo: PJ (" + pj.getTipo() + ")\n"
                + "Bruto: " + String.format("%.2f", pj.salarioBruto()) + "\n"
                + "Descontos: " + String.format("%.2f", imposto.visitPj(pj)) + "\n"
                + "Liquido: " + String.format("%.2f", liquido.visitPj(pj));
    }

    @Override
    public String visitEstagiario(Estagiario estagiario) {
        return "Nome: " + estagiario.getNome() + "\n"
                + "Tipo: Estagiario\n"
                + "Bruto: " + String.format("%.2f", estagiario.salarioBruto()) + "\n"
                + "Auxilio transporte: " + String.format("%.2f", estagiario.getAuxilioTransporte()) + "\n"
                + "Descontos: " + String.format("%.2f", imposto.visitEstagiario(estagiario)) + "\n"
                + "Liquido: " + String.format("%.2f", liquido.visitEstagiario(estagiario));
    }

    @Override
    public String visitFreelancer(Freelancer freelancer) {
        return "Nome: " + freelancer.getNome() + "\n"
                + "Tipo: Freelancer\n"
                + "Horas: " + freelancer.getHoras() + " x " + String.format("%.2f", freelancer.getValorHora()) + "\n"
                + "Bruto: " + String.format("%.2f", freelancer.salarioBruto()) + "\n"
                + "Descontos: " + String.format("%.2f", imposto.visitFreelancer(freelancer)) + "\n"
                + "Liquido: " + String.format("%.2f", liquido.visitFreelancer(freelancer));
    }
}
