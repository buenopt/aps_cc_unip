//APS - Fernando / Luis / Isabela / Samuel
package Apresentacao;

import Classes.contadorNivel;
import Classes.cronometro;
import Classes.musicaFundo;
import Classes.somadorPontos;
import Classes.verificadorResposta;
import DAL.pergrespDAO;
import Modelo.Controle;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JDialog
{

    cronometro cronometro = new cronometro();
    somadorPontos somarPontuacao = new somadorPontos();
    contadorNivel contarNivel = new contadorNivel();

    public frmPrincipal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        cronometro.iniciarCron(lblCronometro);
        cronometro.pararCron(lblCronometro);
        desativandoTudo();
        txfPontos.setText("0");
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        bgPrincipal = new javax.swing.ButtonGroup();
        sPrincipal = new javax.swing.JSeparator();
        lblPrincipal = new javax.swing.JLabel();
        lblPergunta = new javax.swing.JLabel();
        lblCronometro = new javax.swing.JLabel();
        btnComecar = new javax.swing.JButton();
        lblTemporestante = new javax.swing.JLabel();
        sSegundario = new javax.swing.JSeparator();
        rdResposta1 = new javax.swing.JRadioButton();
        rdResposta2 = new javax.swing.JRadioButton();
        lblEscolhaopcao = new javax.swing.JLabel();
        btnAbandonar = new javax.swing.JButton();
        btnAvancar = new javax.swing.JButton();
        lblPontos = new javax.swing.JLabel();
        txfPontos = new javax.swing.JTextField();
        btnPularpergunta = new javax.swing.JButton();
        lblIndiceinicial = new javax.swing.JLabel();
        lblIndicefinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("APS CC4P17 - Ciência da computação - Tela Jogo");
        setPreferredSize(new java.awt.Dimension(462, 378));

        lblPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logoPeq.png"))); // NOI18N

        lblPergunta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPergunta.setText("CLIQUE NO BOTÃO COMEÇAR PARA INICIAR O JOGO.");

        lblCronometro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronometro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblCronometro.addPropertyChangeListener(new java.beans.PropertyChangeListener()
        {
            public void propertyChange(java.beans.PropertyChangeEvent evt)
            {
                lblCronometroPropertyChange(evt);
            }
        });

        btnComecar.setText("COMEÇAR");
        btnComecar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnComecarActionPerformed(evt);
            }
        });

        lblTemporestante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemporestante.setText("Tempo decorrido : (Máximo de 60 segundos)");

        bgPrincipal.add(rdResposta1);
        rdResposta1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        rdResposta1.setForeground(new java.awt.Color(0, 102, 0));
        rdResposta1.setText("SIM");
        rdResposta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdResposta1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        rdResposta1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                rdResposta1MouseClicked(evt);
            }
        });

        bgPrincipal.add(rdResposta2);
        rdResposta2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        rdResposta2.setForeground(new java.awt.Color(255, 0, 0));
        rdResposta2.setText("NÃO");
        rdResposta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rdResposta2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                rdResposta2MouseClicked(evt);
            }
        });

        lblEscolhaopcao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEscolhaopcao.setForeground(new java.awt.Color(255, 102, 0));
        lblEscolhaopcao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscolhaopcao.setText("ESCOLHA A OPÇÃO CORRETA:");

        btnAbandonar.setText("ABANDONAR");
        btnAbandonar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAbandonarActionPerformed(evt);
            }
        });

        btnAvancar.setText("AVANÇAR");
        btnAvancar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAvancarActionPerformed(evt);
            }
        });

        lblPontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPontos.setText("Pontuação:");

        txfPontos.setEditable(false);
        txfPontos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txfPontos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPontos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txfPontos.setEnabled(false);

        btnPularpergunta.setText("PULAR PERGUNTA");
        btnPularpergunta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPularperguntaActionPerformed(evt);
            }
        });

        lblIndiceinicial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblIndiceinicial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIndiceinicial.setText("1");

        lblIndicefinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblIndicefinal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIndicefinal.setText("/ 20");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCronometro, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(lblTemporestante, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txfPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPularpergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAbandonar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnComecar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sSegundario)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEscolhaopcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sPrincipal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblIndiceinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblIndicefinal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdResposta1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(365, 365, 365)
                                        .addComponent(rdResposta2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(lblIndiceinicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIndicefinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(sPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEscolhaopcao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdResposta2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdResposta1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sSegundario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemporestante, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComecar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAbandonar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAvancar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPularpergunta)
                .addGap(20, 20, 20))
        );

        setSize(new java.awt.Dimension(769, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnComecarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnComecarActionPerformed
    {//GEN-HEADEREND:event_btnComecarActionPerformed
        pesquisarPerguntas();
        ativandoTudo();
        cronometro.timer.restart();
        btnComecar.setVisible(false);
    }//GEN-LAST:event_btnComecarActionPerformed

    private void pesquisarPerguntas()
    {
        lblPergunta.setText(null);
        Controle controle = new Controle();
        List<String> listaDadosCliente = new ArrayList<>();
        listaDadosCliente = controle.PesquisarPerguntasAleatorias("-1");
        if (controle.mensagem.equals(""))
        {
            lblPergunta.setText(listaDadosCliente.get(1));
        } else
        {
            JOptionPane.showMessageDialog(null, controle.mensagem);
        }
    }

    private void lblCronometroPropertyChange(java.beans.PropertyChangeEvent evt)//GEN-FIRST:event_lblCronometroPropertyChange
    {//GEN-HEADEREND:event_lblCronometroPropertyChange
        mudancadeCor();
    }//GEN-LAST:event_lblCronometroPropertyChange

    private void btnAbandonarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAbandonarActionPerformed
    {//GEN-HEADEREND:event_btnAbandonarActionPerformed
        musicaFundo iniciarSomfundo = new musicaFundo();
        iniciarSomfundo.IniciarSomFundo("somFundo");
        int reply = JOptionPane.showConfirmDialog(null, "Deseja realmente abandonar ?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_btnAbandonarActionPerformed

    private void salvarScore()
    {
        if (Integer.parseInt(lblIndiceinicial.getText()) > 20)
        {
            int reply = JOptionPane.showConfirmDialog(null, "FIM DE JOGO. \n \n - DESEJA SALVAR SUA PONTUAÇÃO ?", "Parabéns", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION)
            {
                somadorPontos.pontosFinais = txfPontos.getText();
                dispose();
                frmSalvarjogador salvarJogador = new frmSalvarjogador(null, true);
                salvarJogador.setVisible(true);
            } else
            {
                dispose();
            }
        }
    }

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvancarActionPerformed
    {//GEN-HEADEREND:event_btnAvancarActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Tem certeza de sua resposta ?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION)
        {
            cronometro.pararCron(lblCronometro);
            contarNivel.contagemNivel(lblIndiceinicial, lblIndiceinicial);
            pesquisarPerguntas();
            if (verificadorResposta.verificarSelecao(rdResposta1) == true)
            {
                if ("SIM".equals(pergrespDAO.resposta))
                {
                    somarPontuacao.somarPontos(txfPontos, txfPontos);
                }
                if ("NÃO".equals(pergrespDAO.resposta))
                {
                    somarPontuacao.somarPontos(txfPontos, txfPontos);
                }
            }

            salvarScore();
            cronometro.timer.restart();
        }
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void rdResposta1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_rdResposta1MouseClicked
    {//GEN-HEADEREND:event_rdResposta1MouseClicked
        btnAvancar.setVisible(true);
    }//GEN-LAST:event_rdResposta1MouseClicked

    private void rdResposta2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_rdResposta2MouseClicked
    {//GEN-HEADEREND:event_rdResposta2MouseClicked
        btnAvancar.setVisible(true);
    }//GEN-LAST:event_rdResposta2MouseClicked

    private void btnPularperguntaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPularperguntaActionPerformed
    {//GEN-HEADEREND:event_btnPularperguntaActionPerformed
        pesquisarPerguntas();
        ativandoTudo();
        cronometro.timer.restart();
        btnPularpergunta.setVisible(false);
    }//GEN-LAST:event_btnPularperguntaActionPerformed

    private void desativandoTudo()
    {
        lblEscolhaopcao.setVisible(false);
        rdResposta1.setVisible(false);
        rdResposta2.setVisible(false);
        btnAvancar.setVisible(false);
        btnPularpergunta.setVisible(false);
    }

    private void ativandoTudo()
    {
        lblPergunta.setVisible(true);
        lblEscolhaopcao.setVisible(true);
        rdResposta1.setVisible(true);
        rdResposta2.setVisible(true);
    }

    private void mudancadeCor()
    {
        if (lblCronometro.getText().equals("00"))
        {
            lblCronometro.setForeground(Color.BLACK);
        }
        if (lblCronometro.getText().equals("30"))
        {
            lblCronometro.setForeground(Color.orange);
        }
        if (lblCronometro.getText().equals("50"))
        {
            lblCronometro.setForeground(Color.red);
        }
        if (lblCronometro.getText().equals("60"))
        {
            cronometro.timer.stop();
            lblCronometro.setText("Tempo esgotado");
            btnComecar.setEnabled(false);
            btnAvancar.setVisible(false);
            btnPularpergunta.setVisible(true);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPrincipal dialog = new frmPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPrincipal;
    private javax.swing.JButton btnAbandonar;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnComecar;
    private javax.swing.JButton btnPularpergunta;
    private javax.swing.JLabel lblCronometro;
    private javax.swing.JLabel lblEscolhaopcao;
    private javax.swing.JLabel lblIndicefinal;
    private javax.swing.JLabel lblIndiceinicial;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblPontos;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JLabel lblTemporestante;
    private javax.swing.JRadioButton rdResposta1;
    private javax.swing.JRadioButton rdResposta2;
    private javax.swing.JSeparator sPrincipal;
    private javax.swing.JSeparator sSegundario;
    private javax.swing.JTextField txfPontos;
    // End of variables declaration//GEN-END:variables
}
