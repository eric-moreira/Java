package com.projetono;

public class NoRefatorado<T> {

    private T conteudo;
    private NoRefatorado<T> proximoNo;

    public NoRefatorado(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoRefatorado<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoRefatorado proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }

}
