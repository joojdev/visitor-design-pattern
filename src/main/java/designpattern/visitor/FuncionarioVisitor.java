package designpattern.visitor;

public interface FuncionarioVisitor<T> {

    T visitClt(Clt clt);

    T visitPj(Pj pj);

    T visitEstagiario(Estagiario estagiario);

    T visitFreelancer(Freelancer freelancer);
}
