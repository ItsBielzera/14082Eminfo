package net.google;

public class Conta {
    public String conta;
    public String agc;
    public double saldo;
    public String nomeCli;

    public int sacar(double valor) {
        saldo = saldo - valor;
        if (saldo < 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public void depositar(double valor) {
         saldo = saldo + valor;
    }
    public void imprimir() {
        System.out.println("conta = " + conta);
        System.out.println("agc = " + agc);
        System.out.println("saldo = " + saldo);
        System.out.println("nome do Cli = " + nomeCli);
    }
}