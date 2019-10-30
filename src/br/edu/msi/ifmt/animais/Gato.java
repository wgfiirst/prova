package br.edu.msi.ifmt.animais;
import javax.swing.JOptionPane;
public class Gato extends BichoEstimacao {

    int opc2; 
    public void escolhaAção(){
        do{ 
             opc2=Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a ação do Gato!"
        +"\n1 - Emitir Som"
        +"\n2 - Pedir Comida"
        +"\n0 - Sair"));
             
             switch(opc2){
                 case 1: 
                     this.emitirSom();
                     break;
                 case 2:  
                     this.pedirComida();
                     break;
             }
            
        }
        while(opc2!=0);
    }
    @Override
    public void emitirSom() {
    this.som="Miau Miau";
    JOptionPane.showMessageDialog(null, this.som);
    }
    
    @Override
    public void pedirComida() {
    this.emitirSom();
    JOptionPane.showMessageDialog(null, "\nGato faz olhar triste");
        
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome do Pet: "+this.nome+
                "\nEspécie: "+this.especie); 
        this.escolhaAção();
    }
    
    
    
}
