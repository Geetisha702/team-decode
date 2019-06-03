import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Issue_details.java
 *
 * Created on May 30, 2019, 3:10:03 PM
 */

/**
 *
 * @author vaio
 */
public class Issue_details extends javax.swing.JFrame {

    /** Creates new form Issue_details */
    public Issue_details() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgcat = new javax.swing.ButtonGroup();
        txtcat = new javax.swing.JLabel();
        rbstut = new javax.swing.JRadioButton();
        rbfact = new javax.swing.JRadioButton();
        txtmemno = new javax.swing.JLabel();
        lbbookname = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        txtbook_name = new javax.swing.JTextField();
        txtauthor = new javax.swing.JTextField();
        butsearch = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtavail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtreturn = new javax.swing.JTextField();
        butcheck = new javax.swing.JButton();
        butissue = new javax.swing.JButton();
        butclear = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtcat.setText("  Category");

        bgcat.add(rbstut);
        rbstut.setText("Stutdent");

        bgcat.add(rbfact);
        rbfact.setText("Faculty");

        txtmemno.setText(" Membership no");

        lbbookname.setText("Book Name");

        lbname.setText("Author Name");

        txtauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtauthorActionPerformed(evt);
            }
        });

        butsearch.setText("Search Book ");
        butsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsearchActionPerformed(evt);
            }
        });

        jLabel5.setText("No of books available ");

        txtavail.setEnabled(false);
        txtavail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtavailActionPerformed(evt);
            }
        });

        jLabel6.setText("  Book id");

        txtid.setEnabled(false);

        jLabel7.setText("Date of issue");

        txtdate.setEnabled(false);

        jLabel8.setText("Return date");

        txtreturn.setEnabled(false);

        butcheck.setText("Check Date");
        butcheck.setEnabled(false);
        butcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butcheckActionPerformed(evt);
            }
        });

        butissue.setText("Issue");
        butissue.setEnabled(false);
        butissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butissueActionPerformed(evt);
            }
        });

        butclear.setText("Clear");
        butclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butclearActionPerformed(evt);
            }
        });

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Home Page");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(butissue)
                .addContainerGap(678, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(637, Short.MAX_VALUE)
                .addComponent(butclear)
                .addGap(29, 29, 29)
                .addComponent(jButton6)
                .addGap(33, 33, 33)
                .addComponent(jButton5)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbbookname)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmemno)
                            .addComponent(jLabel5)
                            .addComponent(lbname)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbstut)
                                        .addGap(138, 138, 138)
                                        .addComponent(rbfact))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtbook_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                        .addComponent(txtno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                        .addComponent(txtauthor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtavail, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(butsearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGap(341, 341, 341))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtreturn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                .addGap(41, 41, 41)
                                .addComponent(butcheck)
                                .addGap(406, 406, 406))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbstut)
                        .addComponent(rbfact))
                    .addComponent(txtcat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmemno)
                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbbookname)
                    .addComponent(txtbook_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbname)
                    .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(butsearch)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtavail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butcheck)
                            .addComponent(jLabel7))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtreturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(butissue)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butclear)
                            .addComponent(jButton6)
                            .addComponent(jButton5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtauthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtauthorActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtauthorActionPerformed

    private void txtavailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtavailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtavailActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void butsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsearchActionPerformed
String book,author;
int quantity;
book = txtbook_name.getText();
author = txtauthor.getText();
try
{
    Class.forName("java.sql.DriverManager");
    Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_mang","root","admin");
    Statement stmt = (Statement)con.createStatement();
    String query = "Select Book_id,Quantity from books_detail where Book_name = '"+book+"' and Author_name = '"+author+"';";
   ResultSet rs = stmt.executeQuery(query);
   if(rs.next())
   {
       String book_id = rs.getString("book_id");
       quantity = rs.getInt("quantity");
       txtid.setText(book_id);
       txtavail.setText(Integer.toString(quantity));
   }
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(this,e.getMessage());
}
quantity = Integer.parseInt(txtavail.getText());
if(quantity == 0)
       {
           JOptionPane.showMessageDialog(this,"Book not available now.");
       }
       else
       {
           txtavail.setEnabled(true);
           txtavail.setEditable(true);
           txtdate.setEnabled(true);
           butcheck.setEnabled(true);
       }


        // TODO add your handling code here:
}//GEN-LAST:event_butsearchActionPerformed

    private void butissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butissueActionPerformed
