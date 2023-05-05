package BMQuestoes;

public class TesteEquipamento {
    public static void main(String[] args) {
        
        //BMQuestão07:
        Equipamento equipamento = new Equipamento();
        equipamento.setModelo("televisão");
        equipamento.setFabricante("LG");
        Computador computador = new Computador();
        computador.setFabricante("lenovo");
        computador.setModelo("computador");
        computador.setMemoriaRAM(8);
        computador.setSistemaOperacional("windows");

        //BMQuestao08:
        System.out.println("Equipamento: ");
        System.out.println(equipamento.getModelo());
        System.out.println(equipamento.getFabricante());
        System.out.println("\n");
        System.out.println("Computador: ");
        System.out.println(computador.getFabricante());
        System.out.println(computador.getModelo());
        System.out.println(computador.getMemoriaRAM());
        System.out.println(computador.getSistemaOperacional());
    }
}
