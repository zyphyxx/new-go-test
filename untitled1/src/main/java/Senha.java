import java.util.ArrayList;

public class Senha {

    private String conteudo;

    public Senha(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Senha{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }

    public void validacao (String senha) {
        if (conteudo.length() < 10 || conteudo.length() > 30) {
            System.out.println("Não foi possivel criar a senha");
        }




    }

}
