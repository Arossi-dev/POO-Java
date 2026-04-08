package aulaAlvaro4.empresa;

public class Funcionario {
    private String cargo;
    private String departamento;

public Funcionario(String cargo, String departamento) {
    this.cargo = cargo;
    this.departamento = departamento;
}
public Funcionario() {

}

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String busy(){
    return "EM REUNIÃO";
    }
    public double desconto(double salario){
    return salario * 0.10;
    }
}






/* CRIE ATRIBUTOS
CARGO TIPO TEXTO, DEPARTAMENTO TIPO TEXTO

CRIE OS METODOS GET E SET E CRIE OS CONSTRUTORES VAZIOS E COM ATRIBUTOS

CRIE METODO OCUPADO QUE RETORNA TEXTO "EM REUNIÃO", CRIE METODO QUE CALCULA O DESCONTO DE 10% DO
SALÁRIO QUE A PESSOA DEFINIR (DIGITAR OU PARAMETRO) QUE MOSTRA O VALOR DO DESCONTO

CRIE OBJETOS DESSA CLASSE NA PRINCIPAL E USE OS METODOS
 */

