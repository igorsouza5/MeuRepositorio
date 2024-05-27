package telas;

import daoprojeto.Dao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author igor.osouza5
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        Fundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuJogadores = new javax.swing.JMenu();
        itmCadastrarJogadores = new javax.swing.JMenuItem();
        itmExcluirJogadores = new javax.swing.JMenuItem();
        itmAlterarJogadores = new javax.swing.JMenuItem();
        mnuTimes = new javax.swing.JMenu();
        itmListarTimes = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        itmInstrucoes = new javax.swing.JMenuItem();
        itmSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/OIG3.png"))); // NOI18N
        Fundo.setText("jLabel2");
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 600, 600);

        mnuJogadores.setText("Jogadores");

        itmCadastrarJogadores.setText("Cadastrar");
        itmCadastrarJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarJogadoresActionPerformed(evt);
            }
        });
        mnuJogadores.add(itmCadastrarJogadores);

        itmExcluirJogadores.setText("Excluir");
        itmExcluirJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirJogadoresActionPerformed(evt);
            }
        });
        mnuJogadores.add(itmExcluirJogadores);

        itmAlterarJogadores.setText("Alterar");
        itmAlterarJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarJogadoresActionPerformed(evt);
            }
        });
        mnuJogadores.add(itmAlterarJogadores);

        jMenuBar1.add(mnuJogadores);

        mnuTimes.setText("Times");

        itmListarTimes.setText("Listar");
        itmListarTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarTimesActionPerformed(evt);
            }
        });
        mnuTimes.add(itmListarTimes);

        jMenuBar1.add(mnuTimes);

        mnuAjuda.setText("Ajuda");

        itmInstrucoes.setText("Instruções de uso");
        mnuAjuda.add(itmInstrucoes);

        itmSobre.setText("Sobre");
        mnuAjuda.add(itmSobre);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(619, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadastrarJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarJogadoresActionPerformed
        new CadastrarJogadores().setVisible(true);
    }//GEN-LAST:event_itmCadastrarJogadoresActionPerformed

    private void itmExcluirJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirJogadoresActionPerformed
        new ExcluirJogadores().setVisible(true);
    }//GEN-LAST:event_itmExcluirJogadoresActionPerformed

    private void itmListarTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarTimesActionPerformed
        new ListarJogadores().setVisible(true);
    }//GEN-LAST:event_itmListarTimesActionPerformed

    private void itmAlterarJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarJogadoresActionPerformed
        String nome;
        nome = JOptionPane.showInputDialog(null, "Digite o nome do jogador:");
        if(nome==null){
            return; //stop
        }
        try{
            ResultSet resultado = new Dao().buscarJogadores(nome);
            if (resultado.next()){
                String n, p, t;
                n = resultado.getString("nome");
                p = resultado.getString("posicao");
                t = resultado.getString("time");
                new AlterarJogadores(n, p, t).setVisible(true);
            } else{
                JOptionPane.showMessageDialog(null, "Usuário não identificado!");
            }
        }catch(ClassNotFoundException|SQLException ex){
            JOptionPane.showMessageDialog(null,"Entre em contato com o suporte e informe o erro" + ex.getMessage());
        }
    }//GEN-LAST:event_itmAlterarJogadoresActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JMenuItem itmAlterarJogadores;
    private javax.swing.JMenuItem itmCadastrarJogadores;
    private javax.swing.JMenuItem itmExcluirJogadores;
    private javax.swing.JMenuItem itmInstrucoes;
    private javax.swing.JMenuItem itmListarTimes;
    private javax.swing.JMenuItem itmSobre;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuJogadores;
    private javax.swing.JMenu mnuTimes;
    // End of variables declaration//GEN-END:variables
}
