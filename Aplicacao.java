import java.util.ArrayList;

public class Aplicacao {
    public static void main(String[] args) {

        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario("Ana", 1, new CPF("1456"), "Gerente", 5000));
        lista.add(new Funcionario("Carlos", 2, new CPF("2423"), "Analista", 3000));
        lista.add(new Funcionario("Bruna", 3, new CPF("3967"), "Analista", 3500));
        lista.add(new Funcionario("Daniel", 4, new CPF("4908"), "Gerente", 4500));

        // a) Ordenar por nome
        ordenarPorNome(lista);
        System.out.println("\nPor nome:");
        imprimir(lista);

        // b) Ordenar por cargo
        ordenarPorCargo(lista);
        System.out.println("\nPor cargo:");
        imprimir(lista);

        // c) Ordenar por salário
        ordenarPorSalario(lista);
        System.out.println("\nPor salário:");
        imprimir(lista);

        // d) Ordenar por cargo + salário
        ordenarPorCargoSalario(lista);
        System.out.println("\nPor cargo + salário:");
        imprimir(lista);
    }


    public static void ordenarPorNome(ArrayList<Funcionario> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j).getNome().compareTo(lista.get(j + 1).getNome()) > 0) {
                    trocar(lista, j);
                }
            }
        }
    }

    public static void ordenarPorCargo(ArrayList<Funcionario> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j).getCargo().compareTo(lista.get(j + 1).getCargo()) > 0) {
                    trocar(lista, j);
                }
            }
        }
    }

    public static void ordenarPorSalario(ArrayList<Funcionario> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j).getSalario() > lista.get(j + 1).getSalario()) {
                    trocar(lista, j);
                }
            }
        }
    }

    public static void ordenarPorCargoSalario(ArrayList<Funcionario> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {

                Funcionario f1 = lista.get(j);
                Funcionario f2 = lista.get(j + 1);

                int compCargo = f1.getCargo().compareTo(f2.getCargo());

                if (compCargo > 0 ||
                   (compCargo == 0 && f1.getSalario() > f2.getSalario())) {

                    trocar(lista, j);
                }
            }
        }
    }

    // Troca elementos
    public static void trocar(ArrayList<Funcionario> lista, int i) {
        Funcionario temp = lista.get(i);
        lista.set(i, lista.get(i + 1));
        lista.set(i + 1, temp);
    }

    // Impressão
    public static void imprimir(ArrayList<Funcionario> lista) {
        for (Funcionario f : lista) {
            System.out.println(f);
        }
    }
}