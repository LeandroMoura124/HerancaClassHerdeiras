public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        //Visitante - a heranca de implementacao,a mais pobre - nao adiciona nada.
        Visitante v1 = new Visitante();
        v1.setNome("Leandro");
        v1.setIdade(18);
        v1.setSexo("M");
        System.out.println("-------------Dados Visitantes----------------");
        System.out.println(v1.toString());

        //Aluno - Herança de diferença - Pega os atributos e metodos da classe raiz Pessoa, e adiciona seus métodos a tributos em conjunto; 
        Aluno a1 = new Aluno();
        a1.setNome("Leandro Moura");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.setCurso("ADS");
        a1.setMatricula(111244);
        System.out.println("-------------Dados Alunos----------------");
        System.out.println(a1.toString());
        a1.pagarMensalidade();


        //Professor Heranca de diferenca
        Professor p1 = new Professor();
        p1.setNome("Leandro Moura da Silva");
        p1.setIdade(18);
        p1.setSexo("M");
        p1.setEspecialidade("Professor de ADS");
        p1.setSalario(3000f);
        System.out.println("-------------Dados Professor----------------");
        System.out.println(a1.toString());
        p1.receberAumento(500.2f);
        System.out.println("O salário é " + p1.getSalario());


        //Bolsista - herdando de aluno
        Bolsista b1 = new Bolsista();
        b1.setNome("Leandro M.");
        b1.setIdade(18);
        b1.setCurso("ADS");
        b1.setBolsa(144572);
        b1.setMatricula(445567);
        b1.setSexo("M");
        System.out.println("-------------Dados Bolsista----------------");
        System.out.println(b1.toString());
        b1.renovandoBolsa();
        b1.pagarMensalidade();

        //Técnico
        Tecnico t1 = new Tecnico();
        t1.setNome("Leandro");
        t1.setIdade(18);
        t1.setCurso("ADS");
        t1.setMatricula(145554);
        t1.setSexo("M");
        t1.setRegistro(4454554);


    }
}
