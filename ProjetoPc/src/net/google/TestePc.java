package net.google;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TestePc {

    public static void main(String[] args) {
    Pc marca = new Pc();
    Scanner sc = new Scanner(System.in);
        marca.marca = "HP";

        System.out.println("Cor:");
        marca.cor = sc.nextLine();

        System.out.println("Modelo:");
        marca.modelo = sc.nextLine();

        System.out.println("numero de série:");
        marca.nSerie = Long.parseLong(sc.nextLine());

        System.out.println("preço:");
        marca.preco = Double.parseDouble(sc.nextLine());

        marca.imprimir();
        marca.calcularValor();
        marca.imprimir();

        Pc marca2 = new Pc();
        marca2.marca = "IBM";

        System.out.println("cor:");
        marca2.cor = sc.nextLine();

        System.out.println("modelo:");
        marca2.modelo = sc.nextLine();

        System.out.println("numero de série:");
        marca2.nSerie = Long.parseLong(sc.nextLine());

        System.out.println("preço:");
        marca2.preco = Double.parseDouble(sc.nextLine());
        marca2.imprimir();
        marca2.calcularValor();
        marca2.imprimir();
        int recebe = marca2.alterarValor(10);
        if (recebe == 1){
            System.out.println("alteracao de valor");
        }else{
            System.out.println("não alterado o valor");
        }
        marca2.imprimir();
    }
}
