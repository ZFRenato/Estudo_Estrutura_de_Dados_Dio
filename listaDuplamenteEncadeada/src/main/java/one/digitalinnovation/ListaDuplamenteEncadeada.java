package one.digitalinnovation;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> refPrimeiroNoEntrada;
    private NoDuplo<T> refUltimoNoEntrada;

    private int tamanhoNo;

    public ListaDuplamenteEncadeada (){
        this.refPrimeiroNoEntrada = null;
        this.refUltimoNoEntrada = null;
        this.tamanhoNo = 0;
    }

    public int size(){
        return this.tamanhoNo;
    }

    private NoDuplo<T> getNo( int index){
        NoDuplo<T> noAuxiliar = this.refPrimeiroNoEntrada;

        for (int i = 0; (i < index) && (noAuxiliar != null) ; i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }





}
