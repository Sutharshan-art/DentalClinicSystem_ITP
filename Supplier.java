/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Supplier;

import Search.Search;
import MasterForm.MasterForm;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Supplier extends javax.swing.JFrame {
    private int length;
 private String Matches;
    /**
     * Creates new form Supplier
     */
    public Supplier() {
        initComponents();
        jRadioButton3.setVisible(false);
        setSize(1370,750);
       // setLocation(450,200);
        setResizable(false);
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jFileChooser1 = new javax.swing.JFileChooser();
        textField1 = new java.awt.TextField();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        label25 = new java.awt.Label();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        textField1.setText("textField1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SID");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 170, 40, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 210, 60, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Item");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 260, 50, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 370, 80, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Supply date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 410, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Phone number");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 460, 140, 30);

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new.jpg"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(710, 630, 178, 64);

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/th (7).jpg"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 630, 170, 64);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Email");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 320, 50, 20);

        jTextField1.setBackground(new java.awt.Color(102, 255, 102));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 153, 0));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(690, 150, 300, 40);

        jTextField2.setBackground(new java.awt.Color(102, 255, 102));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 153, 0));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(690, 200, 300, 40);

        jTextField3.setBackground(new java.awt.Color(102, 255, 102));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 153, 0));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(690, 250, 300, 40);

        jTextField4.setBackground(new java.awt.Color(102, 255, 102));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 153, 0));
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(690, 300, 300, 40);

        jTextField5.setBackground(new java.awt.Color(102, 255, 102));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 153, 0));
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(690, 350, 300, 40);

        jTextField7.setBackground(new java.awt.Color(102, 255, 102));
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 153, 51));
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(690, 450, 300, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Company type");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 510, 140, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Supply method");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(390, 560, 140, 30);

        jComboBox1.setBackground(new java.awt.Color(102, 255, 102));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select-", "Short term", "Long term", "Joint", "Composite" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(700, 550, 290, 40);

        jRadioButton1.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton1.setText("Limited");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(700, 510, 110, 31);

        jRadioButton2.setBackground(new java.awt.Color(102, 255, 102));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2.setText("International");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(830, 510, 170, 31);

        jDateChooser1.setBackground(new java.awt.Color(0, 102, 0));
        jDateChooser1.setForeground(new java.awt.Color(0, 102, 0));
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDateChooser1MousePressed(evt);
            }
        });
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(690, 400, 300, 40);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(860, 520, 107, 25);

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/th (2) - Copy.jpg"))); // NOI18N
        jButton3.setText("NEXT");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1146, 630, 170, 64);

        label25.setAlignment(java.awt.Label.CENTER);
        label25.setBackground(new java.awt.Color(0, 102, 51));
        label25.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        label25.setForeground(new java.awt.Color(255, 255, 255));
        label25.setText("ADD SUPPLIER");
        getContentPane().add(label25);
        label25.setBounds(0, 0, 1359, 115);

        jLabel10.setBackground(new java.awt.Color(102, 255, 102));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg3.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 110, 650, 980);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg3.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(680, 110, 650, 970);

        setSize(new java.awt.Dimension(1394, 893));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           
            int op = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO MOVE TO PREVIOUS PAGE?", "CHANGE TO HOME PAGE", JOptionPane.YES_NO_OPTION);
        if(op==0){
       MasterForm s = new MasterForm();
        s.setVisible(true);
        this.setVisible(false);}
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        System.out.println(ch);
        if(Character.isDigit(ch)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Please give alphabetic value");
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        // TODO add your handling code here:
        char in = evt.getKeyChar();
        System.out.println(in);
        if(Character.isLetter(in)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Phone number should be numeric value");

        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
      
        if( jTextField2.getText().equals("") || jTextField3.getText().equals("")|| jTextField4.getText().equals("")||jTextField5.getText().equals("")||jTextField7.getText().equals(""));
    JOptionPane.showMessageDialog(this, "Are you enter all data !");
        //String sid = jTextField1.getText();
        String name = jTextField2.getText();
        String item = jTextField3.getText();
        String email = jTextField4.getText();
        String address = jTextField5.getText();
        java.util.Date date= jDateChooser1.getDate();
        String phone = jTextField7.getText();

        String gender ="";
        if(jRadioButton1.isSelected())
            gender="Limited";
        else if(jRadioButton2.isSelected())
            gender="International";
        String method = (String)jComboBox1.getSelectedItem();

        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
            String newdate = sf.format(date);
   
    /*         if(!(Pattern.match("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jTextField4.getText()))){
        JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "The Email is valid", "Good",JOptionPane.INFORMATION_MESSAGE);
        }
        */
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/happysmile","root","");
            PreparedStatement ps = con.prepareStatement("Insert into supplier"
                    +"(name,item, email,address,dated,phone,gender,method)"
        + " values(?,?,?,?,?,?,?,?)");
           // ps.setInt(1, Integer.parseInt(sid));
            ps.setString(1, name);
            ps.setString(2, item);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setString(5, newdate);
            ps.setString(6, phone);
            ps.setString(7, gender);
            ps.setString(8, method);

            int x = 0; x= ps.executeUpdate();
            if(x!=0)
                JOptionPane.showMessageDialog(this, "Data Inserted");
            //jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField7.setText("");
             jRadioButton3.setSelected(true);
            jDateChooser1.setDate(null);

            jComboBox1.setSelectedIndex(0);

           
               con.close();
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        catch(SQLException e){
            System.out.println(e);
        }
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
           
       
            int op = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT TO MOVE TO NEXT PAGE?", "CHANGE TO HOME PAGE", JOptionPane.YES_NO_OPTION);
        if(op==0){
       Search se = new Search();
        se.setVisible(true);
        this.setVisible(false);} 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(Color.CYAN);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
               jButton2.setBackground(Color.green);

    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
           jButton1.setBackground(Color.CYAN);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
           jButton1.setBackground(Color.green);

    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
           jButton3.setBackground(Color.CYAN);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
               jButton3.setBackground(Color.green);

    }//GEN-LAST:event_jButton3MouseExited

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
          jButton2.setBackground(Color.red);
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
         jButton1.setBackground(Color.red);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
         jButton3.setBackground(Color.red);
    }//GEN-LAST:event_jButton3MousePressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
           jTextField2.requestFocus();
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
           jTextField3.requestFocus();
      // JOptionPane.showMessageDialog(rootPane, "Avtive");
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
           jTextField4.requestFocus();
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        /* if(!(Pattern.email("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jTextField4.getText()))){
        JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "The Email is valid", "Good",JOptionPane.INFORMATION_MESSAGE);
        
        }*/
       
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
     
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String email = jTextField4.getText();

         if (!email.contains("@gmail.com")) {
                
            JOptionPane.showMessageDialog(null, "Please enter valid email address"); 

    }
    else{
                      jTextField5.requestFocus();


    }
        }
        
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jDateChooser1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MousePressed
      //if(evt.getKeyCode()==KeyEvent.VK_ENTER)
           jTextField7.requestFocus();
    }//GEN-LAST:event_jDateChooser1MousePressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
           jTextField7.requestFocus();
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        // TODO add your handling code here:
        String phone = jTextField7.getText();
        
        int length = phone.length();
        char c =  evt.getKeyChar();
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9'){
            if(length < 10){
            jTextField7.setEditable(true);
            }else{
            jTextField7.setEditable(false);
             JOptionPane.showMessageDialog(this, "Phone number contain only 10 value");
            }
        }
         
    }//GEN-LAST:event_jTextField7KeyPressed

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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JComboBox jComboBox1;
    public static com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    public javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JRadioButton jRadioButton1;
    public static javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField7;
    private java.awt.Label label25;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
