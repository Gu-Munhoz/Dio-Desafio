# Calcular área Retângulo

```
import javax.swing.JOptionPane;

public class JGPscLab02EX05 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        String n1=JOptionPane.showInputDialog("Digite o tamanho da base do quadrado:");
        int base = Integer.parseInt(n1);      
        String n2=JOptionPane.showInputDialog("Digite o tamanho da altura do quadrado:");
        int altura = Integer.parseInt(n2);      

        int area = base * altura;
        
        JOptionPane.showMessageDialog(null,"A área do triângulo é: " + area);     

    }
    
}
```