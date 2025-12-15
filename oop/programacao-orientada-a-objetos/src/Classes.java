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
}


