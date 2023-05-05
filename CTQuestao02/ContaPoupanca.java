package CTQuestao02;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, String nomeTitular){
        super(nomeTitular, numero);
    }
    public void reajustar(double percentual){
        saldo = saldo + saldo * percentual;
    }
}

