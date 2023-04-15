public class Professor  extends Pessoa{ //Heranca implementacao
    private float salario;
    private String especialidade;

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getSalario() {
        return salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return especialidade;
    }

    //metodo especifico


    public void receberAumento(float aumen){
        this.salario += aumen;
    }



    
}
