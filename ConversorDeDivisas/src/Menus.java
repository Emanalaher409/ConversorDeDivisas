
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Emanuel
 */
public class Menus extends javax.swing.JFrame {

    public static int conversoresmonedas = 0;
public static int conversoresTiempo = 0;
    /**
     * conversoresDeTemperatura Creates new form Menus
     */
    public Menus() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
     
      rsscalelabel.RSScaleLabel.setScaleLabel(Reloj, "src/Imagenes/Relogplata.png");
      
    }

    //FONDO GRIS
    class jPanelGradientGRIS extends JPanel {

        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int With = getWidth();
            int Height = getHeight();
            Color color1 = new Color(192, 192, 192);
            Color color2 = new Color(245, 245, 245);
            GradientPaint gp = new GradientPaint(0, 0, color2, 180, Height, color1);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, With, Height);
        }
    }

    //FONDO AMARILLO
    class jPanelGradientAmarillo extends JPanel {

        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int With = getWidth();
            int Height = getHeight();
            Color color1 = new Color(239, 184, 16);
            Color color2 = new Color(255, 255, 0);
            GradientPaint gp = new GradientPaint(0, 0, color2, 180, Height, color1);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, With, Height);
        }
    }

    //FONDO VERDE
    class jPanelGradientverde extends JPanel {

        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int With = getWidth();
            int Height = getHeight();
            Color color1 = new Color(152, 251, 152);
            Color color2 = new Color(50, 205, 50);
            GradientPaint gp = new GradientPaint(0, 0, color1, 180, Height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, With, Height);

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

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new jPanelGradientverde();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        ArribaCMonedas = new jPanelGradientAmarillo();
        jLabel2 = new javax.swing.JLabel();
        AbajoCMonedas = new jPanelGradientGRIS();
        jPanel2 = new JPanelGradientNaranja();
        jLabel1 = new javax.swing.JLabel();
        BotonDeCierre = new javax.swing.JButton();
        TiempoJpanel = new JPanelGradientGris();
        Reloj = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(102, 102, 255));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conversor de monedas", "Conversor de tiempo" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, -1));

        jButton2.setBackground(new java.awt.Color(186, 249, 195));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Abrir");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 40));

        ArribaCMonedas.setBackground(new java.awt.Color(255, 255, 51));
        ArribaCMonedas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ArribaCMonedas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        jLabel2.setText("CONVERSOR DE MONEDAS");
        ArribaCMonedas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        jPanel1.add(ArribaCMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 150, 30));

        AbajoCMonedas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout AbajoCMonedasLayout = new javax.swing.GroupLayout(AbajoCMonedas);
        AbajoCMonedas.setLayout(AbajoCMonedasLayout);
        AbajoCMonedasLayout.setHorizontalGroup(
            AbajoCMonedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        AbajoCMonedasLayout.setVerticalGroup(
            AbajoCMonedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel1.add(AbajoCMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 150, 60));

        jPanel2.setBackground(new java.awt.Color(249, 177, 22));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("SELECCIONE UNA OPCIÓN");

        BotonDeCierre.setBackground(new java.awt.Color(255, 51, 51));
        BotonDeCierre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        BotonDeCierre.setForeground(new java.awt.Color(0, 0, 0));
        BotonDeCierre.setText("X");
        BotonDeCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonDeCierreMouseClicked(evt);
            }
        });
        BotonDeCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDeCierreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(BotonDeCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BotonDeCierre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 40));

        javax.swing.GroupLayout TiempoJpanelLayout = new javax.swing.GroupLayout(TiempoJpanel);
        TiempoJpanel.setLayout(TiempoJpanelLayout);
        TiempoJpanelLayout.setHorizontalGroup(
            TiempoJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TiempoJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Reloj, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );
        TiempoJpanelLayout.setVerticalGroup(
            TiempoJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TiempoJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Reloj, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        jPanel1.add(TiempoJpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 90, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String conversor = jComboBox1.getSelectedItem().toString();

        if (conversor == "Conversor de monedas" && conversoresmonedas == 0) {
            ConversorDeMonedas conversormonedas = new ConversorDeMonedas();
            conversoresmonedas++;
             
        } 
        if(conversor == "Conversor de tiempo" && conversoresTiempo==0){
            ConversorDeTiempo conversorTemperatura = new ConversorDeTiempo();
         conversoresTiempo++;
            
        }
        
        
            
        

        
      
    }//GEN-LAST:event_jButton2MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if (jComboBox1.getSelectedItem() == "Conversor de monedas") {
            ArribaCMonedas.setVisible(true);
            AbajoCMonedas.setVisible(true);
           
            TiempoJpanel.setVisible(false);
        } else {
            ArribaCMonedas.setVisible(false);
            AbajoCMonedas.setVisible(false);
            TiempoJpanel.setVisible(true);
          
            
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing


    }//GEN-LAST:event_formWindowClosing

    private void BotonDeCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDeCierreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDeCierreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BotonDeCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDeCierreMouseClicked
               int option = JOptionPane.showOptionDialog(this, "¿Está seguro de que desea cerrar la aplicación?", "Confirmar cierre", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "Sí");
if (option == JOptionPane.YES_OPTION) {
    System.exit(0);
}
    }//GEN-LAST:event_BotonDeCierreMouseClicked
    // public static void Conversores(JCombobox Conversores){

    //  }
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
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AbajoCMonedas;
    private javax.swing.JPanel ArribaCMonedas;
    private javax.swing.JButton BotonDeCierre;
    private javax.swing.JLabel Reloj;
    private javax.swing.JPanel TiempoJpanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
