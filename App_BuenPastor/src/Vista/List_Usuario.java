/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author CGCF
 */
public class List_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form ListaUsuario
     */
    public List_Usuario() {
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

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jButton_AgregarUsu = new javax.swing.JButton();
        jButton_GuardarLst = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Jtab_Lst_Usu = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 244, 251));

        jPanel1.setBackground(new java.awt.Color(228, 244, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_AgregarUsu.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton_AgregarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new_add_user_.png"))); // NOI18N
        jButton_AgregarUsu.setText("Agregar Usuario");
        jButton_AgregarUsu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_AgregarUsu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jButton_AgregarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 140, 130));

        jButton_GuardarLst.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton_GuardarLst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save.png"))); // NOI18N
        jButton_GuardarLst.setText("Guardar");
        jButton_GuardarLst.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_GuardarLst.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_GuardarLst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarLstActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_GuardarLst, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 140, 130));

        Jtab_Lst_Usu.setAutoCreateRowSorter(true);
        Jtab_Lst_Usu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Jtab_Lst_Usu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Usuario", "Contrase??a", "Tipo", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Jtab_Lst_Usu);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 600, 190));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel12.setText("Lista de Usuarios");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarLstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarLstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_GuardarLstActionPerformed

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
            java.util.logging.Logger.getLogger(List_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Jtab_Lst_Usu;
    public javax.swing.JButton jButton_AgregarUsu;
    public javax.swing.JButton jButton_GuardarLst;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
