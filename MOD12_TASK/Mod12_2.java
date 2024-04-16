package MOD12_TASK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mod12_2 {

    public static void main(String[] args) {
        listagem();
    }

    public static void listagem(){
        Scanner s = new Scanner(System.in);
        List<String> listaMasc = new ArrayList<>();
        List<String> listaFem = new ArrayList<>();

        String nome;
        String sexo;
        System.out.println("Digite o seu nome: ");
        nome = s.next();
        System.out.println("Digite o nome do seu amigo: ");
        String nome2 = s.next();
        System.out.println("Digite o seu sexo M/F: ");
        sexo = s.next();
        System.out.println("Digite o sexo do seu amigo(a) M/F: ");
        String sexo2 = s.next();

        if (sexo.equalsIgnoreCase("M")){

            listaMasc.add(nome);


        } else if (sexo.equalsIgnoreCase("F")){

            listaFem.add(nome);
            System.out.println("Segue seu nome na lista de genero masculino: "+listaMasc);



        } else {
            System.out.println("Invalido! Processo cancelado.");
        }



        if (sexo2.equalsIgnoreCase("M")){

            listaMasc.add(nome2);


        } else if (sexo2.equalsIgnoreCase("F")){

            listaFem.add(nome2);



        } else {
            System.out.println("Invalido! Processo cancelado.");
        }


         System.out.println("Aqui esta sua lista de nomes do genero masculino: "+ listaMasc);
        System.out.println("Aqui esta sua lista de nomes do genero feminino: "+ listaFem);


    }


}
