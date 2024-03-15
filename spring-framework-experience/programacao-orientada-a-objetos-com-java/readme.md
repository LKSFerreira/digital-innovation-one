# Programação Orientada a Objetos

## Por que programar orientado a objetos?

- Reutilização de código
- Facilidade de manutenção
- Melhor compreensão do código
- Foca na modelagem do mundo real
- Ajuda na organização do código
- Foca no que fazer

## Vantagens da POO

- Melhor coesão
- Criar acoplamentos da melhor forma possível, tornando mais flexível
- Diminuição do GAP semântico
- Coletor de lixo - Garbage Collector que é um processo que gerencia a memória do computador

```md
## Programação Estruturada

A **programação estruturada** é um paradigma que promove a clareza e a organização sistemática dos programas. Ela se baseia em:

- **Sequência**: Execução linear de comandos.
- **Seleção**: Estruturas de decisão (`if`, `switch`).
- **Iteração**: Loops (`for`, `while`, `do-while`).
- **Subprogramas**: Funções e procedimentos para reuso de código.

Evita-se o uso de `goto`, favorecendo a legibilidade e a manutenção do código.

## Programação Orientada a Objetos (POO)

A **POO** é um paradigma baseado em "objetos" que encapsulam dados e métodos. Seus pilares são:

- **Abstração**: Simplificação de sistemas complexos, destacando o essencial.
- **Encapsulamento**: Dados e métodos são protegidos dentro do objeto.
- **Herança**: Criação de novas classes a partir de classes existentes.
- **Polimorfismo**: Objetos de diferentes classes podem ser tratados como instâncias de uma classe base.

A POO é ideal para modelar sistemas complexos e facilitar a manutenção do código.
```

## Exercício:

Modele uma entidade Livro de uma loja online

- Livro
  - Título
  - Autor
  - Descrição
  - Ano de publicação
  - Editora
  - ISBN
  - Preço

### Estruturas básicas da OO

- Classe
- Atributo
- Método
- Objeto
- Mensagem

### Classe

- É uma estrutura que abstrai um conjunto de objetos com características similares.
- Define o comportamento dos objetos que serão criados a partir dela.

Exemplo:

- Bola, Carro, Pessoa, Livro, etc.

Dicas: Classes são substantivos, Nomes significativos, Contexto deve ser considerado.

Exemplo:

- Uma pessoa em um contexto de uma sistema de loja, poderia ser nomeado como Cliente.
- Uma pessoa em um contexto de um sistema de ensino, poderia ser nomeado como Aluno.

Código:
Java:

```java
class Carro{

}
```

C#:

```csharp
class Carro{

}
```

Python:

```python
class Carro:
    pass
```

Obs: O palavra reservada `pass` é utilizada para indicar que a classe está vazia e não apresentar nenhum erro durante a execução do código

### Atributo

- É uma característica do objeto, define a estrutura de dados do objeto. Representando um conceito do mundo real que pode ser armazenado.

Exemplo:

- Cor, Modelo, Marca, Ano, Altura, Idade, Nome, Conjunto de dados, Lista de Endeços, etc.

Dicas: Atributos são adjetivos, Nomes significativos, Contexto deve ser considerado, Abstração, Tipos adequados.

Código:
Java:

```java
class Carro{
    String cor;
    String modelo;
    String marca;
    int ano;
}
```

C#:

```csharp
class Carro{
    string cor;
    string modelo;
    string marca;
    int ano;
}
```

Python:

```python
class Carro:
    cor = ""
    modelo = ""
    marca = ""
    ano = 0
```

### Método

- É uma ação que o objeto pode realizar, define o comportamento do objeto. Representando um conceito do mundo real que pode ser executado.

Exemplo:

- Andar, Correr, Pular, Falar, Comer, Dormir, Calcular, Listar, etc.

Dicas: Métodos são verbos, Nomes significativos, Contexto deve ser considerado, Abstração, Reuso de código.

Criação de métodos:

Em java e C# um método deve ter:

