package designpattern.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void cltAbaixoDe3000SoPagaInss() {
        Clt clt = new Clt("Joao", 2000);
        assertEquals(220, clt.calculaImposto(), 0.01);
        assertEquals(1780, clt.salarioLiquido(), 0.01);
    }

    @Test
    void cltAcimaDe3000PagaInssEIr() {
        Clt clt = new Clt("Joao", 5000);
        assertEquals(925, clt.calculaImposto(), 0.01);
        assertEquals(4075, clt.salarioLiquido(), 0.01);
    }

    @Test
    void pjMeiPagaValorFixo() {
        Pj pj = new Pj("Carlos", 5000, TipoPj.MEI);
        assertEquals(80, pj.calculaImposto(), 0.01);
        assertEquals(4920, pj.salarioLiquido(), 0.01);
    }

    @Test
    void pjMePagaSeisPorCento() {
        Pj pj = new Pj("Maria", 5000, TipoPj.ME);
        assertEquals(300, pj.calculaImposto(), 0.01);
        assertEquals(4700, pj.salarioLiquido(), 0.01);
    }

    @Test
    void estagiarioNaoPagaImposto() {
        Estagiario e = new Estagiario("Ana", 1200, 200);
        assertEquals(0, e.calculaImposto(), 0.01);
        assertEquals(1400, e.salarioLiquido(), 0.01);
    }

    @Test
    void freelancerCalculaPorHora() {
        Freelancer f = new Freelancer("Pedro", 40, 50);
        assertEquals(2000, f.salarioBruto(), 0.01);
        assertEquals(100, f.calculaImposto(), 0.01);
        assertEquals(1900, f.salarioLiquido(), 0.01);
    }

    @Test
    void holeriteTemNomeELiquido() {
        Clt clt = new Clt("Joao", 5000);
        String h = clt.holerite();
        assertTrue(h.contains("Joao"));
        assertTrue(h.contains("CLT"));
        assertTrue(h.contains("4075"));
    }
}
