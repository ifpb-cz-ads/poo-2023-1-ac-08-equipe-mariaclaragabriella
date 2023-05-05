package CTQuestao01;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, String nomeTitular){
        super(numero, nomeTitular);
    }
    public void reajustar(double percentual){
        saldo = saldo + saldo * percentual;
    }
}