- Modificador de acesso: public, private, protected, default
- Tipo de retorno: void, int, String, boolean, etc.
- Nome do método: Nomes significativos, Contexto deve ser considerado
- Parâmetros: Tipos e nomes significativos, Contexto deve ser considerado

Em Python um método deve ter:

- Nome do método: Nomes significativos, Contexto deve ser considerado
- Parâmetros: Tipos e nomes significativos, Contexto deve ser considerado
- O método deve ser definido com a palavra reservada `def`

Código:
Java:

```java
class Carro{
    String cor;
    String modelo;
    String marca;
    int ano;

    public void acelerar(){
        System.out.println("Acelerando...");
    }
}
```

C#:

```csharp
class Carro{
    string cor;
    string modelo;
    string marca;
    int ano;

    public void Acelerar(){
        Console.WriteLine("Acelerando...");
    }
}
```

Python:

```python
class Carro:
    cor = ""
    modelo = ""
    marca = ""
    ano = 0

    def acelerar(self):
        print("Acelerando...")
```

### Métodos especiais

- Construtor: Método que é chamado no momento da criação do objeto. É utilizado para inicializar os atributos do objeto.
  código:
  Java:

```java
class Carro{
    String cor;
    String modelo;
    String marca;
    int ano;

    public Carro(String cor, String modelo, String marca, int ano){
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }
}
```

C#:

```csharp
class Carro{
    string cor;
    string modelo;
    string marca;
    int ano;

    public Carro(string cor, string modelo, string marca, int ano){
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }
}
```

Python:

```python
class Carro:
    cor = ""
    modelo = ""
    marca = ""
    ano = 0

    def __init__(self, cor, modelo, marca, ano):
        self.cor = cor
        self.modelo = modelo
        self.marca = marca
        self.ano = ano
```

- Destrutor: Método que é chamado no momento da destruição do objeto. É utilizado para liberar recursos alocados pelo objeto.
  código:
  Java:

```java
class Carro{
    protected void finalize(){
        System.out.println("Objeto destruído");
    }
}
```

C#:

```csharp
class Carro{
    ~Carro(){
        Console.WriteLine("Objeto destruído");
    }
}
```

Python:

```python
class Carro:
    def __del__(self):
        print("Objeto destruído")
```

### Sobrecarga de métodos

- É a capacidade de um método ter o mesmo nome, mas com diferentes parâmetros (assinarura do método).
- Em Java e C# é possível sobrecarregar métodos.
- Em Python não é possível sobrecarregar métodos.

código:
Java:

```java
class Carro{
    String cor;
    String modelo;
    String marca;
    int ano;

    public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void acelerar(int velocidade){
        System.out.println("Acelerando a " + velocidade + " km/h");
    }
}
```

C#:

```csharp
class Carro{
    string cor;
    string modelo;
    string marca;
    int ano;

    public void Acelerar(){
        Console.WriteLine("Acelerando...");
    }

    public void Acelerar(int velocidade){
        Console.WriteLine("Acelerando a " + velocidade + " km/h");
    }
}
```

Python:

```python
class Carro:
    cor = ""
    modelo = ""
    marca = ""
    ano = 0

    def acelerar(self):
        print("Acelerando...")

    def acelerar(self, velocidade):
        print("Acelerando a " + str(velocidade) + " km/h")
```

Apesa de ser possível definir métodos com o mesmo nome, o Python irá considerar apenas o último método definido.
Caso você tente chamar o método `acelerar` sem passar o parâmetro `velocidade` irá ocorrer um erro.

Uma maneira de escrever um método em python que pode ou não receber parâmetros é utilizando o valor padrão `None` para o parâmetro.

```python
class Carro:
    cor = ""
    modelo = ""
    marca = ""
    ano = 0

    def acelerar(self, velocidade=None):
        if velocidade is not None:
            print("Acelerando a " + str(velocidade) + " km/h")
        else:
            print("Acelerando...")
```

### Objeto

- É uma instância de uma classe, representa um conceito do mundo real que pode ser armazenado e executado.
- A diferença entre classe e objeto é que a classe é a definição do objeto e o objeto é a instância da classe.
- A classe é o molde e o objeto é a instância que existe na memória.

