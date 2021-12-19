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
}
