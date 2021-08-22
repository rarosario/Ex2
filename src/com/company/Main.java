package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double RG;
        double salario;
        System.out.print("Digite o número do RG: ");
        RG = teclado.nextDouble();

        System.out.print("Digite o Salário: ");
        salario = teclado.nextDouble();

        if (salario < 20000){
            System.out.println("Seu aumento será de 20%");
        } else if (salario < 45000){
            System.out.println("Seu aumento será de 10%");
        } else if (salario >= 45000){
            System.out.println("Seu aumento será de 5%");
        }
    }
}
