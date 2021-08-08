package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        ListaCircular<String> minhaListaC = new ListaCircular<>();

        System.out.println(minhaListaC.isEmpty());
       // minhaListaC.add("C0");
        System.out.println(minhaListaC);

        minhaListaC.add("C1");
        minhaListaC.add("C2");
        minhaListaC.add("C3");
        System.out.println(minhaListaC);

        System.out.println(minhaListaC.get(2));
        System.out.println(minhaListaC);

        minhaListaC.remove(2);
        System.out.println(minhaListaC);
        System.out.println(minhaListaC.size());
        System.out.println(minhaListaC.get(2));




    }

}
