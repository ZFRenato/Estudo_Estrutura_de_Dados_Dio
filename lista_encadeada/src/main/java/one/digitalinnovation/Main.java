package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEnacdeada = new ListaEncadeada<>();
        System.out.println(minhaListaEnacdeada.isEmpty());

        minhaListaEnacdeada.add("primeiro");
        System.out.println(minhaListaEnacdeada.isEmpty());

        minhaListaEnacdeada.add("segundo");
        minhaListaEnacdeada.add("terceiro");
        minhaListaEnacdeada.add("quarto");
        System.out.println(minhaListaEnacdeada.get(2));
        System.out.println(minhaListaEnacdeada.remove(1));
        //minhaListaEnacdeada.add("segundo");
      //  minhaListaEnacdeada.add("terceiro");
      //  minhaListaEnacdeada.add("quarto");
     //   minhaListaEnacdeada.add("quinto");

        //System.out.println(minhaListaEnacdeada);

       // System.out.println(minhaListaEnacdeada.get(0));


        System.out.println(minhaListaEnacdeada);
        System.out.println(minhaListaEnacdeada.size());

    }
}
