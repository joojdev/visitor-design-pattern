package designpattern.visitor;

public class Main {

    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();
        folha.adiciona(new Clt("Joao", 5000));
        folha.adiciona(new Pj("Maria", 8000, TipoPj.ME));
        folha.adiciona(new Pj("Carlos", 4500, TipoPj.MEI));
        folha.adiciona(new Estagiario("Ana", 1200, 200));
        folha.adiciona(new Freelancer("Pedro", 40, 50));

        System.out.println(folha.holerites());
        System.out.println("Total impostos: " + String.format("%.2f", folha.totalImpostos()));
        System.out.println("Total liquido: " + String.format("%.2f", folha.totalLiquido()));
    }
}
