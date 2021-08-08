package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaLisDupla = new ListaDuplamenteEncadeada<>();

        minhaLisDupla.add("C1");
        minhaLisDupla.add("C2");
        minhaLisDupla.add("C3");
        minhaLisDupla.add("C4");
        minhaLisDupla.add("C5");
        minhaLisDupla.add("C6");
        minhaLisDupla.add("C7");

        System.out.println(minhaLisDupla.size());
        System.out.println(minhaLisDupla);


        minhaLisDupla.remove(3);

        System.out.println(minhaLisDupla);
        System.out.println(minhaLisDupla.size());

        minhaLisDupla.add(3,"D4");
        System.out.println(minhaLisDupla);
        System.out.println(minhaLisDupla.size());

    }

}
