/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.Tela;

import com.mycompany.DAO.ConnectionFactory;
import com.mycompany.classes.Grupo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 824144932
 */
public class TelaAdminGrupo extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdminGrupo
     */
    public TelaAdminGrupo() {
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

        txtNomeGrupo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSenhaGrupo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        txtCodGrupo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        txtTema = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar grupos");
        getContentPane().setLayout(null);

        txtNomeGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeGrupo);
        txtNomeGrupo.setBounds(70, 170, 255, 26);

        jLabel1.setText("Nome do grupo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 150, 110, 16);

        jLabel2.setText("Tema do grupo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 200, 100, 16);

        jLabel4.setText("Senha do grupo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 260, 110, 16);

        txtSenhaGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenhaGrupo);
        txtSenhaGrupo.setBounds(70, 280, 139, 26);

        jLabel5.setText("foto do grupo (imagem)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(600, 190, 129, 16);

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(70, 70, 260, 26);

        jLabel3.setText("Código do grupo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 50, 100, 16);

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar);
        btPesquisar.setBounds(360, 70, 110, 27);

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(80, 350, 76, 27);

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrar);
        btCadastrar.setBounds(170, 350, 100, 27);

        btExcluir.setForeground(new java.awt.Color(255, 0, 0));
        btExcluir.setText("Excluir grupo");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(290, 350, 120, 27);

        txtCodGrupo.setEditable(false);
        txtCodGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodGrupo);
        txtCodGrupo.setBounds(250, 280, 139, 26);

        jLabel6.setText("ID do grupo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(250, 260, 110, 16);

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(500, 70, 76, 27);
        getContentPane().add(txtTema);
        txtTema.setBounds(70, 220, 140, 26);

        setSize(new java.awt.Dimension(816, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeGrupoActionPerformed

    private void txtSenhaGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaGrupoActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        String grupo = txtPesquisar.getText();
            String sql = "SELECT * FROM tb_grupo WHERE nomegrupo = ?";
        ConnectionFactory cf = new ConnectionFactory();
        try (Connection conn = cf.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, grupo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nomeGrupo = rs.getString("nomegrupo");
                txtNomeGrupo.setText(nomeGrupo);
                String tema = rs.getString("tema");
                txtTema.setText(tema);
                String senhaGrupo = rs.getString("senhagrupo");
                txtSenhaGrupo.setText(senhaGrupo);
                String IdGrupo = Integer.toString(rs.getInt("codgrupo"));
                txtCodGrupo.setText(IdGrupo);
            }
            else {
                JOptionPane.showMessageDialog(null, "Grupo não encontrado!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        String nomeGrupo = txtNomeGrupo.getText();
        String senhaGrupo = txtSenhaGrupo.getText();
        String temaGrupo = txtTema.getText();
        String codGrupo = txtCodGrupo.getText();
        
        String sql = "UPDATE tb_grupo SET nomegrupo = ? , tema = ? , senhagrupo = ? WHERE codgrupo =  ?";
        if (nomeGrupo.isEmpty() || senhaGrupo.isEmpty() || temaGrupo.isEmpty() || codGrupo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
            return;
        }
        
        ConnectionFactory cf = new ConnectionFactory();
        try (Connection conn = cf.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nomeGrupo);
            ps.setString(2, temaGrupo);
            ps.setString(3, senhaGrupo);
            ps.setString(4, codGrupo);
            int contUpdate = ps.executeUpdate();
            if (contUpdate > 0)
                JOptionPane.showMessageDialog(null, "Grupo atualizado com sucesso!");
            else
                JOptionPane.showMessageDialog(null, "Nenhum grupo foi encontrado!");
         } catch (SQLException ex) {
             ex.printStackTrace();
        }        
    }//GEN-LAST:event_btEditarActionPerformed

    private void txtCodGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodGrupoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        String vazio = "";
        txtPesquisar.setText(vazio);
        txtNomeGrupo.setText(vazio);
        txtSenhaGrupo.setText(vazio);
        txtTema.setText(vazio);
        txtCodGrupo.setText(vazio);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:    
        String nomeGrupo = txtNomeGrupo.getText();
        String senhaGrupo = txtSenhaGrupo.getText();
        String temaGrupo = txtTema.getText();
        
        String sql = "INSERT INTO tb_grupo (nomegrupo, tema, senhagrupo) VALUES ( ? , ? , ? )";
        if (nomeGrupo.isEmpty() || senhaGrupo.isEmpty() || temaGrupo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
            return;
        }

        ConnectionFactory cf = new ConnectionFactory();
        try (Connection conn = cf.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nomeGrupo);
            ps.setString(2, temaGrupo);
            ps.setString(3, senhaGrupo);
            int contInsert = ps.executeUpdate();
            if (contInsert > 0)
                JOptionPane.showMessageDialog(null, "Grupo cadastrado com sucesso!");
            else
                JOptionPane.showMessageDialog(null, "Nenhum grupo foi encontrado!");
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Nome do grupo duplicado! Altere o nome");
             ex.printStackTrace();
        }        
               
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        String codGrupo = txtCodGrupo.getText();
        
        String sql = "DELETE FROM tb_grupo WHERE codgrupo = ?";
        if (codGrupo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo do código está vazio!"+"\n"+ "Por favor, forneça o nome do grupo para preenchê-lo automaticamente!");
            return;
        }
        
        ConnectionFactory cf = new ConnectionFactory();
        try (Connection conn = cf.obtemConexao();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, codGrupo);
            int contDelete = ps.executeUpdate();
            if (contDelete > 0)
                JOptionPane.showMessageDialog(null, "Grupo excluído com sucesso!");
            else
                JOptionPane.showMessageDialog(null, "Nenhum grupo foi encontrado!");
         } catch (SQLException ex) {
             ex.printStackTrace();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdminGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdminGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdminGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdminGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdminGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCodGrupo;
    private javax.swing.JTextField txtNomeGrupo;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtSenhaGrupo;
    private javax.swing.JTextField txtTema;
    // End of variables declaration//GEN-END:variables
}
