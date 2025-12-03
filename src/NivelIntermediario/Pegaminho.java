package NivelIntermediario;

import java.security.PublicKey;

public class Pegaminho {

    private String conteudo;

    public Pegaminho(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "Pergaminho: " + conteudo;
    }
}
