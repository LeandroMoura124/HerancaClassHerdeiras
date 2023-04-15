public class Bolsista extends Aluno {
    private int bolsa;

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    public int getBolsa() {
        return bolsa;
    }

    //metodo especifico

    public void renovandoBolsa(){
        System.out.println("Renovando a bolsa....");
    }   

    @Override // Sobrepondo o método de pagar mensalidade vindo da classe Aluno - O bolsista irá pagar a 
    //bolsa de forma diferente -- esse é o override
    public void pagarMensalidade(){
        System.out.println("O " + this.getNome() + " é bolsita e está pagando a mensalidade....");

    }
    
}
