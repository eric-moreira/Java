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

    @Override
    public String toString() {

        String stringRetorno = "----------------\n";
        stringRetorno += "  Pilha";
        stringRetorno += "----------------\n";

        NoPilha noAux = refNoEntrada;
        while (true){
            if (noAux != null){
                stringRetorno +="\n [NoPilha {dado=" + noAux.getDado() + "}]\n";
                noAux = noAux.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "================\n";
        return stringRetorno;
    }
}
