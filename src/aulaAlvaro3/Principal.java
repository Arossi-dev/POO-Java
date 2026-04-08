package aulaAlvaro3;


import aulaAlvaro3.pessoa.Pessoa;
import aulaAlvaro4.empresa.Funcionario;

public class Principal {

    public static void main(String[] args) {

    Pessoa p1 = new Pessoa("Alvaro","Jose", 35);

    Pessoa p2 = new Pessoa();
    p2.setNome("Antonio");
    p2.setSobreNome("Rossi");
    p2.setIdade(41);

        System.out.println("Nome:" + p1.getNome()
            + " SobreNome:" + p1.getSobreNome()
            + " Idade:" + p1.getIdade());

        System.out.println("Nome:" + p2.getNome()
        + " SobreNome:" + p2.getSobreNome()
        + " Idade:" + p2.getIdade());

    Pessoa pessoa3 = new Pessoa();
        System.out.println("COMECA AQUI");
        System.out.println(pessoa3.getNome());
        pessoa3.setNome("Pedro");
        System.out.println(pessoa3.getNome());


    Pessoa pessoa4 = new Pessoa("Marco", "Angelo", 30);
        System.out.println(pessoa4.getNome());
        System.out.println(pessoa4.getSobreNome());
        System.out.println(pessoa4.getIdade());

        System.out.println(pessoa3.falar());
        pessoa3.falar2();
        System.out.println(p1.falar3("Vai curintiaaaaaaaa"));

        System.out.println("Soma: " + pessoa3.somar(3, 5));

        Funcionario f1 = new Funcionario("analista", "ti");
        double salario = 1200;

        Funcionario f2 = new Funcionario();
        System.out.println(f1.desconto(1200));

        System.out.println(f1.busy());


    }


}


