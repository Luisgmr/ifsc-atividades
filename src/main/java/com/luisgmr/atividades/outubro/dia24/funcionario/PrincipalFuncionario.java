package com.luisgmr.atividades.outubro.dia24.funcionario;

public class PrincipalFuncionario {

    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[6];
        int numFuncionarios = 0;

        // Cadastra até 6 funcionários
        funcionarios[numFuncionarios++] = new Funcionario("Alice", 'F', "Gerente", 3000, 5, 2);
        funcionarios[numFuncionarios++] = new Funcionario("Antonio", 'M', "Desenvolvedor", 2500, 3, 1);
        funcionarios[numFuncionarios++] = new Funcionario("Luis", 'M', "Desenvolvedor", 2600, 5, 0);
        funcionarios[numFuncionarios++] = new Funcionario("Lorenzo", 'M', "Desenvolvedor", 2100, 12, 2);
        funcionarios[numFuncionarios++] = new Funcionario("Carlos", 'M', "Desenvolvedor", 2800, 8, 0);
        funcionarios[numFuncionarios++] = new Funcionario("Rita", 'F', "Analista", 2800, 3, 3);

        // Imprima os funcionários cadastrados
        for (int i = 0; i < numFuncionarios; i++) {
            funcionarios[i].mostrarDados();
        }
        System.out.println("");

        // Calcule a quantidade de homens e mulheres
        int homens = 0;
        int mulheres = 0;
        for (int i = 0; i < numFuncionarios; i++) {
            if (funcionarios[i].getSexo() == 'M') {
                homens++;
            } else {
                mulheres++;
            }
        }
        System.out.println("Quantidade de Homens: " + homens);
        System.out.println("Quantidade de Mulheres: " + mulheres);

        // Encontre o funcionário com mais filhos
        int maxFilhos = 0;
        String nomeMaisFilhos = "";
        for (int i = 0; i < numFuncionarios; i++) {
            if (funcionarios[i].getNumeroFilhos() > maxFilhos) {
                maxFilhos = funcionarios[i].getNumeroFilhos();
                nomeMaisFilhos = funcionarios[i].getNome();
            }
        }
        System.out.println("Funcionário com mais filhos: " + nomeMaisFilhos);

        // Encontre o funcionário com mais horas extras
        int maxHorasExtras = 0;
        String nomeMaisHorasExtras = "";
        for (int i = 0; i < numFuncionarios; i++) {
            if (funcionarios[i].getHorasExtras() > maxHorasExtras) {
                maxHorasExtras = funcionarios[i].getHorasExtras();
                nomeMaisHorasExtras = funcionarios[i].getNome();
            }
        }
        System.out.println("Funcionário com mais horas extras: " + nomeMaisHorasExtras);

        // Encontre o funcionário com maior salário
        double maiorSalario = 0;
        String nomeMaiorSalario = "";
        for (int i = 0; i < numFuncionarios; i++) {
            if (funcionarios[i].getSalario() > maiorSalario) {
                maiorSalario = funcionarios[i].getSalario();
                nomeMaiorSalario = funcionarios[i].getNome();
            }
        }
        System.out.println("Funcionário com maior salário: " + nomeMaiorSalario);
    }

}
