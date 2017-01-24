
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import javax.swing.*;

public class chatclient extends javax.swing.JFrame 
{
    JScrollPane jsp;
    JTextArea ta;
    BufferedReader br,brn;
    PrintWriter pw;
    Socket sock;
    Thread t1,t2;
    String s,s2;
    
    public chatclient() {
        initComponents();
        setSize(550,500);
        jsp = new JScrollPane();
        ta = new JTextArea();
        ta.setEditable(false);
        jsp.setViewportView(ta);
        jsp.setBounds(30,50,400,270);
        add(jsp);
        
        try
        {
            
            sock = new Socket("172.16.135.61",900);
            br = new BufferedReader(new InputStreamReader(System.in));
            pw = new PrintWriter(sock.getOutputStream());
            brn = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            
            
            
            Thread t1 =new Thread(new Sender());
            Thread t2 = new Thread(new Reciever());
            
            t1.start();
            t2.start();
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bt = new javax.swing.JButton();
        tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("chatroom[Client]");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Welcome to Pannu'z Chat Room");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 500, 50);

        bt.setText("Send");
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt);
        bt.setBounds(350, 340, 80, 30);
        getContentPane().add(tf);
        tf.setBounds(30, 340, 300, 30);

        pack();
    }// </editor-fold>                        

    private void btActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
        String x= tf.getText();
        ta.append("ME: "+x+"\n");
        pw.println("Client : "+x);
        pw.flush();
        tf.setText("");
    }                                  

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
            //java.util.logging.Logger.getLogger(chatserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //java.util.logging.Logger.getLogger(chatserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
           // java.util.logging.Logger.getLogger(chatserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
          //  java.util.logging.Logger.getLogger(chatserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chatclient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tf;
    // End of variables declaration                   
    class Sender implements Runnable
    {

        @Override
        public void run() 
        {
            try
            {
                
                while(true)
                {
                    s=br.readLine();
                                    
                }
                
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
            
        }
        
    }
    class Reciever implements Runnable
    {

        @Override
        public void run() 
        {
            try
            {
                String s;
                while(true)
                {
                   s2= brn.readLine();
                   ta.append(s2+"\n");
                }
                
                
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
         }
        
    }
}
