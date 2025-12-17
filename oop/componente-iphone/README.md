# Desafio de Projeto: Modelagem e Diagramação de um Componente iPhone

Este repositório contém a resolução do desafio proposto na trilha **Java Básico** da [DIO](https://www.dio.me/).

O objetivo foi modelar e diagramar a representação UML do componente **iPhone** (baseado no lançamento de 2007), abrangendo seus papéis como: **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador na Internet**.

## 🛠️ Ferramentas Utilizadas
* **Java JDK**: Linguagem de programação.
* **Mermaid**: Para a diagramação UML via código.
* **IntelliJ**: IDEs para desenvolvimento.

## 📊 Diagrama UML

Abaixo está o diagrama de classes representando as interfaces e a classe concreta `Iphone` que as implementa.

```mermaid
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class Iphone {
        
    }

    Iphone ..|> ReprodutorMusical
    Iphone ..|> AparelhoTelefonico
    Iphone ..|> NavegadorInternet
