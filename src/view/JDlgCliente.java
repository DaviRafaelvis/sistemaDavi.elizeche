package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bean.Cliente;
import dao.Cliente_DAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import view.*;

/**
 *
 * @author rafae
 */
public class JDlgCliente extends javax.swing.JDialog {
  private boolean incluindo;
    MaskFormatter mascaraCpf, mascaraData, mascaraCep, mascaraTelefone, mascaraRg, mascaraCelular;
    
    public JDlgCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        desabilitar();
        setTitle("Cliente");
        setLocationRelativeTo(null);
     try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraData = new MaskFormatter("##/##/####");
            mascaraCep = new MaskFormatter("#####-###");
            mascaraTelefone = new MaskFormatter("####-####");
            mascaraCelular = new MaskFormatter("(##)#####-####");
            mascaraRg = new MaskFormatter("##.###.###-#");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCpf.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));
        jFmtData.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
        jFmtCep.setFormatterFactory(new DefaultFormatterFactory(mascaraCep));
        jFmtTelefone.setFormatterFactory(new DefaultFormatterFactory(mascaraTelefone));
        jFmtCelular.setFormatterFactory(new DefaultFormatterFactory(mascaraCelular));
        jFmtRg.setFormatterFactory(new DefaultFormatterFactory(mascaraRg));
    
    }

