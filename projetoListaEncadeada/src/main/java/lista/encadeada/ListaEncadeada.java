package lista.encadeada;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    public int sizeOf(){
        int tamanhoLista = 0;
        No<T> refAuxiliar = referenciaEntrada;

        while (true){
            if (refAuxiliar != null){
                tamanhoLista++;
                if(refAuxiliar.getProximoNo() != null){
                    refAuxiliar = refAuxiliar.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return tamanhoLista;
    }
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.sizeOf()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();

        }
        noAuxiliar.setProximoNo(novoNo);
        return;

    }

}
