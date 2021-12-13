package lista.encadeada;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }


    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    private void validaIndex(int index){
        if (index >= this.sizeOf()) {
            throw new IndexOutOfBoundsException("Não existe conteudo no indice "
                    + index + "desta lista.");
        }
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

    public T get(int index){

        return this.getNo(index).getConteudo();

    }

    public T remove(int index){
        No<T> noPivot = this.getNo(index);

        if ( index == 0 ){
            referenciaEntrada = noPivot.getProximoNo();
            return noPivot.getConteudo();
        }

        No<T> noAnterior = this.getNo(index -1 );
        noAnterior.setProximoNo(noPivot.getProximoNo());

        return noPivot.getConteudo();
    }

    private No<T> getNo(int index){

        validaIndex(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;


        for (int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;

        for (int i = 0; i < this.sizeOf(); i++){

            strRetorno += "No{conteudo=" +
                    noAuxiliar.getConteudo() + "} -----> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += null;

        return strRetorno;
    }
}
