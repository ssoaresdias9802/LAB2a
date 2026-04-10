public class Funcionario{
    private String nome;
    private int registro;
    private CPF num_cpf;
    private String cargo;
    private double salario;

    public Funcionario(String nome, int registro, CPF num_cpf, String cargo, double salario){
        this.nome = nome;
        this.registro = registro;
        this.num_cpf = num_cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public int getRegistro(){
        return registro;
    }

    public CPF getNumCpf(){
        return num_cpf;
    }

    public String getCargo(){
        return cargo;
    }

    public double getSalario(){
        return salario;
    }

    public String toString(){
        return ("Nome: " + nome + " Registro: " + registro+ " CPF: "+num_cpf+ " Cargo: " + cargo + " Salário: "+salario);
    }
}