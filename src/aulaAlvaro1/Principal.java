package aulaAlvaro1;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        int a = 10;
        double b = 10.5;
        String nome = "Alvaro";
        int idade = 35;
        int [] arrayIniciado = {12,32,54,6,8,89,64,74,6};
        int [] meuArray = new int[5];
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        List<Integer> list1 = Arrays.asList(1, 5, 6, 8);
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(2);

        System.out.println(a);
        System.out.println(b);
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(Arrays.toString(arrayIniciado));
        System.out.println(arrayIniciado.length);
        System.out.println(meuArray[0]);
        System.out.println(list1);
        System.out.println(list1.get(0));
        System.out.println(list2);
        System.out.println(list2.size());

        if ( a >= 10 ){
            System.out.println("valor maior ou igual a 10");
        } else{
            System.out.println("valor menor que 10");
        }

        System.out.println(nome + " tem " + idade + " ano. ");

        System.out.println(Arrays.toString(arrayIniciado));

        for (int i = 0; i < 10 ; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        for (int i=0; i< arrayIniciado.length; i++) {
            System.out.print(arrayIniciado[i] + " ");
        }
        System.out.println();
        for (int x : arrayIniciado) {
            System.out.print(x + " ");
        }

        a = 1;
        while(a<5) {
            System.out.println("valor de a:  " + a);
            a++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite: ");
        Double digitado = scanner.nextDouble();
        System.out.println("valor " + digitado);

        double nota1, nota2, nota3, nota4, media, freq;



        }
        }






