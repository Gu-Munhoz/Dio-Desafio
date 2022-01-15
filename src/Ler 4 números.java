// Ler 4 números, calcular o quadrado para cada um, somar todos os quadrados e mostrar o resultado. 

import javax.swing.JOptionPane;

public class JGPscLab02EX02 {
    public static void main(String[] args) {
        
        String n1 = JOptionPane.showInputDialog("Digite a 1o número:");
        int num1 = Integer.parseInt(n1);      
        String n2 = JOptionPane.showInputDialog("Digite a 2o número:");
        int num2 = Integer.parseInt(n2);      
        String n3 = JOptionPane.showInputDialog("Digite a 3o número:");
        int num3 = Integer.parseInt(n3);      
        String n4 = JOptionPane.showInputDialog("Digite a 4o número:");
        int num4 = Integer.parseInt(n4);      

        int qdnum1 = num1*num1;
        int qdnum2 = num2*num2;
        int qdnum3 = num3*num3;
        int qdnum4 = num4*num4;
        
        int tot = qdnum1 + qdnum2 + qdnum3 +qdnum4;
        
        JOptionPane.showMessageDialog(null,"A soma dos quadrados é: " + tot);     

    }
    
}
