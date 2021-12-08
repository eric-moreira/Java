package com.Pilha;

public class Pilha {

    private NoPilha refNoEntrada;

    public Pilha() {
        this.refNoEntrada = null;
    }

    public boolean isEmpty(){
        if(refNoEntrada == null){
            return true;
        } else{
            return false;
        }
    }

    public NoPilha top(){
        return refNoEntrada;
    }

    public void push(NoPilha novoNo){
        NoPilha refAux = refNoEntrada;
        refNoEntrada = novoNo;
        refNoEntrada.setRefNo(refAux);
    }

    public NoPilha pop(){
        if(!this.isEmpty()){
            NoPilha noPopped = refNoEntrada;
            refNoEntrada = refNoEntrada.getRefNo();
            return noPopped;
        }
        return null;
    }

}
