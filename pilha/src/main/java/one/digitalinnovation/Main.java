package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        System.out.println(minhaPilha.isEmpty()?"Minha Pilha está Vazia":"Minha pilha está ocupada");
        System.out.println("Elemento poped :"+minhaPilha.pop());
        System.out.println("Elemento top :"+minhaPilha.top());

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));
        minhaPilha.push(new No(7));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.isEmpty()?"Minha Pilha está Vazia":"Minha pilha está ocupada");
        System.out.println("Elemento poped :"+minhaPilha.pop());

        System.out.println(minhaPilha);

        System.out.println("Elemento de poped :"+minhaPilha.pop());
        System.out.println(minhaPilha);

        System.out.println("Elemento de poped :"+minhaPilha.pop());
        System.out.println(minhaPilha);
    }
}
