/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Cliente;
import bean.Venda;
import bean.Vendedor;
import dao.Cliente_DAO;
import dao.Venda_DAO;
import dao.Vendedor_DAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author rafae
 */
public class JDlgVenda extends javax.swing.JDialog {

    private boolean incluindo;
    MaskFormatter mascaraData;

    /**
     * Creates new form JDlgVenda
     */
    public JDlgVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        try {
            mascaraData = new MaskFormatter("##/##/####");

        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtData.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
        setLocationRelativeTo(null);

        Cliente_DAO cliente_DAO = new Cliente_DAO();
        List lista = cliente_DAO.listALL();
        for (int i = 0; i < lista.size(); i++) {
            Cliente cliente = (Cliente) lista.get(i);
            jCboCliente.addItem(cliente);
        }
        Vendedor_DAO vendedor_DAO = new Vendedor_DAO();
        List listaV = vendedor_DAO.listALL();
        for (int f = 0; f < listaV.size(); f++) {
            Vendedor vendedor = (Vendedor) listaV.get(f);
            jCboVendedorr.addItem(vendedor);
        }

        setLocationRelativeTo(null);
        setTitle("Vendas");
        desabilitar();

    }

    public void habilitar() {
        jTxtIdVendas.setEnabled(true);
        jFmtData.setEnabled(true);
        jCboCliente.setEnabled(true);
        jCboVendedorr.setEnabled(true);
        jTxtTotal.setEnabled(true);

        jBtnConfirmar.setEnabled(true);
        jBtnCancelar.setEnabled(true);

        jBtnIncluir.setEnabled(false);
        jBtnIncluir2.setEnabled(true);
        jBtnAlterar.setEnabled(false);
        jBtnAlterar2.setEnabled(true);
        jBtnExcluir.setEnabled(false);
        jBtnExcluir2.setEnabled(true);
        jBtnAlterar.setEnabled(false);

    }

    public void desabilitar() {
        jTxtIdVendas.setEnabled(false);
        jFmtData.setEnabled(false);
        jCboCliente.setEnabled(false);
        jCboVendedorr.setEnabled(false);
        jTxtTotal.setEnabled(false);

        jBtnCancelar.setEnabled(false);
        jBtnConfirmar.setEnabled(false);

        jBtnIncluir.setEnabled(true);
        jBtnIncluir2.setEnabled(false);
        jBtnAlterar.setEnabled(true);
        jBtnAlterar2.setEnabled(false);
        jBtnExcluir.setEnabled(true);
        jBtnExcluir2.setEnabled(false);
        jBtnAlterar.setEnabled(true);

    }

    public void LimparCampos() {
        jTxtIdVendas.setText("");
        jFmtData.setText("");
        jCboCliente.setSelectedIndex(-1);
        jCboVendedorr.setSelectedIndex(-1);
        jTxtTotal.setText("");

    }

    public Venda viewBean() {
        Venda venda = new Venda();
        int id = Integer.parseInt(jTxtIdVendas.getText());

        venda.setIdvenda(id);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            venda.setData_venda(formato.parse(jFmtData.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        Cliente clientes = (Cliente) jCboCliente.getSelectedItem();
        venda.setId_cliente(clientes.getIdCliente());

      Vendedor vendedor = (Vendedor) jCboVendedorr.getSelectedItem();
        venda.setId_vendedor(vendedor.getIdVendedor());
        
      venda.setValor_total_venda(Double.valueOf(jTxtTotal.getText()));
return venda;
    }

    public void beanView(Venda venda) {
        String id = String.valueOf(venda.getIdvenda());

        jTxtIdVendas.setText(id);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jFmtData.setText(formato.format(venda.getData_venda()));

        int id_cliente = venda.getId_cliente();
        Cliente_DAO cliente_DAO = new Cliente_DAO();
        jCboCliente.setSelectedItem(cliente_DAO.List(id_cliente));

        int id_vendedor = venda.getId_vendedor();
        Vendedor_DAO vendedor_DAO = new Vendedor_DAO();
        jCboVendedorr.setSelectedItem(vendedor_DAO.List(id_vendedor));

        jTxtTotal.setText(String.valueOf(venda.getValor_total_venda()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        NumVenda = new javax.swing.JLabel();
        jTxtIdVendas = new javax.swing.JTextField();
        jFmtData = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jCboCliente = new javax.swing.JComboBox<Cliente>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnIncluir2 = new javax.swing.JButton();
        jBtnExcluir2 = new javax.swing.JButton();
        jBtnAlterar2 = new javax.swing.JButton();
        jCboVendedorr = new javax.swing.JComboBox<Vendedor>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Quantidade", "Valor Unitario", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        NumVenda.setText("Num. Venda");

        jLabel1.setText("Data");

        jCboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Cliente");

        jLabel3.setText("Vendedor");

        jLabel4.setText("Total");

        jTxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTotalActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnIncluir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluir2ActionPerformed(evt);
            }
        });

        jBtnExcluir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluir2ActionPerformed(evt);
            }
        });

        jBtnAlterar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        jBtnAlterar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtIdVendas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCboVendedorr, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnAlterar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExcluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnIncluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jBtnIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NumVenda)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtIdVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboVendedorr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnExcluir2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboClienteActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        habilitar();
        incluindo = false;

    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed

        desabilitar();
        LimparCampos();
        JOptionPane.showMessageDialog(null, "Voce cancelou!");
        setVisible(false);

    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed

        habilitar();
        LimparCampos();// TODO add your handling code here:
        incluindo = true;

    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro?", "Exclusão", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            Venda venda = viewBean();
            Venda_DAO venda_DAO = new Venda_DAO();
            venda_DAO.delete(venda);
        } else {
            JOptionPane.showMessageDialog(null, "Exlusão cancelada");
        }
        LimparCampos();
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed

        Venda_DAO venda_DAO = new Venda_DAO();
        venda_DAO.insert(viewBean());

        desabilitar();
        LimparCampos();        // TODO 
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        JDlgVendaPesquisa jDlgVendaPesquisa = new JDlgVendaPesquisa(null, true);
        jDlgVendaPesquisa.setTelaAnterior(this);
        jDlgVendaPesquisa.setVisible(true);

        jBtnIncluir.setEnabled(false);
        jBtnCancelar.setEnabled(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnIncluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluir2ActionPerformed
        JDlgVenda_produto venda = new JDlgVenda_produto(null, true);
        venda.setTitle("Inclusao de produtos");
        venda.setLocationRelativeTo(null);
        venda.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jBtnIncluir2ActionPerformed

    private void jBtnAlterar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar2ActionPerformed
        JDlgVenda_produto venda = new JDlgVenda_produto(null, true);
        venda.setTitle("Inclusao de produtos");
        venda.setLocationRelativeTo(null);
        venda.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAlterar2ActionPerformed

    private void jBtnExcluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluir2ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnExcluir2ActionPerformed

    private void jTxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTotalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVenda dialog = new JDlgVenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NumVenda;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnAlterar2;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnExcluir2;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnIncluir2;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<Cliente> jCboCliente;
    private javax.swing.JComboBox<Vendedor> jCboVendedorr;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtIdVendas;
    private javax.swing.JTextField jTxtTotal;
    // End of variables declaration//GEN-END:variables
}
