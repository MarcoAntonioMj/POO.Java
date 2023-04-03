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
- Crie uma classe "Carro" com os campos "modelo", "ano" e "preço". Adicione um método "desconto" que recebe um valor como parâmetro e diminui o preço do carro por esse valor.

 - Crie uma classe "ContaBancaria" com os campos "titular", "saldo" e "limite". Adicione métodos "depositar" e "sacar" que atualizam o saldo da conta. Certifique-se de que o método "sacar" não permita que o saldo da conta fique negativo.

- Crie uma classe "Retangulo" com os campos "base" e "altura". Adicione métodos "area" e "perimetro" que calculam a área e o perímetro do retângulo.

- Crie uma classe "Aluno" com os campos "nome", "idade" e "notas". Adicione um método "media" que calcula a média das notas do aluno.

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
