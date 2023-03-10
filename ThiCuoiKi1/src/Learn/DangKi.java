/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Learn;

import DatabaseConnect.DataValidator;

/**
 *
 * @author hiep1
 */
public class DangKi extends javax.swing.JDialog {

    /**
     * Creates new form DangKi
     */
    public DangKi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nam = new javax.swing.JRadioButton();
        nu = new javax.swing.JRadioButton();
        dkhvt = new javax.swing.JTextField();
        dkmk = new javax.swing.JPasswordField();
        dkmk1 = new javax.swing.JPasswordField();
        dksdt = new javax.swing.JTextField();
        dkdc = new javax.swing.JTextField();
        bdctk = new javax.swing.JButton();
        dk = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        dkns = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("????ng k?? t??i kho???n");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 408, 91));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 408, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 97, 408, -1));

        jLabel2.setText("H??? v?? t??n : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 128, 93, -1));

        jLabel3.setText("S??? ??i???n tho???i : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 180, 93, -1));

        jLabel4.setText("M???t kh???u :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 226, 85, -1));

        jLabel5.setText("Nh???p l???i m???t kh???u : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 272, -1, -1));

        jLabel6.setText("?????a ch??? : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 358, 97, -1));

        jLabel7.setText("Gi???i t??nh : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 391, 85, -1));

        buttonGroup1.add(nam);
        nam.setText("Nam");
        nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namActionPerformed(evt);
            }
        });
        getContentPane().add(nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 389, 98, -1));

        buttonGroup1.add(nu);
        nu.setText("N???");
        getContentPane().add(nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 389, 98, -1));
        getContentPane().add(dkhvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 119, 284, 34));
        getContentPane().add(dkmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 217, 284, 34));
        getContentPane().add(dkmk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 263, 284, 34));
        getContentPane().add(dksdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 171, 284, 34));

        dkdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dkdcActionPerformed(evt);
            }
        });
        getContentPane().add(dkdc, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 349, 284, 34));

        bdctk.setText("B???n ???? c?? t??i kho???n? ");
        bdctk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdctkActionPerformed(evt);
            }
        });
        getContentPane().add(bdctk, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 416, 396, 13));

        dk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit-validated-icon.png"))); // NOI18N
        dk.setText("????ng k?? ");
        dk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dkActionPerformed(evt);
            }
        });
        getContentPane().add(dk, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 435, 120, 48));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        jButton3.setText("Tho??t");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 435, 118, 48));

        jLabel8.setText("Ng??y sinh");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 311, 97, 31));
        getContentPane().add(dkns, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 309, 284, 34));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namActionPerformed

    private void dkdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dkdcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dkdcActionPerformed

    private void bdctkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdctkActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bdctkActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dkActionPerformed
        // TODO add your handling code here:
         StringBuilder a = new StringBuilder();
         DataValidator.validateEmpty(dkhvt, a, "H??? v?? t??n kh??ng ???????c ????? tr???ng");
         
//        DataValidator.validateEmpty(dkhvt, sb, "H??? v?? t??n kh??ng ???????c ????? tr???ng");
//        Datavalidator.validateEmpty(jTextField_PhoneNumber, sb, "S??? ??i???n tho???i kh??ng ???????c ????? tr???ng");
//        Datavalidator.validateEmpty(jTextField_Password, sb, "M???t kh???u kh??ng ???????c ????? tr???ng");
//        Datavalidator.validateEmpty(jDateChooser_DateOfBirth, sb, "Ng??y sinh kh??ng ???????c ????? tr???ng");
//        Datavalidator.validateEmpty(buttonGroup1, sb, "Gi???i t??nh kh??ng ???????c ????? tr???ng");
//        if(sb.length() > 0){
//            MessageDialog.showErrorDialog(this, "Th??ng b??o", sb.toString());
//            return ;
//        }
//        UserDao dao = new UserDao();
//         String genDer = "";
//         Enumeration<AbstractButton> btn = buttonGroup1.getElements();
//         while(btn.hasMoreElements()){
//             AbstractButton b = btn.nextElement();
//             if(b.isSelected()) genDer = b.getText();
//         }
//         try{
//             User user = new User();
//             user = dao.checkSignUp(jTextField_PhoneNumber.getText());
//             if(user != null){
//                 MessageDialog.showErrorDialog(this, "T??i kho???n ???? ???????c ????ng k??", "????ng k?? l???i");
//             }
//             else{
//                 dao.Singup(jTextField_PhoneNumber.getText(), jTextField_FullName.getText(), jTextField_Password.getText(), jDateChooser_DateOfBirth.getDate() + "", genDer,"Kh??ch h??ng");
//                 MessageDialog.showMessageDialog(this, "????ng k?? th??nh c??ng", "Ho??n th??nh");
//             }
//         } catch(Exception e){
//            e.printStackTrace();
//            MessageDialog.showErrorDialog(this, e.getMessage(), "L???i");
//        }
//        
    }//GEN-LAST:event_dkActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bdctk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton dk;
    private javax.swing.JTextField dkdc;
    private javax.swing.JTextField dkhvt;
    private javax.swing.JPasswordField dkmk;
    private javax.swing.JPasswordField dkmk1;
    private javax.swing.JTextField dkns;
    private javax.swing.JTextField dksdt;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTree jTree1;
    private javax.swing.JRadioButton nam;
    private javax.swing.JRadioButton nu;
    // End of variables declaration//GEN-END:variables
}
