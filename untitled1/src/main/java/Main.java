public class Main {

    public static void main(String[] args) {

        // Objeto criado com a senha padrão automaticamente
        Senha senha = new Senha();
        System.out.println(senha.getConteudo());

        // não atende as condiçoes de troca de senha
        senha.setConteudo("novasenha#24");

        // atende as condiçoes de troca de senha
        senha.setConteudo("NovaSenha#24");

    }
}
