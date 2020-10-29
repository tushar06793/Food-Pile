
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame {

    private Connection conn;
    public Register() throws ClassNotFoundException, SQLException {
        initComponents();
        
         Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/project";
        conn = DriverManager.getConnection(url, "root", "Ayush@123");
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        ei = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("username");

        jLabel2.setText("email id");

        jLabel3.setText("password");

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(un, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(ei)
                    .addComponent(pw))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        try {
            String a="select * from form where username=?";
            PreparedStatement p=conn.prepareStatement(a);
            p.setString(1, un.getText());
            ResultSet r=p.executeQuery();
            
             String ar="select * from form where email=?";
            PreparedStatement pq=conn.prepareStatement(ar);
            pq.setString(1, ei.getText());
            ResultSet rs=pq.executeQuery();
            
            if(r.next()){
                JOptionPane.showMessageDialog(null, "Username already exists", "LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
            else if(rs.next()){
                JOptionPane.showMessageDialog(null, "Email already exists", "LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
            
            
            
            if(un.getText().equals("") || ei.getText().equals("") || pw.getText().equals("")){
                JOptionPane.showMessageDialog(null, "One or more entries are blank", "LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(ei.getText().length()>10 && ei.getText().substring(ei.getText().length()-10,ei.getText().length()).equals("@gmail.com")){
                    
                    
                    
                    if(pw.getText().length()<9){
                        JOptionPane.showMessageDialog(null, "Password length must be greater than 8", "LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        try {
                            String s="insert into form (username , email, password) values (?,?,?)";
                            PreparedStatement ps=conn.prepareStatement(s);
                            ps.setString(1, un.getText());
                            ps.setString(2, ei.getText());
                            ps.setString(3,pw.getText());
                            
                            ps.executeUpdate();
                            
                            ps.close();
                            
                            dispose();
                            new Form().setVisible(true);
                            
                        } catch (SQLException | ClassNotFoundException ex) {
                            
                        }
                    }}
                else{
                    JOptionPane.showMessageDialog(null, "Invalid email", "LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
                }}
        } }catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                        

   
   

    // Variables declaration - do not modify                     
    private javax.swing.JTextField ei;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField un;
    // End of variables declaration                   
}
