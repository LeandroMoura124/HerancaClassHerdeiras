//public FINAL class Aluno --Lembrando, se eu adiciono FINAL na criacao da classe
//declaro que ela é a ultima classe e nao possuirá nenhuma herdeira que herde ela.

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }

    //metodo especifico


    public  void pagarMensalidade(){
        System.out.println("Pagando a mensalidade o aluno...");
    }


    //public FINAL void pagarMensalidade -- adicionando Final no metodo, declaro que ele é o ultimo metodo e nao poderá ser sobreposto caso a classe
    //herde alguem
}
