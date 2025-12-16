public class Classes {
    public static void main(String[] args) {
        /*
         * =========================================
         * Classes
         * =========================================
         * Toda a estrutura de código no Java é distribuído em arquivos ".java" denominadas classes.
         * As classes existentes nos nossos projetos serão compostas por:
         *  - Identificador: Propósito existencial aos objetos que serão criados.
         *  - Características: Também conhecidos como atributos ou propriedades, é toda a informação que representa o estado do objeto dessa classe.
         *  - Comportamentos Também conhecidos como ações ou métodos, é toda a parte comportamental que um objeto dispõe.
         *  - Instanciar: É o ato de criar um objeto a partir da estrutura pré-definida numa classe.
         */

        Estudante e1 = new Estudante("Patricia", 12, "branca", "feminino");
        Estudante e2 = new Estudante("João", 12, "branca", "masculino");
        Estudante e3 = new Estudante("Marcos", 12, "preto", "masculino");

        /*
         * =========================================
         * Convenções
         * =========================================
         * Seguindo algumas convenções, as nossas classes são classificadas como:
         *  - Classe de modelo (models): Classes que representam a estrutura de domínio da aplicação, exemplo: Cliente, Pedido, NF, etc.
         *  - Classe de serviço (services): Classes que contém regras de negócio e validação dos nossos sistemas.
         *  - Classe de repositório (repository's): Classes que contém uma integração com banco de dados.
         *  - Classe de controle (controller's): Classes que possuem a finalidade de disponibilizar alguma comunicação externa à nossa aplicação, tipo http ou webservices.
         *  - Classe utilitária (util's): Classes que contém recursos comuns à toda a aplicação.
         */

        /*
         * =========================================
         * ENUMS
         * =========================================
         * Enum é um tipo especial de classe onde os objetos são previamente criados, são imutaeis e estão disponiveis por toda a aplicação.
         * Usamos Enum quando o nosso modelo de negócio contém objetos de mesmo contexto que já existem de pré-estabelecida com a certeza de não haver alterações de valores.
         * - Exemplos:
         *   - Estados civis,
         *   - Estados Brasileiros,
         *   - Etc...
         */

        for(EstadosBrasileiros e: EstadosBrasileiros.values()) {
            System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo());
        }

        EstadosBrasileiros eb = EstadosBrasileiros.PIAUI;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
    }

    public static class Estudante {
        private String nome;
        private int idade;
        private String cor;
        private String sexo;

        // ===========================================
        // Construtores
        // ===========================================

        public Estudante(String nome, int idade, String cor, String sexo) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
            this.sexo = sexo;
        }

        public Estudante() {

        }

        // ===========================================
        // Setters
        // ===========================================

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        // ===========================================
        // Getters
        // ===========================================

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public String getCor() {
            return cor;
        }

        public String getSexo() {
            return sexo;
        }

        // ===========================================
        // Métodos
        // ===========================================

        void comer () {

        }

        void beber() {

        }

        void correr() {

        }
    }

    public enum EstadosBrasileiros {
        SÃO_PAULO("SP", "São Paulo"),
        RIO_JANEIRO ("RJ", "Rio de Janeiro"),
        PIAUI ("PI", "Piauí");

        private String nome;
        private String sigla;

        private EstadosBrasileiros(String sigla, String nome) {
            this.sigla = sigla;
            this.nome = nome;
        }

        public String getSigla() {
            return sigla;
        }

        public String getNome() {
            return nome;
        }

        public String getNomeMaiusculo() {
            return this.nome.toUpperCase();
        }
    }
}


