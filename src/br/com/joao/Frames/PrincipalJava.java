/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joao.Frames;

import br.com.joao.objeto.Aluno;
import br.com.joao.objeto.Nota;
import br.com.joao.objeto.TipoAvaliacao;
import javax.swing.JOptionPane;

/**
 *
 * @author SATC
 */
public class PrincipalJava extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalJava
     */
    public PrincipalJava() {
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

        jButton1 = new javax.swing.JButton();
        jPNotas = new javax.swing.JPanel();
        jTFn2 = new javax.swing.JTextField();
        jTFn3 = new javax.swing.JTextField();
        jTFn4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLN1 = new javax.swing.JLabel();
        jLN2 = new javax.swing.JLabel();
        jLN3 = new javax.swing.JLabel();
        jLN4 = new javax.swing.JLabel();
        jBCalcular = new javax.swing.JButton();
        jTFn1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTFDisciplina = new javax.swing.JTextField();
        jCBTipoAvaliacao = new javax.swing.JComboBox<>();
        jPAluno = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLMatricula = new javax.swing.JLabel();
        jTFMatricula = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jLCalculoMedia = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPNotas.setBackground(new java.awt.Color(204, 204, 255));
        jPNotas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPNotas.setForeground(new java.awt.Color(10, 10, 10));

        jTFn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFn2ActionPerformed(evt);
            }
        });

        jTFn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFn3ActionPerformed(evt);
            }
        });

        jTFn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFn4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Notas");

        jLN1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLN1.setText("N1");

        jLN2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLN2.setText("N2");

        jLN3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLN3.setText("N3");

        jLN4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLN4.setText("N4");

        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nome da Disciplina");

        jCBTipoAvaliacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione a opção desejada>", "Prova", "Trabalho", "Seminário" }));

        javax.swing.GroupLayout jPNotasLayout = new javax.swing.GroupLayout(jPNotas);
        jPNotas.setLayout(jPNotasLayout);
        jPNotasLayout.setHorizontalGroup(
            jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNotasLayout.createSequentialGroup()
                .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPNotasLayout.createSequentialGroup()
                        .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNotasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTFDisciplina))
                            .addGroup(jPNotasLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel7)
                                .addGap(0, 34, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPNotasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCBTipoAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNotasLayout.createSequentialGroup()
                            .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPNotasLayout.createSequentialGroup()
                                    .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLN4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLN3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLN2, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFn2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTFn4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPNotasLayout.createSequentialGroup()
                                    .addComponent(jLN1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTFn1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNotasLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(57, 57, 57)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPNotasLayout.createSequentialGroup()
                        .addComponent(jBCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPNotasLayout.setVerticalGroup(
            jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNotasLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPNotasLayout.createSequentialGroup()
                .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPNotasLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLN1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLN2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLN3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLN4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPNotasLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jCBTipoAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPAluno.setBackground(new java.awt.Color(204, 204, 255));
        jPAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Aluno");

        jLMatricula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLMatricula.setText("Metricula");

        jLNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNome.setText("Nome");

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAlunoLayout = new javax.swing.GroupLayout(jPAluno);
        jPAluno.setLayout(jPAlunoLayout);
        jPAlunoLayout.setHorizontalGroup(
            jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAlunoLayout.createSequentialGroup()
                .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPAlunoLayout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jLabel6))
                        .addGroup(jPAlunoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLMatricula))
                        .addGroup(jPAlunoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPAlunoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPAlunoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLNome))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPAlunoLayout.setVerticalGroup(
            jPAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAlunoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLCalculoMedia.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLCalculoMedia.setText("Calculo de Média");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLCalculoMedia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLCalculoMedia)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFn2ActionPerformed

    private void jTFn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFn4ActionPerformed

    private void jTFn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFn3ActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
           // TODO add your handling code here:
          String nome = jTFNome.getText();
          int matricula = 0;
          try {
            matricula =Integer.parseInt(jTFMatricula.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Você digitou algo errado! Tente novamente");
            throw new RuntimeException();
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        // TODO add your handling code here:
        Aluno a = new Aluno(jTFNome.getText(), Integer.parseInt(jTFMatricula.getText()));
        TipoAvaliacao tipo = null;
        switch (jCBTipoAvaliacao.getSelectedIndex()){
            case 1:{
                tipo = TipoAvaliacao.PROVA;
                break;
            }
            case 2:{
                tipo = TipoAvaliacao.TRABALHO;
                break;
            }
            case 3:{
                tipo = TipoAvaliacao.SEMINARIO;
                break;
            }
            
        }
        
        try {
            
        a.getNotas().add(new Nota(jTFDisciplina.getText(),tipo, Float.parseFloat(jTFn1.getText())));
        a.getNotas().add(new Nota(jTFDisciplina.getText(),tipo, Float.parseFloat(jTFn2.getText())));
        a.getNotas().add(new Nota(jTFDisciplina.getText(),tipo, Float.parseFloat(jTFn3.getText())));
        a.getNotas().add(new Nota(jTFDisciplina.getText(),tipo, Float.parseFloat(jTFn4.getText())));
        
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Você digitou algo errado! Tente novamento");
            throw new RuntimeException();   
        }
        JOptionPane.showMessageDialog(null, a.toString()+"\n" + "Média: "+ a.calcularMedia());
        
    }//GEN-LAST:event_jBCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBCalcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBTipoAvaliacao;
    private javax.swing.JLabel jLCalculoMedia;
    private javax.swing.JLabel jLMatricula;
    private javax.swing.JLabel jLN1;
    private javax.swing.JLabel jLN2;
    private javax.swing.JLabel jLN3;
    private javax.swing.JLabel jLN4;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPAluno;
    private javax.swing.JPanel jPNotas;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFDisciplina;
    private javax.swing.JTextField jTFMatricula;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFn1;
    private javax.swing.JTextField jTFn2;
    private javax.swing.JTextField jTFn3;
    private javax.swing.JTextField jTFn4;
    // End of variables declaration//GEN-END:variables
}
