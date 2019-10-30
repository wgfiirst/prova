
package br.edu.msi.ifmt.animais;

import javax.swing.JOptionPane;

public class Programa {
    public static void main(String[] args) {
        
        BichoEstimacao e=new BichoEstimacao();
        Gato g=new Gato();
        Cachorro c=new Cachorro();
        int opc;
        
        do{ 
             opc=Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção na qual deseja editar e visualizar as informações!"
        +"\n1 - Editar e Visualisar BichoEstimacao"
        +"\n2 - Editar e Visualisar Gato"
        +"\n3 - Editar e Visualisar Cachorro"
        +"\n0 - Sair"));
             
             switch(opc){
                 case 1: 
                     e.setNome(JOptionPane.showInputDialog("Insira o Nome do Bicho de Estimação: "));
                     e.setEspecie(JOptionPane.showInputDialog("Insira a Espécie do Bicho de Estimação: "));
                     e.imprimir();
                     break;
                 case 2:  
                     g.setNome(JOptionPane.showInputDialog("Insira o Nome do Gato: "));
                     g.setEspecie(JOptionPane.showInputDialog("Insira a Espécie do Gato: "));
                     g.imprimir();
                     break;
                 case 3:
                     c.setNome(JOptionPane.showInputDialog("Insira o Nome do Cachorro: "));
                     c.setEspecie(JOptionPane.showInputDialog("Insira a Espécie do Cachorro: "));
                     c.imprimir();
                     break;
             }
            
        }
        while(opc!=0);
        
    
        
    
        
    }
}
