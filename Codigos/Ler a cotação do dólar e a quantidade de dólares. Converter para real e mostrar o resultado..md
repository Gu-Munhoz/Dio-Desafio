# Ler a cotação do dólar e a quantidade de dólares. Converter para real e mostrar o resultado.

import javax.swing.JOptionPane;

public class Dolar {
     public static void main(String[] args) {
       		

​			String n1=JOptionPane.showInputDialog("Digite a cotação do dolar em Reais:");

​			Double cotacao = Double.parseDouble(n1);

 		    String n2=JOptionPane.showInputDialog("Digite a quantidade de dólares:");

​		    Double dolares = Double.parseDouble(n2);

​            Double reais= cotacao * dolares;

​            JOptionPane.showMessageDialog(null,"Você tem em reais: R$" + reais);

}
}
