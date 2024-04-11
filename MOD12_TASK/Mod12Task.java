package MOD12_TASK;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Mod12Task {

    public static void main(String[] args) {

        mod12();
        mod12_SegundoMetodo();



    }


    public static void mod12() {


        System.out.println("***** exemplo de resposta da tarefa 01 *******");


        Scanner s = new Scanner(System.in);
        boolean start = true;
        while (start) {
            System.out.println("Bem vindo ao programa que irá ler o nome e o sexo do usuario!");
            System.out.println(" ");
            System.out.println("Digite abaixo o nome do usuario 1: ");
            String nome = s.next();
            System.out.println("Digite abaixo o sexo do usuario 1: ");
            String sexo = s.next();
            System.out.println("Digite abaixo o nome do usuario 2: ");
            String nome2 = s.next();
            System.out.println("Digite abaixo o sexo do usuario 1: ");
            String sexo2 = s.next();


            Map<String, String> lista = new HashMap<>();
            lista.put(nome, sexo2);
            lista.put(nome2, sexo2);

            lista.forEach((key, value) -> System.out.println("Nome do usuario: "+key + "\n Sexo do usuario: " + value));

            start = false;




        }






    }


    public static void mod12_SegundoMetodo(){

        System.out.println("***** exemplo de resposta da tarefa 02 *******");
        Scanner s = new Scanner(System.in);
        Map<String, String> lista = new HashMap<>();
        System.out.println("Digite o nome do usuario e o seu sexo: " );
        lista.put(s.next(), s.next());
        lista.forEach((key, value) -> System.out.println("Nome do usuario: "+key + "\n Sexo do usuario: " + value));



    }






}
