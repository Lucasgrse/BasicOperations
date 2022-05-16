
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class Operations2 {
//exercicio 5

    public static void main(String[] args) {
        int retorno = 0;
        JOptionPane.showConfirmDialog(null, "Caro usuário, bem vindo! Está fazendo frio em sua cidade?");
        if (retorno == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Legal! Você poderia informar seu nome para lhe identificarmos?");
            String nome = JOptionPane.showInputDialog("Nome do usuário: ");
            JOptionPane.showMessageDialog(null, "Caro Sr. " + nome + " ,iremos converter sua temperatura para Fahrenheit. Porém, precisamos que informe-a:  ");
            String temperatura = JOptionPane.showInputDialog("Temperatura: ");

            double a = Double.parseDouble(temperatura);
            double b = (a - 32) / 1.8; // Celsius para Fahrenheit

            double c = ((a * 1.8) + 32); //converte temperatura em Fahrenheit para Celsius

            JOptionPane.showMessageDialog(null, "A sua temperatura em Celsius seria" + temperatura + "! Entretanto, caso quisesse saber em Fahrenheit, a temperatura seria em " + c);
        }
        if (retorno == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Legal! Você poderia informar seu nome para lhe identificarmos?");
            String nome = JOptionPane.showInputDialog("Nome do usuário: ");
            JOptionPane.showMessageDialog(null, "Caro Sr. " + nome + " ,iremos converter sua temperatura para Fahrenheit. Porém, precisamos que informe-a:  ");
            String temperatura = JOptionPane.showInputDialog("Temperatura: ");

            double a = Double.parseDouble(temperatura);
            double b = (a - 32) / 18;
            double c = ((a * 1.8) + 32);

            JOptionPane.showMessageDialog(null, "A sua temperatura em Celsius seria" + temperatura + "! Entretanto, caso quisesse saber em Fahrenheit, a temperatura seria em " + c);
        }
    }
}
