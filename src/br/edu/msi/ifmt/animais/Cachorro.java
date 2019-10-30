package br.edu.msi.ifmt.animais;

import javax.swing.JOptionPane;

public class Cachorro extends BichoEstimacao{

    int opc3; 
    public void escolhaAção(){
        do{ 
             opc3=Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a ação do Cachorro!"
        +"\n1 - Emitir Som"
        +"\n2 - Pedir Comida"
        +"\n0 - Sair"));
             
             switch(opc3){
                 case 1: 
                     this.emitirSom();
                     break;
                 case 2:  
                     this.pedirComida();
                     break;
             }
            
        }
        while(opc3!=0);
    }
    @Override
    public void emitirSom() {
    this.som="Au Au";
    JOptionPane.showMessageDialog(null, this.som); 
    }
    
    @Override
    public void pedirComida() {
    this.emitirSom();
    JOptionPane.showMessageDialog(null, "\nCachorro abana o rabo");
    }
    
    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome do Pet: "+this.nome+
                "\nEspécie: "+this.especie);
        this.escolhaAção();
    }
}
