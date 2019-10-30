package br.edu.ifmt.msi.prova;
import javax.swing.JOptionPane;
public class Empregado extends Pessoa{
    private int codigoSetor;
    private double salarioBase;
    private int imposto;
    Pessoa pessoa;
    private double salarioReal;
    
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getSalarioReal() {
        return salarioReal;
    }

    public void setSalarioReal(double salarioReal) {
        this.salarioReal = salarioReal;
    }
    
    public double calcularSalario(){
        setSalarioReal( getSalarioBase() - ((getSalarioBase() * getImposto()) /100));
        return getSalarioReal();
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null,"Nome do empregado: " + getNome() +
                "\nEndereço do empregado: " + getEndereco() + 
                "\nIdade do empregado: " + getIdade() +
                "\nCPF do empregado: " + getCPF() + 
                "\nRG do empregado: " + getRG() +
                "\nCódigo do setor onde o empregado trabalha: " + getCodigoSetor() + 
                "\nPercentual de impostos pagos pelo empregado: " + getImposto() + "%" +
                "\nSalário Base recebido pelo empregado: " + getSalarioBase() +
                "\nSalário líquido deduzido dos impostos: " + calcularSalario(),
                "Dados do Empregado",JOptionPane.INFORMATION_MESSAGE);
    }
}
