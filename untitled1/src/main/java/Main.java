public class Main {

    public static void main(String[] args) {

        Senha senha = new Senha("EdgarMendes#24");

        senha.setConteudo("AlterandoSenha#24");

        senha.validacao(senha.getConteudo());


    }
}
