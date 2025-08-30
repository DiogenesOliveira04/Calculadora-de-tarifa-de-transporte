/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transporte;
    import java.util.Scanner;
/**
 *
 * @author Plugify
 */
public class Transporte {

    public static void main(String[] args) {
 


        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo de transporte:");
        System.out.println("1 - Ônibus urbano");
        System.out.println("2 - Metrô");
        System.out.println("3 - Trem intermunicipal");
        System.out.println("4 - Ônibus rodoviário");
        int opcao = sc.nextInt();

        System.out.print("Digite a quantidade de bilhetes: ");
        int qtd = sc.nextInt();

        double valor = 0;
        switch (opcao) {
            case 1:
                valor = 4.40 * qtd;
                break;
            case 2:
                valor = 5.00 * qtd;
                break;
            case 3:
                valor = 6.50 * qtd;
                break;
            case 4:
                valor = 12.00 * qtd;
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        System.out.printf("Valor total: R$ %.2f%n", valor);
        sc.close();
    }
}

    

