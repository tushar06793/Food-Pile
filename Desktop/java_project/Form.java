
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

public class Form extends javax.swing.JFrame {

    private Connection conn;
   static String str;
    

    public Form() throws ClassNotFoundException, SQLException {
        initComponents();
         Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/project";
        conn = DriverManager.getConnection(url, "root", "Ayush@123");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Lb = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TF1 = new javax.swing.JTextField();
        TF2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("username");

        Lb.setText("Sign In");
        Lb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LbActionPerformed(evt);
            }
        });

        jLabel2.setText("password");

        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Lb))
                    .addComponent(TF1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(TF2))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(TF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(Lb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void LbActionPerformed(java.awt.event.ActionEvent evt) {                                   
           
        if(TF1.getText().equals("") || TF2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter all details", "LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
        try {
            String a="select * from form where username=?";
            PreparedStatement p=conn.prepareStatement(a);
            p.setString(1, TF1.getText());
            ResultSet r=p.executeQuery();
            
            if(r.next()){
                String s="select * from form where password=? and username=?" ;
                PreparedStatement ps=conn.prepareStatement(s);
                ps.setString(1, TF2.getText());
                ps.setString(2, TF1.getText());
                 ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    
                    
                    try {
                        str=TF1.getText();
                        dispose();
                        new Inventory().setVisible(true);
                     
                        
                    } catch (ClassNotFoundException | SQLException ex) {
                        ex.getStackTrace();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Password", "LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
                }
            } else {
                
                JOptionPane.showMessageDialog(null, "Username not found", "LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
           
        }}
    }                                  

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         


            try {
                    dispose();
                    new Register().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    
                }        

       // try {                                         
            
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
                java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            
            /* Create and display the form */
            
         //   new Register().setVisible(true);
            
        //} catch (ClassNotFoundException | SQLException ex) {
            
        //}
        //</editor-fold>
        
        //</editor-fold>
             
    

    }                                        

    private void TF2ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    
    public static void main(String args[]) {
      
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Form().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Lb;
    private javax.swing.JTextField TF1;
    private javax.swing.JPasswordField TF2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration                   

    
   public static String getnm() {
        return str;
    }
}
