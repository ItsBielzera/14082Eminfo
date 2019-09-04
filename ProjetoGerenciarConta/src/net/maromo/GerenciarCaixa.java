package net.maromo;

import net.maromo.visao.CaixaTela;

import javax.swing.*;

public class GerenciarCaixa {

    public static void main(String[] args) {
	// Codigo para abrir a Janela
        JFrame frame = new JFrame();
        frame.setContentPane(new CaixaTela().getPainelCaixa());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
