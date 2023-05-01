package BMQuestoes;

public class Computador extends Equipamento{

    //BMQuestão05:
    private int memoriaRAM;
    private String sistemaOperacional;

    //BMQuestão06:
    public int getMemoriaRAM() {
        return memoriaRAM;
    }
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

}
