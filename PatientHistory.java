package Patient_History;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import LogIn.LoginForm;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import orderForm.OrderForm;


/**
 *
 * @author ADMIN
 */
public class PatientHistory extends javax.swing.JFrame {
    

   Connection con = null;
    PreparedStatement pat = null;
    ResultSet rs = null;
    
    public PatientHistory() {
        initComponents();
         setSize(1920,1080);
       setLocation(0,0);
        setResizable(false);
        showTableData();
        loadcombo();
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
        label4 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        PatientID = new javax.swing.JLabel();
        Pid = new javax.swing.JTextField();
        FullName = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        TreatmentType = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        treatmentType = new javax.swing.JComboBox();
        Progression = new javax.swing.JLabel();
        progression = new javax.swing.JTextField();
        LastDateVisited = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        RESET1 = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        issue = new javax.swing.JTextField();
        bloodGroup = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        report = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lastDate = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        Viewfield = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(new java.awt.Color(0, 102, 0));
        label4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label4.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("HAPPY SMILE DENTAL CLINIC");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(0, 102, 0));
        label3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label3.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("HAPPY SMILE DENTAL CLINIC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(982, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1920, 70);

        PatientID.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        PatientID.setText("Patient Id");
        jPanel1.add(PatientID);
        PatientID.setBounds(30, 400, 73, 23);
        jPanel1.add(Pid);
        Pid.setBounds(180, 400, 180, 30);

        FullName.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        FullName.setText("Full Name");
        jPanel1.add(FullName);
        FullName.setBounds(390, 400, 75, 23);

        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });
        jPanel1.add(fullname);
        fullname.setBounds(510, 400, 230, 30);

        Gender.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Gender.setText("Gender");
        jPanel1.add(Gender);
        Gender.setBounds(30, 460, 55, 23);

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        male.setText("Male");
        male.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maleMouseClicked(evt);
            }
        });
        jPanel1.add(male);
        male.setBounds(180, 460, 70, 25);

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        female.setText("Female");
        female.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                femaleMouseClicked(evt);
            }
        });
        jPanel1.add(female);
        female.setBounds(270, 460, 90, 25);

        TreatmentType.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        TreatmentType.setText("Treatment Type");
        jPanel1.add(TreatmentType);
        TreatmentType.setBounds(30, 540, 120, 23);

        search.setBackground(new java.awt.Color(0, 102, 51));
        search.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(0, 102, 51));
        search.setText("SEARCH");
        search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(470, 90, 70, 30);

        treatmentType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Root filling", "Surgical removal", "Crown", "Bridge" }));
        treatmentType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treatmentTypeActionPerformed(evt);
            }
        });
        jPanel1.add(treatmentType);
        treatmentType.setBounds(180, 530, 180, 30);

        Progression.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Progression.setText("Progression");
        jPanel1.add(Progression);
        Progression.setBounds(390, 620, 110, 30);
        jPanel1.add(progression);
        progression.setBounds(510, 610, 240, 110);

        LastDateVisited.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LastDateVisited.setText("Last edit visited");
        jPanel1.add(LastDateVisited);
        LastDateVisited.setBounds(30, 620, 120, 30);

        ADD.setBackground(new java.awt.Color(0, 102, 51));
        ADD.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/butttonAdd.png"))); // NOI18N
        ADD.setText("ADD");
        ADD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ADD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD);
        ADD.setBounds(40, 980, 130, 40);

        DELETE.setBackground(new java.awt.Color(0, 102, 51));
        DELETE.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        DELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        DELETE.setText("DELETE");
        DELETE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        jPanel1.add(DELETE);
        DELETE.setBounds(220, 980, 140, 40);

        UPDATE.setBackground(new java.awt.Color(0, 102, 51));
        UPDATE.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        UPDATE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel1.add(UPDATE);
        UPDATE.setBounds(410, 980, 130, 40);

        RESET1.setBackground(new java.awt.Color(0, 102, 51));
        RESET1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        RESET1.setText("DEMO");
        RESET1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RESET1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESET1ActionPerformed(evt);
            }
        });
        jPanel1.add(RESET1);
        RESET1.setBounds(820, 980, 130, 40);

        RESET.setBackground(new java.awt.Color(0, 102, 51));
        RESET.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        RESET.setText("RESET");
        RESET.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });
        jPanel1.add(RESET);
        RESET.setBounds(590, 980, 130, 40);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Blood Group");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(390, 540, 120, 20);

        jTable1.setBackground(new java.awt.Color(204, 255, 153));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 710, 170);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Issue");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(390, 460, 38, 23);
        jPanel1.add(issue);
        issue.setBounds(510, 460, 230, 50);

        bloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        jPanel1.add(bloodGroup);
        bloodGroup.setBounds(510, 540, 230, 30);

        jLabel3.setBackground(new java.awt.Color(0, 102, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("PATIENT HISTORY");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1190, 110, 380, 80);

        report.setBackground(new java.awt.Color(0, 102, 51));
        report.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/report.png"))); // NOI18N
        report.setText("REPORT");
        report.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        jPanel1.add(report);
        report.setBounds(1720, 680, 130, 40);

        jButton2.setBackground(new java.awt.Color(0, 102, 51));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jButton2.setText("VIEW");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(810, 680, 100, 40);

        jComboBox1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 102, 51));
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(180, 90, 260, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("SEARCH BY NAME");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 90, 120, 30);

        jButton3.setBackground(new java.awt.Color(0, 102, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        jButton3.setText("LOG OUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1770, 70, 150, 40);
        jPanel1.add(lastDate);
        lastDate.setBounds(180, 620, 180, 40);

        Viewfield.setColumns(20);
        Viewfield.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Viewfield.setRows(5);
        jScrollPane2.setViewportView(Viewfield);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(810, 200, 1040, 470);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg3.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 153, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(0, 102, 51), new java.awt.Color(0, 153, 51)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 330, 770, 750);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg3.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 0), new java.awt.Color(51, 153, 0), new java.awt.Color(0, 204, 51), new java.awt.Color(0, 102, 51)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 70, 770, 260);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg3.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 0), new java.awt.Color(51, 102, 0), new java.awt.Color(0, 204, 0), new java.awt.Color(0, 153, 51)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(770, 50, 1150, 1030);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg3.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(630, 40, 640, 1030);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1938, 1127));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
    String name = fullname.getText();         
                          
        if(fullname.getText().isEmpty()||issue.getText().isEmpty()||progression.getText().isEmpty()||lastDate.getDate()==null||buttonGroup1.isSelected(null)){
               JOptionPane.showMessageDialog(null, "Fields cannot be Empty");
             
               
          }
         else if((!name.matches("^[a-zA-Z]+$")))
        JOptionPane.showMessageDialog(null,"AVOID USING NUMBERS FOR NAME AND SPECIALITY FIELDS");
        else{
        try{    
        String sql = "INSERT INTO patient_history"
               +"(Name,gender, Issue,TreatmentType,Progression,LastDateVisited,bloodGroup)"
        + " VALUES (?,?,?,?,?,?,?)";
        con = DriverManager.getConnection("jdbc:mysql://localhost/HappySmile","root","");
           pat = con.prepareStatement(sql);
            pat.setString(1,fullname.getText());
            pat.setString(2,gender);
            pat.setString(3,issue.getText());
            pat.setString(4,treatmentType.getSelectedItem().toString());
             pat.setString(5,progression.getText());
            pat.setString(6,lastDate.getDate().toString());
            pat.setString(7,bloodGroup.getSelectedItem().toString());
            //pat.setDate(6,convertUtilDateToSqlDate(lastDate.getDate()));
        
                   pat.executeUpdate();
                   JOptionPane.showMessageDialog(null, "Inserted Successfully");
                   clearFeild();
        }
        catch(SQLException | HeadlessException ex){
             JOptionPane.showMessageDialog(null, ex);
        
    }
           showTableData();
        }  
    }//GEN-LAST:event_ADDActionPerformed

    private void maleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maleMouseClicked
       gender = "Male";
    }//GEN-LAST:event_maleMouseClicked

    private void femaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femaleMouseClicked
        gender = "Female";
    }//GEN-LAST:event_femaleMouseClicked

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        if(Pid.getText().isEmpty()){
            
             JOptionPane.showMessageDialog(null, "Enter Pid to Delete ");
        }       
        else{
        
        int YesOrNo =  JOptionPane.showConfirmDialog(null,"do you want to Delete?","",JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0){
           
        try{ 
            
        
        String sql = "DELETE FROM patient_history WHERE Pid = ? ";
        con = DriverManager.getConnection("jdbc:mysql://localhost/HappySmile","root","");
           pat = con.prepareStatement(sql);
            pat.setString(1,Pid.getText());
           
                   pat.executeUpdate();
                   JOptionPane.showMessageDialog(null, "Deleted Successfully");
        }
        catch(SQLException | HeadlessException ex){
             JOptionPane.showMessageDialog(null, ex);
        
    }
         showTableData();
    }//GEN-LAST:event_DELETEActionPerformed
    }
    }
    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
              String name = fullname.getText();
          if(fullname.getText().isEmpty()||issue.getText().isEmpty()||progression.getText().isEmpty()||lastDate.getDate()==null||buttonGroup1.isSelected(null)){
               JOptionPane.showMessageDialog(null, "Fields cannot be Empty");
           
           }
          else if(Pid.getText().isEmpty()){
            
             JOptionPane.showMessageDialog(null, "Enter Pid to update ");
        }       
           else if((!name.matches("^[a-zA-Z]+$")))
        JOptionPane.showMessageDialog(null,"AVOID USING NUMBERS FOR NAME AND SPECIALITY FIELDS");
        
           else{
        int YesOrNo =  JOptionPane.showConfirmDialog(null,"do you want to Update?","Update",JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0){
        
        try{    
        String sql = "UPDATE patient_history SET Name = ?,gender = ?,Issue = ?, TreatmentType = ?, Progression = ?, LastDateVisited = ?, bloodGroup = ? WHERE Pid = ? ";
        con = DriverManager.getConnection("jdbc:mysql://localhost/HappySmile","root","");
           pat = con.prepareStatement(sql);
            pat.setString(8,Pid.getText());
            pat.setString(1,fullname.getText());
            pat.setString(2,gender);
            pat.setString(3,issue.getText());
            pat.setString(4,treatmentType.getSelectedItem().toString());
             pat.setString(5,progression.getText());
             pat.setString(6,lastDate.getDate().toString());
              pat.setString(7,bloodGroup.getSelectedItem().toString());
            
        
                   pat.executeUpdate();
                   JOptionPane.showMessageDialog(null, "Updated Successfully");
        }
        catch(SQLException | HeadlessException ex){
             JOptionPane.showMessageDialog(null, ex);
        
        }
         showTableData();
        }
           }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
         clearFeild();
    }//GEN-LAST:event_RESETActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int i = jTable1.getSelectedRow();
       TableModel model = jTable1.getModel();
      
       fullname.setText(model.getValueAt(i,1).toString());
       String gender = model.getValueAt(i,2).toString();
            if(gender.equals("Male")){
                male.setSelected(true);
            }
            else{
            female.setSelected(true);
            }
        issue.setText(model.getValueAt(i,3).toString());
        String treatmenttype = model.getValueAt(i, 4).toString();
        switch (treatmenttype){
            case "Root filling":
                treatmentType.setSelectedIndex(0);
                break;
         case "Surgical removal":
                treatmentType.setSelectedIndex(1);
                break;
         case "Crown":
                treatmentType.setSelectedIndex(2);
                break;
         case "Bridge":
                treatmentType.setSelectedIndex(3);
                break;
        }
        progression.setText(model.getValueAt(i,5).toString());
        String lastDate = model.getValueAt(i,6).toString();
         String BloodGroup = model.getValueAt(i, 7).toString();
        switch (BloodGroup){
         case "O+":
                bloodGroup.setSelectedIndex(0);
                break;
         case "O-":
                bloodGroup.setSelectedIndex(1);
                break;
         case "A+":
                bloodGroup.setSelectedIndex(2);
                break;
         case "A-":
                bloodGroup.setSelectedIndex(3);
                break;
         case "B+":
                bloodGroup.setSelectedIndex(4);
                break;
         case "B-":
                bloodGroup.setSelectedIndex(5);
                break;
         case "AB+":
                bloodGroup.setSelectedIndex(6);
                break;
         case "AB-":
                bloodGroup.setSelectedIndex(7);
                break;
           
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        Viewfield.setText("*******************************************PATIENT HISTORY***************************************\n");
        Viewfield.setText(Viewfield.getText()+"Patient ID : " + model.getValueAt(i, 0).toString()+"\n");
        Viewfield.setText(Viewfield.getText()+"Patient Name : " + model.getValueAt(i, 1).toString()+"\n");
        Viewfield.setText(Viewfield.getText()+"Gender : " + model.getValueAt(i, 2).toString()+"\n");
        Viewfield.setText(Viewfield.getText()+"Issue : " + model.getValueAt(i, 3).toString()+"\n");
        Viewfield.setText(Viewfield.getText()+"Treatment Type : " + model.getValueAt(i, 4).toString()+"\n");
        Viewfield.setText(Viewfield.getText()+"Progression : "  + model.getValueAt(i, 5).toString()+"\n");
        Viewfield.setText(Viewfield.getText()+"Last Date Visited : " + model.getValueAt(i, 6).toString()+"\n");
     
        
        }catch(Exception ex){
            
        }
                  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
            Object sel1 = jComboBox1.getSelectedItem();
                String selitem = sel1.toString();
                String com = jComboBox1.getSelectedItem().toString();
          
                try{
           con = DriverManager.getConnection("jdbc:mysql://localhost/HappySmile","root","");
           
            String sql2 = "SELECT * FROM patient_history WHERE name LIKE '"+jComboBox1.getSelectedItem()+"%'";
            pat = con.prepareStatement(sql2);
            rs=pat.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
             if(jTable1.getModel().getRowCount()<=0)
                    fullname.setText(com);
                    showTableData();
            
                }
                 catch(Exception ex){
                     JOptionPane.showMessageDialog(null, ex);
                 
           }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       int op = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO SIGN OUT?", "SIGN OUT", JOptionPane.YES_NO_OPTION);
        if(op==0){
        LoginForm l2 = new LoginForm();
        l2.setVisible(true);
        this.setVisible(false);}    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void treatmentTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treatmentTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_treatmentTypeActionPerformed

    private void RESET1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESET1ActionPerformed
        // TODO add your handling code here:
      Calendar cur = Calendar.getInstance();
        Date sqldate = new Date((cur.getTime()).getTime());
      fullname.setText("aravin");
      issue.setText("Toothache");
      progression.setText("Nothing");
      treatmentType.setSelectedIndex(1);
      lastDate.setDate(sqldate);
    }//GEN-LAST:event_RESET1ActionPerformed

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed

       try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/HappySmile","root","");
           
           JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\ADMIN\\Desktop\\Aravin ITP\\Happy_Smile_Dental_Clinic\\Happy_Smile_Dental_Clinic\\src\\Patient_History\\patientHistory.jrxml");
           String query = "SELECT * FROM patient_history ";
           String path = "C:\\Users\\ADMIN\\Desktop\\Aravin ITP\\Happy_Smile_Dental_Clinic\\Happy_Smile_Dental_Clinic\\src\\Patient_History\\patientHistory.jrxml";