código:
Java:

```java
class Carro{
    String cor;
    String modelo;
    String marca;
    int ano;

    public void acelerar(){
        System.out.println("Acelerando...");
    }
}

public class Main{
    public static void main(String[] args){
        Carro carro = new Carro();
    }
}
```

C#:

```csharp
class Carro{
    string cor;
    string modelo;
    string marca;
    int ano;

    public void Acelerar(){
        Console.WriteLine("Acelerando...");
    }
}

class Main{
    static void Main(string[] args){
        Carro carro = new Carro();
    }
}
```

Python:

```python
class Carro:
    cor = ""
    modelo = ""
    marca = ""
    ano = 0

    def acelerar(self):
        print("Acelerando...")

carro = Carro()
```

### Mensagem

- É a comunicação entre objetos, é a forma como um objeto solicita a outro objeto que execute um método.
- É a chama de um método de um objeto, troca de informações entre objetos ou classes.

código:
Java:

```java
class Carro{
    String cor;
    String modelo;
    String marca;
    int ano;

    public void acelerar(){
        System.out.println("Acelerando...");
    }
}

// Carro carro = new Carror();
// carro.<método> (não estático)
// Carror.<método> (estático)

public class Main{
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.acelerar();
    }
}
```

C#:

```csharp
class Carro{
    string cor;
    string modelo;
    string marca;
    int ano;

    public void Acelerar(){
        Console.WriteLine("Acelerando...");
    }
}

// Carro carro = new Carror();
// carro.<método> (não estático)
// Carror.<método> (estático)

class Main{
    static void Main(string[] args){
        Carro carro = new Carro();
        carro.Acelerar();
    }
}
```

#### Sobre métodos de instância e métodos estáticos em Python:

- **Métodos de Instância**: São os métodos mais comuns que você define em uma classe. Eles operam em uma instância da classe (um objeto) e têm acesso ao estado dessa instância. Eles requerem uma referência a uma instância (geralmente referida como `self`) como seu primeiro parâmetro.

- **Métodos Estáticos**: São métodos que não operam em uma instância da classe e, portanto, não têm acesso ao estado da instância (`self`). Eles são definidos com o decorador `@staticmethod` e podem ser chamados tanto na classe quanto em uma instância, sem requerer uma referência a uma instância.

No seu exemplo, `acelerar` é um método de instância, porque recebe `self` como o primeiro parâmetro. Para ilustrar a diferença entre métodos de instância e estáticos, aqui está uma classe `Carro` modificada que inclui ambos:

```python
class Carro:
    cor = ""
    modelo = ""
    marca = ""
    ano = 0

    def acelerar(self):  # Isto é um método de instância.
        print("Acelerando...")

    @staticmethod
    def buzinar():  # Isto é um método estático.
        print("Buzinando...")

# Criando uma instância da classe Carro
carro = Carro()

# Chamando o método de instância
carro.acelerar()  # Isso está correto.

# Chamando o método estático
Carro.buzinar()   # Isso está correto e é um método estático.
carro.buzinar()   # Isso também está correto e é um método estático.
```

Observe que o método `buzinar` é um método estático e pode ser chamado diretamente na classe sem criar uma instância. Ele também pode ser chamado em uma instância, mas não tem acesso à instância específica (ou seja, não tem acesso ao `self`).

A linha `Carro.acelerar()` no seu exemplo original não está correta, pois `acelerar` é um método de instância que requer um objeto `Carro` para ser chamado, e você deve passar a instância como argumento se chamar o método diretamente na classe, assim: `Carro.acelerar(carro)`. No entanto, a forma usual e recomendada de chamar um método de instância é através de uma instância da classe, como feito com `carro.acelerar()`.

### Herança

- É a capacidade de criar uma nova classe a partir de uma classe existente.
- A nova classe herda os atributos e métodos da classe existente.
- A classe existente é chamada de classe base ou superclasse.
- A nova classe é chamada de classe derivada ou subclasse.

