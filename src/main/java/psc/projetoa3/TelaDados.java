/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package psc.projetoa3;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author d4rkwav3
 */
public class TelaDados extends javax.swing.JFrame {
    private String [] uf = {"SP", "AL", "AP", "AM", "BA", "CE", "DF", "ES",
                            "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR",
                            "PE", "PI", "RR", "RO", "RJ", "RN", "RS", "SC",
                            "AC", "SE", "TO"};
    private Usuario loggedUser;
    private Dados dados;
    /**
     * Creates new form Info
     */
    public TelaDados() {
        super("Atualizar seus dados");
        initComponents();
        ufComboBox.setModel(new DefaultComboBoxModel<>(uf));
        this.setLocationRelativeTo(null);
    }
    
    public TelaDados(Usuario user) {
        this();
        this.loggedUser = user;
        this.dados = loggedUser.getDados();
        
        nomeTextField.setText(dados.getNome());
        idadeTextField.setText(Integer.toString(dados.getIdade()));
        loginTextField.setText(loggedUser.getNome());
        cpfTextField.setText(dados.getCpf());
        logradouroTextField.setText(dados.getLogradouro());
        numeroTextField.setText(Integer.toString(dados.getNumero()));
        bairroTextField.setText(dados.getBairro());
        cepTextField.setText(dados.getCep());
        cidadeTextField.setText(dados.getCidade());
        telefoneTextField.setText(dados.getTelefone());
        emailTextField.setText(dados.getEmail());
        complementoTextField.setText(dados.getComplemento());
        
        if (dados.isPreferencia()) {
            preferencialTextField.setText("Sim");
        }
        else {
            preferencialTextField.setText("Não");
        }
        
        if (loggedUser.isAdm()) {
            admTextField.setText("Administrador");
//            atualizarDadosButton.setVisible(false);
        }
        else {
            admTextField.setText("Colaborador");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        nomeTextField = new javax.swing.JTextField();
        logradouroTextField = new javax.swing.JTextField();
        idadeTextField = new javax.swing.JTextField();
        preferencialTextField = new javax.swing.JTextField();
        loginTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        numeroTextField = new javax.swing.JTextField();
        bairroTextField = new javax.swing.JTextField();
        ufComboBox = new javax.swing.JComboBox<>();
        cepTextField = new javax.swing.JTextField();
        telefoneTextField = new javax.swing.JTextField();
        cidadeTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        atualizarDadosButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        cpfTextField = new javax.swing.JTextField();
        admTextField = new javax.swing.JTextField();
        complementoTextField = new javax.swing.JTextField();

        nomeTextField1.setEditable(false);
        nomeTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seus Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 0, 14))); // NOI18N

        nomeTextField.setEditable(false);
        nomeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        logradouroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Logradouro"));
        logradouroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logradouroTextFieldActionPerformed(evt);
            }
        });

        idadeTextField.setEditable(false);
        idadeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Idade"));
        idadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeTextFieldActionPerformed(evt);
            }
        });

        preferencialTextField.setEditable(false);
        preferencialTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Atendimento Preferencial"));

        loginTextField.setEditable(false);
        loginTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Seus Dados:");

        numeroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Número"));

        bairroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Bairro"));

        ufComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ufComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder("UF"));
        ufComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufComboBoxActionPerformed(evt);
            }
        });

        cepTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("CEP"));

        telefoneTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));

        cidadeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Cidade"));

        emailTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("E-mail"));

        atualizarDadosButton.setText("Atualizar Dados");
        atualizarDadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarDadosButtonActionPerformed(evt);
            }
        });

        voltarButton.setText("Cancelar / Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        cpfTextField.setEditable(false);
        cpfTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

        admTextField.setEditable(false);
        admTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Usuário"));

        complementoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Complemento"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logradouroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ufComboBox, 0, 121, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidadeTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(atualizarDadosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeTextField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(preferencialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(loginTextField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(admTextField))))
                    .addComponent(complementoTextField))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preferencialTextField)
                    .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouroTextField)
                    .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ufComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cidadeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(cepTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(complementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telefoneTextField)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarDadosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ufComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufComboBoxActionPerformed

    private void logradouroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logradouroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logradouroTextFieldActionPerformed

    private void idadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeTextFieldActionPerformed

    private void atualizarDadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarDadosButtonActionPerformed
        this.dados.setLogradouro(logradouroTextField.getText());
        this.dados.setNumero(Integer.parseInt(numeroTextField.getText()));
        this.dados.setBairro(bairroTextField.getText());
        this.dados.setUf((String)ufComboBox.getSelectedItem());
        this.dados.setCep(cepTextField.getText());
        this.dados.setCidade(cidadeTextField.getText());
        this.dados.setTelefone(telefoneTextField.getText());
        this.dados.setEmail(emailTextField.getText());
        this.dados.setComplemento(complementoTextField.getText());
        
        try {
            int escolha = JOptionPane.showConfirmDialog(null, "Atualizar o cadastro?");
            
            if (escolha == JOptionPane.YES_OPTION) {
                DAODados updateDados = new DAODados();
                updateDados.atualizarCadastro(this.dados);
                JOptionPane.showMessageDialog(null, "Cadastro atualizado!");
                this.loggedUser.setDados(dados);
                TelaPrincipal tp = new TelaPrincipal(loggedUser);
                tp.setVisible(true);
                this.dispose();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_atualizarDadosButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        TelaPrincipal tp = new TelaPrincipal(loggedUser);
        tp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

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
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admTextField;
    private javax.swing.JButton atualizarDadosButton;
    private javax.swing.JTextField bairroTextField;
    private javax.swing.JTextField cepTextField;
    private javax.swing.JTextField cidadeTextField;
    private javax.swing.JTextField complementoTextField;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField idadeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JTextField logradouroTextField;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JTextField nomeTextField1;
    private javax.swing.JTextField numeroTextField;
    private javax.swing.JTextField preferencialTextField;
    private javax.swing.JTextField telefoneTextField;
    private javax.swing.JComboBox<String> ufComboBox;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables

}