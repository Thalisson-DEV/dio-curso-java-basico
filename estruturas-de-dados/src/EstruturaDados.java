import java.awt.*;
import java.security.PublicKey;
import java.util.List;

public class EstruturaDados {
    public static void main(String[] args) {
        /*
         * ============================================================
         * ARQUITETURA E CONCEITOS DE MEMÓRIA
         * ============================================================
         * * 1. MEMÓRIA PRIMÁRIA (Ex: RAM)
         * - Natureza: VOLÁTIL. Requer energia para manter os dados.
         * - Função: Armazenamento de curto prazo. É onde o Java aloca as suas variáveis e objetos enquanto o programa executa.
         * - Estrutura: Unidade básica é o BIT (0 ou 1). 8 Bits formam 1 BYTE.
         *
         * * 2. MEMÓRIA SECUNDÁRIA (Ex: SSD, HDD)
         * - Natureza: NÃO VOLÁTIL. Preserva dados sem energia.
         * - Função: Armazenamento de longo prazo (arquivos, instalador do Java).
         * ============================================================
         * TIPOS DE DADOS EM JAVA (COMO O JAVA USA A MEMÓRIA)
         * ============================================================
         * Java utiliza a memória de forma eficiente dividindo os dados em:
         *
         * TIPOS PRIMITIVOS (Valores puros, ocupam espaço fixo na RAM)
         * ============================================================
         * - Inteiros:
         * byte -> 8 bits (1 byte)
         * short -> 16 bits (2 bytes)
         * int -> 32 bits (4 bytes) - O padrão para números inteiros.
         * long -> 64 bits (8 bytes) - Para números enormes.
         * - Decimais (Ponto Flutuante):
         * float -> 32 bits (Precisão simples)
         * double -> 64 bits (Precisão dupla) - O padrão para decimais.
         * - Outros:
         * boolean -> 1 bit (true/false)
         * char -> 16 bits (Um único character Unicode)
         *
         * TIPOS DE REFERÊNCIA (OBJETOS)
         * ============================================================
         * - String: Para textos. Diferente dos primitivos, é um objeto.
         * - Arrays e Classes: Armazenam endereços que apontam para outros locais na memória.
         * ============================================================
         * CONEXÃO: Onde os dados ficam?
         * - STACK (Pilha): Memória rápida que guarda primitivos e os ponteiros de objetos.
         * - HEAP (Monte): Memória maior onde os objetos reais (como "Strings" complexas) ficam guardados.
         */

        // Exemplos
        int idade = 25;// Aloca 32 bits na memória primária
        double salario = 2500.50; // Aloca 64 bits na memória primária
        String nome = "Thalisson";   // "nome" é uma referência na Stack para o texto na Heap

        int intA = 1;
        int intB = intA;

        System.out.println("intA=" + intA + " intB=" + intB);
        intA = 2;
        // Armazena exatamente o valor em memória, logo o valor A não modifica o valor B
        System.out.println("intA=" + intA + " intB=" + intB);

        MeuObj objA = new MeuObj(1);
        // Aqui copiamos a referência em memória do objA, ou seja, se modificarmos o objA em outro ponto da aplicação
        // o objB também será alterado no espaço alocado em memória.
        MeuObj objB = objA;

        System.out.println("objA=" + objA + " objB=" + objB);
        objA.setNum(2);
        System.out.println("objA=" + objA + " objB=" + objB);

        /*
         * ============================================================
         * CONCEITO DE NÓ
         * ============================================================
         * Um Nó é uma estrutura "embrulhadora" que permite armazenar dados de forma encadeada na memória.
         * Diferente de um Array (que precisa de um bloco de memória contínuo), os Nós podem estar espalhados em diferentes lugares da memória RAM.
         * Um Nó básico é composto por duas partes:
         * 1. INFORMAÇÃO: O dado que você quer guardar (int, "string", etc).
         * 2. REFERÊNCIA (Ponteiro): O endereço de memória que aponta para o "próximo" Nó da sequência.
         * ============================================================
         */

        No<String> no1 = new No<>("Conteúdo no1");
        No<String> no2 = new No<>("Conteúdo no2");

        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteúdo no3");

        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteúdo no4");

        no3.setProximoNo(no4);

        // no1->no2->no3->no4->null
        // Nó1 aponta para Nó2, Nó2 aponta para Nó3, Nó3 aponta para Nó4 e Nó4 aponta para null.

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

        /*
         * ============================================================
         * UNKNOWN WILDCARD (CORINGA DESCONHECIDO: <?>)
         * ============================================================
         * Representa um tipo desconhecido. É útil quando o método realiza operações que não dependem do tipo específico.
         * - Exemplo: Imprimir todos os elementos de uma lista, não importa se são Inteiros ou Strings.
         * * ============================================================
         * UPPER BOUNDED WILDCARD (LIMITE SUPERIOR: <? extends T>)
         * ============================================================
         * Restringe o tipo para ser T ou qualquer uma de suas subclasses.
         * - "T" é o limite máximo na hierarquia.
         * - Útil quando você quer LER dados de uma estrutura e garantir que eles tenham o comportamento de uma superclasse.
         * - Exemplo: <? extends Number> aceita Integer, Double e Float.
         * * ============================================================
         * LOWER BOUNDED WILDCARD (LIMITE INFERIOR: <? super T>)
         * ============================================================
         * Restringe o tipo para ser T ou qualquer uma de suas superclasses.
         * - "T" é o limite mínimo na hierarquia.
         * - Útil quando você quer ESCREVER dados em uma estrutura.
         * - Exemplo: <? super Integer> aceita Integer, Number e Object.
         * * ============================================================
         * CONVENÇÕES DE NOMENCLATURA
         * ============================================================
         * <E> - Element (usado em Coleções)
         * <K> - Key (Chave, usado em Mapas)
         * <V> - Value (Valor, usado em Mapas)
         * <T> - Type (Tipo genérico)
         * <S, U, V> - Quando há mais de um tipo genérico
         */

    }
    public void imprimeLista(List<?> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }
}