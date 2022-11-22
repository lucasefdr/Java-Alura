package edu.lucasefdr.B03OOP2.model.empresa;

public class Cliente implements Autenticavel {
    /**
     * <strong>Injetando</strong> a classe AutenticacaoUtil
     */
    private AutenticacaoUtil autenticador;

    public Cliente() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return autenticador.autentica(senha);
    }
}
