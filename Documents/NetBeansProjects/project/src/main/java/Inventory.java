
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class Inventory extends javax.swing.JFrame {

    private Connection conn;
    String nam="ayush";
  

   
    public Inventory() throws ClassNotFoundException, SQLException {
        initComponents();
        
        //connection
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/project";
        conn = DriverManager.getConnection(url, "root", "Ayush@123");
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        refresh = new javax.swing.JButton();
        ct = new javax.swing.JTextField();
        nm = new javax.swing.JTextField();
        pc = new javax.swing.JTextField();
        tq = new javax.swing.JTextField();
        qt = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        value = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sort = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "category", "price", "quantity", "threshold_quantity"
            }
        ));
        jScrollPane1.setViewportView(Table);

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcActionPerformed(evt);
            }
        });

        insert.setText("Add");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel4.setText("Search by");

        jLabel1.setText("Value");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Sort by");

        jButton3.setText("Sort");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Edit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(sort, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                                .addComponent(search)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(ct, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(7, 7, 7)))
                                            .addGap(26, 26, 26)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6)
                                        .addGap(53, 53, 53)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(insert))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(tq, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addGap(71, 71, 71)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(23, 23, 23)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(refresh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(refresh)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert)
                    .addComponent(jButton4)
                    .addComponent(jButton7)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    //show content of table
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        DefaultTableModel tableModel = ( DefaultTableModel) Table.getModel();
       
        try {                                        
            
            tableModel.setRowCount(0);
           
            String query2 = "SELECT * FROM user where username = ?";
           
              PreparedStatement preStat = conn.prepareStatement(query2);
            preStat.setString(1, nam);
            ResultSet result = preStat.executeQuery();
            
            while(result.next()) {
                String name = result.getString("name");
                String category= result.getString("category");
                float price  = result.getFloat("price");
                int quantity=result.getInt("quantity");
                int thquantity=result.getInt("threshold_quantity");
                
               tableModel.addRow(new Object[] {name, category, price, quantity, thquantity });
            }
            
              preStat.close();
            
        } catch (Exception ex) {
           ex.getStackTrace();
        }
   
    }//GEN-LAST:event_refreshActionPerformed

    private void pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcActionPerformed

    
    //insert into the table
    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed

        try {
            String n=nm.getText();
            String c=ct.getText();
            float p=Float.parseFloat(pc.getText());
            int q=Integer.parseInt(qt.getText());
            int t=Integer.parseInt(tq.getText());
            
            
            String s = "INSERT INTO user (name, category, price , quantity, threshold_quantity, username) VALUES(?, ?, ?, ?, ?,?)";
            PreparedStatement pS = conn.prepareStatement(s);
            
            pS.setString(1, n);
            pS.setString(2, c);
            pS.setFloat(3, p);
            pS.setInt(4, q);
            pS.setInt(5,t);
            pS.setString(6, nam);
            pS.executeUpdate();
            
            refresh.doClick();
            
              pS.close();
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_insertActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    //searching into the table
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tableModel = ( DefaultTableModel) Table.getModel();
        try {
         
            
            tableModel.setRowCount(0);
            String srch=search.getText();
            String v=value.getText();
            
            
            String qry2="Select * from user where "+srch+" = ? AND username = 'ayush'";
            PreparedStatement pr = conn.prepareStatement(qry2);
            pr.setString(1, v);
            
            ResultSet rt = pr.executeQuery();
            
             while(rt.next()) {
                String name = rt.getString("name");
                String category= rt.getString("category");
                float price  = rt.getFloat("price");
                int quantity=rt.getInt("quantity");
                int thquantity=rt.getInt("threshold_quantity");
                
               tableModel.addRow(new Object[] {name, category, price, quantity, thquantity });
            }
            
              pr.close();
            
        } catch (SQLException ex) {
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    //sorting the table
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            DefaultTableModel tableModel = ( DefaultTableModel) Table.getModel();
            
            tableModel.setRowCount(0);
            String so=sort.getText();
            
            String qry3="select * from user order by "+so;
            PreparedStatement pst=conn.prepareStatement(qry3);
            
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()) {
                String name = rs.getString("name");
                String category= rs.getString("category");
                float price  = rs.getFloat("price");
                int quantity=rs.getInt("quantity");
                int thquantity=rs.getInt("threshold_quantity");
                
                tableModel.addRow(new Object[] {name, category, price, quantity, thquantity });
            }
            
        } catch (SQLException ex) {
            
        }
       
       
    }//GEN-LAST:event_jButton3ActionPerformed

    
    //delete a row in table
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:
            
            int row=Table.getSelectedRow();
            String name = (String) Table.getValueAt(row,0);
            
            String qry="DELETE FROM user where name=?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1,name);
              ps.executeUpdate();
              
              refresh.doClick();
        } catch (SQLException ex) {
            
        }
              
    }//GEN-LAST:event_jButton4ActionPerformed

    
    //select a row in table
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        DefaultTableModel model = ( DefaultTableModel) Table.getModel();
          int row=Table.getSelectedRow();
            String name = (String) model.getValueAt(row,0);
              String category = (String) model.getValueAt(row,1);
                String price = model.getValueAt(row,2).toString();
                  String quantity = model.getValueAt(row,3).toString();
                  String thq = model.getValueAt(row,4).toString();
                    
                    nm.setText(name);
                    ct.setText(category);
                    pc.setText(price);
                    qt.setText(quantity);
                    tq.setText(thq);
                                    
    }//GEN-LAST:event_jButton7ActionPerformed

    
    //update the table
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            
            String qry5= "update user set category=?, price=?, quantity=?, threshold_quantity=? where name=?";
            
            PreparedStatement prst= conn.prepareStatement(qry5);
            
            prst.setString(5, nm.getText());
            prst.setString(1, ct.getText());
            prst.setFloat(2, Float.parseFloat(pc.getText()));
            prst.setInt(3, Integer.parseInt(qt.getText()));
            prst.setInt(4,Integer.parseInt(tq.getText()));
            
            prst.executeUpdate();
            
            refresh.doClick();
            prst.close();
        } catch (SQLException ex) {
            
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Inventory().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                   ex.getStackTrace();
                }
            }
        });
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JTextField ct;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nm;
    private javax.swing.JTextField pc;
    private javax.swing.JTextField qt;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField search;
    private javax.swing.JTextField sort;
    private javax.swing.JTextField tq;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
