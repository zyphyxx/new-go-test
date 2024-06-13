import java.util.regex.Pattern;

public class Senha {

    private String conteudo;


    public void valida (String conteudo) {
        if (conteudo.length() < 10 || conteudo.length() > 30) {
            System.out.println("Tamanho menor que 10 ou maior que 30");
        }
    }


}
