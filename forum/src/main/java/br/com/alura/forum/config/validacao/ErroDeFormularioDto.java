package br.com.alura.forum.config.validacao;

public class ErroDeFormularioDto {

    private String campo;
    private String error;

    public ErroDeFormularioDto(String campo, String erro) {
        this.campo = campo;
        this.error = erro;
    }

    public String getCampo() {
        return campo;
    }

    public String getError() {
        return error;
    }
}
