import java.awt.Color;


public class calculator extends javax.swing.JFrame {

    double a;
    double b;
    String s="";
    String ans="";
    int n;
     
    public calculator() {
        initComponents();
        setSize(430,350);
        setTitle("PANNU'Z Calculator"); 
        tb.requestFocus();
       
        tf.setVisible(false);
        lb.setText("OFF");
        tb.setForeground(Color.red);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tb = new javax.swing.JToggleButton();
        bequal = new javax.swing.JButton();
        bplus = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        bmul = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        b00 = new javax.swing.JButton();
        bminus = new javax.swing.JButton();
        bc = new javax.swing.JButton();
        bmod = new javax.swing.JButton();
        lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(tf);
        tf.setBounds(30, 30, 350, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Calculator");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 120, 20);

        tb.setText("ON/OFF");
        tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbActionPerformed(evt);
            }
        });
        getContentPane().add(tb);
        tb.setBounds(280, 100, 100, 40);

        bequal.setText("=");
        bequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequalActionPerformed(evt);
            }
        });
        getContentPane().add(bequal);
        bequal.setBounds(330, 250, 50, 40);

        bplus.setText("+");
        bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplusActionPerformed(evt);
            }
        });
        getContentPane().add(bplus);
        bplus.setBounds(280, 220, 50, 70);

        bdiv.setText("/");
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });
        getContentPane().add(bdiv);
        bdiv.setBounds(330, 180, 50, 30);

        bmul.setText("x");
        bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmulActionPerformed(evt);
            }
        });
        getContentPane().add(bmul);
        bmul.setBounds(280, 180, 50, 40);

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(30, 100, 80, 50);

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(170, 100, 80, 50);

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(110, 100, 60, 50);

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(30, 150, 80, 50);

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(170, 150, 80, 50);

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(110, 150, 60, 50);

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(30, 200, 80, 50);

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(170, 200, 80, 50);

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(110, 200, 60, 50);

        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        getContentPane().add(b0);
        b0.setBounds(30, 250, 80, 40);

        bdot.setText(".");
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });
        getContentPane().add(bdot);
        bdot.setBounds(170, 250, 80, 40);

        b00.setText("00");
        b00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b00ActionPerformed(evt);
            }
        });
        getContentPane().add(b00);
        b00.setBounds(110, 250, 60, 40);

        bminus.setText("-");
        bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bminusActionPerformed(evt);
            }
        });
        getContentPane().add(bminus);
        bminus.setBounds(330, 210, 50, 40);

        bc.setText("C");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });
        getContentPane().add(bc);
        bc.setBounds(330, 140, 50, 40);

        bmod.setText("%");
        bmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodActionPerformed(evt);
            }
        });
        getContentPane().add(bmod);
        bmod.setBounds(280, 140, 50, 40);
        getContentPane().add(lb);
        lb.setBounds(330, 70, 50, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bequalActionPerformed
      b=Double.parseDouble(tf.getText());
      
      
        switch (n) {
            case 1:
            {
                if(a*b==Math.ceil(a*b))
                {
                    tf.setText(""+(int) (a*b));
                    break;
                }
                else
                {
                    tf.setText(""+a*b);
                    break;
                }
            }
                
            case 2:
            {
                if(a+b==Math.ceil(a+b))
                {
                    tf.setText(""+(int) (a+b));
                break;
                }
                else
                {
                    tf.setText(""+(a+b));
                    break;
                }
            }
            case 3:
            {
                 if(b==0)
                            {
                                  tf.setText("Math Error");
                                  break;
                            } 
                            else
                 {
                     if(a/b==Math.ceil(a/b))
                     {
                         tf.setText(""+(int)(a/b));
                         break;
                     }
                     else
                     {
                         tf.setText(""+(a/b));
                         break;
                     }
                 }
              }
            case 4:
            {
                if(a-b==Math.ceil(a-b))
                {
                    tf.setText(""+(int) (a-b));
                break;
                }
                else
                {
                    tf.setText(""+(a-b));
                    break;
                }
            }
            case 5:
               {
                if(a%b==Math.ceil(a%b))
                {
                    tf.setText(""+(int) (a%b));
                break;
                }
                else
                {
                    tf.setText(""+(a%b));
                    break;
                }
            }
            default:
                break;
        }
      
    }//GEN-LAST:event_bequalActionPerformed

    private void bplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplusActionPerformed
       a=Double.parseDouble(tf.getText());
       tf.setText("");
       s="";
       n=2;
    }//GEN-LAST:event_bplusActionPerformed

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed
       a=Double.parseDouble(tf.getText());
       tf.setText("");
       s="";
       n=3;
    }//GEN-LAST:event_bdivActionPerformed

    private void bmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmulActionPerformed
       a=Double.parseDouble(tf.getText());
       tf.setText("");
       s="";
       n=1;
    }//GEN-LAST:event_bmulActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        s=s+"7";
        tf.setText(s);
    }//GEN-LAST:event_b7ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        s=s+"9";
        tf.setText(s);
    }//GEN-LAST:event_b9ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        s=s+"8";
        tf.setText(s);
    }//GEN-LAST:event_b8ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
       s=s+"4";
        tf.setText(s);
    }//GEN-LAST:event_b4ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        s=s+"6";
        tf.setText(s);
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        s=s+"5";
        tf.setText(s);
    }//GEN-LAST:event_b5ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       s=s+"1";
        tf.setText(s);
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        s=s+"3";
        tf.setText(s);
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        s=s+"2";
        tf.setText(s);
    }//GEN-LAST:event_b2ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        s=s+"0";
        tf.setText(s);
    }//GEN-LAST:event_b0ActionPerformed

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdotActionPerformed
       s=s+".";
        tf.setText(s);
    }//GEN-LAST:event_bdotActionPerformed

    private void b00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b00ActionPerformed
        s=s+"00";
        tf.setText(s);
    }//GEN-LAST:event_b00ActionPerformed

    private void bminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bminusActionPerformed
       a=Double.parseDouble(tf.getText());
       tf.setText("");
       s="";
       n=4;
    }//GEN-LAST:event_bminusActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
       tf.setText("");
       s="";
       a=0;b=0;
    }//GEN-LAST:event_bcActionPerformed

    private void bmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodActionPerformed
        a=Double.parseDouble(tf.getText());
       tf.setText("");
       s="";
       n=5;
       
    }//GEN-LAST:event_bmodActionPerformed

    private void tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbActionPerformed
     
        if(tb.isSelected())
      {
          tf.setVisible(true);
          lb.setText("ON");
          tb.setForeground(Color.green);
           tf.setText("");
           s="";
           a=0;b=0;
      }
        else
        {
          tf.setVisible(false);
          lb.setText("OFF");
          tb.setForeground(Color.red);
        }
     
        
    }//GEN-LAST:event_tbActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b00;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bc;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bdot;
    private javax.swing.JButton bequal;
    private javax.swing.JButton bminus;
    private javax.swing.JButton bmod;
    private javax.swing.JButton bmul;
    private javax.swing.JButton bplus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb;
    private javax.swing.JToggleButton tb;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