int member_no = Integer.parseInt(txtno.getText());
String book_id,issue_date,return_date;
book_id = txtid.getText();
issue_date = txtdate.getText();
return_date = txtreturn.getText();
try
{
    Class.forName("java.sql.DriverManager");
    Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_mang","root","admin");
    Statement stmt = (Statement)con.createStatement();
    String query = "Insert into issue_details values('"+book_id+"','"+member_no+"','"+issue_date+"','"+return_date+"');";
    JOptionPane.showMessageDialog(this,"Book issued to Member : ".concat(Integer.toString(member_no)).concat("\nreturn date is : ")
            .concat(return_date));
    String query1 = "Update book_details set quantity = quantity - 1 where book_id = '"+book_id+"';";
    stmt.executeUpdate(query);
    stmt.executeUpdate(query1);
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(this,e.getMessage());
}
        // TODO add your handling code here:
}//GEN-LAST:event_butissueActionPerformed

    private void butcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butcheckActionPerformed
String issue_date,return_date="NULL";
String book_id = txtid.getText();
issue_date = txtdate.getText();
if (issue_date.isEmpty())
  {
     JOptionPane.showMessageDialog(this,"Please enter date");
  }
else
  {
     if (issue_date.contains("__/__/____"))
       {
           JOptionPane.showMessageDialog(this,"Enter date in required format YYYY/MM/DD");
       }
     if (issue_date.contains("__/__/__"))
       {
           JOptionPane.showMessageDialog(this,"Enter date in required format YYYY/MM/DD");
       }
     if(rbstut.isSelected())
                 {
                     return_date = issue_date + 7; // for students
                 }
         else if(rbfact.isSelected())
         {
             return_date = issue_date + 14; // for teachers
         }
         txtreturn.setText(return_date);
         butissue.setEnabled(true);
         try
       {
         Class.forName("java.sql.DriverManager");
         Connection con = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost:3306/Library_mang" , "root" , "admin");
         Statement stmt = (Statement) con.createStatement();
         String query="Update issue_details set issue_date='"+issue_date+"'and return_date+'"+return_date+"' where book_id='"+book_id+"' ;";
         stmt.executeUpdate(query);
         JOptionPane.showMessageDialog(this, "The date is valid");
       }
     catch(Exception e)
       {
         JOptionPane.showMessageDialog(this, "Enter date in required format YYYY/MM/DD");
       }
   }

        // TODO add your handling code here:
    }//GEN-LAST:event_butcheckActionPerformed

    private void butclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butclearActionPerformed
txtno.setText("");
txtbook_name.setText("");
txtauthor.setText("");
txtavail.setText("");
txtid.setText("");
txtdate.setText("");
txtreturn.setText("");
bgcat.clearSelection();
txtavail.setEnabled(false);
txtavail.setEditable(false);
txtid.setEnabled(false);
butcheck.setEnabled(false);
butissue.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_butclearActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
home_page Issue_details =  new home_page();
Issue_details.setVisible(true);
this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgcat;
    private javax.swing.JButton butcheck;
    private javax.swing.JButton butclear;
    private javax.swing.JButton butissue;
    private javax.swing.JButton butsearch;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbbookname;
    private javax.swing.JLabel lbname;
    private javax.swing.JRadioButton rbfact;
    private javax.swing.JRadioButton rbstut;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtavail;
    private javax.swing.JTextField txtbook_name;
    private javax.swing.JLabel txtcat;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtid;
    private javax.swing.JLabel txtmemno;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtreturn;
    // End of variables declaration//GEN-END:variables

}