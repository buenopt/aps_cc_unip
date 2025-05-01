//APS - Fernando / Luis / Isabela / Samuel
package Apresentacao;

import Modelo.Controle;
import Modelo.perguntasRespostas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class frmPersonalizacao extends javax.swing.JDialog
{
    
    public frmPersonalizacao(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        bloqueioInicial();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        tbPrincipal = new javax.swing.JTabbedPane();
        pPerguntas = new javax.swing.JPanel();
        lblPergunta = new javax.swing.JLabel();
        txfPergunta = new javax.swing.JTextField();
        lblResposta = new javax.swing.JLabel();
        txfResposta = new javax.swing.JTextField();
        lblPontos = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txfPontos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txfId = new javax.swing.JTextField();
        btnLocalizar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        lblPrincipal = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("APS CC4P17 - Ciência da computação - Tela Personalização");

        lblPergunta.setText("Pergunta :");

        txfPergunta.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txfPerguntaKeyReleased(evt);
            }
        });

        lblResposta.setText("Resposta :");

        txfResposta.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txfRespostaKeyReleased(evt);
            }
        });

        lblPontos.setText("Pontos :");

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("(Apenas números)");

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditarActionPerformed(evt);
            }
        });

        lblId.setText("ID :");

        btnLocalizar.setText("LOCALIZAR POR ID");
        btnLocalizar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLocalizarActionPerformed(evt);
            }
        });

        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pPerguntasLayout = new javax.swing.GroupLayout(pPerguntas);
        pPerguntas.setLayout(pPerguntasLayout);
        pPerguntasLayout.setHorizontalGroup(
            pPerguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPerguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPerguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblPontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResposta, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(lblPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pPerguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                    .addComponent(txfResposta)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPerguntasLayout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pPerguntasLayout.createSequentialGroup()
                        .addComponent(txfPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txfId, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pPerguntasLayout.setVerticalGroup(
            pPerguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPerguntasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPerguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pPerguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResposta)
                    .addComponent(txfResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pPerguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPontos)
                    .addComponent(txfPontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblId)
                    .addComponent(txfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pPerguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnLocalizar)
                    .addComponent(btnNovo))
                .addGap(54, 54, 54))
        );

        tbPrincipal.addTab("Criar Perguntas", pPerguntas);

        lblPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/personalizar.png"))); // NOI18N

        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPrincipal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(661, 661, 661)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tbPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 34, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tbPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(860, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVoltarActionPerformed
    {//GEN-HEADEREND:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalvarActionPerformed
    {//GEN-HEADEREND:event_btnSalvarActionPerformed
        String mensagem = "";
        List<String> listaDadosPerguntas = new ArrayList<>();
        Controle ctrl = new Controle();
        listaDadosPerguntas.add("0");
        listaDadosPerguntas.add(txfPergunta.getText());
        listaDadosPerguntas.add(txfResposta.getText());
        listaDadosPerguntas.add(txfPontos.getText());
        ctrl.SalvarPerguntaNova(listaDadosPerguntas);
        mensagem = ctrl.mensagem;
        JOptionPane.showMessageDialog(null, mensagem);
        limparCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txfPerguntaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txfPerguntaKeyReleased
    {//GEN-HEADEREND:event_txfPerguntaKeyReleased
        txfPergunta.setText(txfPergunta.getText().toUpperCase());
    }//GEN-LAST:event_txfPerguntaKeyReleased

    private void txfRespostaKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txfRespostaKeyReleased
    {//GEN-HEADEREND:event_txfRespostaKeyReleased
        txfResposta.setText(txfResposta.getText().toUpperCase());
    }//GEN-LAST:event_txfRespostaKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditarActionPerformed
    {//GEN-HEADEREND:event_btnEditarActionPerformed
        Controle controle = new Controle();
        List<String> listaDadosPerguntas = new ArrayList<>();
        listaDadosPerguntas.add(txfId.getText());
        listaDadosPerguntas.add(txfPergunta.getText());
        listaDadosPerguntas.add(txfResposta.getText());
        listaDadosPerguntas.add(txfPontos.getText());
        controle.EditarPerguntaResposta(listaDadosPerguntas);
        JOptionPane.showMessageDialog(null, controle.mensagem);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNovoActionPerformed
    {//GEN-HEADEREND:event_btnNovoActionPerformed
        limparCampos();
        desbloqueioNovoCad();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLocalizarActionPerformed
    {//GEN-HEADEREND:event_btnLocalizarActionPerformed
        btnSalvar.setEnabled(false);
        Controle controle = new Controle();
        List<String> listaDadosPerguntasResp = new ArrayList<>();
        listaDadosPerguntasResp = controle.PesquisarPerguntas(txfId.getText());
        if (controle.mensagem.equals(""))
        {
            txfPergunta.setText(listaDadosPerguntasResp.get(1));
            txfResposta.setText(listaDadosPerguntasResp.get(2));
            txfPontos.setText(listaDadosPerguntasResp.get(3));
        } else
        {
            JOptionPane.showMessageDialog(null, controle.mensagem);
        }
    }//GEN-LAST:event_btnLocalizarActionPerformed
    
    private void limparCampos()
    {
        txfPergunta.setText(null);
        txfResposta.setText(null);
        txfPontos.setText(null);
        txfId.setText(null);
    }
    
    private void desbloqueioNovoCad()
    {
        txfId.setEnabled(true);
        txfPergunta.setEnabled(true);
        txfResposta.setEnabled(true);
        txfPontos.setEnabled(true);
        btnEditar.setEnabled(true);
        btnLocalizar.setEnabled(true);
        btnSalvar.setEnabled(true);
    }
    
    private void bloqueioInicial()
    {
        txfId.setEnabled(false);
        txfPergunta.setEnabled(false);
        txfResposta.setEnabled(false);
        txfPontos.setEnabled(false);
        btnEditar.setEnabled(false);
        btnLocalizar.setEnabled(false);
        btnSalvar.setEnabled(false);
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
            java.util.logging.Logger.getLogger(frmPersonalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPersonalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPersonalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPersonalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPersonalizacao dialog = new frmPersonalizacao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblPontos;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JPanel pPerguntas;
    private javax.swing.JTabbedPane tbPrincipal;
    private javax.swing.JTextField txfId;
    private javax.swing.JTextField txfPergunta;
    private javax.swing.JTextField txfPontos;
    private javax.swing.JTextField txfResposta;
    // End of variables declaration//GEN-END:variables
}
