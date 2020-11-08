
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAM
 */
public class MainJFrame extends javax.swing.JFrame {
    DefaultTableModel tableModel;

    List<Student> studentList;

    private JTextField txtID;
    private JTextField txtscoreMatch;
    private JTextField txtscoreLit;

/**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        tableModel=(DefaultTableModel) tbl.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        txtID1 = new javax.swing.JTextField();
        txtScoreLit = new javax.swing.JTextField();
        txtscoreMath = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Manager");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Student's Detail Information"));

        jLabel2.setText("ID :");

        jLabel3.setText("Full Name :");

        jLabel4.setText("Age:");

        jLabel5.setText("Address :");

        jLabel6.setText("Score Match :");

        jLabel7.setText("Score Literature :");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(161, 161, 161)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtID1)
                    .addComponent(txtName)
                    .addComponent(txtAge)
                    .addComponent(txtScoreLit)
                    .addComponent(txtscoreMath)
                    .addComponent(txtAddress))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtscoreMath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtScoreLit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit)))
        );

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO", "ID", "Full Name", "Age", "Address", "Score Math", "Score Literature", "ScoreGPA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Input Student's Detail Information");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validateForm(){
        StringBuilder sb=new StringBuilder();
        Validator.isEmpty(txtID1, sb, "ID khong duoc trong");
        Validator.isEmpty(txtName, sb, "Ten khong duoc trong");
        Validator.isNumberMinMax(txtAge, sb, "Tuoi 18-35",18,35,0);
        Validator.isNumberMinMax(txtscoreMath, sb, "Diem 0-10",0,10,1);
        Validator.isNumberMinMax(txtScoreLit, sb,"Diem 0-10",0,10,1);
        if(sb.length()>0){ 
            JOptionPane.showMessageDialog(this, sb.toString());
            return false;
        }
        return true;
    }
    
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
       if(validateForm()){

           String id= txtID1.getText();
           String name=txtName.getText();
           Byte age=Byte.parseByte(txtAge.getText());
           String address=txtAddress.getText();
           Float score1=Float.parseFloat(txtscoreMath.getText());
           Float score2=Float.parseFloat(txtScoreLit.getText());
           
          
               
           Student std=new Student(id,name,age,address,score1,score2);
           studentList=Validator.read();
           if(studentList==null){
           studentList=new ArrayList<>();
           }
           for(Student students:studentList){
               if(students.getId().equals(id)){
                   JOptionPane.showMessageDialog(this,"MSV existed");
                   return;
               }
           }
          
           studentList.add(std);
           Validator.write(studentList);
           
          
           System.out.println("id= "+id+", name = "+name+", age = "+age+
                ", address= "+address+ ", Toan : "+score1+", Van: "+ score2);
           
         //  
           tableModel.addRow(new Object[] {tableModel.getRowCount()+1,
               id,name,age,address,score1,score2,std.getScoreGPA()});
           return;
       }
       
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try{
            studentList=Validator.read();
        String id1=txtID1.getText();       
        if(studentList==null){
           JOptionPane.showMessageDialog(this,"Student List is Empty");
           return;
        }
        else{
            Student student1=null;

            for(int i = 0; i < studentList.size(); i++){
               if (studentList.get(i).getId().equals(id1)) {
                student1= studentList.get(i);
                break;
                }                    
            }
            if(student1!=null){
                studentList.remove(student1);
                Validator.write(studentList);
                for(int j=0;j<=studentList.size();j++){
                    tableModel.removeRow(0);
                }
                for(Student students:studentList){
                    tableModel.addRow(new Object[] {tableModel.getRowCount()+1,
                        students.id,students.name,students.age,students.address,
                        students.getScoreMath(),students.getScoreLiter(),students.getScoreGPA()});
                }               
                return;        
            }else{
                JOptionPane.showMessageDialog(this,"Not found ID");
                return;
            }
             
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Student List is Empty");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String id2=txtID1.getText();
        studentList=Validator.read();
        if(studentList==null){
           JOptionPane.showMessageDialog(this,"Student List is Empty");
           return;
        }
        else{
            boolean check=true;
             for(Student students:studentList){
                if (students.getId().equals(id2)) {
                   check=false;
                   JOptionPane.showMessageDialog(this,students.toString());
                   break;        
                }      
            }
            if(check){
                 JOptionPane.showMessageDialog(this,"Not found ID");
                return;
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        studentList=Validator.read();
        if(studentList!=null){
            try{
                for(int j=0;j<=studentList.size();j++){
                    tableModel.removeRow(0);
                }
            }catch(Exception e){
                System.out.println("Show Table");         
            }
            
            for(Student students:studentList){
                    tableModel.addRow(new Object[] {tableModel.getRowCount()+1,
                        students.id,students.name,students.age,students.address,
                        students.getScoreMath(),students.getScoreLiter(),students.getScoreGPA()});
                }
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    if(validateForm()){
        String id3=txtID1.getText();
        studentList=Validator.read();
        if(studentList==null){
           JOptionPane.showMessageDialog(this,"Student List is Empty");
           return;
        }
        else{
            boolean check=true;
             for(Student students:studentList){
                if (students.getId().equals(id3)) {
                    check=false;
                    JOptionPane.showMessageDialog(this,"Update thanh cong!!!");
                    String names=txtName.getText();
                    Byte age=Byte.parseByte(txtAge.getText());
                    String adres=txtAddress.getText();
                    float score1=Float.parseFloat(txtscoreMath.getText());
                    float score2=Float.parseFloat(txtScoreLit.getText());
                    float gpa=(score1+score2)/2;
                    students.setName(names);
                    students.setAddress(adres);
                    students.setAge(age);
                    students.setScoreMath(score1);
                    students.setScoreLiter(score2);
                    students.setScoreGPA(gpa);                    
                    Validator.write(studentList);
                    studentList=Validator.read();
                    if(studentList!=null){
                        try{
                        for(int j=0;j<=studentList.size();j++){
                        tableModel.removeRow(0);
                        }
                        }catch(Exception e){
                            System.out.println("Show Table");         
                        }
            
                        for(Student students1:studentList){
                            tableModel.addRow(new Object[] {tableModel.getRowCount()+1,
                            students1.id,students1.name,students1.age,students1.address,
                            students1.getScoreMath(),students1.getScoreLiter(),students1.getScoreGPA()});
                        }
                    }
                    return;
                }  
                          
            }
            if(check){
                 JOptionPane.showMessageDialog(this,"Not found ID");
                return;
            }
        }
      }  
       
    }//GEN-LAST:event_btnEditActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblMouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtID1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtScoreLit;
    private javax.swing.JTextField txtscoreMath;
    // End of variables declaration//GEN-END:variables
}