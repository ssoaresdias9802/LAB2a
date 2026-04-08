public class Funcionario{
    private String nome;
    private int registro;
    private String num_cpf;
    private String cargo;
    private double salario;

    public Funcionario(String nome, int registro, String num_cpf, String cargo, double salario){
        this.nome = nome;
        this.registro = registro;
        this.num_cpf = num_cpf;
        this.cargo = cargo;
        this.salario = salario;
    }
}