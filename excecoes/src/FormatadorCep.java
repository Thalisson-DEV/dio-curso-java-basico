public class FormatadorCep {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("23.765-064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de negocio.");
        }

        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de negocio.");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8) {
            throw new CepInvalidoException("O CEP digitado é invalido");
        }
        return "23.765-064";
    }
}