//           JRDesignQuery updateQuery = new  JRDesignQuery();
//           
//           updateQuery.setText(query);
//           
//           jdesign.setQuery(updateQuery);
           
           HashMap parameter = new HashMap();
           parameter.put("IDP", Pid.getText());
           
           JasperReport jreport = JasperCompileManager.compileReport(path);
           
           JasperPrint jprint = JasperFillManager.fillReport(jreport, parameter, con);
           
           
           JasperViewer.viewReport(jprint,false);
           
           
           
           
           
       } catch (SQLException ex) {
           Logger.getLogger(PatientHistory.class.getName()).log(Level.SEVERE, null, ex);
       } catch (JRException ex) {
           Logger.getLogger(PatientHistory.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(PatientHistory.class.getName()).log(Level.SEVERE, null, ex);
       } 
    }//GEN-LAST:event_reportActionPerformed
    
     public void showTableData(){
    
     try{    
    
        con = DriverManager.getConnection("jdbc:mysql://localhost/HappySmile","root","");
        String sql = "SELECT * FROM patient_history";
          pat = con.prepareStatement(sql);
          rs = pat.executeQuery();
          jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    }
      catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex);
    }
  }
  public void clearFeild(){
       Pid.setText(null);
      fullname.setText(null);
      issue.setText(null);
      progression.setText(null);
      treatmentType.setSelectedIndex(0);
      lastDate.setDate(null);
      
  }
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
            java.util.logging.Logger.getLogger(PatientHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientHistory().setVisible(true);
            }
        });
    }
    
        public void loadcombo(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/happysmile","root","");
           String sql = "SELECT Name FROM patient_registration";
           pat = con.prepareStatement(sql);
           rs = pat.executeQuery();
            while(rs.next()){
                jComboBox1.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton DELETE;
    private javax.swing.JLabel FullName;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel LastDateVisited;
    private javax.swing.JLabel PatientID;
    private javax.swing.JTextField Pid;
    private javax.swing.JLabel Progression;
    private javax.swing.JButton RESET;
    private javax.swing.JButton RESET1;
    private javax.swing.JLabel TreatmentType;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextArea Viewfield;
    private javax.swing.JComboBox bloodGroup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fullname;
    private javax.swing.JTextField issue;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private com.toedter.calendar.JDateChooser lastDate;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField progression;
    private javax.swing.JButton report;
    private javax.swing.JButton search;
    private javax.swing.JComboBox treatmentType;
    // End of variables declaration//GEN-END:variables

private String gender="";
}
