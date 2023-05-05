package CTQuestao01;

public class TesteConta{
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca(12345, "Gabriella");

        System.out.println(cp.getNumero());
        System.out.println(cp.getNomeTitular());
        System.out.println(cp.getSaldo());

        cp.depositar(500);
        System.out.println(cp.getSaldo());

        cp.sacar(250);
        System.out.println(cp.saldo);

        cp.reajustar(0.2);
        System.out.println(cp.saldo);

        ContaEspecial ce = new ContaEspecial(12543, "Maria", 1500);

        System.out.println(ce.getNumero());
        System.out.println(ce.getNomeTitular());
        System.out.println(ce.getSaldo());
        System.out.println(ce.getLimite());

        ce.depositar(600);
        System.out.println(ce.getSaldo());

        ce.sacar(300);
        System.out.println(ce.getSaldo());







    }


}
