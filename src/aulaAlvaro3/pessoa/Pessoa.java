package aulaAlvaro3.pessoa;


public class Pessoa {
    private String nome;
    private String sobreNome;
    private int idade;


    public Pessoa() {

    }

    public Pessoa(String nome, String sobreNome, int idade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;

    }

    public String falar(){
        return "Pessoa falando";

    }

    public void falar2(){
        System.out.println("Pessoa falando2");
    }

    public String falar3(String texto){
        return "Pessoa falando3: " + texto;
    }

    public int somar(int a, int b){
        return a + b;
    }

    }



