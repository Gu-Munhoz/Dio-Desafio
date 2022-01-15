# Ler um valor inteiro e exibir seu antecessor

```
import javax.swing.JOptionPane;

public class JGPscLab02EX04 {
    public static void main(String[] args) {
        
        String n1=JOptionPane.showInputDialog("Digite um número:");
        int num = Integer.parseInt(n1);      
        
        int antecessor = num - 1;
                
        JOptionPane.showMessageDialog(null,"Seu antecessor é: " + antecessor);     

    }
    
}
```