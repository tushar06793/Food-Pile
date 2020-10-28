
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class Inventory extends javax.swing.JFrame {

    private Connection conn;
    
       String nam= Form.getnm();  
       
       String srch,v;
       
    public Inventory() throws ClassNotFoundException, SQLException {
        initComponents();
        
        //connection
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/project";
        conn = DriverManager.getConnection(url, "root", "Ayush@123");
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
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
        logout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pnm = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        sval = new javax.swing.JTextField();
        sbutton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        subs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

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

        nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmActionPerformed(evt);
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

        value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueActionPerformed(evt);
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Sort by");

        sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionPerformed(evt);
            }
        });

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

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jButton1.setText("Pie chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton8.setText("Bar graph");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        sbutton.setText("Sub search");
        sbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbuttonActionPerformed(evt);
            }
        });

        jLabel5.setText("Sub Search by");

        jLabel6.setText("Value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ct, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subs, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(tq, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refresh)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(logout)
                                        .addGap(41, 41, 41))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(sval, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(49, 49, 49)
                                        .addComponent(sbutton)))))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(67, 67, 67)
                                .addComponent(insert)
                                .addGap(64, 64, 64)
                                .addComponent(jButton4)
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel3))
                                .addGap(29, 29, 29)
                                .addComponent(jButton8)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pnm)
                                .addGap(52, 52, 52))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnm)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refresh)
                    .addComponent(jButton1)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insert)
                    .addComponent(jButton4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7)
                        .addComponent(jButton6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sbutton)
                    .addComponent(sval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(subs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout)
                    .addComponent(jLabel2)
                    .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>                        
        
    //show content of table
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {                                        
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
               
               if(quantity<=thquantity){
                   JOptionPane.showMessageDialog(null, name+" is at or below the thereshold quantity ");
               }
            }
            
            pnm.setText(nam);
            
            
            preStat.close();
            
        } catch (Exception ex) {
           ex.getStackTrace();
        }
   
    }                                       

    private void pcActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    
    //insert into the table
    private void insertActionPerformed(java.awt.event.ActionEvent evt) {                                       

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
              
              nm.setText("");
              ct.setText("");
              pc.setText("");
              qt.setText("");
              tq.setText("");
              
        } catch (SQLException ex) {
            
        }
    }                                      

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    //searching into the table
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DefaultTableModel tableModel = ( DefaultTableModel) Table.getModel();
        try {
         
            
           tableModel.setRowCount(0);
            srch=search.getText();
            v=value.getText();
            
            
            String qry2="Select * from user where "+srch+" = ? and username = ?" ;
            PreparedStatement pr = conn.prepareStatement(qry2);
            pr.setString(1, v);
            pr.setString(2, nam);
            
            ResultSet rt = pr.executeQuery();
            
             while(rt.next()) {
                String name = rt.getString("name");
                String category= rt.getString("category");
                float price  = rt.getFloat("price");
                int quantity=rt.getInt("quantity");
                int thquantity=rt.getInt("threshold_quantity");
                
               tableModel.addRow(new Object[] {name, category, price, quantity, thquantity });
            }
             
             
            
             search.setText("");
             value.setText("");
              pr.close();
            
        } catch (SQLException ex) {
            
        }
        
    }                                        

    
    //sorting the table
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            // TODO add your handling code here:
            DefaultTableModel tableModel = ( DefaultTableModel) Table.getModel();
            
            tableModel.setRowCount(0);
            String so=sort.getText();
            
            String qry3="select * from user where username = ? order by "+so;
            PreparedStatement pst=conn.prepareStatement(qry3);
            
            pst.setString(1, nam);
            
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()) {
                String name = rs.getString("name");
                String category= rs.getString("category");
                float price  = rs.getFloat("price");
                int quantity=rs.getInt("quantity");
                int thquantity=rs.getInt("threshold_quantity");
                
                tableModel.addRow(new Object[] {name, category, price, quantity, thquantity });
            }
            
            sort.setText("");
            
        } catch (SQLException ex) {
            
        }
       
       
    }                                        

    
    //delete a row in table
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
              
    }                                        

    
    //select a row in table
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        DefaultTableModel model = ( DefaultTableModel) Table.getModel();
          int row=Table.getSelectedRow();
            String name = (String) model.getValueAt(row,0);
              String category = (String) model.getValueAt(row,1);
                String price = model.getValueAt(row,2).toString();
                  String quantity = model.getValueAt(row,3).toString();
                   String thquantity = model.getValueAt(row,4).toString();
                    
                    nm.setText(name);
                    ct.setText(category);
                    pc.setText(price);
                    qt.setText(quantity);
                    tq.setText(thquantity);
                                    
    }                                        

    
    //update the table
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
            
             nm.setText("");
              ct.setText("");
              pc.setText("");
              qt.setText("");
              tq.setText("");
              
            prst.close();
        } catch (SQLException ex) {
            
        }
        
    }                                        

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            // TODO add your handling code here:
            dispose();
            new Form().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
    }                                      

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
         DefaultTableModel model = ( DefaultTableModel) Table.getModel();
          int rw=Table.getSelectedRow();
            String sname = (String) model.getValueAt(rw,0);
              String scag = (String) model.getValueAt(rw,1);
                String sprice = model.getValueAt(rw,2).toString();
                  String squantity = model.getValueAt(rw,3).toString();
                   String sthq = model.getValueAt(rw,4).toString();
                   
      DefaultCategoryDataset dcd = new DefaultCategoryDataset();
           
            dcd.setValue(new Float(sprice),"Values", "price");
              dcd.setValue(new Float(squantity),"Values", "quantity");
                dcd.setValue(new Float(sthq),"Values", "threshold_quantity");
                           

                 JFreeChart chart= ChartFactory.createBarChart3D(sname, "details", "Values", dcd, PlotOrientation.VERTICAL, false, true, false);
               chart.getTitle().setPaint(Color.RED);
               CategoryPlot p=chart.getCategoryPlot();
               p.setRangeGridlinePaint(Color.BLUE);
               ChartFrame fr=new ChartFrame("item details",chart);
               fr.setVisible(true);
               fr.setSize(500,500);
        
       
       
    }                                        

    private void nmActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void valueActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void sortActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void sbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
          DefaultTableModel tableModel = ( DefaultTableModel) Table.getModel();
        try {
         
            
           tableModel.setRowCount(0);
            String sh=subs.getText();
            String sva=sval.getText();
            
            
            String qy2="Select * from user where "+srch+" = ? and username = ? and "+sh+" =?";
            PreparedStatement r = conn.prepareStatement(qy2);
            r.setString(1, v);
            r.setString(2, nam);
            r.setString(3,sva);
            
            ResultSet rt = r.executeQuery();
            
             while(rt.next()) {
                String name = rt.getString("name");
                String category= rt.getString("category");
                float price  = rt.getFloat("price");
                int quantity=rt.getInt("quantity");
                int thquantity=rt.getInt("threshold_quantity");
                
               tableModel.addRow(new Object[] {name, category, price, quantity, thquantity });
            }
             
             
            
             subs.setText("");
             sval.setText("");
              r.close();
            
        } catch (SQLException ex) {
            
        }
        
                                            

    
        
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
          DefaultTableModel model = ( DefaultTableModel) Table.getModel();
          int rw=Table.getSelectedRow();
            String sname = (String) model.getValueAt(rw,0);
              String scag = (String) model.getValueAt(rw,1);
                String sprice = model.getValueAt(rw,2).toString();
                  String squantity = model.getValueAt(rw,3).toString();
                   String sthq = model.getValueAt(rw,4).toString();
                   
      DefaultPieDataset dcd = new DefaultPieDataset();
      
       dcd.setValue("price",new Float(sprice));
              dcd.setValue("quantity",new Float(squantity));
                dcd.setValue("threshold_quantity",new Float(sthq));
                           

                 JFreeChart chart= ChartFactory.createPieChart3D(sname,dcd,true, true,true);
               ChartFrame fr=new ChartFrame("item details",chart);
               fr.setVisible(true);
               fr.setSize(500,500);
    }                                        
  

    
    // Variables declaration - do not modify                     
    private javax.swing.JTable Table;
    private javax.swing.JTextField ct;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField nm;
    private javax.swing.JTextField pc;
    private javax.swing.JLabel pnm;
    private javax.swing.JTextField qt;
    private javax.swing.JButton refresh;
    private javax.swing.JButton sbutton;
    private javax.swing.JTextField search;
    private javax.swing.JTextField sort;
    private javax.swing.JTextField subs;
    private javax.swing.JTextField sval;
    private javax.swing.JTextField tq;
    private javax.swing.JTextField value;
    // End of variables declaration                   
}
