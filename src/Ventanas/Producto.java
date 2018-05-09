/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author LUIS POTTE
 */
public class Producto extends javax.swing.JDialog {

    private String Categoria;
    private String subcategoria;
    private String nombre;
    private int cantidad;
    private String referencia;

    /**
     * Creates new form Agregar_producto
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        combocat = new javax.swing.JComboBox<>();
        combosubcat = new javax.swing.JComboBox<>();
        cant = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        ref = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        nproducto = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(244, 249, 247));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combocat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoría" }));
        jPanel3.add(combocat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 260, -1));

        combosubcat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Subcategoría" }));
        jPanel3.add(combosubcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 260, -1));

        cant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 50, -1));

        jLabel16.setText("Cantidad del producto:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 110, 20));

        ref.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        ref.setForeground(new java.awt.Color(153, 153, 153));
        ref.setText("Digite la referencia del producto");
        ref.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refMouseClicked(evt);
            }
        });
        jPanel3.add(ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 260, -1));

        jButton2.setText("cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2cancelar(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        jButton9.setText("Aceptar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        nproducto.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        nproducto.setForeground(new java.awt.Color(153, 153, 153));
        nproducto.setText("Digite el nombre del producto");
        nproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nproductoMouseClicked(evt);
            }
        });
        nproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nproductoActionPerformed(evt);
            }
        });
        jPanel3.add(nproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 260, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR NUEVO PRODUCTO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String k,l;
    public Producto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        k= nproducto.getText();
        l= ref.getText();
    }

    public void add_combocat(javax.swing.JComboBox<String> jcbx) {
        for (int i = 0; i < jcbx.getItemCount(); i++) {
            boolean sw = true;
            for (int j = 0; j < combocat.getItemCount(); j++) {
                if (jcbx.getItemAt(i).equals(combocat.getItemAt(j))) {
                    sw = false;
                }
            }
            if (sw == true) {
                this.combocat.addItem(jcbx.getItemAt(i));
            }
        }
    }

    public void add_combosubcat(javax.swing.JComboBox<String> jcbx) {
        for (int i = 0; i < jcbx.getItemCount(); i++) {
            boolean sw = true;
            for (int j = 0; j < combosubcat.getItemCount(); j++) {
                if (jcbx.getItemAt(i).equals(combosubcat.getItemAt(j))) {
                    sw = false;
                }
            }
            if (sw == true) {
                this.combosubcat.addItem(jcbx.getItemAt(i));
            }
        }
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean verificar_valores() {
        boolean b = true;
        if (this.getCantidad() == 0
                && this.getNombre() == null
                && combocat.getSelectedItem().equals("-")
                && combosubcat.getSelectedItem().equals("-")
                && this.getReferencia() == null) {
            b = false;
        }
        return b;
    }
    
    public void fuente(JTextField n) {
        if (n.getText().equals("") || n.getText().equals("")) {
            n.setForeground(new java.awt.Color(153, 153, 153));
            Font f = new Font("Tahoma", Font.ITALIC, 10);
            n.setFont(f);
            if (n.equals(ref)) {
                n.setText("Digite la referencia del producto");
            } else {
                if (n.equals(nproducto)) {
                    n.setText("Digite el nombre del producto");
                }
            }
        }
    }
    
    public void cambiarFuente(Component n) {
        n.setForeground(Color.BLACK);
        Font f = new Font("Tahoma", Font.BOLD, 10);
        n.setFont(f);
    }

    private void jButton2cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2cancelar
        int op = JOptionPane.showConfirmDialog(null, "¿Seguro que desea cancelar el proceso?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (op == 0){
            this.dispose();
        }
    }//GEN-LAST:event_jButton2cancelar

    private void aceptar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar
        setCantidad((int) cant.getValue());
        setNombre(nproducto.getText());
        setCategoria(combocat.getSelectedItem().toString());
        setSubcategoria(combosubcat.getSelectedItem().toString());
        setReferencia(ref.getText());
        this.dispose();
    }//GEN-LAST:event_aceptar

    private void refMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseClicked
        if(ref.getText().equals(l)){
            ref.setText("");
            cambiarFuente(ref);
            fuente(nproducto);
        }

    }//GEN-LAST:event_refMouseClicked

    private void nproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nproductoMouseClicked
        if(nproducto.getText().equals(k)){
            nproducto.setText("");
            cambiarFuente(nproducto);
            fuente(ref);
        }

    }//GEN-LAST:event_nproductoMouseClicked

    private void nproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nproductoActionPerformed

    }//GEN-LAST:event_nproductoActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Producto dialog = new Producto(new javax.swing.JFrame(), true);
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
    private javax.swing.JSpinner cant;
    private javax.swing.JComboBox<String> combocat;
    private javax.swing.JComboBox<String> combosubcat;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nproducto;
    private javax.swing.JTextField ref;
    // End of variables declaration//GEN-END:variables
}