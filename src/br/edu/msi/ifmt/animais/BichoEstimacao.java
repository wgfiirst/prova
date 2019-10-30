
package br.edu.msi.ifmt.animais;

import javax.swing.JOptionPane;

public class BichoEstimacao {
    protected String especie, som, nome;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void emitirSom(){
        
    }
    public void pedirComida(){
        
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "Nome do Pet: "+this.nome+
                "\nEspécie: "+this.especie);
    }
}
