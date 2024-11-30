package thiagolara;

import java.awt.*;//Importa java awt
import javax.swing.*;//Importa java swing

//Dupla: Thiago Piffer e Lara Calegário

public class ProgramaSeries extends javax.swing.JFrame {
    
    public ProgramaSeries() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Séries");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(644, 458));
        setName("janela1"); // NOI18N
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Transferir para séries assistidas");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 240, 270, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 10)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Transferir para séries não assistidas");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setMaximumSize(new java.awt.Dimension(238, 19));
        jButton2.setMinimumSize(new java.awt.Dimension(238, 19));
        jButton2.setPreferredSize(new java.awt.Dimension(238, 19));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 240, 270, 40);

        jComboBox1.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "The Boys", "Mr. Robot", "La Casa de Papel", "Breaking Bad", "Stranger Things", "The 100", "Game of Thrones", "The Witcher", "Pacificador" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(30, 190, 270, 30);

        jComboBox2.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setMinimumSize(new java.awt.Dimension(74, 21));
        jComboBox2.setPreferredSize(new java.awt.Dimension(74, 21));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(320, 190, 270, 30);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("        SÉRIES AINDA NÃO ASSISTIDAS:");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 270, 50);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("               SÉRIES JÁ ASSISTIDAS:");
        jLabel3.setMaximumSize(new java.awt.Dimension(233, 15));
        jLabel3.setMinimumSize(new java.awt.Dimension(233, 15));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(233, 15));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 130, 270, 50);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thiagolara/FrondEndS.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jComboBox1.getSelectedIndex()>-1){//Verifica se alguma série foi selecionada
            String serieselecionada = jComboBox1.getSelectedItem().toString();//Variável "serieselecionada" recebe o item selecionado na combobox
            jComboBox2.addItem(serieselecionada);//A lista de séries vistas recebe "serieselecionada"
            jComboBox1.removeItem(serieselecionada);//A lista de séries não vistas exclui "serieselecionada"
        } else {//Envia mensagem de erro caso nenhuma série seja selecionada
            JOptionPane.showMessageDialog(null,"ERRO:\nNenhuma série foi selecionada.");//Mensagem informando ao usuário que nenhuma série foi selecionada
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jComboBox2.getSelectedIndex()>-1){//Verifica se alguma série foi selecionada
            String serieselecionadan = jComboBox2.getSelectedItem().toString();//Variável "serieselecionadan" recebe o item selecionado na combobox
            jComboBox1.addItem(serieselecionadan);//A lista de séries não vistas recebe "serieselecionadan"
            jComboBox2.removeItem(serieselecionadan);//A lista de séries vistas exclui "serieselecionadan"
        } else {//Envia mensagem de erro caso nenhuma série seja selecionada
            JOptionPane.showMessageDialog(null,"ERRO:\nNenhuma série foi selecionada.");//Mensagem informando ao usuário que nenhuma série foi selecionada
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        //Método gerado ao passar o mouse sobre o botão de "transferir para séries assistidas"
        jButton1.setSize(274, 42);//Aumenta o tamanho do botão
        jButton1.setBackground(Color.DARK_GRAY);//Muda a cor do botão para cinza-escuro
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        //Método gerado ao tirar o mouse do botão de "transferir para séries assistidas"
        jButton1.setSize(270, 40);//Diminui o tamanho do botão
        jButton1.setBackground(Color.BLACK);//Muda a cor do botão para preto
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        //Método gerado ao passar o mouse sobre o botão de "transferir para séries não assistidas"
        jButton2.setSize(274, 42);//Aumenta o tamanho do botão
        jButton2.setBackground(Color.DARK_GRAY);//Muda a cor do botão para cinza-escuro
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        //Método gerado ao tirar o mouse do botão de "transferir para séries não assistidas"
        jButton2.setSize(270, 40);//Diminui o tamanho do botão
        jButton2.setBackground(Color.BLACK);//Muda a cor do botão para preto
    }//GEN-LAST:event_jButton2MouseExited

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
            java.util.logging.Logger.getLogger(ProgramaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramaSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramaSeries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
