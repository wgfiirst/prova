package br.edu.msi.ifmt.pessoal;
import javax.swing.JOptionPane;
public class Programa {
    public static void main(String[] args) {
        
        Pessoa P=new Pessoa();
        
        P.setNome(JOptionPane.showInputDialog("Insira o nome: "));
        P.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Insira a Altura em metros: ")));
        P.setAnoAtual(Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual: ")));
        P.setAnoNasc(Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento: ")));
        P.imprimir();
        
    }
}
