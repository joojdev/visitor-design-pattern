package designpattern.visitor;

public interface Funcionario {

    String getNome();

    double salarioBruto();

    <T> T accept(FuncionarioVisitor<T> visitor);
}
