
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
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
        
           // center the form
       this.setLocationRelativeTo(null);
        
         // create a yellow border for the jpanel_title
        // 0 border in the top
        Border jpanel_inventory = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
        // set the border to the jPanel_title
        jPanel_inventory.setBorder(jpanel_inventory);
        
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
        jLabel3 = new javax.swing.JLabel();
        pnm = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        name = new javax.swing.JTextField();
        category = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        thquantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        value = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        subs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sval = new javax.swing.JTextField();
        sbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sort = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel_inventory = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        Alert = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "category", "price", "quantity", "threshold_quantity"
            }
        ));
        jScrollPane1.setViewportView(Table);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Search by");

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Value");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Sub Search by");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Value");

        sbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sbutton.setForeground(new java.awt.Color(0, 0, 204));
        sbutton.setText("Sub search");
        sbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbuttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Sort by");

        sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setText("Sort");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(155, 155, 155));

        jPanel_inventory.setBackground(new java.awt.Color(0, 240, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Inventry");

        javax.swing.GroupLayout jPanel_inventoryLayout = new javax.swing.GroupLayout(jPanel_inventory);
        jPanel_inventory.setLayout(jPanel_inventoryLayout);
        jPanel_inventoryLayout.setHorizontalGroup(
            jPanel_inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_inventoryLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel7)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel_inventoryLayout.setVerticalGroup(
            jPanel_inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_inventoryLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jPanel_inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel_inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("item-name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("category");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("price");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("quantity");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("threshold_quantity");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(thquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel4)))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(subs, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jButton3))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(jLabel6))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sval, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(sbutton)))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel9)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel10)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel11)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel12)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(subs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(sval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 667, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 0, 204));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refresh.setForeground(new java.awt.Color(0, 0, 204));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        Alert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Alert.setForeground(new java.awt.Color(0, 0, 204));
        Alert.setText("Alert");
        Alert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlertActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Pie chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 204));
        jButton8.setText("Bar graph");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 204));
        jButton7.setText("Edit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 204));
        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insert.setForeground(new java.awt.Color(0, 0, 204));
        insert.setText("Add");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pnm)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(refresh)
                                    .addComponent(logout))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Alert)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jButton8)
                                    .addComponent(jButton6))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(insert))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(logout)
                .addGap(59, 59, 59)
                .addComponent(refresh)
                .addGap(18, 18, 18)
                .addComponent(Alert)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(jButton8)
                .addGap(35, 35, 35)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(insert)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
               fr.setSize(500,500);
        }
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_inventory;
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
