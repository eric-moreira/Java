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
        System.out.println("\n Exibindo em Ordem: ");
        showInOrder(this.raiz);
    }

    private void showInOrder(BinNo<T> atual){
        if (atual != null){
            showInOrder(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            showInOrder(atual.getNoDir());
        }
    }

    public void showPostOrder(){
        System.out.println("\n Exibindo Pós-Ordem");
        showPostOrder(this.raiz);
    }
    private void showPostOrder(BinNo<T> atual){
        if (atual != null){
            showPostOrder(atual.getNoEsq());
            showPostOrder(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void showPreOrder(){
        System.out.println("\n Exibindo Pre-ordem");
        showPreOrder(this.raiz);
    }

    private void showPreOrder(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ", ");
            showPreOrder(atual.getNoEsq());
            showPreOrder(atual.getNoDir());
        }
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
                if (noParent.getNoEsq() == atual){
                    noParent.setNoEsq(atual.getNoEsq());
                } else{
                    noParent.setNoDir(atual.getNoEsq());
                }
            } else if (atual.getNoEsq() == null){
                if (noParent.getNoEsq() == atual){
                    noParent.setNoEsq(atual.getNoDir());
                } else {
                    noParent.setNoDir(atual.getNoDir());
                }
            } else {
                for (noAux = atual, noChild = atual.getNoEsq();
                    noChild.getNoDir() != null;
                    noAux = noChild, noChild = noChild.getNoDir()
                ){
                    if(noChild != atual.getNoEsq()){
                        noAux.setNoDir(noChild.getNoEsq());
                        noChild.setNoEsq(atual.getNoEsq());
                    }
                    noChild.setNoDir(atual.getNoDir());

                    if(noParent.getNoEsq() == atual){
                        noParent.setNoEsq(noChild);
                    } else {
                        noParent.setNoDir(noChild);
                    }

                }
            }

        } catch(NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }



    }


}
