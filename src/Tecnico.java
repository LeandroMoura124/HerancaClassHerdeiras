public class Tecnico extends Aluno  {
    private int registro;

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    public int getRegistro() {
        return registro;
    }

    //metodo especifico

    public final void praticar(){
        System.out.println("O " + this.getNome() + "é técnico e está praticando");
    }
}
