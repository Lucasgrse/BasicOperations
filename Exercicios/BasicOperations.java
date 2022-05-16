/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class BasicOperations {

    //exercicio 4
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Caro usuário! Bem vindo! Qual seu nome?");
        String nome;
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        JOptionPane.showMessageDialog(null, "Bem vindo Sr." + nome + ". Damos-lhe as boas vindas!");
        JOptionPane.showMessageDialog(null, "O objetivo do programa é calcular o custo final do seu veículo que saiu de fábrica.");
        JOptionPane.showConfirmDialog(null, "Para isso vamos precisar de algumas informações, tudo bem?");
        //Iniciando as variáveis 
        String preçoFabrica;
        JOptionPane.showMessageDialog(null, "Caro " + nome + " favor inserir o valor de fábrica do carro!");
        preçoFabrica = JOptionPane.showInputDialog("Valor do carro de fábrica: ");

        int a = Integer.parseInt(preçoFabrica);

        int percentual = (a * 28 / 100);
        int imposto = (a * 45 / 100);
        int f = (a + percentual + imposto);

        JOptionPane.showMessageDialog(null, "O valor final de seu veículo é : " + f + " reais, com todos os valores e impostos já aplicados");
    }
}
