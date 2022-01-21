package com.listacircular;

public class ListaCircular<T> {

    private No<T> head;
    private No<T> tail;
    private int size;

    public ListaCircular() {
        this.tail = null;
        this.head = null;
        size = 0;
    }

    public int sizeOf(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    private No<T> getNo(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("The list is empty");
        } else {
            if (index == 0){
                return this.tail;
            }

            No<T> noAux = this.tail;
            for (int i = 0; (i < index) && (noAux != null); i++){
                noAux = noAux.getNoProximo();
            }

            return noAux;
        }

    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void remove (int index){
        if (index >= this.size){
            throw new IndexOutOfBoundsException("The index is out of bound");
        }
        No<T> noAux = this.tail;
        if (index == 0){
            this.tail = this.tail.getNoProximo();
            this.head.setNoProximo(this.tail);
        }
        // else if(index == 1){
            // this.tail.setNoProximo(this.tail.getNoProximo().getNoProximo());
        // }
        else {
            for (int i = 0; i < index-1; i++){
                noAux = noAux.getNoProximo();
            }
            noAux.setNoProximo(noAux.getNoProximo().getNoProximo());
        }
        this.size--;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()){
            this.head = novoNo;
            this.tail = this.head;
            this.head.setNoProximo(this.tail);
        } else {
            novoNo.setNoProximo(this.tail);
            this.head.setNoProximo(novoNo);
            this.tail = novoNo;
        }
        this.size++;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAux = this.tail;

        for (int i = 0; i < sizeOf(); i++){
            strRetorno += "[No{conteúdo=" + noAux.getConteudo() + "}] ---->";
            noAux = noAux.getNoProximo();
        }

        if (!this.isEmpty()){
            strRetorno += "(Retorna ao Inicio)";
        } else {
            strRetorno += "[]";
        }

        return strRetorno;
    }
}
