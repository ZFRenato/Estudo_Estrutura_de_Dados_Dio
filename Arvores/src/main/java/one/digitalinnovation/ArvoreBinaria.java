package one.digitalinnovation;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir( T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        this.raiz = this.inserir(this.raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){

        if (atual == null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(this.inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(this.inserir(atual.getNoDir(), novoNo));
        }

        return  atual;
    }


}
