
package br.edu.msi.ifmt.pessoal;
import javax.swing.JOptionPane;
public class Pessoa {
    private String nome;
    private double altura;
    private int idade, anoAtual, anoNasc;

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public int caluclarIdade(){
        this.idade=this.anoAtual-this.anoNasc;
        return this.idade;
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "Nome: "+this.nome+
                "\nAno de Nascimento: "+this.anoNasc+
                "\nAltura: "+this.altura+
                "\nIdade: "+this.caluclarIdade(), "Impressão", 1);
        
    }
    
}
