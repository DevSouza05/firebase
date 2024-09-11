package com.mycompany.crudfirebase;

import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author peterson.moraes
 */
public class crudIHM extends javax.swing.JFrame {

    public crudIHM() {
        crudDAL.conecta();
        initComponents();
        this.setLocationRelativeTo(null);
        Provider.carregarTablePersona(tblPersona);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Inserir = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersona = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        btnQuery = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Inserir.setText("INSERIR");
        Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirActionPerformed(evt);
            }
        });

        btnUpdate.setText("ATUALIZAR");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETAR");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("LIMPAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        tblPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblPersona);

        jLabel1.setText("Nome");

        jLabel2.setText("Sobrenome");

        jLabel3.setText("CPF");

        jLabel4.setText("Email");

        txtSobrenome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtCPF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        TxtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnQuery.setText("CONSULTAR");
        btnQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(Inserir)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuery))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuery)
                    .addComponent(btnClear)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(Inserir))
                .addContainerGap(303, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed
        Insert();

    }//GEN-LAST:event_InserirActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueryActionPerformed

        String cpf = txtCPF.getText().trim();

        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o CPF para consultar.");
            return;
        }

        if (!isValidCPF(cpf)) {
            JOptionPane.showMessageDialog(null, "CPF inválido. Digite uma CPF válido");
        }

        try {
            Map<String, Object> dados = Provider.getPersona("Persona", cpf);

            if (dados != null) {
                txtNome.setText((String) dados.get("Nome"));
                txtSobrenome.setText((String) dados.get("Sobrenome"));
                TxtEmail.setText((String) dados.get("Email"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado para o CPF informado.");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao consultar!");
        }
    }//GEN-LAST:event_btnQueryActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new crudIHM().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Inserir;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnQuery;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersona;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables

    private void Insert() {
        String cpf = txtCPF.getText().trim();
        String nome = txtNome.getText().trim();
        String sobrenome = txtSobrenome.getText().trim();
        String email = TxtEmail.getText().trim();

       
        if (nome.isEmpty() || sobrenome.isEmpty() || cpf.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
            return;
        }
        
         if (!isValidCPF(cpf)) {
            JOptionPane.showMessageDialog(null, "CPF inválido. Digite um CPF válido.");
            return;
        }

          if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Email inválido. Digite um email válido.");
            return;
        }
         
         
        try {
            Map<String, Object> dados = new HashMap<>();
            dados.put("Nome", txtNome.getText());
            dados.put("Sobrenome", txtSobrenome.getText());
            dados.put("CPF", cpf);
            dados.put("Email", TxtEmail.getText());

            // Usar CPF como ID do documento
            Provider.insertPersona("Persona", cpf, dados);
            JOptionPane.showMessageDialog(null, "Êxito ao inserir!");
            clearForm();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao inserir!");
        }
    }

    private void Update() {
        String nome = txtNome.getText().trim();
        String sobrenome = txtSobrenome.getText().trim();
        String cpf = txtCPF.getText().trim();
        String email = TxtEmail.getText().trim();

        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o CPF para atualizar.");
            return;
        }

        if (nome.isEmpty() || sobrenome.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
            return;
        }

        if (!isValidCPF(cpf)) {
            JOptionPane.showMessageDialog(null, "CPF inválido. Digite um CPF válido.");
            return;
        }

        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Email inválido. Digite um email válido.");
            return;
        }

        try {
            Map<String, Object> dados = new HashMap<>();
            dados.put("Nome", nome);
            dados.put("Sobrenome", sobrenome);
            dados.put("CPF", cpf);
            dados.put("Email", email);

            boolean success = Provider.updatePersona("Persona", cpf, dados);

            if (success) {
                JOptionPane.showMessageDialog(null, "Êxito ao atualizar!");
                clearForm(); 
                Provider.carregarTablePersona(tblPersona); // Atualiza a tabela
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
            }
        } catch (Exception e) {
            System.err.println("Erro ao atualizar documento: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!");
        }
    }

 private void Delete() {
        String cpf = txtCPF.getText().trim();

        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o CPF para excluir.");
            return;
        }

        if (!isValidCPF(cpf)) {
            JOptionPane.showMessageDialog(null, "CPF inválido. Digite um CPF válido.");
            return;
        }

        try {
            boolean success = Provider.deletePersona("Persona", cpf);

            if (success) {
                JOptionPane.showMessageDialog(null, "Êxito ao deletar!");
                clearForm();
                Provider.carregarTablePersona(tblPersona); 
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao deletar!");
            }
        } catch (Exception e) {
            System.err.println("Erro ao excluir documento: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao deletar!");
        }
    }

    void clearForm() {
        txtNome.setText("");
        txtSobrenome.setText("");
        txtCPF.setText("");
        TxtEmail.setText("");
    }

    private boolean isValidCPF(String cpf) {

        return cpf.matches("\\d{11}");
    }

    private boolean isValidEmail(String email) {

        return email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }

}
