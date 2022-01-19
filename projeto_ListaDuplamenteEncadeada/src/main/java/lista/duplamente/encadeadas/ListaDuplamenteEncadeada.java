package lista.duplamente.encadeadas;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int size;

    public ListaDuplamenteEncadeada (){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.size = 0;
    }

    public int sizeOf(){
        return size;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoAnterior(ultimoNo);
        if (primeiroNo == null){
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        size++;
    }
    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);

        if (noAuxiliar.getNoProximo() != null){
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.setNoProximo(noAuxiliar);
            noAuxiliar.setNoAnterior(novoNo);
        } else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0){
            primeiroNo = novoNo;
        } else {
            novoNo.getNoAnterior().setNoProximo(novoNo);
        }

        size++;
    }

    public void remove (int index){
        if (index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if (primeiroNo != null){
                primeiroNo.setNoAnterior(null);
            }
        } else {
            NoDuplo<T> noAux = getNo(index);
            noAux.getNoAnterior().setNoProximo(noAux.getNoProximo());
            if (noAux != ultimoNo){
                noAux.getNoProximo().setNoAnterior(noAux.getNoAnterior());
            } else {
                ultimoNo = noAux;
            }
        }
        this.size--;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAux = primeiroNo;

        for (int i = 0; i < sizeOf(); i++){
            strRetorno += "[No{conteudo="+ noAux.getConteudo() +"}]---->";
            noAux = noAux.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