A verdadeira utilidade da herança é a capacidade de estender a funcionalidade de uma classe existente sem precisar reescrever o código, podendo assim criar subtipos, ou seja, tipos mais específicos de um tipo existente. O reuso é apenas uma consequência da herança.

Código:

Java:

```java
class Veiculo{
    String cor;
    String modelo;
    String marca;
    int ano;

    public void acelerar(){
        System.out.println("Acelerando...");
    }
}

class Carro extends Veiculo{
    int portas;
    int capacidade;
}
```

C#:

```csharp
class Veiculo{
    string cor;
    string modelo;
    string marca;
    int ano;

    public void Acelerar(){
        Console.WriteLine("Acelerando...");
    }
}

class Carro : Veiculo{
    int portas;
    int capacidade;
}
```

Python:

```python
class Veiculo:
    cor = ""
    modelo = ""
    marca = ""
    ano = 0

    def acelerar(self):
        print("Acelerando...")

class Carro(Veiculo):
    portas = 0
    capacidade = 0
```

#### Tipos de Herança

- Herança Simples: Uma classe derivada herda de uma única classe base.
- Herança Múltipla: Uma classe derivada herda de múltiplas classes base.

Algumas linguagens de programação como Java e C# não suportam herança múltipla, mas permitem a implementação de múltiplas interfaces.
Já Python suporta herança múltipla.

Código:
Python:

```python
class A(B, C):
    pass
```

### Upcasting e Downcasting

- **Upcasting**: É a conversão de um objeto de uma classe derivada para uma classe base.
- **Downcasting**: É a conversão de um objeto de uma classe base para uma classe derivada.

Código:

Java Upcasting:

```java
Veiculo veiculo = new Carro();
```

C# Upcasting:

```csharp
Veiculo veiculo = new Carro();
```

Python Upcasting:

```python
Em Python não é necessário fazer upcasting, pois o Python é uma linguagem de tipagem dinâmica. (Duck Typing)
```

Java Downcasting:

```java
Veiculo veiculo = new Carro();
Carro carro = (Carro) veiculo;
```

C# Downcasting:

```csharp
Veiculo veiculo = new Carro();
Carro carro = (Carro) veiculo;
```

Python Downcasting:

```python
Em Python não é necessário fazer downcasting, pois o Python é uma linguagem de tipagem dinâmica. (Duck Typing)
```

### Polimorfismo e Sobreescrita

- **Polimorfismo**: É a capacidade de um objeto ser referenciado de várias formas. "A mesma ação, se comportando de maneiras diferentes".

- **Sobreescrita**: É a capacidade de uma classe derivada de fornecer uma implementação específica de um método que já foi fornecido por uma de suas classes base.

Codigo:

Java:

```java
class Veiculo{
    String cor;
    String modelo;
    String marca;
    int ano;

    public void acelerar(){
        System.out.println("Acelerando...");
    }
}

class Carro extends Veiculo{
    int portas;
    int capacidade;

    @Override
    public void acelerar(){
        System.out.println("Acelerando o carro...");
    }
}
```

C#:

```csharp
class Veiculo{
    string cor;
    string modelo;
    string marca;
    int ano;

    public void Acelerar(){
        Console.WriteLine("Acelerando...");
    }
}

class Carro : Veiculo{
    int portas;
    int capacidade;

    public override void Acelerar(){
        Console.WriteLine("Acelerando o carro...");
    }
}
```

Python:

```python
class Veiculo:
    cor = ""
    modelo = ""
    marca = ""
    ano = 0

    def acelerar(self):
        print("Acelerando...")

class Carro(Veiculo):
    portas = 0
    capacidade = 0

    def acelerar(self):
        print("Acelerando o carro...")
```

#### Associção

- Possibilita um relacionamento entre classes/opjetos, no qual estes possam pedir "ajuda" a outras classes/objetos e representar de forma mais completa o conceito ao qual se destinam. Neste tipo de relacionamento, as classes e objetos interagem entre si, para atingir seus objetivos.

