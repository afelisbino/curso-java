package controllers;

import models.ContaCorrente;
import models.ContaPoupanca;

public class Banco {
    public static void main(String[] args){

        ContaCorrente cc = new ContaCorrente(0565, 0001, "IronBank");
        cc.deposita(150.0);
        ContaPoupanca cp = new ContaPoupanca(0565, 0001, "IronBank");
        cp.deposita(500.0);
        System.out.println("Conta corrente: " + cc.getSaldoConta());
        System.out.println("limite Conta corrente: " + cc.getLimite());
        System.out.println("Poupança " + cp.getSaldoConta());
        System.out.println("=====================================");
        cc.transfere(50, cp);
        System.out.println("Conta corrente: " + cc.getSaldoConta());
        System.out.println("limite Conta corrente: " + cc.getLimite());
        System.out.println("Poupança " + cp.getSaldoConta());
        System.out.println("======Sacando conta corrente=========");
        cc.saque(120.0);
        System.out.println("Conta corrente: " + cc.getSaldoConta());
        System.out.println("limite Conta corrente: " + cc.getLimite());
        System.out.println("Poupança " + cp.getSaldoConta());
        System.out.println("======Sacando conta corrente=========");
        cc.saque(200.0);
        System.out.println("Conta corrente: " + cc.getSaldoConta());
        System.out.println("limite Conta corrente: " + cc.getLimite());
        System.out.println("Poupança " + cp.getSaldoConta());

        System.out.println("======Total taxa arrecadado==========");
        System.out.println("Total taxa: " + ContaCorrente.getTaxaArrecadado());
    }
}