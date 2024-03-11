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
