package one.digitalinnovation;

public class Fila {
    private No refNoDeEntrada;

    public Fila() {
        this.refNoDeEntrada = null;
    }

    public Boolean isEmpty(){
        return this.refNoDeEntrada == null;
    }

    public void enqueue(Object object){
      No novoNo = new No(object);
      novoNo.setRefNo(this.refNoDeEntrada);
      this.refNoDeEntrada = novoNo;
    }

    public Object first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoDeEntrada;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }
    public Object dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoDeEntrada;
            No noAuxiliar = refNoDeEntrada;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";

        No noAuxiliar = this.refNoDeEntrada;
        if (!this.isEmpty()){
            while (true){
                if(noAuxiliar.getRefNo() != null){
                    stringRetorno += "[No {objeto=" + noAuxiliar.getObject() +"}] --->";
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno+= "[No {objeto=" + noAuxiliar.getObject() +"}] ---> null";
                    break;
                }
            }
        }else{
            stringRetorno+="null";
        }

        return stringRetorno;
    }
}
