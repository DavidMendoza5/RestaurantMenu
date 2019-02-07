
package menutienda;

import javax.swing.JOptionPane;

public class ventana1 extends javax.swing.JFrame {

    public ventana1() {
        initComponents();
    }
    double cuenta = 0, total = 0;
    double burger, hotdog, soda, qcq, qsq, burrito, grill;
    int option;
    Calculos purchase = new Calculos();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        RBtn1 = new javax.swing.JRadioButton();
        RBtn3 = new javax.swing.JRadioButton();
        RBtn2 = new javax.swing.JRadioButton();
        RBtn4 = new javax.swing.JRadioButton();
        BtnCleanFields = new javax.swing.JButton();
        cbBurger = new javax.swing.JCheckBox();
        cbHotDog = new javax.swing.JCheckBox();
        txtPriceBurger = new javax.swing.JTextField();
        txtPrecioHotDog = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbQCQ = new javax.swing.JCheckBox();
        cbSoda = new javax.swing.JCheckBox();
        cbQSQ = new javax.swing.JCheckBox();
        cbBurrito = new javax.swing.JCheckBox();
        cbGrill = new javax.swing.JCheckBox();
        txtSoda = new javax.swing.JTextField();
        txtQCQ = new javax.swing.JTextField();
        txtQSQ = new javax.swing.JTextField();
        txtBurrito = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtGrill = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jlCost = new javax.swing.JLabel();
        txtBill = new javax.swing.JTextField();
        getBill = new javax.swing.JButton();
        BtnLeave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Promociones");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 30));

