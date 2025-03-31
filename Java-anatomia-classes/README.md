Palavras pré definidas para linguagem, consolidar todo aspecto estrutural ,endentado dentro do código 

- Estrutura inicial
- Padrão de nomenclatura
- Declaração de variáveis
- Identação
- Organizando arquivos(Pastas → Pacotes → Subdiretórios no Java)
- Java Bens (Estruturação no meu código)

Códigos de uma programa coerente , padrões, escrita de código classes , atribútos , métodos…

### Declaração de uma nova classe:

Todo código escrito dentro do bloco de código “{}”

**public class Minha class{**

**//seu código (conteúdo)**

**//códigos**

**//metodos** 

**//variaveis**

**}**

Criando uma classe : 

1. Criar projeto : ctrl + shift +p
2. Java Create Java Project 
3. No build
4. Determina um diretório padrão para o proj
5. eto 
6. Nomeie o projeto “Java-Anatomia-Classes”

**Pastas**

**lib**

**.vscode**

**src**

- App.java

```java
public class Java-Anatomia-Classe{
                     
    public static void main(String[] args) {
       
        System.out.println("Primeira Classe");
    }
}
```

README.md

---

```java
public class MinhaClasse{
   
    //                     Parâmetros argumentos
    public static void main(String[] args) {
        //inicializa classe
        //metodos
         //conteúdo
        //bloco de código
        //Imprimindo na tela 
        System.out.println("Primeira Classe");
    }
}//corpo da MinhaClasse
```

```java
Primeira Classe 
```

### Inicialização

Metodo de inicialização “Main”

public static void main(String[]args)

```java
public class MinhaClasse {
public static void main (String[]args){
    System.out.println("Bem vindo");
}
}

```

```java
Bem vindo
```

Toda classe dentro da pasta “src” do diretório 

### Estrutura de escrita

Arquivo .java → Letra maiúscula 

Mesmo nome do arquivo a classe 

Variáveis → Letra minúscula 

String BR = “Brasil”; 

double PI = 3.12;

```java
public class MetodoMain {
    public static void main(String[] args) {
        String BR = "Brasil";
        BR = "Brazil";//Trocando valor variavel
        int ano = 2023;
        ano = 2025;//Valor alterado
        System.out.println(BR);
        System.out.println(ano);
    }
}

```

```java
Brazil
2025
```

### Variáveis

Tipo → Nome da variável 

**String** nome=”Luiz Paulo”;

**int** idade = 25;

Deve iniciar letra minúscula ,sem espaços, nome bem definido 

```java
public class Variaveis {
public static void main(String[]args){
    String nome = "Luiz";
    int idade= 26; 
    int anoNascimento=1999;
    
    System.out.println(nome);
    System.out.println(idade);
    System.out.println(anoNascimento);

}
}

```

```java
Luiz
26
1999
```

### Double

double → Altura → 1.96 ,  números décimais 

**double** altura = 1.96;

```java
public class Variaveis {
public static void main(String[]args){
    String nome = "Luiz";
    int idade= 26;
    double altura = 1.96;
    
    System.out.println(nome);
    System.out.println(idade);
    System.out.println(altura);

}
}

```

```java
Luiz
26
1.96
```

### Declarando métodos

Tipo de retorno , nome objetivo no infinitivo 

int Somar (int numeroUm,int numeroDois)

String formatarCep (long cep)

```java
public class Metodo {
public static void main(String[] args) {
    String primeiroNome="Luiz";
    String segundoNome="Medeiros";
    String nomeCompleto=nomeCompleto(primeiroNome,segundoNome); 
    System.out.println(nomeCompleto);
}
    
public static String nomeCompleto(String primeiroNome,String segundoNome){
    return "resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}   

}

```

```java
resultado do método: Luiz Medeiros
```

### Identação

Visibilidade do código hierarquia de linha de código, facilidade da visualização do código , entendimento do programa 

```java
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal=8;
        if (mediaFinal<=6){
            System.out.println("Reprovado");
        }else if(mediaFinal>=6){
            System.out.println("Aprovado");
        }
    }

}

```

 

## Organização de arquivos

Packages → Pacotes 

Desenvolvimento de pequenas aplicações Java, pode ser viável manter o código em um mesmo diretório. Entretanto, para aplicações maiores, colocar todos os arquivos em um mesmo local, sem organização, pode aumentar a possibilidade de colisão de classes (classes com o mesmo nome no mesmo escopo) e dificultar a localização de um determinado código.

Em Java, a solução para esses problemas está na organização de classes em pacotes. Um pacote ou **package** na tecnologia Java nada mais é do que um conjunto de classes localizadas na mesma estrutura hierárquica de diretórios. Usualmente, são colocadas em um **package** classes relacionadas, construídas com um propósito comum para promover a reutilização de código; assim, sobre certos aspectos, os *packages* reproduzem a ideia das bibliotecas de código (*libraries* e *units*), de outras linguagens de programação.

Na programação Java a reutilização de código pode ser apoiada pela construção de pacotes de classes com métodos destinados a solucionar tarefas bastante corriqueiras, como por exemplo, validação de CPF e CNPJ, operações com data, manipulação de vetores, cálculos matemáticos como médias e percentuais, entre outras.

O próprio código base da tecnologia Java está todo estruturado em pacotes, como pode ser observado na especificação da API (*Application Programming Interface*, ou Interface de Programação de Aplicações) da plataforma Java SE, apresentada parcialmente na **Tabela 1**.

![image.png](attachment:0ca8cf29-917c-44bb-b37b-5e4be75bfed3:image.png)

## **Criando pacotes**

Para indicar que uma classe Java pertence a um determinado pacote, a primeira linha de código deve ser a declaração de pacote implementada através da diretiva package, seguida do nome do pacote, obedecendo a seguinte sintaxe:

**package** nomedopacote;

Essencialmente, uma classe denominada MinhaClasse que pertence a um pacote nomedopacote tem um “nome completo” que é nomedopacote.MinhaClasse. Assim, se outra aplicação tiver uma classe de mesmo nome, não haverá conflitos, pois classes em pacotes diferentes têm nomes completos distintos.
