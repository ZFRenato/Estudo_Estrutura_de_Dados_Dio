package com.projetono;

public class NoRefact<T> {

    private T conteudo;
    private NoRefact<T> proximono;

    public NoRefact(T conteudo) {
        this.conteudo = conteudo;
        this.proximono = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoRefact<T> getProximono() {
        return proximono;
    }

    public void setProximono(NoRefact<T> proximono) {
        this.proximono = proximono;
    }

    @Override
    public String toString() {
        return "NoRefact{" +
                "conteudo=" + conteudo +
                '}';
    }
}
