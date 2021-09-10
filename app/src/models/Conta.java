package models;

public class Conta extends Agencia{
    private int numeroConta;
    private Pessoa titular;
    private double saldoConta;

    /**
     * Metodo construtor inicializando com o numero da conta e agencia
     */

    public Conta(int numeroConta, int agencia, String nome){
        super(agencia, nome);

        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * Transfere determinado valor para determinada conta
     * 
     * @param valor
     * @param destino
     * @return
     */
    public boolean transfere(double valor, Conta destino){
        if(valor > 0 && valor <= this.getSaldoConta() && destino != null){
            this.saldoConta -= valor;
            
            destino.deposita(valor);
            return true;
        }
        
        return false;
    }

    /**
     * Retira determinado valor da conta caso esteja disponivel
     * 
     * @param valor
     * @return
     */
    public boolean saque(double valor){
        if(valor > 0 && valor <= this.getSaldoConta()){
            this.saldoConta -= valor;
            return true;
        }

        return false;
    }

    /**
     * Deposita qualquer valor na conta 
     * 
     * @param valor
     * @return
     */
    public boolean deposita(double valor){
        if(valor > 0){
            this.saldoConta += valor;
            return true;
        }

        return false;
    }
}