- Tipos de associação:

  - Estrutural
    - Composição
    - Agregação
  - Comportamental
    - Dependência

- **Composição**: Imagine que você está montando um modelo de carro de brinquedo. O carro (o "todo") é feito de várias peças, como rodas, motor e carroceria (as "partes"). Se você tirar todas as peças, o carro deixa de existir como um carro. Isso é composição: as peças são essenciais para a existência do todo. No mundo da programação, isso significa que se você tem uma classe que contém outra classe, a classe contida não pode existir sem a classe que a contém.

Exemplo simplificado:

```java
class Carro {
    Motor motor;
}

class Motor {
    // Detalhes do motor
}
```

Um `Carro` tem um `Motor`, e o `Motor` não faz sentido existir sem o `Carro`.

- **Agregação**: Agora, pense em uma sala de aula. A sala (o "todo") é usada por vários alunos (as "partes"), mas os alunos não dependem da sala para existir. Eles podem ir para outras salas ou ficar em casa. Na agregação, as partes podem existir separadamente do todo. Em termos de programação, isso significa que uma classe pode conter outra classe, mas a classe contida pode existir por conta própria.

Exemplo simplificado:

```java
class SalaDeAula {
    Aluno[] alunos;
}

class Aluno {
    // Detalhes do aluno
}
```

Neste caso, a `SalaDeAula` tem `Alunos`, mas os `Alunos` podem existir sem a `SalaDeAula`.

- **Dependência**: Imagine que você tem uma classe `A` que precisa de uma classe `B` para fazer alguma coisa. Isso é uma dependência. A classe `A` depende da classe `B`.

Codigo:

```java
class Compra {
    private Cupom cupom;

    public void finalizar(Cupom cupom) {
        // Detalhes da compra
    }
}
```

### Interface
- É um tipo de referência similar a uma classe, que é puramente abstrata, ou seja, não contém implementação de métodos.
- Uma classe pode implementar uma ou mais interfaces.
- Uma interface pode herdar de uma ou mais interfaces.

Quem implementa a interface deve implementar todos os métodos da interface.

- **Contratos**: Pode-se dizer que uma interface funciona como um contrato. Quando uma classe implementa uma interface, ela se compromete a fornecer comportamentos específicos (métodos) que a interface define.

- **Polimorfismo**: Interfaces são uma forma de alcançar polimorfismo em linguagens como Java. Elas permitem que objetos de diferentes classes sejam tratados de forma uniforme, desde que todas implementem a mesma interface.

- **Separação de conceitos**: Interfaces ajudam a separar o que algo faz (interface) de como algo é feito (implementação). Isso permite mudar a implementação sem alterar o código que usa a interface.

- **Extensibilidade**: Interfaces permitem que novas funcionalidades sejam adicionadas sem comprometer as classes existentes, facilitando a extensibilidade do código.

- **Múltiplas implementações**: Uma classe pode implementar várias interfaces, o que permite combinar comportamentos de diferentes fontes.

- **Métodos padrão (Java 8+)**: A partir do Java 8, interfaces podem conter métodos padrão com implementação, permitindo que novos métodos sejam adicionados a interfaces sem afetar as classes que já as implementam.

- **Métodos estáticos**: Interfaces também podem ter métodos estáticos, que podem ser chamados independentemente de uma instância de uma classe que implementa a interface.

```java
interface Animal {
    void fazerSom();
}

class Cachorro implements Animal {
    public void fazerSom() {
        System.out.println("Au au!");
    }
}

class Gato implements Animal {
    public void fazerSom() {
        System.out.println("Miau!");
    }
}

public class App {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();
        
        meuCachorro.fazerSom(); // Imprime: Au au!
        meuGato.fazerSom();     // Imprime: Miau!
    }
}
```

Neste exemplo, `Animal` é uma interface com um método `fazerSom()`. As classes `Cachorro` e `Gato` implementam a interface `Animal`, fornecendo suas próprias versões do método `fazerSom()`. No método `main`, tanto `Cachorro` quanto `Gato` são tratados como objetos do tipo `Animal`, demonstrando polimorfismo.