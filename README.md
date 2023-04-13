# POO.Java
## Começando a aprender programação Orientada a Objetos (POO) no java.
Este repositório é um repositório de estudo.
## Como usar POO em Java com o VS Code e um exemplo.!
- Abra o VS Code e crie um novo arquivo Java.

- Crie uma classe "Pessoa" com os campos "nome" e "idade" e um construtor que inicializa esses campos.
```
public class Pessoa {
   String nome;
   int idade;
   
   public Pessoa(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
   }
}
```
- Adicione um método "saudar" que imprime uma saudação com o nome e a idade da pessoa.
```
public class Pessoa {
   String nome;
   int idade;
   
   public Pessoa(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
   }
   
   public void saudar() {
      System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos.");
   }
}
```
-Crie um objeto "pessoa" e chame o método "saudar".
```
public class Main {
   public static void main(String[] args) {
      Pessoa pessoa = new Pessoa("João", 30);
      pessoa.saudar();
   }
}
```
Execute o programa e verifique se a saudação foi impressa corretamente.

# 5 exercícios para praticar POO em Java:
- Crie uma classe "Carro" com os campos "modelo", "ano" e "preço". Adicione um método "desconto" que recebe um valor como parâmetro e diminui o preço do carro por esse valor.[Clique aqui para acessar o exer 1 ](https://github.com/MarcoAntonioMj/POO.Java/tree/main/Atividade%201)

- Crie uma classe "conta" com os métodos "depositar", "sacar", "inicializarConta" e "exibirDados". A classe deve conter os atributos "numero" e "saldo". O método "sacar" deve verificar se o valor do saque é maior que o saldo disponível. O programa deve ter uma opção para o usuário selecionar qual operação realizar (depósito, saque, mostrar dados da conta ou sair). O programa deve continuar em execução até que o usuário selecione a opção "sair"..[Clique aqui para acessar o exer 2 ](https://github.com/MarcoAntonioMj/POO.Java/tree/main/Atividade%202)

- Crie uma classe "Retangulo" com os campos "base" e "altura". Adicione métodos "area" e "perimetro" que calculam a área e o perímetro do retângulo..[Clique aqui para acessar o exer 3 ] (https://github.com/MarcoAntonioMj/POO.Java/tree/main/Atividade%203)

- Crie uma classe "Aluno" com os campos "nome", "idade" e "notas". Adicione um método "media" que calcula a média das notas do aluno..[Clique aqui para acessar o exer 4 ](https://github.com/MarcoAntonioMj/POO.Java/tree/main/Atividade%204)

- Crie uma classe "Banco" com os campos "nome" e "contas". Adicione métodos "criarConta" e "excluirConta" que adicionam e removem contas da lista de contas do banco. Adicione um método "total" que calcula o saldo total de todas as contas do banco.

Dicas:

1. Para cada exercício, comece criando a classe com seus campos.
2. Pense nos métodos que essa classe precisaria ter para realizar as operações desejadas.
3. Adicione os métodos e implemente sua lógica.
4. Para testar a classe, crie objetos no método "main" e chame os métodos implementados, verificando se os resultados estão corretos.
5. Lembre-se de seguir os princípios da POO, como encapsulamento e herança, para tornar seu código mais organizado e reutilizável.
# Encapsulamento: 
É um mecanismo que permite que os dados de uma classe sejam protegidos e manipulados apenas pelos métodos da própria classe. Isso significa que os dados são escondidos de outras classes e só podem ser acessados por meio de métodos públicos que são definidos na própria classe. O encapsulamento é importante porque permite que as alterações sejam feitas em uma classe sem afetar outras partes do programa que a utilizam. Também ajuda a manter a consistência dos dados e a evitar erros de programação.
# Herança:
É um mecanismo que permite criar uma nova classe a partir de uma classe existente, aproveitando seus atributos e métodos. A nova classe é chamada de classe derivada ou subclasse, e a classe existente é chamada de classe base ou superclasse. A subclasse pode adicionar novos atributos e métodos, ou substituir os métodos existentes da superclasse. A herança é importante porque permite a reutilização de código e facilita a criação de hierarquias de classes que refletem a organização do mundo real.

Esses conceitos são fundamentais para o desenvolvimento de software em POO e ajudam a tornar o código mais organizado, modular e reutilizável.

# Primeira atividade

## Primeira atividade fiz em dupla com um colega listarei as etapas e as dificuldades encontradas ;
Descrição geral: Hoje trabalhamos juntos para criar um programa que permite ao usuário escolher um modelo de carro, informar o ano e o preço do carro, e aplicar um desconto se o preço for maior que R$ 15.000.

Tecnologias utilizadas: Java

Etapas do projeto:

1. Definimos o escopo do projeto e identificamos as funcionalidades necessárias.
2. Criamos uma classe chamada "carro" para armazenar informações do carro, como preço e desconto aplicado.
3. Implementamos o método "aplicarDesconto()" na classe "carro", que verifica se o preço é maior que R$ 15.000 e aplica um desconto de 10%.
4. Criamos uma classe principal chamada "App" para lidar com a interação com o usuário.
5. Adicionamos um menu para que o usuário possa selecionar um modelo de carro.
6. Implementamos a lógica para que o usuário possa escolher novamente caso selecione uma opção inválida.
7. Adicionamos a opção para o usuário informar o ano e preço do carro.
8. Implementamos a lógica para aplicar o desconto no preço do carro caso o preço seja maior que R$ 15.000.
9. Finalizamos o programa e testamos para garantir que todas as funcionalidades estavam funcionando corretamente.
##  Dificuldades encontradas:

No início, tivemos dificuldade em entender como implementar a lógica para aplicar o desconto no preço do carro. Foi necessário revisar alguns conceitos de programação orientada a objetos para criar a classe "carro" e o método "aplicarDesconto()" corretamente.
Também tivemos dificuldade em lidar com a interação com o usuário e garantir que o programa fosse capaz de lidar com entradas inválidas do usuário. Foi necessário implementar a lógica para permitir que o usuário escolha novamente caso selecione uma opção inválida.
Como resolvemos as dificuldades:

Revisamos conceitos de programação orientada a objetos e utilizamos exemplos de implementações similares para criar a classe "carro" e o método "aplicarDesconto()" corretamente.
Implementamos a lógica para lidar com entradas inválidas do usuário utilizando o comando "switch" e um loop "while" para garantir que o programa permita que o usuário selecione novamente caso selecione uma opção inválida.

## segunda atividade

Descrição do Projeto:
Este projeto consiste na implementação de uma aplicação bancária simples que permite realizar operações básicas de depósito e saque em uma conta bancária. Para isso, é criada uma classe chamada "Conta" que possui as informações necessárias para representar uma conta bancária, como número e saldo.

Etapas do Projeto:

1. Inicialização da conta bancária com um número predefinido;
2. Criação do menu de opções para que o usuário possa escolher entre depositar, sacar ou mostrar informações da conta;
3. Implementação das funcionalidades de depósito, saque e exibição de informações da conta;
4. Verificação da possibilidade de realizar um saque com o saldo atual da conta;
5. Finalização do programa e teste das funcionalidades implementadas.

## Terceira atividade
Este é um simples programa em Java que calcula a área e o perímetro de um retângulo. O programa consiste em uma classe Retangulo que possui os atributos base e altura, bem como métodos para calcular a área e o perímetro.

Também há uma classe Retangulotest que realiza testes unitários na classe Retangulo. E, por fim, há uma classe App que utiliza a classe Retangulo para pedir ao usuário a base e a altura do retângulo e exibe os resultados na tela.
Uma coisa difente que fiz das outras atividades vou adicionar  um teste que ficou assim :

```
package calculo;

import org.junit.Test;
import static org.junit.Assert.*;

public class Retangulotest {
  @Test
  public void testArea() {
    Retangulo retangulo = new Retangulo(5, 10);
    double resultado = retangulo.area();
    double esperado = 50;
    assertEquals(esperado, resultado, 0);
  }
}
```
Se quiser ver mais sobre os teste que eu estou aprendendo a fazer [clique aqui](https://github.com/MarcoAntonioMj/calculadora-java-junit)
## Quarta  atividade
O código se trata de um programa que lê as notas de um aluno em três disciplinas (matemática, português e ciências), calcula a média das notas e exibe o resultado na tela, junto com o nome e a idade do aluno.

A classe Notas é responsável por armazenar as notas do aluno e calcular a média. Ela possui um construtor que recebe as notas como parâmetros e métodos para acessar e modificar cada uma delas. O método media calcula a média das notas.

A classe Main é responsável por ler os dados do aluno (nome, idade e notas), criar um objeto da classe Notas, calcular a média e exibir as informações na tela
