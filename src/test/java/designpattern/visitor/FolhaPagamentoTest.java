package designpattern.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FolhaPagamentoTest {

    @Test
    void somaImpostosELiquidoDeTodos() {
        FolhaPagamento folha = new FolhaPagamento();
        folha.adiciona(new Clt("Joao", 5000));
        folha.adiciona(new Pj("Maria", 5000, TipoPj.ME));
        folha.adiciona(new Estagiario("Ana", 1200, 200));
        folha.adiciona(new Freelancer("Pedro", 40, 50));

        assertEquals(1325, folha.totalImpostos(), 0.01);
        assertEquals(12075, folha.totalLiquido(), 0.01);
    }

    @Test
    void holeritesTemTodosOsNomes() {
        FolhaPagamento folha = new FolhaPagamento();
        folha.adiciona(new Clt("Joao", 5000));
        folha.adiciona(new Pj("Carlos", 4500, TipoPj.MEI));

        String h = folha.holerites();
        assertTrue(h.contains("Joao"));
        assertTrue(h.contains("Carlos"));
    }

    @Test
    void folhaVazia() {
        FolhaPagamento folha = new FolhaPagamento();
        assertEquals(0, folha.totalImpostos());
        assertEquals("", folha.holerites());
    }
}
