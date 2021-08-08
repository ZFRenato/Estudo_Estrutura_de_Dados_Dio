package one.digitalinnovation;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular(){
        this.tamanhoLista = 0;
        this.cabeca = null;
        this.cauda = null;
    }

    // Metodos

    public int size(){
        return this.tamanhoLista;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    private No<T> getNo(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if (index == 0){
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index)/*&& (noAuxiliar != null) */; i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void remove(int index){
        if(index >= this.size())
            throw new IndexOutOfBoundsException("Índice excede o tamanho da lista Circular!!");

        No<T> noAuxiliar = this.cauda;

        if(index == 0){
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else{

            for (int i = 0; i < index -1 ; i++) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            // Paramos um elemento antes do que desejamos retirar
            // Apontamos a refrência do proximo elemento do elemento anterior para o elemento logo a frente após o que removemos

            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }

        this.tamanhoLista --;

    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()){
            this.cauda = novoNo;
            this.cabeca = this.cauda;
            novoNo.setNoProximo(novoNo);
        }else{
            novoNo.setNoProximo(this.cauda);
            this.cauda = novoNo;
            this.cabeca.setNoProximo(this.cauda);
        }

        this.tamanhoLista ++;
    }

    @Override
    public String toString() {
        String str = "";

        No<T> noAuxiliar = this.cauda;


        for (int i = 0; i < this.size() ; i++) {
            str += "[No{ conteudo: " + noAuxiliar.getConteudo()+ "}]-->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        str+= this.isEmpty() ? "[]": "(Retorna ao inicio)";

        return str;
    }
}
