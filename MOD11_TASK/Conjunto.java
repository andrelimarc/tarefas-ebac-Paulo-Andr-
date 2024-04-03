package MOD11_TASK;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto {



    public static void main(String[] args) {



        listaDePessoas();
        conjuntorun();

    }

    private static void listaDePessoas() {

System.out.println("******** TAREFA 01 *********");
        Set<String> lista = new TreeSet<>();

        lista.add("Paulo");
        lista.add("tiago");
        lista.add("Moises");
        lista.add("Andre");


        String conteudoLista = String.join(",",lista);
        // aqui eu estou colocando todas as insformações de string nesta variavel conteudo lista em uma unica linha. Lembrando que isso é um texto em uma unica linha, não é um array.

        // vou agora transformar em um array

        String [] array = conteudoLista.split(",");

        String a = String.join(", ", array);

        System.out.println(a);


    }






    private static void conjuntorun() {

        System.out.println("********** TAREFA 02 *********");

        Set<ConjuntoTeste> conjunto = new HashSet<>();

        ConjuntoTeste a = new ConjuntoTeste("Paulo", "Masculino");
        ConjuntoTeste b = new ConjuntoTeste("Leticia", "Feminino");


        conjunto.add(a);
        conjunto.add(b);



        System.out.println(conjunto);


    }


}
