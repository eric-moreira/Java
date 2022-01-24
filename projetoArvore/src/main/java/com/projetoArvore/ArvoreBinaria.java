package com.projetoArvore;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual == null){
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void showInOrder(){
        System.out.println("Exibindo em Ordem: ");
        showInOrder(this.raiz);
    }

    private void showinOrder(BinNo<T> atual){
        if (atual != null){
            showinOrder(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ", ");
            showinOrder(atual.getNoDir());
        }
    }

    public void showPostOrder(){
        System.out.println("Exibindo Pós-Ordem");
        showPostOrder(this.raiz);
    }
    private void showPostOrder(BinNo<T> atual){
        if (atual != null){
            showPostOrder(atual.getNoEsq());
            showPostOrder(atual.getNoDir());
            System.out.println(atual.getConteudo() + ", ");
        }
    }

    public void showPreOrder(){
        System.out.println("Exibindo Pre-ordem");
        showPreOrder(this.raiz);
    }

    private void showPreOrder(BinNo<T> atual){
        System.out.println(atual.getConteudo() + ", ");
        showPreOrder(atual.getNoEsq());
        showPreOrder(atual.getNoDir());
    }

    public void remove(T conteudo){
        try{
            BinNo<T> atual = this.raiz;
            BinNo<T> noParent = null;
            BinNo<T> noChild = null;
            BinNo<T> noAux = null;

            while (atual !=null && !atual.getConteudo().equals(conteudo)){
                noParent = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }

            if (atual == null) {
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }
            if (noParent == null) {
                if (atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                } else {
                    for (noAux = atual, noChild = atual.getNoEsq();
                        noChild.getNoDir() != null;
                        noAux = noChild, noChild = noChild.getNoEsq()
                    ){
                        if (noChild != atual.getNoEsq()){
                            noAux.setNoDir(noChild.getNoEsq());
                            noChild.setNoEsq(raiz.getNoEsq());
                        }

                    }
                    noChild.setNoDir(raiz.getNoDir());
                    raiz = noChild;
                }


            } else if (atual.getNoDir() == null){

            } else if (atual.getNoEsq() == null){

            } else {

            }

        } catch(NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }



    }


}
