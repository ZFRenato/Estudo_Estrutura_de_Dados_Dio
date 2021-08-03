package one.digitalinnovation;

public class No {
    private int dato;
    private No refNo = null;

    public No( int dado){
        this.dato = dado;
    }

    public No() {
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dato=" + dato +
                '}';
    }
}