        buttonGroup1.add(RBtn1);
        RBtn1.setFont(new java.awt.Font("Marker Felt", 1, 14)); // NOI18N
        RBtn1.setText("Sin Descuento");
        RBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(RBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        buttonGroup1.add(RBtn3);
        RBtn3.setFont(new java.awt.Font("Marker Felt", 1, 14)); // NOI18N
        RBtn3.setText("Targeta de Promoción 15%");
        RBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(RBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        buttonGroup1.add(RBtn2);
        RBtn2.setFont(new java.awt.Font("Marker Felt", 1, 14)); // NOI18N
        RBtn2.setText("Cliente Frecuente 20% de descuento");
        RBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(RBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        buttonGroup1.add(RBtn4);
        RBtn4.setFont(new java.awt.Font("Marker Felt", 1, 14)); // NOI18N
        RBtn4.setText("Descuento de Internet 10%");
        RBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(RBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        BtnCleanFields.setBackground(new java.awt.Color(255, 51, 51));
        BtnCleanFields.setFont(new java.awt.Font("Marker Felt", 1, 14)); // NOI18N
        BtnCleanFields.setText("Limpiar Campos");
        BtnCleanFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCleanFieldsActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCleanFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        cbBurger.setFont(new java.awt.Font("Marker Felt", 1, 12)); // NOI18N
        cbBurger.setForeground(new java.awt.Color(204, 51, 0));
        cbBurger.setText("Hamburguesa Long Rodeo");
        cbBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBurgerActionPerformed(evt);
            }
        });
        getContentPane().add(cbBurger, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        cbHotDog.setFont(new java.awt.Font("Marker Felt", 1, 12)); // NOI18N
        cbHotDog.setForeground(new java.awt.Color(204, 51, 0));
        cbHotDog.setText("Super HotDog");
        cbHotDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHotDogActionPerformed(evt);
            }
        });
        getContentPane().add(cbHotDog, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        txtPriceBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceBurgerActionPerformed(evt);
            }
        });
        getContentPane().add(txtPriceBurger, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 60, -1));

        txtPrecioHotDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioHotDogActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecioHotDog, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 60, -1));

        jLabel3.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        jLabel3.setText("$20.00");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        jLabel4.setText("$15.00");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        cbQCQ.setFont(new java.awt.Font("Marker Felt", 1, 12)); // NOI18N
        cbQCQ.setForeground(new java.awt.Color(255, 51, 51));
        cbQCQ.setText("quesadilla con queso");
        cbQCQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQCQActionPerformed(evt);
            }
        });
        getContentPane().add(cbQCQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        cbSoda.setFont(new java.awt.Font("Marker Felt", 1, 12)); // NOI18N
        cbSoda.setForeground(new java.awt.Color(255, 51, 51));
        cbSoda.setText("Refrescos");
        cbSoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSodaActionPerformed(evt);
            }
        });
        getContentPane().add(cbSoda, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        cbQSQ.setFont(new java.awt.Font("Marker Felt", 1, 12)); // NOI18N
        cbQSQ.setForeground(new java.awt.Color(255, 51, 51));
        cbQSQ.setText("qusadilla sin queso");
        cbQSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQSQActionPerformed(evt);
            }
        });
        getContentPane().add(cbQSQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        cbBurrito.setFont(new java.awt.Font("Marker Felt", 1, 12)); // NOI18N
        cbBurrito.setForeground(new java.awt.Color(255, 0, 0));
        cbBurrito.setText("Burrito de Arrachera");
        cbBurrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBurritoActionPerformed(evt);
            }
        });
        getContentPane().add(cbBurrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        cbGrill.setFont(new java.awt.Font("Marker Felt", 1, 12)); // NOI18N
        cbGrill.setForeground(new java.awt.Color(255, 51, 51));
        cbGrill.setText("Parrillada");
        cbGrill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGrillActionPerformed(evt);
            }
        });
        getContentPane().add(cbGrill, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        txtSoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSodaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSoda, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 80, -1));

        txtQCQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQCQActionPerformed(evt);
            }
        });
        getContentPane().add(txtQCQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 80, -1));

        txtQSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQSQActionPerformed(evt);
            }
        });
        getContentPane().add(txtQSQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 80, -1));

        txtBurrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBurritoActionPerformed(evt);
            }
        });
        getContentPane().add(txtBurrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 80, -1));

        jLabel5.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        jLabel5.setText("$ 25.00");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        jLabel6.setText("$ 35.00");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        jLabel7.setText("$ 30.00");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        jLabel8.setText("$ 125.00");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, -1, -1));

        txtGrill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrillActionPerformed(evt);
            }
        });
        getContentPane().add(txtGrill, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 80, -1));

        jLabel9.setFont(new java.awt.Font("Marker Felt", 1, 18)); // NOI18N
        jLabel9.setText("$ 700.00");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, 20));

        jlCost.setFont(new java.awt.Font("Marker Felt", 1, 12)); // NOI18N
        jlCost.setForeground(new java.awt.Color(255, 51, 51));
        jlCost.setText("Total a Pagar :$");
        getContentPane().add(jlCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, 20));

        txtBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillActionPerformed(evt);
            }
        });
        getContentPane().add(txtBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 90, 20));

        getBill.setFont(new java.awt.Font("Marker Felt", 1, 14)); // NOI18N
        getBill.setText("Obtener el Total a pagar");
        getBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBillActionPerformed(evt);
            }
        });
        getContentPane().add(getBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        BtnLeave.setFont(new java.awt.Font("Marker Felt", 1, 14)); // NOI18N
        BtnLeave.setText("Salir de la App");
        BtnLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLeaveActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLeave, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foto1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtn3ActionPerformed
        option = 3;
        total = cuenta - cuenta*.15;
        txtBill.setText(String.valueOf(total));
    }//GEN-LAST:event_RBtn3ActionPerformed

    private void RBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtn4ActionPerformed
        option = 4;
        total = cuenta - cuenta*.10;
        txtBill.setText(String.valueOf(total));
    }//GEN-LAST:event_RBtn4ActionPerformed

    private void txtPrecioHotDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioHotDogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioHotDogActionPerformed

    private void txtBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillActionPerformed
        
    }//GEN-LAST:event_txtBillActionPerformed

    private void txtSodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSodaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSodaActionPerformed

    private void txtQSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQSQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQSQActionPerformed

    private void txtBurritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBurritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBurritoActionPerformed

    private void txtGrillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrillActionPerformed

    private void getBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBillActionPerformed
        
    }//GEN-LAST:event_getBillActionPerformed

    private void txtQCQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQCQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQCQActionPerformed

    private void BtnLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLeaveActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BtnLeaveActionPerformed

    private void BtnCleanFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCleanFieldsActionPerformed
        // TODO add your handling code here:
        if(cbBurrito.isSelected())
            cbBurrito.setSelected(false);
        if(cbHotDog.isSelected())
            cbHotDog.setSelected(false);
        if(cbGrill.isSelected())
            cbGrill.setSelected(false);
        if(cbQCQ.isSelected())
            cbQCQ.setSelected(false);
        if(cbQSQ.isSelected())
            cbQSQ.setSelected(false);
        if(cbSoda.isSelected())
            cbSoda.setSelected(false);
        if(cbHotDog.isSelected())
            cbHotDog.setSelected(false);
        if(cbBurger.isSelected())
            cbBurger.setSelected(false);
        if(RBtn1.isSelected())
            RBtn1.setSelected(false);
        if(RBtn2.isSelected())
            RBtn2.setSelected(false);
        if(RBtn3.isSelected())
            RBtn3.setSelected(false);
        if(RBtn4.isSelected())
            RBtn4.setSelected(false);
        txtBill.setText("");
        txtSoda.setText("");
        txtBurrito.setText("");
        txtGrill.setText("");
        txtPrecioHotDog.setText("");
        txtPriceBurger.setText("");
        txtQCQ.setText("");
        txtQSQ.setText("");
    }//GEN-LAST:event_BtnCleanFieldsActionPerformed

    private void cbBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBurgerActionPerformed
        String aux = txtPriceBurger.getText();
        if(cbBurger.isSelected()){
            try{
                burger = Double.parseDouble(aux);
                cuenta += burger*20;
                txtBill.setText(String.valueOf(cuenta));
            } catch(NumberFormatException e1){
                JOptionPane.showMessageDialog(null, "Debe poner una cantidad");
                cbBurger.setSelected(false);
                txtPriceBurger.setText(null);
                txtPriceBurger.requestFocus();
            }
        } else if(!cbBurger.isSelected()){
            cuenta -= burger*20;
            txtBill.setText(String.valueOf(cuenta));
            burger = 0;
            txtPriceBurger.setText("");
        }
        
        if(option == 1){
            total = cuenta;
            txtBill.setText(String.valueOf(total));
        } else if(option == 2){
            total = cuenta - cuenta*.20;
            txtBill.setText(String.valueOf(total));
        } else if(option == 3){
            total = cuenta - cuenta*.15;
            txtBill.setText(String.valueOf(total));
        } else if(option == 4){
            total = cuenta - cuenta*.10;
            txtBill.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_cbBurgerActionPerformed

    private void RBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtn1ActionPerformed
        option = 1;
        txtBill.setText(String.valueOf(total));
    }//GEN-LAST:event_RBtn1ActionPerformed

    private void RBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtn2ActionPerformed
        option = 2;
        total = cuenta - cuenta*.20;
        txtBill.setText(String.valueOf(total));
    }//GEN-LAST:event_RBtn2ActionPerformed

    private void txtPriceBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceBurgerActionPerformed
        
    }//GEN-LAST:event_txtPriceBurgerActionPerformed

    private void cbHotDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHotDogActionPerformed
        String aux = txtPrecioHotDog.getText();
        if(cbHotDog.isSelected()){
            try{
                hotdog = Double.parseDouble(aux);
                total += hotdog*20;
            } catch(NumberFormatException e1){
                JOptionPane.showMessageDialog(null, "Debe poner una cantidad");
                cbHotDog.setSelected(false);
                txtPrecioHotDog.setText(null);
                txtPrecioHotDog.requestFocus();
            }
        } else if(!cbBurger.isSelected()){
            cuenta -= hotdog*20;
            hotdog = 0;
            txtPrecioHotDog.setText(null);
        }
        
        if(option == 1){
            total = cuenta;
            txtBill.setText(String.valueOf(total));
        } else if(option == 2){
            total = cuenta - cuenta*.20;
            txtBill.setText(String.valueOf(total));
        } else if(option == 3){
            total = cuenta - cuenta*.15;
            txtBill.setText(String.valueOf(total));
        } else if(option == 4){
            total = cuenta - cuenta*.10;
            txtBill.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_cbHotDogActionPerformed

    private void cbSodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSodaActionPerformed
        String aux = txtSoda.getText();
        if(cbSoda.isSelected()){
            try{
                soda = Double.parseDouble(aux);
                cuenta += soda*25;
                txtBill.setText(String.valueOf(cuenta));
            } catch(NumberFormatException e1){
                JOptionPane.showMessageDialog(null, "Debe poner una cantidad");
                cbSoda.setSelected(false);
                txtSoda.setText(null);
                txtSoda.requestFocus();
            }
            } else if(!cbSoda.isSelected()){
            cuenta -= soda*25;
            txtBill.setText(String.valueOf(cuenta));
            soda = 0;
            txtSoda.setText(null);
        }
        
        if(option == 1){
            total = cuenta;
            txtBill.setText(String.valueOf(total));
        } else if(option == 2){
            total = cuenta - cuenta*.20;
            txtBill.setText(String.valueOf(total));
        } else if(option == 3){
            total = cuenta - cuenta*.15;
            txtBill.setText(String.valueOf(total));
        } else if(option == 4){
            total = cuenta - cuenta*.10;
            txtBill.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_cbSodaActionPerformed

    private void cbQCQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQCQActionPerformed
        String aux = txtQCQ.getText();
        if(cbQCQ.isSelected()){
            try{
                qcq = Double.parseDouble(aux);
                cuenta += qcq*35;
                txtBill.setText(String.valueOf(cuenta));
            } catch(NumberFormatException e1){
                JOptionPane.showMessageDialog(null, "Debe poner una cantidad");
                cbSoda.setSelected(false);
                txtSoda.setText(null);
                txtSoda.requestFocus();
            }
            } else if(!cbSoda.isSelected()){
            cuenta -= qcq*35;
            txtBill.setText(String.valueOf(cuenta));
            qcq = 0;
            txtQCQ.setText(null);
        }
        
        if(option == 1){
            total = cuenta;
            txtBill.setText(String.valueOf(total));
        } else if(option == 2){
            total = cuenta - cuenta*.20;
            txtBill.setText(String.valueOf(total));
        } else if(option == 3){
            total = cuenta - cuenta*.15;
            txtBill.setText(String.valueOf(total));
        } else if(option == 4){
            total = cuenta - cuenta*.10;
            txtBill.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_cbQCQActionPerformed

    private void cbQSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQSQActionPerformed
        String aux = txtQSQ.getText();
        if(cbQSQ.isSelected()){
            try{
                qsq = Double.parseDouble(aux);
                cuenta += qsq*30;
                txtBill.setText(String.valueOf(cuenta));
            } catch(NumberFormatException e1){
                JOptionPane.showMessageDialog(null, "Debe poner una cantidad");
                cbSoda.setSelected(false);
                txtSoda.setText(null);
                txtSoda.requestFocus();
            }
            } else if(!cbSoda.isSelected()){
            cuenta -= qsq*30;
            txtBill.setText(String.valueOf(cuenta));
            qsq = 0;
            txtQSQ.setText(null);
        }
        
        if(option == 1){
            total = cuenta;
            txtBill.setText(String.valueOf(total));
        } else if(option == 2){
            total = cuenta - cuenta*.20;
            txtBill.setText(String.valueOf(total));
        } else if(option == 3){
            total = cuenta - cuenta*.15;
            txtBill.setText(String.valueOf(total));
        } else if(option == 4){
            total = cuenta - cuenta*.10;
            txtBill.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_cbQSQActionPerformed

    private void cbBurritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBurritoActionPerformed
        String aux = txtBurrito.getText();
        if(cbBurrito.isSelected()){
            try{
                burrito = Double.parseDouble(aux);
                cuenta += burrito*125;
                txtBill.setText(String.valueOf(cuenta));
            } catch(NumberFormatException e1){
                JOptionPane.showMessageDialog(null, "Debe poner una cantidad");
                cbSoda.setSelected(false);
                txtSoda.setText(null);
                txtSoda.requestFocus();
            }
            } else if(!cbSoda.isSelected()){
            cuenta -= burrito*125;
            txtBill.setText(String.valueOf(cuenta));
            burrito = 0;
            txtPriceBurger.setText(null);
        }
        
        if(option == 1){
            total = cuenta;
            txtBill.setText(String.valueOf(total));
        } else if(option == 2){
            total = cuenta - cuenta*.20;
            txtBill.setText(String.valueOf(total));
        } else if(option == 3){
            total = cuenta - cuenta*.15;
            txtBill.setText(String.valueOf(total));
        } else if(option == 4){
            total = cuenta - cuenta*.10;
            txtBill.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_cbBurritoActionPerformed

    private void cbGrillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGrillActionPerformed
        String aux = txtGrill.getText();
        if(cbGrill.isSelected()){
            try{
                grill = Double.parseDouble(aux);
                cuenta += grill*700;
                txtBill.setText(String.valueOf(cuenta));
            } catch(NumberFormatException e1){
                JOptionPane.showMessageDialog(null, "Debe poner una cantidad");
                cbSoda.setSelected(false);
                txtSoda.setText(null);
                txtSoda.requestFocus();
            }
            } else if(!cbSoda.isSelected()){
            cuenta -= grill*20;
            txtBill.setText(String.valueOf(cuenta));
            grill = 0;
            txtGrill.setText(null);
        }
        
        if(option == 1){
            total = cuenta;
            txtBill.setText(String.valueOf(total));
        } else if(option == 2){
            total = cuenta - cuenta*.20;
            txtBill.setText(String.valueOf(total));
        } else if(option == 3){
            total = cuenta - cuenta*.15;
            txtBill.setText(String.valueOf(total));
        } else if(option == 4){
            total = cuenta - cuenta*.10;
            txtBill.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_cbGrillActionPerformed

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
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana1().setVisible(true);
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCleanFields;
    private javax.swing.JButton BtnLeave;
    private javax.swing.JRadioButton RBtn1;
    private javax.swing.JRadioButton RBtn2;
    private javax.swing.JRadioButton RBtn3;
    private javax.swing.JRadioButton RBtn4;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JCheckBox cbBurger;
    public javax.swing.JCheckBox cbBurrito;
    public javax.swing.JCheckBox cbGrill;
    public javax.swing.JCheckBox cbHotDog;
    public javax.swing.JCheckBox cbQCQ;
    public javax.swing.JCheckBox cbQSQ;
    public javax.swing.JCheckBox cbSoda;
    public javax.swing.JButton getBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlCost;
    public javax.swing.JTextField txtBill;
    private javax.swing.JTextField txtBurrito;
    private javax.swing.JTextField txtGrill;
    public javax.swing.JTextField txtPrecioHotDog;
    public javax.swing.JTextField txtPriceBurger;
    public javax.swing.JTextField txtQCQ;
    public javax.swing.JTextField txtQSQ;
    public javax.swing.JTextField txtSoda;
    // End of variables declaration//GEN-END:variables

}
