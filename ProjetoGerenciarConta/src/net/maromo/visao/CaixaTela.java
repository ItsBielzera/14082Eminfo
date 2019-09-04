package net.maromo.visao;

import net.maromo.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CaixaTela {
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton btnDepositar;
    private JButton btnRetirar;
    private JButton btnConsultar;
    private JButton btnSair;
    private JTextArea txtMensagem;
    private JPanel painelCaixa;

    public JPanel getPainelCaixa() {
        return painelCaixa;
    }

    private Caixa caixa;

    public CaixaTela() {
        caixa = new Caixa();

        btnDepositar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            double valor;
            valor = Double.parseDouble(txtValor.getText());
            boolean deuCerto = caixa.depositar(valor);
            if(deuCerto){
                txtMensagem.append("Deposito feito com sucesso \n");
            }else{
                txtMensagem.append("Valor incorreto para deposito");
            }
        LimparTextos();
            }


        });
        btnRetirar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor;
                valor = Double.parseDouble(txtValor.getText());
                boolean deuCerto = caixa.sacar(valor);
                if(deuCerto){
                    txtMensagem.append("Saque efetuado com sucesso \n");
                }else{
                    txtMensagem.append("valor insuficiente na conta \n");
                }
                LimparTextos();
            }
        });
        btnConsultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSaldo.setText(Double.toString(caixa.consultar()));
                txtMensagem.append("Saldo Consultado em Tela \n");

            }
        });
        btnSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Fim do Programa",
                        "Mensagem",
                        JOptionPane.INFORMATION_MESSAGE
                        );
                System.exit(0);
            }
        });
    }

    private void LimparTextos() {
        txtValor.setText(null);
        txtSaldo.setText(null);
        txtValor.requestFocus();
    }
}
