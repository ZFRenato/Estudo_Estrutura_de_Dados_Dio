package one.digitalinnovation;

public class ListaEncadeada<T> {
    private No<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    public boolean isEmpty (){
        return this.refEntrada == null;
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> noAuxiliar = this.refEntrada;

        while (true){
            if (noAuxiliar != null){
                tamanhoLista++;
                if(noAuxiliar.getProximoNo() != null){
                    noAuxiliar = noAuxiliar.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanhoLista;
    }

    public void add( T conteudo){
        No<T> novoNo = new No<> (conteudo);

        if(this.isEmpty()){
            this.refEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = refEntrada;

        for (int i = 0; i < this.size() ; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index){
        this.validaIndice(index);
        No<T> noAuxiliar = this.refEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i >= index ; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }

    private void validaIndice(int index){
        if(index >= this.size()){
            int ultimoIndice  = this.size() - 1;
            throw new IndexOutOfBoundsException("Não existe elemento com esse index: " + index + ", ListaEncadeada com indice máximo: " + ultimoIndice + ".");
        }
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);

        if(index == 0){
            this.refEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }else{
            No<T> noAnterior = this.getNo(index -1);
            noAnterior.setProximoNo(noPivor.getProximoNo());
        }

        return noPivor.getConteudo();
    }

    @Override
    public String toString() {
        String str = "";

        No<T> noAuxiliar = this.refEntrada;

        for (int i =0; i < this.size(); i++){
            str += "[No{conteudo: " + noAuxiliar.getConteudo() + "} --->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        str += "null]";

        return str;
    }
}
