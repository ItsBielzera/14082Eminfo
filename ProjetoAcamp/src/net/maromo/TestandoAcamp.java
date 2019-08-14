package net.maromo;

import java.util.Scanner;

public class TestandoAcamp {

    public static void main(String[] args) {
        Acamp pessoa = new Acamp();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome da pessoa: ");
        membro.nome = sc.nextLine();
        System.out.println("Idade: ");
        membro.idade = Integer.parseInt(sc.nextLine());
        membro.separarGrupo();
        membro.imprimir();
    }
}
