package Pilhas;

public class EstruturaPilhas {
    public static void main(String[] args) {
        /*
         * ============================================================
         * PILHA (STACK) - CONCEITO LIFO
         * ============================================================
         * LIFO (Last In, First Out): O último a entrar é o primeiro a sair.
         * Analogia: Uma pilha de pratos ou uma pilha de livros. Você só retira o que está no topo.
         * Operações Principais:
         * 1. PUSH: Adiciona um elemento ao topo.
         * 2. POP: Remove o elemento do topo.
         * 3. PEEK/TOP: Apenas visualiza quem está no topo sem remover.
         * Uso na Memória: A "Stack Memory" do Java funciona exatamente assim para gerenciar as chamadas de métodos.
         * ============================================================
         * FILA (QUEUE) - CONCEITO FIFO
         * ============================================================
         * FIFO (First In, First Out): O primeiro a entrar é o primeiro a sair.
         * Analogia: Uma fila de banco ou de supermercado.
         * Operações Principais:
         * 1. ENQUEUE (Offer): Adiciona ao final da fila.
         * 2. DEQUEUE (Poll): Remove o primeiro da fila (o que está lá há mais tempo).
         * Diferença crucial: Enquanto a Pilha tem apenas uma entrada/saída (topo), a Fila tem duas extremidades (Início e Fim).
         */

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new Nos(1));
        minhaPilha.push(new Nos(2));
        minhaPilha.push(new Nos(3));
        minhaPilha.push(new Nos(4));
        minhaPilha.push(new Nos(5));
        minhaPilha.push(new Nos(6));

        System.out.println(minhaPilha);

        minhaPilha.pop();
        minhaPilha.pop();
        minhaPilha.pop();

        System.out.println(minhaPilha);
    }
}

