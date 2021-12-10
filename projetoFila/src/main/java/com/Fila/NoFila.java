package com.Fila;

public class NoFila<T> {

    private T object;
    private NoFila<T> refNo = null;

    public NoFila(T object) {
        this.object = object;
    }


    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public NoFila getRefNo() {
        return refNo;
    }

    public void setRefNo(NoFila refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "NoFila{" +
                "objeto=" + object +
                '}';
    }
}
