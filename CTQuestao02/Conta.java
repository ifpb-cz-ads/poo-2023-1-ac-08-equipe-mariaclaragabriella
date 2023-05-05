package CTQuestao02;

public class Conta {
    private String nomeTitular;
    private int numero;
    protected double saldo;

    public Conta(String nomeTitular, int numero) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        saldo = 0;
    }

    public Conta(String nomeTitular, int numero, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.saldo = saldo;
    }

    void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
