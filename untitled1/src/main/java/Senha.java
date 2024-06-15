public class Senha {

    // fields
    private String conteudo;

    // constructors
    public Senha(String conteudo) {
        this.conteudo = conteudo;
    }
    public Senha() {
        this.conteudo = "SenhaPadrao#123";
    }

    // getters and setters
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {

        if (conteudo.length() < 10) {
            System.out.println("Tamanho mínimo de senha é 10");
        } else if (conteudo.length() > 30) {
            System.out.println("Tamanho maximo de senha é 30");
        } else {

            boolean upper = false;
            boolean lower = false;
            boolean digit = false;
            boolean symbol = false;

            for (char c : conteudo.toCharArray()) {

                if (Character.isUpperCase(c)) {
                    upper = true;
                }
                if (Character.isLowerCase(c)) {
                    lower = true;
                }
                if (Character.isDigit(c)) {
                    digit = true;
                }
                if (Character.isLetter(c)) {
                    symbol = true;
                }

            }

            if (upper && lower && digit && symbol) {
                System.out.println("senha alterada com sucesso");
            } else {

                System.out.println("senha invalida!");
                System.out.println(" - ter ao menos uma letra maiúscula;");
                System.out.println(" - ter ao menos uma letra minúscula;");
                System.out.println(" - ter ao menos um número;");
                System.out.println(" - ter ao menos um símbolo");

            }


        }


    }

    // methods
    public void forcaDaSenha(String senha) {

        // TODO: 15/06/2024  

    }


    @Override
    public String toString() {
        return "Senha{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }

}
