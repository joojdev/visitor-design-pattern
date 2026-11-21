# folha de pagamento - visitor

Exemplo simples em Java pra mostrar o design pattern Visitor.

A aplicacao calcula a folha de pagamento de quatro tipos de funcionario:

- CLT: INSS 11% e IR 7,5% se o salario passar de 3000
- PJ: MEI paga R$ 80 fixo, ME paga 6% da nota
- Estagiario: sem desconto, recebe bolsa + auxilio transporte
- Freelancer: horas x valor da hora, 5% de ISS

As regras sao simplificadas, nao sao as tabelas reais.

## Branches

- `antes`: cada classe tem seus metodos de imposto, liquido e holerite
- `depois`: mesma coisa usando Visitor

## Rodar

```
mvn test
mvn compile exec:java -Dexec.mainClass=designpattern.visitor.Main
```

## Autores

- João Vitor Piovezan
- Artur Benatti Penetra
