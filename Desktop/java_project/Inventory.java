
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
        category = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        thquantity = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
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
        price = new javax.swing.JTextField();
        Alert = new javax.swing.JButton();

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

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
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

        Alert.setText("Alert");
        Alert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlertActionPerformed(evt);
            }
        });

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
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subs, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(thquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(refresh)
                                .addGap(118, 118, 118)
                                .addComponent(Alert))
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
                    .addComponent(jButton8)
                    .addComponent(Alert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(thquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                String nm = result.getString("name");
                String ct= result.getString("category");
                float pc  = result.getFloat("price");
                int qt=result.getInt("quantity");
                int thqt=result.getInt("threshold_quantity");
                
               tableModel.addRow(new Object[] {nm, ct, pc, qt, thqt });
               
              
            }
            
            pnm.setText(nam);
            
            
            preStat.close();
            
        } catch (Exception ex) {
           ex.getStackTrace();
        }
   
    }                                       

    
    //insert into the table
    private void insertActionPerformed(java.awt.event.ActionEvent evt) {                                       

          if(name.getText().equals("") || category.getText().equals("") || price.getText().equals("") || quantity.getText().equals("") || thquantity.getText().equals("")){
            JOptionPane.showMessageDialog(null, "One or more fields empty", "Unable to Add",JOptionPane.ERROR_MESSAGE);
       }
          else{
        try {
            String n=name.getText();
            String c=category.getText();
            float p=Float.parseFloat(price.getText());
            int q=Integer.parseInt(quantity.getText());
            int t=Integer.parseInt(thquantity.getText());
            
            
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
              
              name.setText("");
              category.setText("");
              price.setText("");
              quantity.setText("");
              thquantity.setText("");
              
        } catch (SQLException ex) {
            
        }}
    }                                      

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    //searching into the table
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        DefaultTableModel tableModel = ( DefaultTableModel) Table.getModel();
        
        if(search.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Search field empty", "Unable to Search",JOptionPane.ERROR_MESSAGE);
        }
        else if(value.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Value field empty", "Unable to Search",JOptionPane.ERROR_MESSAGE);
        }
        else{
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
                String nm = rt.getString("name");
                String ct= rt.getString("category");
                float pc  = rt.getFloat("price");
                int qt=rt.getInt("quantity");
                int thqt=rt.getInt("threshold_quantity");
                
               tableModel.addRow(new Object[] {nm, ct, pc, qt, thqt });
            }
             
             
            
             search.setText("");
             value.setText("");
              pr.close();
            
        } catch (SQLException ex) {
            
        }
        } 
    }                                        

    
    //sorting the table
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        if(sort.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Sort field empty", "Unable to Sort",JOptionPane.ERROR_MESSAGE);
        }
        else{
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
                String nm = rs.getString("name");
                String ct= rs.getString("category");
                float pc  = rs.getFloat("price");
                int qt=rs.getInt("quantity");
                int thqt=rs.getInt("threshold_quantity");
                
                tableModel.addRow(new Object[] {nm, ct, pc, qt, thqt });
            }
            
            sort.setText("");
            
        } catch (SQLException ex) {
            
        }
        }
       
    }                                        

    
    //delete a row in table
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            // TODO add your handling code here:
            
           int row=Table.getSelectedRow();
            String name = (String) Table.getValueAt(row,0);
            
           // if(row==0){
             //    JOptionPane.showMessageDialog(null, "Select which row to delete", "Unable to delete",JOptionPane.ERROR_MESSAGE);
            //}
           // else{
            String qry="DELETE FROM user where name=?";
            PreparedStatement ps = conn.prepareStatement(qry);
            ps.setString(1,name);
              ps.executeUpdate();
              
              refresh.doClick();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select which row to delete", "Unable to delete",JOptionPane.ERROR_MESSAGE);
        }
              
    }                                        

    
    //select a row in table
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
          try{int row=Table.getSelectedRow();
            String nm = (String) model.getValueAt(row,0);
              String ct = (String) model.getValueAt(row,1);
                String pc = model.getValueAt(row,2).toString();
                  String qt = model.getValueAt(row,3).toString();
                   String thqt = model.getValueAt(row,4).toString();
                    
                    name.setText(nm);
                    category.setText(ct);
                    price.setText(pc);
                    quantity.setText(qt);
                    thquantity.setText(thqt);
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Select which row to edit", "Unable to delete",JOptionPane.ERROR_MESSAGE);
          }  
                                    
    }                                        

    
    //update the table
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       if(name.getText().equals("") || category.getText().equals("") || price.getText().equals("") || quantity.getText().equals("") || thquantity.getText().equals("")){
            JOptionPane.showMessageDialog(null, "One or more fields empty", "Unable to Update",JOptionPane.ERROR_MESSAGE);
       }
       else{
        try {
            
            String qry5= "update user set category=?, price=?, quantity=?, threshold_quantity=? where name=?";
            
            PreparedStatement prst= conn.prepareStatement(qry5);
            
            prst.setString(5, name.getText());
            prst.setString(1, category.getText());
            prst.setFloat(2, Float.parseFloat(price.getText()));
            prst.setInt(3, Integer.parseInt(quantity.getText()));
            prst.setInt(4,Integer.parseInt(thquantity.getText()));
            
            prst.executeUpdate();
            
            refresh.doClick();
            
             name.setText("");
              category.setText("");
              price.setText("");
              quantity.setText("");
              thquantity.setText("");
              
            prst.close();
        } catch (SQLException ex) {
            
        }
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
        try{  int rw=Table.getSelectedRow();
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
               fr.setSize(500,500);}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select whose bar chart to show", "Unable to delete",JOptionPane.ERROR_MESSAGE);
        }
        
       
       
    }                                        

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {                                     
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
         if(subs.getText().equals("")){
            JOptionPane.showMessageDialog(null, "SubSearch field empty", "Unable to Search",JOptionPane.ERROR_MESSAGE);
        }
        else if(sval.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Value field empty", "Unable to Search",JOptionPane.ERROR_MESSAGE);
        }
        else{
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
                String nm = rt.getString("name");
                String ct= rt.getString("category");
                float pc = rt.getFloat("price");
                int qt=rt.getInt("quantity");
                int tqt=rt.getInt("threshold_quantity");
                
               tableModel.addRow(new Object[] {nm, ct, pc, qt, tqt });
            }
             
             
            
             subs.setText("");
             sval.setText("");
              r.close();
            
        } catch (SQLException ex) {
            
        }
        
                                            

    
        }   
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
          DefaultTableModel model = ( DefaultTableModel) Table.getModel();
        try{  int rw=Table.getSelectedRow();
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
               fr.setSize(500,500);}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Select whose pie chart to show", "Unable to delete",JOptionPane.ERROR_MESSAGE);
        }
    }                                        

    private void AlertActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
         DefaultTableModel tableModel = ( DefaultTableModel) Table.getModel();
          
        
         
        try {                                        
            
            tableModel.setRowCount(0);
           
            String query2 = "SELECT * FROM user where username = ?";
           
            PreparedStatement preStat = conn.prepareStatement(query2);
            preStat.setString(1, nam);
            ResultSet result = preStat.executeQuery();
            
            while(result.next()) {
                
                String nm = result.getString("name");
                String ct= result.getString("category");
                float pc  = result.getFloat("price");
                int qt=result.getInt("quantity");
                int thqt=result.getInt("threshold_quantity");
                
                   if(qt<=thqt){
                    JOptionPane.showMessageDialog(null, nm+" is at or below its threshold quantity", "Alert",JOptionPane.ERROR_MESSAGE);
    
                
               tableModel.addRow(new Object[] {nm, ct, pc, qt, thqt });}
              
            }
            
            
            
            
            preStat.close();
            
        } catch (Exception ex) {
           ex.getStackTrace();
        }
        
    }                                     
  

    
    // Variables declaration - do not modify                     
    private javax.swing.JButton Alert;
    private javax.swing.JTable Table;
    private javax.swing.JTextField category;
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
    private javax.swing.JTextField name;
    private javax.swing.JLabel pnm;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton refresh;
    private javax.swing.JButton sbutton;
    private javax.swing.JTextField search;
    private javax.swing.JTextField sort;
    private javax.swing.JTextField subs;
    private javax.swing.JTextField sval;
    private javax.swing.JTextField thquantity;
    private javax.swing.JTextField value;
    // End of variables declaration                   
}
