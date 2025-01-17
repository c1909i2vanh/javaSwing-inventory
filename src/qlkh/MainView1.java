/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlkh;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import qlkh.controller.InvoiceImportDetailController;
import qlkh.testView.GiangTestFrameInvoiceImportDetail;
import qlkh.views.CustomerView;
import qlkh.views.Home;
import qlkh.views.InvoiceImportDetail2View;
import qlkh.views.InvoiceImportDetailView;

/**
 *
 * @author user
 */
public class MainView1 extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    int xMouse;
    int yMouse;
    public MainView1() {
        
        initComponents();
        Home home = new Home();
        content.add(home);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        iconminmaxclose = new javax.swing.JPanel();
        ButtonClose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        ButtonScreen = new javax.swing.JPanel();
        RestoreDown = new javax.swing.JLabel();
        ButtonHide = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        menuMain = new javax.swing.JPanel();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        kButton3 = new keeptoo.KButton();
        kButton4 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        header.setBackground(new java.awt.Color(0, 0, 255));
        header.setMinimumSize(new java.awt.Dimension(100, 50));
        header.setPreferredSize(new java.awt.Dimension(977, 30));
        header.setLayout(new java.awt.BorderLayout());

        iconminmaxclose.setBackground(new java.awt.Color(255, 0, 153));
        iconminmaxclose.setPreferredSize(new java.awt.Dimension(150, 70));
        iconminmaxclose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonClose.setBackground(new java.awt.Color(231, 234, 237));
        ButtonClose.setLayout(new java.awt.BorderLayout());

        close.setBackground(new java.awt.Color(23, 169, 204));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlkh/icons/icons8-delete-15.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeMouseReleased(evt);
            }
        });
        ButtonClose.add(close, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(ButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 30));

        ButtonScreen.setBackground(new java.awt.Color(231, 234, 237));
        ButtonScreen.setLayout(new java.awt.BorderLayout());

        RestoreDown.setBackground(new Color(0,0,0,0));
        RestoreDown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RestoreDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlkh/icons/icons8-restore-down-15.png"))); // NOI18N
        RestoreDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestoreDownMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RestoreDownMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RestoreDownMouseExited(evt);
            }
        });
        ButtonScreen.add(RestoreDown, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(ButtonScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 30));

        ButtonHide.setBackground(new java.awt.Color(231, 234, 237));
        ButtonHide.setLayout(new java.awt.BorderLayout());

        minimize.setBackground(new java.awt.Color(23, 169, 204));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlkh/icons/icons8-compress-15.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        ButtonHide.add(minimize, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(ButtonHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        header.add(iconminmaxclose, java.awt.BorderLayout.LINE_END);

        jPanel1.setBackground(new java.awt.Color(231, 234, 237));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlkh/icons/icons8-online-store-25.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("Store Manager");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 150, 30));

        FrameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameDragMouseDragged(evt);
            }
        });
        FrameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameDragMousePressed(evt);
            }
        });
        jPanel1.add(FrameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 30));

        header.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        content.setBackground(new java.awt.Color(102, 255, 0));
        content.setLayout(new java.awt.CardLayout());

        menuMain.setBackground(new java.awt.Color(28, 43, 65));
        menuMain.setPreferredSize(new java.awt.Dimension(200, 575));

        kButton1.setText("Unit");
        kButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kButton1.setkBorderRadius(0);
        kButton1.setkEndColor(new java.awt.Color(28, 43, 65));
        kButton1.setkHoverEndColor(new java.awt.Color(48, 125, 245));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(48, 125, 245));
        kButton1.setkStartColor(new java.awt.Color(28, 43, 65));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setText("InvoiceImportDetail");
        kButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kButton2.setkBorderRadius(0);
        kButton2.setkEndColor(new java.awt.Color(28, 43, 65));
        kButton2.setkHoverEndColor(new java.awt.Color(48, 125, 245));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(48, 125, 245));
        kButton2.setkStartColor(new java.awt.Color(28, 43, 65));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        kButton3.setText("Hóa đơn");
        kButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kButton3.setkBorderRadius(0);
        kButton3.setkEndColor(new java.awt.Color(28, 43, 65));
        kButton3.setkHoverEndColor(new java.awt.Color(48, 125, 245));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(48, 125, 245));
        kButton3.setkStartColor(new java.awt.Color(28, 43, 65));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        kButton4.setText("Khách hàng");
        kButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kButton4.setkBorderRadius(0);
        kButton4.setkEndColor(new java.awt.Color(28, 43, 65));
        kButton4.setkHoverEndColor(new java.awt.Color(48, 125, 245));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new java.awt.Color(48, 125, 245));
        kButton4.setkStartColor(new java.awt.Color(28, 43, 65));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuMainLayout = new javax.swing.GroupLayout(menuMain);
        menuMain.setLayout(menuMainLayout);
        menuMainLayout.setHorizontalGroup(
            menuMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuMainLayout.setVerticalGroup(
            menuMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuMainLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(menuMain, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuMain, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1223, 611));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void changeColor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        changeColor(ButtonClose, new Color(232, 17, 35));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        changeColor(ButtonClose, new Color(231, 234, 237));
    }//GEN-LAST:event_closeMouseExited

    
    
    
    private void RestoreDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestoreDownMouseClicked
        // TODO add your handling code here:
        if (this.getExtendedState() != MainView1.MAXIMIZED_BOTH) {
            this.setExtendedState(MainView1.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(MainView1.NORMAL);
        }
    }//GEN-LAST:event_RestoreDownMouseClicked

    private void RestoreDownMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestoreDownMouseEntered
        // TODO add your handling code here:
        changeColor(ButtonScreen, new Color(229, 229, 229));
    }//GEN-LAST:event_RestoreDownMouseEntered

    private void RestoreDownMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestoreDownMouseExited
        changeColor(ButtonScreen, new Color(231, 234, 237));
    }//GEN-LAST:event_RestoreDownMouseExited

    
    
    
    private void closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_closeMouseReleased

    
    
    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(MainView1.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        // TODO add your handling code here:
        changeColor(ButtonHide, new Color(229, 229, 229));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        // TODO add your handling code here:
        changeColor(ButtonHide, new Color(231, 234, 237));
    }//GEN-LAST:event_minimizeMouseExited

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        CustomerView x = new CustomerView();
        content.removeAll();
        content.add(x);
       
        System.out.println("â");
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        InvoiceImportDetailController y = new InvoiceImportDetailController();
     JPanel x = y.getContentPage();
      content.removeAll();
        content.add(x);
       

    }//GEN-LAST:event_kButton1ActionPerformed

    private void FrameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_FrameDragMousePressed

    private void FrameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_FrameDragMouseDragged

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
            java.util.logging.Logger.getLogger(MainView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonClose;
    private javax.swing.JPanel ButtonHide;
    private javax.swing.JPanel ButtonScreen;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JLabel RestoreDown;
    private javax.swing.JLabel close;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JPanel iconminmaxclose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KButton kButton4;
    private javax.swing.JPanel menuMain;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
