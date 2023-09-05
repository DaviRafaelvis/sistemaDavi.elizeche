package view;

import bean.Funcionario;
import dao.Funcionario_DAO;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafae
 */
public class JDlgFuncionario extends javax.swing.JDialog {
    private boolean incluindo;
MaskFormatter mascaraCpf, mascaraTelefone;
    /**
     * Creates new form JDlgFuncionario
     */
    public JDlgFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        desabilitar();
        setTitle("Funcionário");
        setLocationRelativeTo(null);
        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraTelefone = new MaskFormatter("(##)#####-####");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
        jFmtTelefone.setFormatterFactory(new DefaultFormatterFactory(mascaraTelefone));
    }
    public void habilitar(){
    jTxtIdFuncionario.setEnabled(true);
    jTxtNome.setEnabled(true);
    jTxtEmail.setEnabled(true);
    jFmtTelefone.setEnabled(true);
    jFmtCpf.setEnabled(true);
    jCboCargo.setEnabled(true);
    
    jBtnConfirmar.setEnabled(true);
    jBtnCancelar.setEnabled(true);
    
    jBtnIncluir.setEnabled(false);
    jBtnAlterar.setEnabled(false);
    jBtnExcluir.setEnabled(false);
    jBtnAlterar.setEnabled(false);
   
   
   
    }
    
    public void desabilitar(){
    jTxtIdFuncionario.setEnabled(false);
    jTxtNome.setEnabled(false);
    jTxtEmail.setEnabled(false);
    jFmtTelefone.setEnabled(false);
    jFmtCpf.setEnabled(false);
    jCboCargo.setEnabled(false);
    
    jBtnCancelar.setEnabled(false);
    jBtnConfirmar.setEnabled(false);
    
     jBtnIncluir.setEnabled(true);
    jBtnAlterar.setEnabled(true);
    jBtnExcluir.setEnabled(true);
    jBtnAlterar.setEnabled(true);
    
    }
    public void LimparCampos(){
    jTxtIdFuncionario.setText("");
    jTxtNome.setText("");
    jTxtEmail.setText("");
    jFmtTelefone.setText("");
    jFmtCpf.setText("");
    jCboCargo.setSelectedIndex(-1);;
    
    }
    public Funcionario viewBean(){
    Funcionario funcionario = new Funcionario();
int id = Integer.parseInt(jTxtIdFuncionario.getText());

funcionario.setIdFuncionario(id);
funcionario.setNome(jTxtNome.getText());
funcionario.setEmail(jTxtEmail.getText());
funcionario.setTelefone(jFmtTelefone.getText());
funcionario.setCpf(jFmtCpf.getText());
funcionario.setCargo(jCboCargo.getSelectedIndex());
return funcionario;
    }
    public void beanView(Funcionario funcionario) {
        String id = String.valueOf(funcionario.getIdFuncionario());
        jTxtIdFuncionario.setText(id);
        jTxtNome.setText(funcionario.getNome());
        jTxtEmail.setText(funcionario.getEmail());
        jFmtTelefone.setText(funcionario.getTelefone());
        jFmtCpf.setText(funcionario.getCpf());
        jCboCargo.setSelectedIndex(funcionario.getCargo());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCboCargo = new javax.swing.JComboBox<>();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTxtIdFuncionario = new javax.swing.JTextField();
        jFmtCpf = new javax.swing.JFormattedTextField();
        jFmtTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Email");

        jLabel3.setText("Telefone");

        jLabel4.setText("Cpf");

        jLabel5.setText("Cargo");

        jCboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Gerente" }));
        jCboCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboCargoActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("INCLUIR");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar_1.png"))); // NOI18N
        jBtnAlterar.setText("ALTERAR");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("EXCLUIR");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ok.png"))); // NOI18N
        jBtnConfirmar.setText("CONFIRMAR");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("CANCELAR");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("PESQUISAR");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jLabel8.setText("Código");

        jTxtIdFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(jBtnPesquisar))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jTxtEmail)
                            .addComponent(jLabel1)
                            .addComponent(jFmtTelefone))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jCboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8)
                    .addComponent(jTxtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
      habilitar();
       LimparCampos();// TODO add your handling code here:
incluindo= true;  // TODO add your handling code here:
                 
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
     habilitar();
      incluindo=false;  // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
       Funcionario funcionario= viewBean(); 
Funcionario_DAO funcionario_DAO = new Funcionario_DAO();
if(incluindo == true){
    funcionario_DAO.insert(funcionario);
}else{       
 funcionario_DAO.update(funcionario);
}   
     LimparCampos();    
        desabilitar();  // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
       desabilitar();  
LimparCampos();
JOptionPane.showMessageDialog(null, "Voce cancelou!"); // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jCboCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboCargoActionPerformed

    private void jTxtIdFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdFuncionarioActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro?", "Exclusão", JOptionPane.YES_NO_OPTION);
if (resp == JOptionPane.YES_OPTION){
Funcionario funcionario= viewBean(); 
Funcionario_DAO funcionario_DAO = new Funcionario_DAO();
funcionario_DAO.delete(funcionario);
}else{
JOptionPane.showMessageDialog(null, "Exlusão cancelada");
}  
LimparCampos();    // TODO add your handling code here:
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
     //String resp = JOptionPane.showInputDialog(null, "Entre com o codigo (PK)", "Pesquisa", 3);
       // int id = Integer.parseInt(resp);
        //Funcionario_DAO funcionario_DAO = new Funcionario_DAO();
        //Funcionario funcionario = (Funcionario) funcionario_DAO.List(id);
        //beanView(funcionario);   // TODO add your handling code here:
         JDlgFuncionarioPesquisa jDlgFuncionarioPesquisa = new JDlgFuncionarioPesquisa(null, true);
        jDlgFuncionarioPesquisa.setTelaAnterior(this);        
        jDlgFuncionarioPesquisa.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFuncionario dialog = new JDlgFuncionario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCboCargo;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JFormattedTextField jFmtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtIdFuncionario;
    private javax.swing.JTextField jTxtNome;
    // End of variables declaration//GEN-END:variables
}
