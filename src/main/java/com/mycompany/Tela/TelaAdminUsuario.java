/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Tela;

import com.mycompany.DAO.ConnectionFactory;
import com.mycompany.Tela.TelaMenu;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 824144932
 */
public class TelaAdminUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdmin
     */
    public TelaAdminUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAniversario = new javax.swing.JTextField();
        txtNomeExibicao = new javax.swing.JTextField();
        btEditar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        ckAdmin = new javax.swing.JCheckBox();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar usuários");
        setResizable(false);
        getContentPane().setLayout(null);

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(68, 59, 159, 26);

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar);
        btPesquisar.setBounds(259, 59, 84, 27);

        jLabel1.setText("Data de nascimento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 229, 140, 16);

        jLabel2.setText("Nome completo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(68, 117, 130, 16);

        jLabel3.setText("E-mail");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 173, 70, 16);

        jLabel4.setText("Senha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 285, 70, 16);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(70, 139, 157, 26);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(70, 195, 155, 26);

        jLabel7.setText("Nome de exibição");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 120, 140, 16);
        getContentPane().add(txtAniversario);
        txtAniversario.setBounds(70, 251, 80, 26);

        txtNomeExibicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeExibicaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeExibicao);
        txtNomeExibicao.setBounds(290, 140, 149, 26);

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(70, 359, 76, 27);

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrar);
        btCadastrar.setBounds(175, 359, 84, 27);

        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Excluir usuário");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(298, 359, 111, 27);

        jLabel5.setText("Código do usuário");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(68, 37, 140, 16);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(70, 310, 180, 26);

        ckAdmin.setText("Admin");
        ckAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckAdminActionPerformed(evt);
            }
        });
        getContentPane().add(ckAdmin);
        ckAdmin.setBounds(290, 180, 100, 20);

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(360, 60, 76, 27);

        setSize(new java.awt.Dimension(816, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        String codusuario = txtPesquisar.getText();
        String sql = "SELECT * FROM tb_usuario WHERE codusuario = ?";
        ConnectionFactory cf = new ConnectionFactory();
        try (Connection conn = cf.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, codusuario);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nomeCompleto = rs.getString("nomecompleto");
                txtNome.setText(nomeCompleto);
                String email = rs.getString("email");
                txtEmail.setText(email);
                String senha = rs.getString("senha");
                txtSenha.setText(senha);
                String aniversario = rs.getString("aniversario");
                txtAniversario.setText(aniversario);
                String nomeExibicao = rs.getString("nomeexibicao");
                txtNomeExibicao.setText(nomeExibicao);
            }
            else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomeExibicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeExibicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeExibicaoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        String nomeCompleto = txtNome.getText();
        String nomeExibicao = txtNomeExibicao.getText();
        String senha = txtSenha.getText();
        String email = txtEmail.getText();
        String aniversario = txtAniversario.getText();
        String codusuario = txtPesquisar.getText();
        boolean admin;
        if (ckAdmin.isSelected())
            admin = true;
        else 
            admin = false;
        
        String sql = "INSERT INTO tb_usuario (nomecompleto, nomeexibicao, senha, email, aniversario, adm) VALUES ( ? , ? , ? , ? , ? , ?)";
        if (nomeCompleto.isEmpty() || nomeExibicao.isEmpty() || senha.isEmpty() || email.isEmpty() || aniversario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
            return;
        }
        ConnectionFactory cf = new ConnectionFactory();
        try (Connection conn = cf.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nomeCompleto);
            ps.setString(2, nomeExibicao);
            ps.setString(3, senha);
            ps.setString(4, email);
            ps.setString(5, aniversario);
            ps.setBoolean(6, admin);
            int contInsert = ps.executeUpdate();
            if (contInsert > 0)
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
         } catch (SQLException ex) {
             ex.printStackTrace();
        }  
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        TelaAdminExcluirUsuario tExcluirUsuario = new TelaAdminExcluirUsuario();
        tExcluirUsuario.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        String nomeCompleto = txtNome.getText();
        String nomeExibicao = txtNomeExibicao.getText();
        String senha = txtSenha.getText();
        String email = txtEmail.getText();
        String aniversario = txtAniversario.getText();
        String codusuario = txtPesquisar.getText();
        boolean admin = ckAdmin.isSelected();
        
        String sql = "UPDATE tb_usuario SET nomecompleto = ? , nomeexibicao = ? , senha = ? , email = ? , aniversario = ? , adm = ? WHERE codusuario =  ?";
        if (nomeCompleto.isEmpty() || nomeExibicao.isEmpty() || senha.isEmpty() || email.isEmpty() || aniversario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
            return;
        }
        ConnectionFactory cf = new ConnectionFactory();
        try (Connection conn = cf.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nomeCompleto);
            ps.setString(2, nomeExibicao);
            ps.setString(3, senha);
            ps.setString(4, email);
            ps.setString(5, aniversario);
            ps.setBoolean(6, admin);
            ps.setString(7, codusuario);
            int contUpdate = ps.executeUpdate();
            if (contUpdate > 0)
                JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");
            else
                JOptionPane.showMessageDialog(null, "Nenhum usuário foi encontrado!");
         } catch (SQLException ex) {
             ex.printStackTrace();
        }  
    }//GEN-LAST:event_btEditarActionPerformed

    private void ckAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckAdminActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        txtNome.setText("");
        txtNomeExibicao.setText("");
        txtSenha.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdminUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdminUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdminUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdminUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdminUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JCheckBox ckAdmin;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAniversario;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeExibicao;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
