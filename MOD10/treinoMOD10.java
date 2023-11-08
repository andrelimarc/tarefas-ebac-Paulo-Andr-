package TreinoMod7;

import java.util.Scanner;

public class treinoMOD10 {



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Vamos começar o trabalho? ");
        String vamos = s.next();
        if (vamos.equalsIgnoreCase("sim")) {


         while (vamos.equalsIgnoreCase("sim")) {

            if (vamos.equalsIgnoreCase("sim")){
                calculo(vamos);
            }

            if (vamos.equalsIgnoreCase("Sim")) {

                System.out.println("Deseja começar novamente: ");
                vamos = s.next();

               if (vamos.equalsIgnoreCase("sim")) {

               } else {
                   System.out.println("obrigado");
               }


            }

        }

        } else {
            System.out.println("Obrigado");
        }







    }

    public static void calculo(String vamos){

        Scanner s = new Scanner(System.in);



            System.out.println("Olá! Muito bom ter vocÊ conosco. Qual o seu nome?");
            String nome = s.next();
            System.out.println("Prazer em conhecer! "+nome);
            System.out.println("Vamos começar nosso trabalho. Digite sua primeira nota: ");
            double primeiranota = s.nextDouble();
            System.out.println("Digite sua segunda nota: ");
            double segundanota = s.nextDouble();
            System.out.println("Digite sua terceira nota: ");
            double terceiranota = s.nextDouble();
            System.out.println("Digite sua quarta nota: ");
            double quartanota = s.nextDouble();





                double mediafinal = (primeiranota+segundanota+terceiranota+quartanota)/4;

                if (mediafinal>=7){
                    System.out.println("Aprovado! Parabéns "+nome+"!"+" Sua média final foi: "+mediafinal);
                } else if (mediafinal < 7) {
                    System.out.println("Reprovado.");
                }




                //  System.out.println("Sua primeira nota é "+primeiranota+" sua segunda nota é "+ segundanota+ " sua terceira nota é "+terceiranota+" sua quarta nota é "+quartanota+" e sua média final = "+mediafinal);






    }









}
