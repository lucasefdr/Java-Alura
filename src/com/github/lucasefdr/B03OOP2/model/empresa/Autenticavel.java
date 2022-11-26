package com.github.lucasefdr.B03OOP2.model.empresa;

/**
 * Uma <strong>interface</strong> age como um contrato, obrigando todos que a implementam, implementar os seus métodos também.
 */
public interface Autenticavel {

    void setSenha(int senha);
    boolean autentica(int senha);
}
