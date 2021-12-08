package com.Fila;

public class Fila {

    private NoFila refNoEntrada;

    public Fila(){
        this.refNoEntrada = null;
    }

    public void enqueue(NoFila novoNo){
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }



    public NoFila first(){
        if(!this.isEmpty()){
            NoFila entrada = refNoEntrada;
            while(true) {
                if (entrada.getRefNo() != null) {
                    entrada = entrada.getRefNo();
                } else {
                    break;
                }
            }
            return entrada;
        }
        return null;
    }

    public NoFila dequeue(){
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
            return entrada;
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
                stringRetorno += "[No{dado=" + noAux.getDado() + "}] ----> ";
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
