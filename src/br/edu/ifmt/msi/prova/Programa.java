package br.edu.ifmt.msi.prova;
import javax.swing.JOptionPane;
public class Programa {
    public static void main(String args[]){
        Empregado dados = new Empregado();
        
        dados.setNome(JOptionPane.showInputDialog("Entre com o nome do empregado: "));
        dados.setEndereco(JOptionPane.showInputDialog("Entre com o endereço do empregado: "));
        dados.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre com a "
                                                                    + "idade do empregado: ")));
        dados.setCPF(JOptionPane.showInputDialog("Entre com o CPF do empregado: "));
        dados.setRG(JOptionPane.showInputDialog("Entre com o RG do empregado: "));
        dados.setCodigoSetor(Integer.parseInt(JOptionPane.showInputDialog("Entre com "
                                          + "o código do setor do empregado: ")));
        dados.setSalarioBase(Double.parseDouble(JOptionPane.showInputDialog("Entre com "
                                          + "o salário base do empregado: ")));
        dados.setImposto(Integer.parseInt(JOptionPane.showInputDialog("Entre com "
                                          + "a porcentagem (0 a 100) a ser "
                                            + "descontada do salario base do empregado: ")));
        dados.imprimir();
    }
}
