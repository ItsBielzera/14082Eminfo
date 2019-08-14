package net.google;

import java.util.Scanner;



public class TesteConta {
 public Conta cc = new Conta();
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TesteConta teste = new TesteConta();
        int op=0;
        do {
            System.out.println("opção: ");
            System.out.println(" 1- sacar");
            System.out.println("2- depositar");
            System.out.println("3- consultar");
            System.out.println("4- cadastrar");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    teste.execSacar();
                    break;
                case 2:
                    teste.execDepositar();
                case 3:
                    teste.execConsultar();
                case 4:
                    teste.execCadastrar();
            }
        }
        while(op!=9);
    }

    public void execCadastrar() {
        System.out.println("número da conta: ");
        cc.conta = sc.nextLine();
        System.out.println("número da agência: ");
        cc.agc = sc.nextLine();
        System.out.println("saldo: ");
        cc.saldo = Double.parseDouble(sc.nextLine());
        System.out.println("nome: ");
        cc.nomeCli = sc.nextLine();
    }
    public void execConsultar() {
        cc.imprimir();
    }
    public void execSacar() {
        double valor;
        System.out.println("valor: ");
        valor = Double.parseDouble(sc.nextLine());
        cc.sacar(valor);
        if(cc.saldo == 1){
            System.out.println("saque realizado");
        }else{
            System.out.println("saque não realizado");
        }
    }
    public void execDepositar() {
        double valor;
        System.out.println("valor Deposito: ");
        valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
    }
}
