

public abstract class Pessoa { //classe pessoa nao sera instanciada
    private String nome;
    private String sexo;
    private int idade;



    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    //metodo especifico

    public void fazerAniver(){
        this.idade++;
    }

    public String toString() {
        return "Dados: " + this.nome + ", Sexo: " + this.sexo + ", idade: " + this.idade;
    }
    
}