public void habilitar(){
    jTxtIdCliente.setEnabled(true);
     jTxtNome.setEnabled(true);
     jTxtEmail.setEnabled(true);
    jFmtCpf.setEnabled(true);
    jFmtCep.setEnabled(true);
      jFmtTelefone.setEnabled(true);
      jTxtDadosPagamento.setEnabled(true);
      jFmtRg.setEnabled(true);
    jFmtData.setEnabled(true);
    jCboSexo.setEnabled(true);
    jTxtCidade.setEnabled(true);
    jTxtBairro.setEnabled(true);
     jFmtCelular.setEnabled(true);
    jTxtPais.setEnabled(true);
    jTxtApelido.setEnabled(true);
  
    
    jBtnConfirmar.setEnabled(true);
    jBtnCancelar.setEnabled(true);
    
    jBtnIncluir.setEnabled(false);
    jBtnAlterar.setEnabled(false);
    jBtnExcluir.setEnabled(false);
    jBtnAlterar.setEnabled(false);
   
   
   
    }
    
    public void desabilitar(){
     jTxtIdCliente.setEnabled(false);
     jTxtNome.setEnabled(false);
     jTxtEmail.setEnabled(false);
     jFmtCpf.setEnabled(false);
     jFmtCep.setEnabled(false);
     jFmtTelefone.setEnabled(false);
     jTxtDadosPagamento.setEnabled(false);
     jFmtRg.setEnabled(false);
     jFmtData.setEnabled(false);
     jCboSexo.setEnabled(false);
     jTxtCidade.setEnabled(false);
     jTxtBairro.setEnabled(false);
     jFmtCelular.setEnabled(false);
     jTxtPais.setEnabled(false);
     jTxtApelido.setEnabled(false);

    jBtnCancelar.setEnabled(false);
    jBtnConfirmar.setEnabled(false);
    
     jBtnIncluir.setEnabled(true);
    jBtnAlterar.setEnabled(true);
    jBtnExcluir.setEnabled(true);
    jBtnAlterar.setEnabled(true);
    
    }
    public void LimparCampos(){
    jTxtIdCliente.setText("");
    jTxtNome.setText("");
    jTxtEmail.setText("");
    jFmtCpf.setText("");
    jFmtCep.setText("");
    jFmtTelefone.setText("");
    jTxtDadosPagamento.setText("");
    jFmtRg.setText("");
    jFmtData.setText("");
    jCboSexo.setSelectedIndex(-1);
    jTxtCidade.setText("");
    jTxtBairro.setText("");
    jFmtCelular.setText("");
    jTxtPais.setText("");
    jTxtApelido.setText("");
    
    }
 
 public Cliente viewBean(){
    Cliente cliente = new Cliente();
int id = Integer.parseInt(jTxtIdCliente.getText());

cliente.setIdCliente(id);
cliente.setNome(jTxtNome.getText());
cliente.setEmail(jTxtEmail.getText()); 
cliente.setCpf(jFmtCpf.getText()); 
cliente.setCep(jFmtCep.getText()); 
cliente.setTelefone(jFmtTelefone.getText());
cliente.setDados_pagamento(jTxtDadosPagamento.getText()); 
cliente.setRg(jFmtRg.getText()); 
SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            cliente.setData_nascimento(formato.parse(jFmtData.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
 cliente.setSexo(jCboSexo.getSelectedIndex() );
  cliente.setCidade(jTxtCidade.getText()); 
  cliente.setBairro(jTxtBairro.getText()); 
  cliente.setCelular(jFmtCelular.getText()); 
  cliente.setPais(jTxtPais.getText()); 
  cliente.setApelido(jTxtApelido.getText()); 
return cliente;
    }
 
 public void beanView(Cliente cliente) {
        String id = String.valueOf(cliente.getIdCliente());
        jTxtIdCliente.setText(id);
        jTxtNome.setText(cliente.getNome());
        jTxtEmail.setText(cliente.getEmail());
        jFmtCpf.setText(cliente.getCpf());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jFmtData.setText(formato.format(cliente.getData_nascimento()));
        jFmtCep.setText(cliente.getCep());
        jFmtTelefone.setText(cliente.getTelefone());
        jTxtDadosPagamento.setText(cliente.getDados_pagamento());
        jFmtRg.setText(cliente.getRg());
         jCboSexo.setSelectedIndex (cliente.getSexo() );
        jTxtCidade.setText(cliente.getCidade());
        jTxtBairro.setText(cliente.getBairro());
        jFmtCelular.setText(cliente.getCelular());
        jTxtPais.setText(cliente.getPais());
        jTxtApelido.setText(cliente.getApelido());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxtPais = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTxtDadosPagamento = new javax.swing.JTextField();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jCboSexo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTxtIdCliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTxtApelido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jFmtCpf = new javax.swing.JFormattedTextField();
        jFmtCep = new javax.swing.JFormattedTextField();
        jFmtTelefone = new javax.swing.JFormattedTextField();
        jFmtRg = new javax.swing.JFormattedTextField();
        jFmtCelular = new javax.swing.JFormattedTextField();
        jFmtData = new javax.swing.JFormattedTextField();

        jLabel1.setText("Nome");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Email");

        jTxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEmailActionPerformed(evt);
            }
        });

        jLabel4.setText("CPF");

        jLabel5.setText("Data de Nascimento");

        jLabel6.setText("Sexo");

        jLabel7.setText("Celular");

        jLabel8.setText("Telefone");

        jLabel9.setText("País");

        jLabel10.setText("Cidade");

        jTxtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCidadeActionPerformed(evt);
            }
        });

        jLabel11.setText("Bairro");

        jTxtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtBairroActionPerformed(evt);
            }
        });

        jLabel12.setText("Dados de pagamento");

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("INCLUIR");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
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

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png"))); // NOI18N
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

        jLabel14.setText("CEP");

        jCboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jCboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboSexoActionPerformed(evt);
            }
        });

        jLabel16.setText("Codigo");

        jTxtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdClienteActionPerformed(evt);
            }
        });

        jLabel17.setText("Apelido");

        jTxtApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtApelidoActionPerformed(evt);
            }
        });

        jLabel13.setText("RG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel4)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jTxtEmail)
                            .addComponent(jTxtIdCliente)
                            .addComponent(jFmtCpf)
                            .addComponent(jFmtCep))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jFmtData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtCelular, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtCidade, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFmtRg)
                        .addGap(572, 572, 572))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel17)
                                    .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnPesquisar))
                            .addComponent(jTxtDadosPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(1, 1, 1)
                                .addComponent(jFmtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtDadosPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtEmailActionPerformed

    private void jTxtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtCidadeActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
       habilitar();
        LimparCampos();// TODO add your handling code here:
        incluindo = true; // TODO add your handling code here:
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
      Cliente cliente = viewBean();
        Cliente_DAO cliente_DAO = new Cliente_DAO();
        if (incluindo == true) {
            cliente_DAO.insert(cliente);
        } else {
            cliente_DAO.update(cliente);
        }

        desabilitar();
LimparCampos();        // TODO 
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
       desabilitar();
       LimparCampos();    // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
       habilitar();
        incluindo = false;  // TODO add your handling code here:
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jTxtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtBairroActionPerformed

    private void jTxtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdClienteActionPerformed

    private void jTxtApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtApelidoActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro?", "Exclusão", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            Cliente cliente = viewBean();
            Cliente_DAO cliente_DAO = new Cliente_DAO();
            cliente_DAO.delete(cliente);
        } else {
            JOptionPane.showMessageDialog(null, "Exlusão cancelada");
        }  
        LimparCampos();    
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        //String resp = JOptionPane.showInputDialog(null, "Entre com o codigo (PK)", "Pesquisa", 3);
        //int id = Integer.parseInt(resp);
        //Cliente_DAO cliente_DAO = new Cliente_DAO();
        //Cliente cliente = (Cliente) cliente_DAO.List(id);
        //beanView(cliente);
        JDlgClientePesquisa jDlgClientePesquisa = new JDlgClientePesquisa(null, true);
        jDlgClientePesquisa.setTelaAnterior(this);        
        jDlgClientePesquisa.setVisible(true);

    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jCboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboSexoActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  JDlgCliente dialog = new JDlgCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jCboSexo;
    private javax.swing.JFormattedTextField jFmtCelular;
    private javax.swing.JFormattedTextField jFmtCep;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JFormattedTextField jFmtRg;
    private javax.swing.JFormattedTextField jFmtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtApelido;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtDadosPagamento;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtIdCliente;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtPais;
    // End of variables declaration//GEN-END:variables
}
