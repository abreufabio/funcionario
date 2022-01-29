package controller;

import javax.swing.JOptionPane;
import model.Funcionario;

public class ExercicioFuncionario {

    public static void main(String[] args) {

        /*Funcionario funcionario1 = new Funcionario();
        funcionario1.matricula = 10;
        funcionario1.nome = "Alyson Figueroa";
        funcionario1.email = "alyson@gmail.com";
        funcionario1.cargo = "Gerente de Projetos";
        funcionario1.salario = 8988.50;
        funcionario1.endereco = " QI 30 Conjunto B Casa 2";

        System.out.println(funcionario1.mostraFuncionario());*/
        try {
            for (int i = 0; i < 2; i++) {
                Funcionario funcionarioX = new Funcionario();
                funcionarioX.setMatricula (Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula: ")));
                funcionarioX.setNome(JOptionPane.showInputDialog("Digite o nome: "));
                funcionarioX.setEmail(JOptionPane.showInputDialog("Digite o email: ")); 
                funcionarioX.setCargo(JOptionPane.showInputDialog("Digite o cargo: ")); 
                funcionarioX.setSalario (Double.parseDouble((JOptionPane.showInputDialog("Digite o salario: ")))); 
                funcionarioX.setEndereco((JOptionPane.showInputDialog("Digite o endereco: ")));

                System.out.println("\n");
                System.out.println(funcionarioX.mostraFuncionario());
                funcionarioX = null;
            }
        } catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERRO 404", "ERRO", JOptionPane.ERROR_MESSAGE);
    }
}
}
