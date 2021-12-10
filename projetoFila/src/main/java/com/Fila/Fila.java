package com.Fila;
/*
    RC -1 - isEmpty() == true
 */
public class Fila<T> {

    private NoFila<T> refNoEntrada;

    public Fila(){
        this.refNoEntrada = null;
    }

    public void enqueue(T obj){
        NoFila novoNo = new NoFila(obj);
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }



    public T first(){
        if(!this.isEmpty()){
            NoFila entrada = refNoEntrada;
            while(true) {
                if (entrada.getRefNo() != null) {
                    entrada = entrada.getRefNo();
                } else {
                    break;
                }
            }
            return (T) entrada.getObject();
        }
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            NoFila noAux = refNoEntrada;
            NoFila entrada = refNoEntrada;

            while(true) {
                if (entrada.getRefNo() != null) {
                    noAux = entrada;
                    entrada = entrada.getRefNo();
                } else {
                    noAux.setRefNo(null);
                    break;
                }
            }
            return (T) entrada.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        if (refNoEntrada == null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoFila noAux = refNoEntrada;

        if (refNoEntrada != null){
            while (true){
                stringRetorno += "[No{objeto=" + noAux.getObject() + "}] ----> ";
                if (noAux.getRefNo() != null){
                    noAux = noAux.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = null;
        }
        return stringRetorno;

    }
}
