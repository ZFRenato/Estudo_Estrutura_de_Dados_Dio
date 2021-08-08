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


}
