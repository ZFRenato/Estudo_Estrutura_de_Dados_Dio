package one.digitalinnovation;

public class Pilha {
    private No refNoEntradaPilha;


    public Pilha(){
        this.refNoEntradaPilha = null;
    }
    /* O metodo isEmpty retorna se a pilha está vazia ou não:
    *     - Sabemos que a pilha está vazia checando se a referência de entrada da pilha está nula */
    public Boolean isEmpty(){
        return this.refNoEntradaPilha == null;
    }

    /* O metodo top() retorna o topo da pilha:
    *     - Se a pilha não estiver vázia, retornamos a referência de entrada da pilha
    *     - visto que a referência de entrada da pilha é o topo da pilha  */
    public No top(){
        return !this.isEmpty()? this.refNoEntradaPilha: null;
    }

    /* O metodo push() Inseri um novo No na pilha :
    *     - Guardamos a referência de entrada da Pilha em uma variável auxliar.
    *     - Referenciamos a entrada da pilha com o novo No inserido.
    *     - Setamos no novo No a referência do No anterior a ele na Pilha, guardada na variável auxiliar anteiormente */
    public void push(No novoNo){
        No refNoAuxiliar = this.refNoEntradaPilha;
        this.refNoEntradaPilha = novoNo;
        novoNo.setRefNo(refNoAuxiliar);
    }

    /* O metodo pop() retorna o No de topo da pilha, ao mesmo tempo que o remove da mesma:
    *    - Caso a pilha esteja vazia retornamos null
    *    - Guardamos o No de topo referenciado na variável de referência de entrada de pilha
    *    - Guardamos a referência do No anterior do antigo No topo de pilha
    *    - Referenciamos como novo topo de pilha o No anterior
    *    - Retornamos a variável popded */
    public No pop(){
        if(!this.isEmpty()){
            No noPoded = this.refNoEntradaPilha;
            No noAnterior = this.refNoEntradaPilha.getRefNo();
            this.refNoEntradaPilha = noAnterior;
            return noPoded;
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        String stringRetorno ="-----------------\n";
        stringRetorno += "    PILHA\n";
        stringRetorno+= " -------------------\n";

        No noAuxiliar = this.refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[No{dado: " + noAuxiliar.getDato() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }

        stringRetorno+= "==================\n";

        return stringRetorno;
    }
}
