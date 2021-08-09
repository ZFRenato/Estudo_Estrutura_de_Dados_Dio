package one.digitalinnovation;
import one.digitalinnovation.model.Obj;

public class Main {
    public static void main(String[] args) {

        ArvoreBinaria<Obj> minhArbBin = new ArvoreBinaria<>();

        minhArbBin.inserir(new Obj(13));
        minhArbBin.inserir(new Obj(10));
        minhArbBin.inserir(new Obj(25));
        minhArbBin.inserir(new Obj(2));
        minhArbBin.inserir(new Obj(12));
        minhArbBin.inserir(new Obj(20));
        minhArbBin.inserir(new Obj(31));
        minhArbBin.inserir(new Obj(29));

        minhArbBin.exibirInOrdem();
        minhArbBin.exibirPosOrdem();
        minhArbBin.exibirPreOrdem();
    }
}
