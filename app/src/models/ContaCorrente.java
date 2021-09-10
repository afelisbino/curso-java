package models;

public class ContaCorrente extends Conta{

    private double limite;
    private double taxaServico;
    private static double taxaArrecadado;
    
    public ContaCorrente(int numeroConta, int agencia, String nome){
        super(numeroConta, agencia, nome);

        this.limite = 300;
        this.taxaServico = .78;
    }

    public double getLimite() {
        return limite;
    }

    public static double getTaxaArrecadado() {
        return taxaArrecadado;
    }

    public void aumentaLimite(double limite) {
        this.limite += limite;
    }

    @Override
    public boolean saque(double valor) {
        if(super.getSaldoConta() < valor && this.limite > 0){
            double limiteUsar = ((super.getSaldoConta() - (valor + this.taxaServico)) * (-1));
            this.limite -= limiteUsar;

            super.deposita(limiteUsar);
        }

        valor += this.taxaServico;
        taxaArrecadado += this.taxaServico;

        return super.saque(valor);
    }
}
