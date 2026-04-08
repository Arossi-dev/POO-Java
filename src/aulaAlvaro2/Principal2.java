package aulaAlvaro2;

import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite: ");
//        Double digitado = scanner.nextDouble();
//        System.out.println("valor " + digitado);
//
//        double nota1, nota2, nota3, nota4, media, freq;
//        System.out.println("Digite nota1:");
//        nota1 = scanner.nextDouble();
//        System.out.println("Digite nota2:");
//        nota2 = scanner.nextDouble();
//        System.out.println("Digite nota3:");
//        nota3 = scanner.nextDouble();
//        System.out.println("Digite nota4:");
//        nota4 = scanner.nextDouble();
//        media = (nota1 + nota2 + nota3 + nota4) / 4;
//        System.out.println("Digite a freq: " );
//        freq = scanner.nextDouble();
//
//        if (freq < 75 && media < 6) {
//            System.out.println("Reprovado");
//
//        }
//        else {
//            System.out.println("Aprovado");
//            //  ou na (freq >= 75 && media >= 6 )
//        }
//        scanner.close();
        int add = 1;
        System.out.println(add);
        //ou add++;
        System.out.println(add++);
        //ou add--;
        System.out.println(add);

        double conta = 5 * 4 + 2 ;
        System.out.println(conta);

        int numero1 = 10, numero2 = 20;
        System.out.println(numero1 == numero2);
        System.out.println(numero1 != numero2);

        if (!(numero1 == numero2)) {
            System.out.println("sao iguais");

        }else {
            System.out.println("sao diferentes");
        }
        boolean valor = true;

        if (valor) {
            System.out.println(1);
        }else{
            System.out.println(2);
        }

        int numero3 = 30;

        if(numero1 < numero2 && numero1 < numero3) {
            System.out.println("expressao verdadeira");
        }else {
            System.out.println("expressao falsa");
        }



        }

    }

