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
    }
}
